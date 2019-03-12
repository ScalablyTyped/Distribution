package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropOptions[T] extends js.Object {
  // bug : 对于 type 为 Object 或 Array 的属性，如果通过该组件自身的 this.setData
  // 来改变属性值的一个子字段，则依旧会触发属性 observer ，且 observer 接收到的 newVal 是变化的那个子字段的值，
  // oldVal 为空， changedPath 包含子字段的字段名相关信息。
  var observer: js.UndefOr[
    js.Function3[/* value */ T, /* old */ T, /* changedPath */ java.lang.String, scala.Unit]
  ] = js.undefined
  var `type`: js.UndefOr[Prop[T] | js.Array[Prop[T]]] = js.undefined
  var value: js.UndefOr[T | scala.Null | js.Function0[js.Object]] = js.undefined
}

object PropOptions {
  @scala.inline
  def apply[T](
    observer: (/* value */ T, /* old */ T, /* changedPath */ java.lang.String) => scala.Unit = null,
    `type`: Prop[T] | js.Array[Prop[T]] = null,
    value: T | js.Function0[js.Object] = null
  ): PropOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (observer != null) __obj.updateDynamic("observer")(js.Any.fromFunction3(observer))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropOptions[T]]
  }
}

