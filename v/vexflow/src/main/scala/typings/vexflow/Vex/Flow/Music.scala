package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StringDictionary
import typings.vexflow.anon.AccidentalRoot
import typings.vexflow.anon.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Music extends StObject {
  
  def createScaleMap(keySignature: String): StringDictionary[String] = js.native
  
  def getCanonicalIntervalName(intervalValue: Double): String = js.native
  
  def getCanonicalNoteName(noteValue: Double): String = js.native
  
  def getIntervalBetween(note1: Double, note2: Double): Double = js.native
  def getIntervalBetween(note1: Double, note2: Double, direction: Double): Double = js.native
  
  def getIntervalValue(intervalString: String): Double = js.native
  
  def getKeyParts(noteString: String): AccidentalRoot = js.native
  
  def getNoteParts(noteString: String): Root = js.native
  
  def getNoteValue(noteString: String): Double = js.native
  
  def getRelativeNoteName(root: String, noteValue: Double): String = js.native
  
  def getRelativeNoteValue(noteValue: Double, intervalValue: Double): Double = js.native
  def getRelativeNoteValue(noteValue: Double, intervalValue: Double, direction: Double): Double = js.native
  
  def getScaleTones(key: String, intervals: js.Array[Double]): Double = js.native
  
  def isValidIntervalValue(interval: Double): Boolean = js.native
  
  def isValidNoteValue(note: Double): Boolean = js.native
}
