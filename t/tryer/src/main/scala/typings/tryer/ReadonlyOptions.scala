package typings.tryer

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<tryer.tryer.Options> */
trait ReadonlyOptions extends js.Object {
  val action: js.UndefOr[js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])] = js.undefined
  val fail: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
  val interval: js.UndefOr[Double] = js.undefined
  val limit: js.UndefOr[Double] = js.undefined
  val pass: js.UndefOr[js.Function0[Unit]] = js.undefined
  val until: js.UndefOr[js.Function0[Boolean]] = js.undefined
  val when: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object ReadonlyOptions {
  @scala.inline
  def apply(
    action: js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _]) = null,
    fail: /* err */ Error => Unit = null,
    interval: Int | Double = null,
    limit: Int | Double = null,
    pass: () => Unit = null,
    until: () => Boolean = null,
    when: () => Boolean = null
  ): ReadonlyOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(js.Any.fromFunction0(pass))
    if (until != null) __obj.updateDynamic("until")(js.Any.fromFunction0(until))
    if (when != null) __obj.updateDynamic("when")(js.Any.fromFunction0(when))
    __obj.asInstanceOf[ReadonlyOptions]
  }
}

