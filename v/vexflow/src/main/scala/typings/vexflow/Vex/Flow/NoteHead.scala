package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import typings.vexflow.anon.FillStyle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteHead extends Note {
  
  def applyStyle(context: IRenderContext): NoteHead = js.native
  
  def draw(): Unit = js.native
  
  def getLine(): Double = js.native
  
  def getStyle(): FillStyle_ = js.native
  
  def getY(): Double = js.native
  
  def isDisplaced(): Boolean = js.native
  
  def setLine(line: Double): NoteHead = js.native
  
  def setStyle(style: FillStyle_): NoteHead = js.native
  
  def setX(x: Double): NoteHead = js.native
  
  def setY(y: Double): NoteHead = js.native
}
