package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clauses extends js.Object {
  var all: scala.Double = js.native
  var clauses: scala.Double = js.native
  var minimal: scala.Double = js.native
  var none: scala.Double = js.native
  var wiql: scala.Double = js.native
}

object Clauses {
  @scala.inline
  def apply(
    all: scala.Double,
    clauses: scala.Double,
    minimal: scala.Double,
    none: scala.Double,
    wiql: scala.Double
  ): Clauses = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], clauses = clauses.asInstanceOf[js.Any], minimal = minimal.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], wiql = wiql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clauses]
  }
  @scala.inline
  implicit class ClausesOps[Self <: Clauses] (val x: Self) extends AnyVal {
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def setClauses(value: scala.Double): Self = this.set("clauses", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimal(value: scala.Double): Self = this.set("minimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setWiql(value: scala.Double): Self = this.set("wiql", value.asInstanceOf[js.Any])
  }
  
}

