package typings.vexflow.global.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.BaseY
import typings.vexflow.anon.FillStyle_
import typings.vexflow.anon.Stemdirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.Stem")
@js.native
class Stem protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.Stem {
  def this(options: Stemdirection) = this()
  
  /* CompleteClass */
  override def applyStyle(context: IRenderContext): typings.vexflow.Vex.Flow.Stem = js.native
  
  /* CompleteClass */
  override def draw(): Unit = js.native
  
  /* CompleteClass */
  override def getBoundingBox(): typings.vexflow.Vex.Flow.BoundingBox = js.native
  
  /* CompleteClass */
  override def getCategory(): String = js.native
  
  /* CompleteClass */
  override def getExtents(): BaseY = js.native
  
  /* CompleteClass */
  override def getHeight(): Double = js.native
  
  /* CompleteClass */
  override def getStyle(): FillStyle_ = js.native
  
  //inconsistent API: this should be set via the options object in the constructor
  /* CompleteClass */
  var hide: Boolean = js.native
  
  /* CompleteClass */
  override def setContext(context: IRenderContext): typings.vexflow.Vex.Flow.Stem = js.native
  
  /* CompleteClass */
  override def setDirection(direction: Double): Unit = js.native
  
  /* CompleteClass */
  override def setExtension(`extension`: Double): Unit = js.native
  
  /* CompleteClass */
  override def setNoteHeadXBounds(x_begin: Double, x_end: Double): typings.vexflow.Vex.Flow.Stem = js.native
  
  /* CompleteClass */
  override def setStyle(style: FillStyle_): Unit = js.native
  
  /* CompleteClass */
  override def setYBounds(y_top: Double, y_bottom: Double): Unit = js.native
}
object Stem {
  
  @JSGlobal("Vex.Flow.Stem")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Vex.Flow.Stem.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("Vex.Flow.Stem.DOWN")
  @js.native
  val DOWN: Double = js.native
  
  @JSGlobal("Vex.Flow.Stem.UP")
  @js.native
  val UP: Double = js.native
}
