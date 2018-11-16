package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.ClefNote")
@js.native
class ClefNote protected () extends Note {
  def this(clef: java.lang.String) = this()
  def this(clef: java.lang.String, size: java.lang.String) = this()
  def this(clef: java.lang.String, size: java.lang.String, annotation: java.lang.String) = this()
  def addToModifierContext(): ClefNote = js.native
  def draw(): scala.Unit = js.native
  def getClef(): java.lang.String = js.native
  def setClef(clef: java.lang.String): ClefNote = js.native
  def setClef(clef: java.lang.String, size: java.lang.String): ClefNote = js.native
  def setClef(clef: java.lang.String, size: java.lang.String, annotation: java.lang.String): ClefNote = js.native
  @JSName("setStave")
  def setStave_Unit(stave: Stave): scala.Unit = js.native
}

