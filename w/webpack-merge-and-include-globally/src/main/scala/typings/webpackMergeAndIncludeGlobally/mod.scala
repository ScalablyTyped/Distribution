package typings.webpackMergeAndIncludeGlobally

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import typings.webpackMergeAndIncludeGlobally.anon.Dest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Webpack plugin to merge your source files together into single file, to be included in index.html,
    * and achieving same effect as you would by including them all separately through <script> or <link>.
    */
  @JSImport("webpack-merge-and-include-globally", JSImport.Namespace)
  @js.native
  class ^ protected () extends Plugin {
    def this(options: Options) = this()
    def this(options: Options, onComplete: js.Function1[/* files */ StringDictionary[String], Unit]) = this()
  }
  
  /* static member */
  @JSImport("webpack-merge-and-include-globally", "getHashOfRelatedFile")
  @js.native
  def getHashOfRelatedFile(assets: js.Any, fileName: String): String | Null = js.native
  
  /**
    * Object that maps file names to array of all files (can also be defined by wildcard path) that will be merged together and saved under each file name.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#files-as-object}
    */
  type FilesMap = StringDictionary[js.Array[String]]
  
  /**
    * Webpack plugin to merge your source files together into single file, to be included in index.html,
    * and achieving same effect as you would by including them all separately through <script> or <link>.
    */
  type MergeIntoFile = Plugin
  
  @js.native
  trait Options extends StObject {
    
    /**
      * array of entry points (strings) for which this plugin should run only
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#hash}
      */
    var chunks: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * encoding of node.js reading
      * @default 'utf-8'
      */
    var encoding: js.UndefOr[String] = js.native
    
    var files: js.UndefOr[FilesMap | SourceDestinationMaps] = js.native
    
    /**
      * set true to append version hash before file extension.
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#hash}
      * @default false
      */
    var hash: js.UndefOr[Boolean] = js.native
    
    /**
      * Object that maps resulting file names to transform methods that will be applied on merged content before saving. Use to minify / uglify the result.
      * {@linkhttps://github.com/markshapiro/webpack-merge-and-include-globally#transform}
      */
    var transform: js.UndefOr[StringDictionary[js.Function1[/* code */ String, String]]] = js.native
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
      def setChunks(value: js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      @scala.inline
      def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value :_*))
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFiles(value: FilesMap | SourceDestinationMaps): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: Dest*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setTransform(value: StringDictionary[js.Function1[/* code */ String, String]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /**
    * Alternative way to specify files as array of src & dest,
    * for flexibility to transform and create multiple destination files for same source when you need to generate additional map file for example.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#files-as-array}
    */
  type SourceDestinationMaps = js.Array[Dest]
}
