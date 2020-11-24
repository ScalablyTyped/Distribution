package typings.wechatMiniprogram.global

import org.scalablytyped.runtime.TopLevel
import typings.wechatMiniprogram.WechatMiniprogram.Component.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Component构造器可用于定义组件，调用Component构造器时可以指定组件的属性、数据、方法等。
  *
  * * 使用 `this.data` 可以获取内部数据和属性值，但不要直接修改它们，应使用 `setData` 修改。
  * * 生命周期函数无法在组件方法中通过 `this` 访问到。
  * * 属性名应避免以 data 开头，即不要命名成 `dataXyz` 这样的形式，因为在 WXML 中， `data-xyz=""` 会被作为节点 dataset 来处理，而不是组件属性。
  * * 在一个组件的定义和使用时，组件的属性名和 data 字段相互间都不能冲突（尽管它们位于不同的定义段中）。
  * * 从基础库 `2.0.9` 开始，对象类型的属性和 data 字段中可以包含函数类型的子字段，即可以通过对象类型的属性字段来传递函数。低于这一版本的基础库不支持这一特性。
  * * `bug` : 对于 type 为 Object 或 Array 的属性，如果通过该组件自身的 `this.setData` 来改变属性值的一个子字段，则依旧会触发属性 observer ，且 observer 接收到的 `newVal` 是变化的那个子字段的值， `oldVal` 为空， `changedPath` 包含子字段的字段名相关信息。
  */
@JSGlobal("Component")
@js.native
object Component extends TopLevel[Constructor]
