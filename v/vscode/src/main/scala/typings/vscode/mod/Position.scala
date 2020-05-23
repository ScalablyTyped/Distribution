package typings.vscode.mod

import typings.vscode.anon.Character
import typings.vscode.anon.CharacterDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Position")
@js.native
class Position protected () extends js.Object {
  /**
    * @param line A zero-based line value.
    * @param character A zero-based character value.
    */
  def this(line: Double, character: Double) = this()
  /**
    * The zero-based character value.
    */
  val character: Double = js.native
  /**
    * The zero-based line value.
    */
  val line: Double = js.native
  /**
    * Compare this to `other`.
    *
    * @param other A position.
    * @return A number smaller than zero if this position is before the given position,
    * a number greater than zero if this position is after the given position, or zero when
    * this and the given position are equal.
    */
  def compareTo(other: Position): Double = js.native
  /**
    * Check if this position is after `other`.
    *
    * @param other A position.
    * @return `true` if position is on a greater line
    * or on the same line on a greater character.
    */
  def isAfter(other: Position): Boolean = js.native
  /**
    * Check if this position is after or equal to `other`.
    *
    * @param other A position.
    * @return `true` if position is on a greater line
    * or on the same line on a greater or equal character.
    */
  def isAfterOrEqual(other: Position): Boolean = js.native
  /**
    * Check if this position is before `other`.
    *
    * @param other A position.
    * @return `true` if position is on a smaller line
    * or on the same line on a smaller character.
    */
  def isBefore(other: Position): Boolean = js.native
  /**
    * Check if this position is before or equal to `other`.
    *
    * @param other A position.
    * @return `true` if position is on a smaller line
    * or on the same line on a smaller or equal character.
    */
  def isBeforeOrEqual(other: Position): Boolean = js.native
  /**
    * Check if this position is equal to `other`.
    *
    * @param other A position.
    * @return `true` if the line and character of the given position are equal to
    * the line and character of this position.
    */
  def isEqual(other: Position): Boolean = js.native
  /**
    * Create a new position relative to this position.
    *
    * @param lineDelta Delta value for the line value, default is `0`.
    * @param characterDelta Delta value for the character value, default is `0`.
    * @return A position which line and character is the sum of the current line and
    * character and the corresponding deltas.
    */
  def translate(): Position = js.native
  /**
    * Derived a new position relative to this position.
    *
    * @param change An object that describes a delta to this position.
    * @return A position that reflects the given delta. Will return `this` position if the change
    * is not changing anything.
    */
  def translate(change: CharacterDelta): Position = js.native
  def translate(lineDelta: Double): Position = js.native
  def translate(lineDelta: Double, characterDelta: Double): Position = js.native
  /**
    * Create a new position derived from this position.
    *
    * @param line Value that should be used as line value, default is the [existing value](#Position.line)
    * @param character Value that should be used as character value, default is the [existing value](#Position.character)
    * @return A position where line and character are replaced by the given values.
    */
  def `with`(): Position = js.native
  /**
    * Derived a new position from this position.
    *
    * @param change An object that describes a change to this position.
    * @return A position that reflects the given change. Will return `this` position if the change
    * is not changing anything.
    */
  def `with`(change: Character): Position = js.native
  def `with`(line: Double): Position = js.native
  def `with`(line: Double, character: Double): Position = js.native
}

