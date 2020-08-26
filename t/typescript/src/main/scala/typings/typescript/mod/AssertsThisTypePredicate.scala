package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsThis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertsThisTypePredicate
  extends TypePredicateBase
     with TypePredicate {
  @JSName("kind")
  var kind_AssertsThisTypePredicate: AssertsThis = js.native
  var parameterIndex: js.UndefOr[scala.Nothing] = js.native
  var parameterName: js.UndefOr[scala.Nothing] = js.native
}

object AssertsThisTypePredicate {
  @scala.inline
  def apply(kind: AssertsThis): AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertsThisTypePredicate]
  }
  @scala.inline
  implicit class AssertsThisTypePredicateOps[Self <: AssertsThisTypePredicate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: AssertsThis): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

