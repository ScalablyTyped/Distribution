package typings.webpackManifestPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-manifest-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  trait Chunk
    extends StObject
       with /* propName */ StringDictionary[js.Any] {
    
    var id: String
    
    var parents: js.Array[String]
  }
  object Chunk {
    
    inline def apply(id: String, parents: js.Array[String]): Chunk = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    extension [Self <: Chunk](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParents(value: js.Array[String]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
      
      inline def setParentsVarargs(value: String*): Self = StObject.set(x, "parents", js.Array(value :_*))
    }
  }
  
  trait FileDescriptor extends StObject {
    
    /** Only available is isChunk is true. */
    var chunk: js.UndefOr[Chunk] = js.undefined
    
    var isAsset: Boolean
    
    var isChunk: Boolean
    
    /** Is required to run you app. Cannot be true if isChunk is false. */
    var isInitial: Boolean
    
    /** Is required by a module. Cannot be true if isAsset is false. */
    var isModuleAsset: Boolean
    
    var name: String | Null
    
    var path: String
  }
  object FileDescriptor {
    
    inline def apply(isAsset: Boolean, isChunk: Boolean, isInitial: Boolean, isModuleAsset: Boolean, path: String): FileDescriptor = {
      val __obj = js.Dynamic.literal(isAsset = isAsset.asInstanceOf[js.Any], isChunk = isChunk.asInstanceOf[js.Any], isInitial = isInitial.asInstanceOf[js.Any], isModuleAsset = isModuleAsset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], name = null)
      __obj.asInstanceOf[FileDescriptor]
    }
    
    extension [Self <: FileDescriptor](x: Self) {
      
      inline def setChunk(value: Chunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      inline def setIsAsset(value: Boolean): Self = StObject.set(x, "isAsset", value.asInstanceOf[js.Any])
      
      inline def setIsChunk(value: Boolean): Self = StObject.set(x, "isChunk", value.asInstanceOf[js.Any])
      
      inline def setIsInitial(value: Boolean): Self = StObject.set(x, "isInitial", value.asInstanceOf[js.Any])
      
      inline def setIsModuleAsset(value: Boolean): Self = StObject.set(x, "isModuleAsset", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A path prefix for all keys. Useful for including your output path in the manifest.
      */
    var basePath: js.UndefOr[String] = js.undefined
    
    /**
      * The manifest filename in your output directory.
      * Default: manifest.json
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * Filter out files.
      */
    var filter: js.UndefOr[js.Function1[/* file */ FileDescriptor, Boolean]] = js.undefined
    
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
      ] = js.undefined
    
    /**
      * Modify files details before the manifest is created.
      */
    var map: js.UndefOr[js.Function1[/* file */ FileDescriptor, FileDescriptor]] = js.undefined
    
    /**
      * A path prefix that will be added to values of the manifest.
      * Default: output.publicPath
      */
    var publicPath: js.UndefOr[String] = js.undefined
    
    /**
      * A cache of key/value pairs to used to seed the manifest. This may include a set of custom key/value pairs to include in your manifest,
      * or may be used to combine manifests across compilations in multi-compiler mode.
      * To combine manifests, pass a shared seed object to each compiler's ManifestPlugin instance.
      * Default: {}
      */
    var seed: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Output manifest file in different format then json (i.e. yaml).
      */
    var serialize: js.UndefOr[js.Function1[/* manifest */ js.Object, String]] = js.undefined
    
    /**
      * Sort files before they are passed to generate.
      */
    var sort: js.UndefOr[js.Function2[/* a */ FileDescriptor, /* b */ FileDescriptor, Double]] = js.undefined
    
    /**
      * If set to true will emit to build folder and memory in combination with webpack-dev-server
      * Default: false
      */
    var writeToFileEmit: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFilter(value: /* file */ FileDescriptor => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGenerate(
        value: (/* seed */ js.Object, /* files */ js.Array[FileDescriptor], /* entrypoints */ StringDictionary[js.Array[String]]) => js.Object
      ): Self = StObject.set(x, "generate", js.Any.fromFunction3(value))
      
      inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
      
      inline def setMap(value: /* file */ FileDescriptor => FileDescriptor): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setSeed(value: js.Object): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSerialize(value: /* manifest */ js.Object => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setSort(value: (/* a */ FileDescriptor, /* b */ FileDescriptor) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setWriteToFileEmit(value: Boolean): Self = StObject.set(x, "writeToFileEmit", value.asInstanceOf[js.Any])
      
      inline def setWriteToFileEmitUndefined: Self = StObject.set(x, "writeToFileEmit", js.undefined)
    }
  }
  
  type WebpackManifestPlugin = Plugin
}
