package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropOptions[T] extends js.Object {
  // bug : 对于 type 为 Object 或 Array 的属性，如果通过该组件自身的 this.setData
  // 来改变属性值的一个子字段，则依旧会触发属性 observer ，且 observer 接收到的 newVal 是变化的那个子字段的值，
  // oldVal 为空， changedPath 包含子字段的字段名相关信息。
  var observer: js.UndefOr[js.Function3[/* value */ T, /* old */ T, /* changedPath */ String, Unit]] = js.native
  var `type`: js.UndefOr[Prop[T] | js.Array[Prop[T]]] = js.native
  var value: js.UndefOr[T | Null | js.Function0[js.Object]] = js.native
}

object PropOptions {
  @scala.inline
  def apply[T](): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropOptions[T]]
  }
  @scala.inline
  implicit class PropOptionsOps[Self <: PropOptions[_], T] (val x: Self with PropOptions[T]) extends AnyVal {
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
    def setObserver(value: (/* value */ T, /* old */ T, /* changedPath */ String) => Unit): Self = this.set("observer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteObserver: Self = this.set("observer", js.undefined)
    @scala.inline
    def setTypeVarargs(value: Prop[T]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setTypeFunction0(value: () => T): Self = this.set("type", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: Prop[T] | js.Array[Prop[T]]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValueFunction0(value: () => js.Object): Self = this.set("value", js.Any.fromFunction0(value))
    @scala.inline
    def setValue(value: T | js.Function0[js.Object]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

