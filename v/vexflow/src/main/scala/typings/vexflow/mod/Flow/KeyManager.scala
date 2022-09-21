package typings.vexflow.mod.Flow

import typings.vexflow.anon.AccidentalNote
import typings.vexflow.anon.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.KeyManager")
@js.native
open class KeyManager protected ()
  extends StObject
     with typings.vexflow.Vex.Flow.KeyManager {
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
