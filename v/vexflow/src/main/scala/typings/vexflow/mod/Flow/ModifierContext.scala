package typings.vexflow.mod.Flow

import typings.vexflow.anon.Extraleftpx
import typings.vexflow.anon.Leftshift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.ModifierContext")
@js.native
class ModifierContext ()
  extends typings.vexflow.Vex.Flow.ModifierContext {
  /* CompleteClass */
  override def addModifier(modifier: typings.vexflow.Vex.Flow.Modifier): typings.vexflow.Vex.Flow.ModifierContext = js.native
  /* CompleteClass */
  override def getExtraLeftPx(): Double = js.native
  /* CompleteClass */
  override def getExtraRightPx(): Double = js.native
  /* CompleteClass */
  override def getMetrics(): Extraleftpx = js.native
  /* CompleteClass */
  override def getModifiers(`type`: String): js.Array[typings.vexflow.Vex.Flow.Modifier] = js.native
  /* CompleteClass */
  override def getState(): Leftshift = js.native
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /* CompleteClass */
  override def postFormat(): Unit = js.native
  /* CompleteClass */
  override def preFormat(): Unit = js.native
}

/* static members */
@JSImport("vexflow", "Flow.ModifierContext")
@js.native
object ModifierContext extends js.Object {
  var DEBUG: Boolean = js.native
}

