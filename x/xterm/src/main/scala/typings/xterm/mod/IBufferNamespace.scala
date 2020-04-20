package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the terminal's set of buffers.
  */
@js.native
trait IBufferNamespace extends js.Object {
  /**
    * The active buffer, this will either be the normal or alternate buffers.
    */
  val active: IBuffer = js.native
  /**
    * The alternate buffer, this becomes the active buffer when an application
    * enters this mode via DECSET (`CSI ? 4 7 h`)
    */
  val alternate: IBuffer = js.native
  /**
    * The normal buffer.
    */
  val normal: IBuffer = js.native
  /**
    * Adds an event listener for when the active buffer changes.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onBufferChange")
  var onBufferChange_Original: IEvent[IBuffer, Unit] = js.native
  /**
    * Adds an event listener for when the active buffer changes.
    * @returns an `IDisposable` to stop listening.
    */
  def onBufferChange(listener: js.Function2[/* arg1 */ IBuffer, /* arg2 */ Unit, _]): IDisposable = js.native
}

