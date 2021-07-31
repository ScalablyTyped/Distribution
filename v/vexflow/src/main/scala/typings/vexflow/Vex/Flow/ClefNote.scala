package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClefNote
  extends StObject
     with Note {
  
  def addToModifierContext(): ClefNote = js.native
  
  def draw(): Unit = js.native
  
  def getClef(): String = js.native
  
  def setClef(clef: String): ClefNote = js.native
  def setClef(clef: String, size: String): ClefNote = js.native
  def setClef(clef: String, size: String, annotation: String): ClefNote = js.native
  def setClef(clef: String, size: Unit, annotation: String): ClefNote = js.native
  
  @JSName("setStave")
  def setStave_Unit(stave: Stave): Unit = js.native
}
