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
@js.native
trait ComponentOptions[Instance /* <: Component[Data, Props, Behaviors] */, Data, Methods, Props, Behaviors /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */] extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 类似于mixins和traits的组件间代码复用机制
    * 参见 [behaviors](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/behaviors.html)
    */
  var behaviors: js.UndefOr[Behaviors] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 组件的内部数据，和 properties 一同用于组件的模版渲染
    */
  var data: js.UndefOr[Data] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 组件接受的外部样式类，参见 外部样式类
    *
    * 有时，组件希望接受外部传入的样式类（类似于 view 组件的 hover-class 属性）。
    * 此时可以在 Component 中用 externalClasses 定义段定义若干个外部样式类。这个特性从小程序基础库版本 1.9.90 开始支持。
    *
    * @version 1.9.90
    */
  var externalClasses: js.UndefOr[js.Array[String]] = js.native
  /**
    * 组件生命周期声明对象，组件的生命周期：created、attached、ready、moved、detached将收归到lifetimes字段内进行声明，
    * 原有声明方式仍旧有效，如同时存在两种声明方式，则lifetimes字段内声明方式优先级最高
    */
  var lifetimes: js.UndefOr[PartialLifetimes] = js.native
  /**
    * 组件的方法，包括事件响应函数和任意的自定义方法
    * 关于事件响应函数的使用
    * 参见[组件事件](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/events.html)
    */
  var methods: js.UndefOr[Methods] = js.native
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 数据监听器可以用于监听和响应任何属性和数据字段的变化。从小程序基础库版本 2.6.1 开始支持
    * @since 2.6.1
    */
  var observers: js.UndefOr[ObserversDefs[Instance]] = js.native
  /**
    * 一些组件选项，请参见文档其他部分的说明
    */
  var options: js.UndefOr[PartialaddGlobalClassbool] = js.native
  /**
    * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
    */
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.native
  /**
    * 组件的对外属性，是属性名到属性设置的映射表
    * 属性设置中可包含三个字段:
    * type 表示属性类型、 value 表示属性初始值、 observer 表示属性值被更改时的响应函数
    */
  var properties: js.UndefOr[Props] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 组件间关系定义，参见 [组件间关系](https://mp.weixin.qq.com/debug/wxadoc/dev/framework/custom-component/relations.html)
    */
  var relations: js.UndefOr[StringDictionary[ComponentRelation[_, _]]] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[/* <: typings.weixinApp.wx.Component[Data, Props, Behaviors] */ Instance, Data, Methods, Props, /* <: js.Array[
  (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */ Behaviors](): ComponentOptions[Instance, Data, Methods, Props, Behaviors] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[Instance, Data, Methods, Props, Behaviors]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions[_, _, _, _, _], /* <: typings.weixinApp.wx.Component[Data, Props, Behaviors] */ Instance, Data, Methods, Props, /* <: js.Array[
  (typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | java.lang.String] */ Behaviors] (val x: Self with (ComponentOptions[Instance, Data, Methods, Props, Behaviors])) extends AnyVal {
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
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setBehaviors(value: Behaviors): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setExternalClassesVarargs(value: String*): Self = this.set("externalClasses", js.Array(value :_*))
    @scala.inline
    def setExternalClasses(value: js.Array[String]): Self = this.set("externalClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalClasses: Self = this.set("externalClasses", js.undefined)
    @scala.inline
    def setLifetimes(value: PartialLifetimes): Self = this.set("lifetimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifetimes: Self = this.set("lifetimes", js.undefined)
    @scala.inline
    def setMethods(value: Methods): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setMoved(value: () => Unit): Self = this.set("moved", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMoved: Self = this.set("moved", js.undefined)
    @scala.inline
    def setObservers(value: ObserversDefs[Instance]): Self = this.set("observers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservers: Self = this.set("observers", js.undefined)
    @scala.inline
    def setOptions(value: PartialaddGlobalClassbool): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPageLifetimes(value: PartialPageLifetimes): Self = this.set("pageLifetimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLifetimes: Self = this.set("pageLifetimes", js.undefined)
    @scala.inline
    def setProperties(value: Props): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setRelations(value: StringDictionary[ComponentRelation[_, _]]): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
  }
  
}

