package typings.vegaTypings.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any], Boolean]
  ] = js.native
  var recurse: js.UndefOr[Boolean] = js.native
  var signals: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any], Boolean]
  ] = js.native
}

object Data {
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: (/* name */ js.UndefOr[String], /* object */ js.UndefOr[js.Any]) => Boolean): Self = this.set("data", js.Any.fromFunction2(value))
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setRecurse(value: Boolean): Self = this.set("recurse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurse: Self = this.set("recurse", js.undefined)
    @scala.inline
    def setSignals(value: (/* name */ js.UndefOr[String], /* operator */ js.UndefOr[js.Any]) => Boolean): Self = this.set("signals", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSignals: Self = this.set("signals", js.undefined)
  }
  
}

