package typings.textClipper.mod

import typings.textClipper.textClipperBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipHtmlOptions
  extends CommonClipOptions
     with ClipOptions {
  
  @JSName("html")
  var html_ClipHtmlOptions: `true` = js.native
  
  /**
    * The amount of characters to assume for images. This is used whenever an image is encountered,
    * but also for SVG and MathML content. Default: `2`.
    */
  var imageWeight: js.UndefOr[Double] = js.native
}
object ClipHtmlOptions {
  
  @scala.inline
  def apply(html: `true`): ClipHtmlOptions = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipHtmlOptions]
  }
  
  @scala.inline
  implicit class ClipHtmlOptionsOps[Self <: ClipHtmlOptions] (val x: Self) extends AnyVal {
    
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
    def setHtml(value: `true`): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageWeight(value: Double): Self = this.set("imageWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageWeight: Self = this.set("imageWeight", js.undefined)
  }
}
