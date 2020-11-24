package typings.terminalImage.anon

import typings.terminalImage.mod.RenderFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  width :string | number | undefined,   height :string | number | undefined,   maximumFrameRate :number | undefined,   renderFrame :terminal-image.terminal-image.RenderFrame | undefined}> */
@js.native
trait ReadonlywidthstringnumberHeight extends js.Object {
  
  val height: js.UndefOr[String | Double] = js.native
  
  val maximumFrameRate: js.UndefOr[Double] = js.native
  
  val renderFrame: js.UndefOr[RenderFrame] = js.native
  
  val width: js.UndefOr[String | Double] = js.native
}
object ReadonlywidthstringnumberHeight {
  
  @scala.inline
  def apply(): ReadonlywidthstringnumberHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlywidthstringnumberHeight]
  }
  
  @scala.inline
  implicit class ReadonlywidthstringnumberHeightOps[Self <: ReadonlywidthstringnumberHeight] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaximumFrameRate(value: Double): Self = this.set("maximumFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumFrameRate: Self = this.set("maximumFrameRate", js.undefined)
    
    @scala.inline
    def setRenderFrame(value: RenderFrame): Self = this.set("renderFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderFrame: Self = this.set("renderFrame", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
