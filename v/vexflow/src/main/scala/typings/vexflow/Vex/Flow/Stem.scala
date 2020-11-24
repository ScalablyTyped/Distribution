package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.BaseY
import typings.vexflow.anon.FillStyle_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stem extends js.Object {
  
  def applyStyle(context: IRenderContext): Stem = js.native
  
  def draw(): Unit = js.native
  
  def getBoundingBox(): BoundingBox = js.native
  
  def getCategory(): String = js.native
  
  def getExtents(): BaseY = js.native
  
  def getHeight(): Double = js.native
  
  def getStyle(): FillStyle_ = js.native
  
  //inconsistent API: this should be set via the options object in the constructor
  var hide: Boolean = js.native
  
  def setContext(context: IRenderContext): Stem = js.native
  
  def setDirection(direction: Double): Unit = js.native
  
  def setExtension(extension: Double): Unit = js.native
  
  def setNoteHeadXBounds(x_begin: Double, x_end: Double): Stem = js.native
  
  def setStyle(style: FillStyle_): Unit = js.native
  
  def setYBounds(y_top: Double, y_bottom: Double): Unit = js.native
}
object Stem {
  
  @scala.inline
  def apply(
    applyStyle: IRenderContext => Stem,
    draw: () => Unit,
    getBoundingBox: () => BoundingBox,
    getCategory: () => String,
    getExtents: () => BaseY,
    getHeight: () => Double,
    getStyle: () => FillStyle_,
    hide: Boolean,
    setContext: IRenderContext => Stem,
    setDirection: Double => Unit,
    setExtension: Double => Unit,
    setNoteHeadXBounds: (Double, Double) => Stem,
    setStyle: FillStyle_ => Unit,
    setYBounds: (Double, Double) => Unit
  ): Stem = {
    val __obj = js.Dynamic.literal(applyStyle = js.Any.fromFunction1(applyStyle), draw = js.Any.fromFunction0(draw), getBoundingBox = js.Any.fromFunction0(getBoundingBox), getCategory = js.Any.fromFunction0(getCategory), getExtents = js.Any.fromFunction0(getExtents), getHeight = js.Any.fromFunction0(getHeight), getStyle = js.Any.fromFunction0(getStyle), hide = hide.asInstanceOf[js.Any], setContext = js.Any.fromFunction1(setContext), setDirection = js.Any.fromFunction1(setDirection), setExtension = js.Any.fromFunction1(setExtension), setNoteHeadXBounds = js.Any.fromFunction2(setNoteHeadXBounds), setStyle = js.Any.fromFunction1(setStyle), setYBounds = js.Any.fromFunction2(setYBounds))
    __obj.asInstanceOf[Stem]
  }
  
  @scala.inline
  implicit class StemOps[Self <: Stem] (val x: Self) extends AnyVal {
    
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
    def setApplyStyle(value: IRenderContext => Stem): Self = this.set("applyStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraw(value: () => Unit): Self = this.set("draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoundingBox(value: () => BoundingBox): Self = this.set("getBoundingBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCategory(value: () => String): Self = this.set("getCategory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtents(value: () => BaseY): Self = this.set("getExtents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStyle(value: () => FillStyle_): Self = this.set("getStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetContext(value: IRenderContext => Stem): Self = this.set("setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirection(value: Double => Unit): Self = this.set("setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExtension(value: Double => Unit): Self = this.set("setExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNoteHeadXBounds(value: (Double, Double) => Stem): Self = this.set("setNoteHeadXBounds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStyle(value: FillStyle_ => Unit): Self = this.set("setStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYBounds(value: (Double, Double) => Unit): Self = this.set("setYBounds", js.Any.fromFunction2(value))
  }
}
