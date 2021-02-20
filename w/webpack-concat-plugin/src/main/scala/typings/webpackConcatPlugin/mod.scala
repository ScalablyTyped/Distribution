package typings.webpackConcatPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import typings.uglifyJs.mod.MinifyOptions
import typings.webpackConcatPlugin.webpackConcatPluginStrings.append
import typings.webpackConcatPlugin.webpackConcatPluginStrings.none
import typings.webpackConcatPlugin.webpackConcatPluginStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A plugin to help webpack concat js and inject into html
    */
  @JSImport("webpack-concat-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends ConcatPlugin {
    def this(options: Options) = this()
  }
  
  /**
    * A plugin to help webpack concat js and inject into html
    */
  @js.native
  trait ConcatPlugin extends Plugin {
    
    def ensureTrailingSlash(str: String): String = js.native
    
    def getFileName(file: String): String = js.native
    def getFileName(file: String, filePath: String): String = js.native
    def getFileName(file: StringDictionary[String]): String = js.native
    def getFileName(file: StringDictionary[String], filePath: String): String = js.native
    
    def getRelativePathAsync(context: String): js.Promise[String] = js.native
    
    def hashFile(files: String): String = js.native
    def hashFile(files: StringDictionary[String]): String = js.native
    
    def resolveConcatAndUglify(
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any,
      files: js.Array[String]
    ): Unit = js.native
    
    def resolveReadFiles(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /** if set, will be used as the extra attributes of the script tag. */
    var attributes: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
      * if set, will be used as the output fileName
      * @default '[name].js'
      */
    var fileName: js.UndefOr[String] = js.native
    
    /**
      * supported path patterns:
      * - normal path
      * - npm packages
      * - glob
      */
    var filesToConcat: js.Array[String | js.Array[String]] = js.native
    
    /**
      * how to auto inject to html-webpack-plugin
      * (only if html-webpack-plugin set inject option not to be false)
      * @default 'prepend'
      */
    var injectType: js.UndefOr[prepend | append | none] = js.native
    
    /**
      * it's useful when you want to inject to html-webpack-plugin manually
      * @default 'result'
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * if set, will be used as the output directory of the file.
      */
    var outputPath: js.UndefOr[String] = js.native
    
    /**
      * if set, will be used as the public path of the script tag.
      * if set to false, will use relativePath.
      */
    var publicPath: js.UndefOr[String | Boolean] = js.native
    
    /**
      * if true, will output sourcemap
      * @default false
      */
    var sourceMap: js.UndefOr[Boolean] = js.native
    
    /**
      * if true the output file will be uglified
      * or set uglifyjs options to customize the output
      * @default false
      */
    var uglify: js.UndefOr[Boolean | MinifyOptions] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(filesToConcat: js.Array[String | js.Array[String]]): Options = {
      val __obj = js.Dynamic.literal(filesToConcat = filesToConcat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFilesToConcat(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "filesToConcat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesToConcatVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "filesToConcat", js.Array(value :_*))
      
      @scala.inline
      def setInjectType(value: prepend | append | none): Self = StObject.set(x, "injectType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectTypeUndefined: Self = StObject.set(x, "injectType", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String | Boolean): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setUglify(value: Boolean | MinifyOptions): Self = StObject.set(x, "uglify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUglifyUndefined: Self = StObject.set(x, "uglify", js.undefined)
    }
  }
}
