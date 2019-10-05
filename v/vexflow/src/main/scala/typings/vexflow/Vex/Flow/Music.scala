package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StringDictionary
import typings.vexflow.Anon_AccidentalNoteNumber
import typings.vexflow.Anon_AccidentalRoot
import typings.vexflow.Anon_AccidentalRootType
import typings.vexflow.Anon_Intval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Music")
@js.native
class Music () extends js.Object {
  def createScaleMap(keySignature: String): StringDictionary[String] = js.native
  def getCanonicalIntervalName(intervalValue: Double): String = js.native
  def getCanonicalNoteName(noteValue: Double): String = js.native
  def getIntervalBetween(note1: Double, note2: Double): Double = js.native
  def getIntervalBetween(note1: Double, note2: Double, direction: Double): Double = js.native
  def getIntervalValue(intervalString: String): Double = js.native
  def getKeyParts(noteString: String): Anon_AccidentalRootType = js.native
  def getNoteParts(noteString: String): Anon_AccidentalRoot = js.native
  def getNoteValue(noteString: String): Double = js.native
  def getRelativeNoteName(root: String, noteValue: Double): String = js.native
  def getRelativeNoteValue(noteValue: Double, intervalValue: Double): Double = js.native
  def getRelativeNoteValue(noteValue: Double, intervalValue: Double, direction: Double): Double = js.native
  def getScaleTones(key: String, intervals: js.Array[Double]): Double = js.native
  def isValidIntervalValue(interval: Double): Boolean = js.native
  def isValidNoteValue(note: Double): Boolean = js.native
}

@JSGlobal("Vex.Flow.Music")
@js.native
object Music extends js.Object {
  val NUM_TONES: Double = js.native
  val accidentals: js.Array[String] = js.native
  val canonical_notes: js.Array[String] = js.native
  val diatonic_intervals: js.Array[String] = js.native
  val root_values: js.Array[Double] = js.native
  val roots: js.Array[String] = js.native
  @js.native
  object diatonic_accidentals extends /* diatonic_interval */ StringDictionary[Anon_AccidentalNoteNumber]
  
  @js.native
  object intervals extends /* interval */ StringDictionary[Double]
  
  @js.native
  object noteValues extends /* value */ StringDictionary[Anon_Intval]
  
  @js.native
  object root_indices extends /* root */ StringDictionary[Double]
  
  @js.native
  object scales
    extends /* scale */ StringDictionary[js.Array[Double]]
  
}

