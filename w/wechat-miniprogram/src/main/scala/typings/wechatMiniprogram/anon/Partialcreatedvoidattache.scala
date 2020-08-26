package typings.wechatMiniprogram.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{created (): void, attached (): void, ready (): void, moved (): void, detached (): void, error (err : std.Error): void}> */
@js.native
trait Partialcreatedvoidattache extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  var error: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object Partialcreatedvoidattache {
  @scala.inline
  def apply(): Partialcreatedvoidattache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcreatedvoidattache]
  }
  @scala.inline
  implicit class PartialcreatedvoidattacheOps[Self <: Partialcreatedvoidattache] (val x: Self) extends AnyVal {
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setError(value: /* err */ Error => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
  }
  
}

