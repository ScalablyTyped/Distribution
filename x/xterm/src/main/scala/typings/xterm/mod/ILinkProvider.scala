package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom link provider.
  */
trait ILinkProvider extends js.Object {
  /**
    * Provides a link a buffer position
    * @param position The position of the buffer that is currently active.
    * @param callback The callback to be fired with the resulting link or
    * `undefined` when ready.
    */
  def provideLink(position: IBufferCellPosition, callback: js.Function1[/* link */ js.UndefOr[ILink], Unit]): Unit
}

object ILinkProvider {
  @scala.inline
  def apply(provideLink: (IBufferCellPosition, js.Function1[/* link */ js.UndefOr[ILink], Unit]) => Unit): ILinkProvider = {
    val __obj = js.Dynamic.literal(provideLink = js.Any.fromFunction2(provideLink))
    __obj.asInstanceOf[ILinkProvider]
  }
}

