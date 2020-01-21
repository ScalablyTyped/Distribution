package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StringDictionary
import typings.vexflow.AnonAccidentalRoot
import typings.vexflow.AnonAccidentalRootType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Music")
@js.native
class Music_ () extends js.Object {
  def createScaleMap(keySignature: String): StringDictionary[String] = js.native
  def getCanonicalIntervalName(intervalValue: Double): String = js.native
  def getCanonicalNoteName(noteValue: Double): String = js.native
  def getIntervalBetween(note1: Double, note2: Double): Double = js.native
  def getIntervalBetween(note1: Double, note2: Double, direction: Double): Double = js.native
  def getIntervalValue(intervalString: String): Double = js.native
  def getKeyParts(noteString: String): AnonAccidentalRootType = js.native
  def getNoteParts(noteString: String): AnonAccidentalRoot = js.native
  def getNoteValue(noteString: String): Double = js.native
  def getRelativeNoteName(root: String, noteValue: Double): String = js.native
  def getRelativeNoteValue(noteValue: Double, intervalValue: Double): Double = js.native
  def getRelativeNoteValue(noteValue: Double, intervalValue: Double, direction: Double): Double = js.native
  def getScaleTones(key: String, intervals: js.Array[Double]): Double = js.native
  def isValidIntervalValue(interval: Double): Boolean = js.native
  def isValidNoteValue(note: Double): Boolean = js.native
}

