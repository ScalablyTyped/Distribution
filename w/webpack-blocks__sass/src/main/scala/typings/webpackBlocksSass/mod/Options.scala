package typings.webpackBlocksSass.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var includePaths: js.UndefOr[js.Array[String]] = js.native
  
  var indentedSyntax: js.UndefOr[Boolean] = js.native
  
  var outputStyle: js.UndefOr[String] = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setIncludePathsVarargs(value: String*): Self = this.set("includePaths", js.Array(value :_*))
    
    @scala.inline
    def setIncludePaths(value: js.Array[String]): Self = this.set("includePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePaths: Self = this.set("includePaths", js.undefined)
    
    @scala.inline
    def setIndentedSyntax(value: Boolean): Self = this.set("indentedSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentedSyntax: Self = this.set("indentedSyntax", js.undefined)
    
    @scala.inline
    def setOutputStyle(value: String): Self = this.set("outputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputStyle: Self = this.set("outputStyle", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
}
