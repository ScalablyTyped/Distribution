package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crescendo extends Note {
  
  def draw(): Unit = js.native
  
  def setDecrescendo(decresc: Boolean): Crescendo = js.native
  
  def setHeight(height: Double): Crescendo = js.native
  
  def setLine(line: Double): Crescendo = js.native
}
