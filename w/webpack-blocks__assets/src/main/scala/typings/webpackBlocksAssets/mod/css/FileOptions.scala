package typings.webpackBlocksAssets.mod.css

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileOptions extends js.Object {
  
  var context: js.UndefOr[String] = js.native
  
  var emitFile: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String | NameFunction] = js.native
  
  var outputPath: js.UndefOr[String | PathFunction] = js.native
  
  var postTransformPublicPath: js.UndefOr[js.Function1[/* p */ String, String]] = js.native
  
  var publicPath: js.UndefOr[String | PathFunction] = js.native
  
  var regExp: js.UndefOr[RegExp] = js.native
}
object FileOptions {
  
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  @scala.inline
  implicit class FileOptionsOps[Self <: FileOptions] (val x: Self) extends AnyVal {
    
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
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEmitFile(value: Boolean): Self = this.set("emitFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitFile: Self = this.set("emitFile", js.undefined)
    
    @scala.inline
    def setNameFunction1(value: /* file */ String => js.Any): Self = this.set("name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String | NameFunction): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutputPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => js.Any): Self = this.set("outputPath", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOutputPath(value: String | PathFunction): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    
    @scala.inline
    def setPostTransformPublicPath(value: /* p */ String => String): Self = this.set("postTransformPublicPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostTransformPublicPath: Self = this.set("postTransformPublicPath", js.undefined)
    
    @scala.inline
    def setPublicPathFunction3(value: (/* url */ String, /* resourcePath */ String, /* context */ String) => js.Any): Self = this.set("publicPath", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPublicPath(value: String | PathFunction): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setRegExp(value: RegExp): Self = this.set("regExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegExp: Self = this.set("regExp", js.undefined)
  }
}
