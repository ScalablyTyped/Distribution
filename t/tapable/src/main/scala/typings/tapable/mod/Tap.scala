package typings.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tap[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] extends js.Object {
  var before: js.UndefOr[String | js.Array[String]] = js.native
  var context: js.UndefOr[Boolean] = js.native
  var fn: TapFunction[TTapType, TArg1, TArg2, TArg3, THookResult] = js.native
  var name: String = js.native
  var stage: js.UndefOr[Double] = js.native
  var `type`: TTapType = js.native
}

object Tap {
  @scala.inline
  def apply[/* <: typings.tapable.mod.TapType */ TTapType, TArg1, TArg2, TArg3, THookResult](
    fn: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit,
    name: String,
    `type`: TTapType
  ): Tap[TTapType, TArg1, TArg2, TArg3, THookResult] = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tap[TTapType, TArg1, TArg2, TArg3, THookResult]]
  }
  @scala.inline
  implicit class TapOps[Self <: Tap[_, _, _, _, _], /* <: typings.tapable.mod.TapType */ TTapType, TArg1, TArg2, TArg3, THookResult] (val x: Self with (Tap[TTapType, TArg1, TArg2, TArg3, THookResult])) extends AnyVal {
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
    def setFn(
      value: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit
    ): Self = this.set("fn", js.Any.fromFunction4(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TTapType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeVarargs(value: String*): Self = this.set("before", js.Array(value :_*))
    @scala.inline
    def setBefore(value: String | js.Array[String]): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    @scala.inline
    def setContext(value: Boolean): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setStage(value: Double): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
  }
  
}

