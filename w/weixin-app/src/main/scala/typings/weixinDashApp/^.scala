package typings.weixinDashApp

import typings.std.ThisType
import typings.weixinDashApp.wxNs.App
import typings.weixinDashApp.wxNs.AppOptions
import typings.weixinDashApp.wxNs.Behavior
import typings.weixinDashApp.wxNs.Component
import typings.weixinDashApp.wxNs.Page
import typings.weixinDashApp.wxNs.PageOptions
import typings.weixinDashApp.wxNs.ThisTypedComponentOptionsWithRecordProps
import typings.weixinDashApp.wxNs.UnboxBehaviorsData
import typings.weixinDashApp.wxNs.UnboxBehaviorsMethods
import typings.weixinDashApp.wxNs.UnboxBehaviorsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * App() 函数用来注册一个小程序。
    * 接受一个 object 参数，其指定小程序的生命周期函数等。
    */
  def App[T /* <: AppOptions */](app: T with (ThisType[T with typings.weixinDashApp.wxNs.App])): Unit = js.native
  /**
    * behaviors 是用于组件间代码共享的特性
    * 类似于一些编程语言中的“mixins”或“traits”
    * 每个 behavior 可以包含一组属性、数据、生命周期函数和方法
    * 组件引用它时，它的属性、数据和方法会被合并到组件中，生命周期函数也会在对应时机被调用
    * 每个组件可以引用多个 behavior
    * behavior 也可以引用其他 behavior
    */
  def Behavior[D, M, P, B /* <: js.Array[(typings.weixinDashApp.wxNs.Behavior[js.Object, js.Object, js.Object]) | String] */](): typings.weixinDashApp.wxNs.Behavior[
    D with UnboxBehaviorsData[B], 
    P with UnboxBehaviorsProps[B], 
    M with UnboxBehaviorsMethods[B]
  ] = js.native
  def Behavior[D, M, P, B /* <: js.Array[(typings.weixinDashApp.wxNs.Behavior[js.Object, js.Object, js.Object]) | String] */](options: ThisTypedComponentOptionsWithRecordProps[Component[D, P, B], D, M, P, B]): typings.weixinDashApp.wxNs.Behavior[
    D with UnboxBehaviorsData[B], 
    P with UnboxBehaviorsProps[B], 
    M with UnboxBehaviorsMethods[B]
  ] = js.native
  // #endregion
  // #region Compontent组件
  def Component[D, M, P, B /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */](): String = js.native
  def Component[D, M, P, B /* <: js.Array[(Behavior[js.Object, js.Object, js.Object]) | String] */](
    options: ThisTypedComponentOptionsWithRecordProps[typings.weixinDashApp.wxNs.Component[D, P, B], D, M, P, B]
  ): String = js.native
  // #endregion
  // #region Page
  /**
    * Page() 函数用来注册一个页面。
    * 接受一个 object 参数，其指定页面的初始数据、生命周期函数、事件处理函数等。
    */
  def Page[T /* <: PageOptions with js.Object */](page: T with (ThisType[T with (typings.weixinDashApp.wxNs.Page[js.Object, js.Object])])): Unit = js.native
  /**
    * 获取小程序实例
    */
  def getApp(): App = js.native
  /**
    * getCurrentPages() 函数用于获取当前页面栈的实例，
    * 以数组形式按栈的顺序给出，第一个元素为首页，最后一个元素为当前页面。
    */
  def getCurrentPages(): js.Array[Page[js.Object, js.Object]] = js.native
}

