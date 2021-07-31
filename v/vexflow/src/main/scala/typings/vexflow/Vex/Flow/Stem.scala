package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.BaseY
import typings.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stem extends StObject {
  
  def applyStyle(context: IRenderContext): Stem
  
  def draw(): Unit
  
  def getBoundingBox(): BoundingBox
  
  def getCategory(): String
  
  def getExtents(): BaseY
  
  def getHeight(): Double
  
  def getStyle(): FillStyle_
  
  //inconsistent API: this should be set via the options object in the constructor
  var hide: Boolean
  
  def setContext(context: IRenderContext): Stem
  
  def setDirection(direction: Double): Unit
  
  def setExtension(`extension`: Double): Unit
  
  def setNoteHeadXBounds(x_begin: Double, x_end: Double): Stem
  
  def setStyle(style: FillStyle_): Unit
  
  def setYBounds(y_top: Double, y_bottom: Double): Unit
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
  implicit class StemMutableBuilder[Self <: Stem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyStyle(value: IRenderContext => Stem): Self = StObject.set(x, "applyStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBoundingBox(value: () => BoundingBox): Self = StObject.set(x, "getBoundingBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCategory(value: () => String): Self = StObject.set(x, "getCategory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExtents(value: () => BaseY): Self = StObject.set(x, "getExtents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStyle(value: () => FillStyle_): Self = StObject.set(x, "getStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetContext(value: IRenderContext => Stem): Self = StObject.set(x, "setContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDirection(value: Double => Unit): Self = StObject.set(x, "setDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetExtension(value: Double => Unit): Self = StObject.set(x, "setExtension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetNoteHeadXBounds(value: (Double, Double) => Stem): Self = StObject.set(x, "setNoteHeadXBounds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetStyle(value: FillStyle_ => Unit): Self = StObject.set(x, "setStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetYBounds(value: (Double, Double) => Unit): Self = StObject.set(x, "setYBounds", js.Any.fromFunction2(value))
  }
}
