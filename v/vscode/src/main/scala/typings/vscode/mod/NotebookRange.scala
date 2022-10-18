package typings.vscode.mod

import typings.vscode.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "NotebookRange")
@js.native
open class NotebookRange protected () extends StObject {
  /**
    * Create a new notebook range. If `start` is not
    * before or equal to `end`, the values will be swapped.
    *
    * @param start start index
    * @param end end index.
    */
  def this(start: Double, end: Double) = this()
  
  /**
    * The exclusive end index of this range (zero-based).
    */
  val end: Double = js.native
  
  /**
    * `true` if `start` and `end` are equal.
    */
  val isEmpty: Boolean = js.native
  
  /**
    * The zero-based start index of this range.
    */
  val start: Double = js.native
  
  /**
    * Derive a new range for this range.
    *
    * @param change An object that describes a change to this range.
    * @return A range that reflects the given change. Will return `this` range if the change
    * is not changing anything.
    */
  def `with`(change: End): NotebookRange = js.native
}
