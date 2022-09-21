package typings.webpackConcatPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyJs.mod.MinifyOptions
import typings.webpack.mod.Compiler
import typings.webpackConcatPlugin.webpackConcatPluginStrings.append
import typings.webpackConcatPlugin.webpackConcatPluginStrings.none
import typings.webpackConcatPlugin.webpackConcatPluginStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A plugin to help webpack concat js and inject into html
    */
  @JSImport("webpack-concat-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ConcatPlugin {
    def this(options: Options) = this()
  }
  
  /**
    * A plugin to help webpack concat js and inject into html
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @js.native
  trait ConcatPlugin extends StObject {
    
    def ensureTrailingSlash(str: String): String = js.native
    
    def getFileName(file: String): String = js.native
    def getFileName(file: String, filePath: String): String = js.native
    def getFileName(file: StringDictionary[String]): String = js.native
    def getFileName(file: StringDictionary[String], filePath: String): String = js.native
    
    def getRelativePathAsync(context: String): js.Promise[String] = js.native
    
    def hashFile(files: String): String = js.native
    def hashFile(files: StringDictionary[String]): String = js.native
    
    def resolveConcatAndUglify(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ Any,
      files: js.Array[String]
    ): Unit = js.native
    
    def resolveReadFiles(compiler: Compiler): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /** if set, will be used as the extra attributes of the script tag. */
    var attributes: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * if set, will be used as the output fileName
      * @default '[name].js'
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * supported path patterns:
      * - normal path
      * - npm packages
      * - glob
      */
    var filesToConcat: js.Array[String | js.Array[String]]
    
    /**
      * how to auto inject to html-webpack-plugin
      * (only if html-webpack-plugin set inject option not to be false)
      * @default 'prepend'
      */
    var injectType: js.UndefOr[prepend | append | none] = js.undefined
    
    /**
      * it's useful when you want to inject to html-webpack-plugin manually
      * @default 'result'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * if set, will be used as the output directory of the file.
      */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * if set, will be used as the public path of the script tag.
      * if set to false, will use relativePath.
      */
    var publicPath: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * if true, will output sourcemap
      * @default false
      */
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if true the output file will be uglified
      * or set uglifyjs options to customize the output
      * @default false
      */
    var uglify: js.UndefOr[Boolean | MinifyOptions] = js.undefined
  }
  object Options {
    
    inline def apply(filesToConcat: js.Array[String | js.Array[String]]): Options = {
      val __obj = js.Dynamic.literal(filesToConcat = filesToConcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFilesToConcat(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "filesToConcat", value.asInstanceOf[js.Any])
      
      inline def setFilesToConcatVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "filesToConcat", js.Array(value*))
      
      inline def setInjectType(value: prepend | append | none): Self = StObject.set(x, "injectType", value.asInstanceOf[js.Any])
      
      inline def setInjectTypeUndefined: Self = StObject.set(x, "injectType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setPublicPath(value: String | Boolean): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setUglify(value: Boolean | MinifyOptions): Self = StObject.set(x, "uglify", value.asInstanceOf[js.Any])
      
      inline def setUglifyUndefined: Self = StObject.set(x, "uglify", js.undefined)
    }
  }
}
