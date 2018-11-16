package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Tuning")
@js.native
class Tuning () extends js.Object {
  def this(tuningString: java.lang.String) = this()
  def getNoteForFret(fretNum: java.lang.String, stringNum: java.lang.String): java.lang.String = js.native
  def getValueForFret(fretNum: java.lang.String, stringNum: java.lang.String): scala.Double = js.native
  def getValueForString(stringNum: java.lang.String): scala.Double = js.native
  def noteToInteger(noteString: java.lang.String): scala.Double = js.native
  def setTuning(tuningString: java.lang.String): scala.Unit = js.native
}

