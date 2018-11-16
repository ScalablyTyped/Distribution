package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Music")
@js.native
class Music () extends js.Object {
  def createScaleMap(keySignature: java.lang.String): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def getCanonicalIntervalName(intervalValue: scala.Double): java.lang.String = js.native
  def getCanonicalNoteName(noteValue: scala.Double): java.lang.String = js.native
  def getIntervalBetween(note1: scala.Double, note2: scala.Double): scala.Double = js.native
  def getIntervalBetween(note1: scala.Double, note2: scala.Double, direction: scala.Double): scala.Double = js.native
  def getIntervalValue(intervalString: java.lang.String): scala.Double = js.native
  def getKeyParts(noteString: java.lang.String): vexflowLib.Anon_Root = js.native
  def getNoteParts(noteString: java.lang.String): vexflowLib.Anon_RootAccidental = js.native
  def getNoteValue(noteString: java.lang.String): scala.Double = js.native
  def getRelativeNoteName(root: java.lang.String, noteValue: scala.Double): java.lang.String = js.native
  def getRelativeNoteValue(noteValue: scala.Double, intervalValue: scala.Double): scala.Double = js.native
  def getRelativeNoteValue(noteValue: scala.Double, intervalValue: scala.Double, direction: scala.Double): scala.Double = js.native
  def getScaleTones(key: java.lang.String, intervals: js.Array[scala.Double]): scala.Double = js.native
  def isValidIntervalValue(interval: scala.Double): scala.Boolean = js.native
  def isValidNoteValue(note: scala.Double): scala.Boolean = js.native
}

