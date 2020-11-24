package typings.terminalKit.rectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rect extends js.Object {
  
  def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit = js.native
  
  val height: Double = js.native
  
  val isNull: Boolean = js.native
  
  def set(obj: Region): Unit = js.native
  
  val width: Double = js.native
  
  val xmax: Double = js.native
  
  val xmin: Double = js.native
  
  val ymax: Double = js.native
  
  val ymin: Double = js.native
}
object Rect {
  
  @scala.inline
  def apply(
    clip: (Rect, Double, Double, Boolean) => Unit,
    height: Double,
    isNull: Boolean,
    set: Region => Unit,
    width: Double,
    xmax: Double,
    xmin: Double,
    ymax: Double,
    ymin: Double
  ): Rect = {
    val __obj = js.Dynamic.literal(clip = js.Any.fromFunction4(clip), height = height.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), width = width.asInstanceOf[js.Any], xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rect]
  }
  
  @scala.inline
  implicit class RectOps[Self <: Rect] (val x: Self) extends AnyVal {
    
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
    def setClip(value: (Rect, Double, Double, Boolean) => Unit): Self = this.set("clip", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNull(value: Boolean): Self = this.set("isNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: Region => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmax(value: Double): Self = this.set("xmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmin(value: Double): Self = this.set("xmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmax(value: Double): Self = this.set("ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYmin(value: Double): Self = this.set("ymin", value.asInstanceOf[js.Any])
  }
}
