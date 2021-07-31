package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraceNoteGroup
  extends StObject
     with Modifier {
  
  def beamNotes(): GraceNoteGroup = js.native
  
  def preFormat(): Unit = js.native
  
  def setNote(note: StaveNote): Modifier = js.native
  
  //TODO remove the following lines once TypeScript allows subclass overrides with type changes or type inconsistencies mentioned below are fixed
  @JSName("setWidth")
  def setWidth_Modifier(width: Double): Modifier = js.native
}
