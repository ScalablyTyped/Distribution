package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostNote
  extends StObject
     with StemmableNote {
  
  //inconsistent type: void -> GhostNote
  def addToModifierContext(): GhostNote = js.native
  
  def draw(): Unit = js.native
  
  @JSName("setStave")
  def setStave_Unit(stave: Stave): Unit = js.native
}
