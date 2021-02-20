package typings.webpackManifestPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-manifest-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Chunk
    extends /* propName */ StringDictionary[js.Any] {
    
    var id: String = js.native
    
    var parents: js.Array[String] = js.native
  }
  object Chunk {
    
    @scala.inline
    def apply(id: String, parents: js.Array[String]): Chunk = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FileDescriptor extends StObject {
    
    /** Only available is isChunk is true. */
    var chunk: js.UndefOr[Chunk] = js.native
    
    var isAsset: Boolean = js.native
    
    var isChunk: Boolean = js.native
    
    /** Is required to run you app. Cannot be true if isChunk is false. */
    var isInitial: Boolean = js.native
    
    /** Is required by a module. Cannot be true if isAsset is false. */
    var isModuleAsset: Boolean = js.native
    
    var name: String | Null = js.native
    
    var path: String = js.native
  }
  object FileDescriptor {
    
    @scala.inline
    def apply(isAsset: Boolean, isChunk: Boolean, isInitial: Boolean, isModuleAsset: Boolean, path: String): FileDescriptor = {
      val __obj = js.Dynamic.literal(isAsset = isAsset.asInstanceOf[js.Any], isChunk = isChunk.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isModuleAsset = isModuleAsset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileDescriptor]
    }
    
    @scala.inline
    implicit class FileDescriptorMutableBuilder[Self <: FileDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      @scala.inline
      def setIsAsset(value: Boolean): Self = StObject.set(x, "isAsset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsChunk(value: Boolean): Self = StObject.set(x, "isChunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInitial(value: Boolean): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModuleAsset(value: Boolean): Self = StObject.set(x, "isModuleAsset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * A path prefix for all keys. Useful for including your output path in the manifest.
      */
    var basePath: js.UndefOr[String] = js.native
    
    /**
      * The manifest filename in your output directory.
      * Default: manifest.json
      */
    var fileName: js.UndefOr[String] = js.native
    
    /**
      * Filter out files.
      */
    var filter: js.UndefOr[js.Function1[/* file */ FileDescriptor, Boolean]] = js.native
    
    /**
      * Create the manifest. It can return anything as long as it's serialisable by JSON.stringify.
      */
    var generate: js.UndefOr[
        js.Function3[
          /* seed */ js.Object, 
          /* files */ js.Array[FileDescriptor], 
          /* entrypoints */ StringDictionary[js.Array[String]], 
          js.Object
        ]
      ] = js.native
    
    /**
      * Modify files details before the manifest is created.
      */
    var map: js.UndefOr[js.Function1[/* file */ FileDescriptor, FileDescriptor]] = js.native
    
    /**
      * A path prefix that will be added to values of the manifest.
      * Default: output.publicPath
      */
    var publicPath: js.UndefOr[String] = js.native
    
    /**
      * A cache of key/value pairs to used to seed the manifest. This may include a set of custom key/value pairs to include in your manifest,
      * or may be used to combine manifests across compilations in multi-compiler mode.
      * To combine manifests, pass a shared seed object to each compiler's ManifestPlugin instance.
      * Default: {}
      */
    var seed: js.UndefOr[js.Object] = js.native
    
    /**
      * Output manifest file in different format then json (i.e. yaml).
      */
    var serialize: js.UndefOr[js.Function1[/* manifest */ js.Object, String]] = js.native
    
    /**
      * Sort files before they are passed to generate.
      */
    var sort: js.UndefOr[js.Function2[/* a */ FileDescriptor, /* b */ FileDescriptor, Double]] = js.native
    
    /**
      * If set to true will emit to build folder and memory in combination with webpack-dev-server
      * Default: false
      */
    var writeToFileEmit: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFilter(value: /* file */ FileDescriptor => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGenerate(
        value: (/* seed */ js.Object, /* files */ js.Array[FileDescriptor], /* entrypoints */ StringDictionary[js.Array[String]]) => js.Object
      ): Self = StObject.set(x, "generate", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      @scala.inline
      def setMap(value: /* file */ FileDescriptor => FileDescriptor): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setSeed(value: js.Object): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setSerialize(value: /* manifest */ js.Object => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setSort(value: (/* a */ FileDescriptor, /* b */ FileDescriptor) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setWriteToFileEmit(value: Boolean): Self = StObject.set(x, "writeToFileEmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToFileEmitUndefined: Self = StObject.set(x, "writeToFileEmit", js.undefined)
    }
  }
  
  type WebpackManifestPlugin = Plugin
}
