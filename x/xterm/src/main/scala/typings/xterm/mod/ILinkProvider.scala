package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom link provider.
  */
@js.native
trait ILinkProvider extends js.Object {
  /**
    * Provides a link a buffer position
    * @param bufferLineNumber The y position of the buffer to check for links
    * within.
    * @param callback The callback to be fired when ready with the resulting
    * link(s) for the line or `undefined`.
    */
  def provideLinks(bufferLineNumber: Double, callback: js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]): Unit = js.native
}

object ILinkProvider {
  @scala.inline
  def apply(provideLinks: (Double, js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]) => Unit): ILinkProvider = {
    val __obj = js.Dynamic.literal(provideLinks = js.Any.fromFunction2(provideLinks))
    __obj.asInstanceOf[ILinkProvider]
  }
  @scala.inline
  implicit class ILinkProviderOps[Self <: ILinkProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvideLinks(value: (Double, js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]) => Unit): Self = this.set("provideLinks", js.Any.fromFunction2(value))
  }
  
}

