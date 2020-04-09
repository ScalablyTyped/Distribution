package typings.vfileMessage.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.unist.mod.Node
import typings.unist.mod.Point
import typings.unist.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vfile-message", JSImport.Namespace)
@js.native
class ^ protected () extends VFileMessage {
  /**
    * Constructor of a message for `reason` at `position` from `origin`.
    * When an error is passed in as `reason`, copies the `stack`.
    *
    * @param reason Reason for message (`string` or `Error`). Uses the stack and message of the error if given.
    * @param position Place at which the message occurred in a file (`Node`, `Position`, or `Point`, optional).
    * @param origin Place in code the message originates from (`string`, optional).
    */
  def this(reason: String) = this()
  def this(reason: Error) = this()
  def this(reason: String, position: Node) = this()
  def this(reason: String, position: Point) = this()
  def this(reason: String, position: Position) = this()
  def this(reason: Error, position: Node) = this()
  def this(reason: Error, position: Point) = this()
  def this(reason: Error, position: Position) = this()
  def this(reason: String, position: Node, origin: String) = this()
  def this(reason: String, position: Point, origin: String) = this()
  def this(reason: String, position: Position, origin: String) = this()
  def this(reason: Error, position: Node, origin: String) = this()
  def this(reason: Error, position: Point, origin: String) = this()
  def this(reason: Error, position: Position, origin: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

@JSImport("vfile-message", JSImport.Namespace)
@js.native
object ^ extends TopLevel[VFileMessage]

