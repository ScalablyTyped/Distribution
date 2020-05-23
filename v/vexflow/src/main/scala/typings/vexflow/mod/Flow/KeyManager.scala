package typings.vexflow.mod.Flow

import typings.vexflow.anon.AccidentalNote
import typings.vexflow.anon.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexflow", "Flow.KeyManager")
@js.native
class KeyManager protected ()
  extends typings.vexflow.Vex.Flow.KeyManager {
  def this(key: String) = this()
  /* CompleteClass */
  override def getAccidental(key: String): AccidentalNote = js.native
  /* CompleteClass */
  override def getKey(): String = js.native
  /* CompleteClass */
  override def reset(): typings.vexflow.Vex.Flow.KeyManager = js.native
  /* CompleteClass */
  override def selectNote(note: String): Change = js.native
  /* CompleteClass */
  override def setKey(key: String): typings.vexflow.Vex.Flow.KeyManager = js.native
}

