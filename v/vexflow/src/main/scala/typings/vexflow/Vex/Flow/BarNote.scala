package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.Barline.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarNote extends Note {
  
  def addToModifierContext(): BarNote = js.native
  
  def draw(): Unit = js.native
  
  def getType(): `type` = js.native
  
  def setType(`type`: `type`): BarNote = js.native
}
