package typings.webpackConcatPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyJs.mod.MinifyOptions
import typings.webpackConcatPlugin.webpackConcatPluginStrings.append
import typings.webpackConcatPlugin.webpackConcatPluginStrings.none
import typings.webpackConcatPlugin.webpackConcatPluginStrings.prepend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilesToConcatVarargs(value: (String | js.Array[String])*): Self = this.set("filesToConcat", js.Array(value :_*))
    
    @scala.inline
    def setFilesToConcat(value: js.Array[String | js.Array[String]]): Self = this.set("filesToConcat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setInjectType(value: prepend | append | none): Self = this.set("injectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectType: Self = this.set("injectType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String | Boolean): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setUglify(value: Boolean | MinifyOptions): Self = this.set("uglify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUglify: Self = this.set("uglify", js.undefined)
  }
}
