package typings.styleValueTypes.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueType extends js.Object {
  var createTransformer: js.UndefOr[js.Function1[/* template */ String, Transformer]] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var getAnimatableNone: js.UndefOr[js.Function1[/* v */ js.Any, _]] = js.native
  var transform: js.UndefOr[Transformer] = js.native
  def parse(v: js.Any): js.Any = js.native
  def test(v: js.Any): Boolean = js.native
}

object ValueType {
  @scala.inline
  def apply(parse: js.Any => js.Any, test: js.Any => Boolean): ValueType = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[ValueType]
  }
  @scala.inline
  implicit class ValueTypeOps[Self <: ValueType] (val x: Self) extends AnyVal {
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
    def setParse(value: js.Any => js.Any): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setTest(value: js.Any => Boolean): Self = this.set("test", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateTransformer(value: /* template */ String => Transformer): Self = this.set("createTransformer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateTransformer: Self = this.set("createTransformer", js.undefined)
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setGetAnimatableNone(value: /* v */ js.Any => _): Self = this.set("getAnimatableNone", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetAnimatableNone: Self = this.set("getAnimatableNone", js.undefined)
    @scala.inline
    def setTransform(value: /* v */ js.Any => js.Any): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

