package typings.webpackMergeAndIncludeGlobally

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.mod.Compiler
import typings.webpackMergeAndIncludeGlobally.anon.Dest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Webpack plugin to merge your source files together into single file, to be included in index.html,
    * and achieving same effect as you would by including them all separately through <script> or <link>.
    */
  @JSImport("webpack-merge-and-include-globally", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MergeIntoFile {
    def this(options: Options) = this()
    def this(options: Options, onComplete: js.Function1[/* files */ StringDictionary[String], Unit]) = this()
    
    /** Hook into the Webpack compiler */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  @JSImport("webpack-merge-and-include-globally", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getHashOfRelatedFile(assets: Any, fileName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getHashOfRelatedFile")(assets.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  /**
    * Object that maps file names to array of all files (can also be defined by wildcard path) that will be merged together and saved under each file name.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#files-as-object}
    */
  type FilesMap = StringDictionary[js.Array[String]]
  
  /**
    * Webpack plugin to merge your source files together into single file, to be included in index.html,
    * and achieving same effect as you would by including them all separately through <script> or <link>.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait MergeIntoFile extends StObject {
    
    /** Hook into the Webpack compiler */
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object MergeIntoFile {
    
    inline def apply(apply: Compiler => Unit): MergeIntoFile = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[MergeIntoFile]
    }
    
    extension [Self <: MergeIntoFile](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * array of entry points (strings) for which this plugin should run only
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#chunks}
      * @default undefined
      */
    var chunks: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * encoding of node.js reading
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#encoding}
      * @default 'utf-8'
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[FilesMap | SourceDestinationMaps] = js.undefined
    
    /**
      * set true to append version hash before file extension.
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#hash}
      * @default false
      */
    var hash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * string used between files when joining them together
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#separator}
      * @default '\n'
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Object that maps resulting file names to transform methods that will be applied on merged content before saving. Use to minify / uglify the result.
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#transform}
      */
    var transform: js.UndefOr[StringDictionary[js.Function1[/* code */ String, String]]] = js.undefined
    
    /**
      * A function for change output file name with hash
      * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#transformfilename}
      */
    var transformFileName: js.UndefOr[TransformFileNameFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setChunks(value: js.Array[String]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setChunksVarargs(value: String*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFiles(value: FilesMap | SourceDestinationMaps): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: Dest*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTransform(value: StringDictionary[js.Function1[/* code */ String, String]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformFileName(value: (/* fileNameBase */ String, /* extension */ String, /* hash */ String) => String): Self = StObject.set(x, "transformFileName", js.Any.fromFunction3(value))
      
      inline def setTransformFileNameUndefined: Self = StObject.set(x, "transformFileName", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  /**
    * Alternative way to specify files as array of src & dest,
    * for flexibility to transform and create multiple destination files for same source when you need to generate additional map file for example.
    * {@link https://github.com/markshapiro/webpack-merge-and-include-globally#files-as-array}
    */
  type SourceDestinationMaps = js.Array[Dest]
  
  type TransformFileNameFunction = js.Function3[/* fileNameBase */ String, /* extension */ String, /* hash */ String, String]
}
