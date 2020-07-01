package typings.weixinApp.wx

import org.scalablytyped.runtime.StringDictionary
import typings.weixinApp.anon.PartialLifetimes
import typings.weixinApp.anon.PartialPageLifetimes
import typings.weixinApp.anon.PartialaddGlobalClassbool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Component组件参数
  */
/* Inlined parent std.Partial<weixin-app.wx.Lifetimes> */
trait ComponentOptions[Instance /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 类似于mixins和traits的组件间代码复用机制
    * 参见 [behaviors](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/behaviors.html)
    */
  var behaviors: js.UndefOr[Behaviors] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 组件的内部数据，和 properties 一同用于组件的模版渲染
    */
  var data: js.UndefOr[Data] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 组件接受的外部样式类，参见 外部样式类
    *
    * 有时，组件希望接受外部传入的样式类（类似于 view 组件的 hover-class 属性）。
    * 此时可以在 Component 中用 externalClasses 定义段定义若干个外部样式类。这个特性从小程序基础库版本 1.9.90 开始支持。
    *
    * @version 1.9.90
    */
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
    * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
    */
  var lifetimes: js.UndefOr[PartialLifetimes] = js.undefined
  /**
    * 组件的方法，包括事件响应函数和任意的自定义方法
    * 关于事件响应函数的使用
    * 参见[组件事件](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/events.html)
    */
  var methods: js.UndefOr[Methods] = js.undefined
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 数据监听器可以用于监听和响应任何属性和数据字段的变化。从小程序基础库版本 2.6.1 开始支持
    * @since 2.6.1
    */
  var observers: js.UndefOr[ObserversDefs[Instance]] = js.undefined
  /**
    * 一些组件选项，请参见文档其他部分的说明
    */
  var options: js.UndefOr[PartialaddGlobalClassbool] = js.undefined
  /**
    * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
    */
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
  /**
    * 组件的对外属性，是属性名到属性设置的映射表
    * 属性设置中可包含三个字段:
    * type 表示属性类型、 value 表示属性初始值、 observer 表示属性值被更改时的响应函数
    */
  var properties: js.UndefOr[Props] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 组件间关系定义，参见 [组件间关系](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/relations.html)
    */
  var relations: js.UndefOr[StringDictionary[ComponentRelation[_, _]]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[/* <: typings.weixinApp.wx.Component[Data, Props, Behaviors] */ Instance, Data, Methods, Props, /* <: js.Array[
  (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */ Behaviors](
    attached: () => Unit = null,
    behaviors: Behaviors = null,
    created: () => Unit = null,
    data: Data = null,
    detached: () => Unit = null,
    externalClasses: js.Array[String] = null,
    lifetimes: PartialLifetimes = null,
    methods: Methods = null,
    moved: () => Unit = null,
    observers: ObserversDefs[Instance] = null,
    options: PartialaddGlobalClassbool = null,
    pageLifetimes: PartialPageLifetimes = null,
    properties: Props = null,
    ready: () => Unit = null,
    relations: StringDictionary[ComponentRelation[_, _]] = null
  ): ComponentOptions[Instance, Data, Methods, Props, Behaviors] = {
    val __obj = js.Dynamic.literal()
    if (attached != null) __obj.updateDynamic("attached")(js.Any.fromFunction0(attached))
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction0(created))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (detached != null) __obj.updateDynamic("detached")(js.Any.fromFunction0(detached))
    if (externalClasses != null) __obj.updateDynamic("externalClasses")(externalClasses.asInstanceOf[js.Any])
    if (lifetimes != null) __obj.updateDynamic("lifetimes")(lifetimes.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (moved != null) __obj.updateDynamic("moved")(js.Any.fromFunction0(moved))
    if (observers != null) __obj.updateDynamic("observers")(observers.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (pageLifetimes != null) __obj.updateDynamic("pageLifetimes")(pageLifetimes.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[Instance, Data, Methods, Props, Behaviors]]
  }
}

