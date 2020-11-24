package typings.textClipper.mod

import typings.textClipper.textClipperBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipPlainTextOptions
  extends CommonClipOptions
     with ClipOptions {
  
  @JSName("html")
  var html_ClipPlainTextOptions: js.UndefOr[`false`] = js.native
}
object ClipPlainTextOptions {
  
  @scala.inline
  def apply(): ClipPlainTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipPlainTextOptions]
  }
  
  @scala.inline
  implicit class ClipPlainTextOptionsOps[Self <: ClipPlainTextOptions] (val x: Self) extends AnyVal {
    
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
    def setHtml(value: `false`): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
  }
}
