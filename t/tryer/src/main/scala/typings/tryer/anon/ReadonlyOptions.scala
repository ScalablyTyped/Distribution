package typings.tryer.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<tryer.tryer.Options> */
@js.native
trait ReadonlyOptions extends js.Object {
  val action: js.UndefOr[js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])] = js.native
  val fail: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  val interval: js.UndefOr[Double] = js.native
  val limit: js.UndefOr[Double] = js.native
  val pass: js.UndefOr[js.Function0[Unit]] = js.native
  val until: js.UndefOr[js.Function0[Boolean]] = js.native
  val when: js.UndefOr[js.Function0[Boolean]] = js.native
}

object ReadonlyOptions {
  @scala.inline
  def apply(): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyOptions]
  }
  @scala.inline
  implicit class ReadonlyOptionsOps[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
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
    def setActionFunction1(value: /* done */ js.Function0[Unit] => _): Self = this.set("action", js.Any.fromFunction1(value))
    @scala.inline
    def setActionFunction0(value: () => js.Promise[_]): Self = this.set("action", js.Any.fromFunction0(value))
    @scala.inline
    def setAction(value: js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setFail(value: /* err */ Error => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setPass(value: () => Unit): Self = this.set("pass", js.Any.fromFunction0(value))
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setUntil(value: () => Boolean): Self = this.set("until", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
    @scala.inline
    def setWhen(value: () => Boolean): Self = this.set("when", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWhen: Self = this.set("when", js.undefined)
  }
  
}

