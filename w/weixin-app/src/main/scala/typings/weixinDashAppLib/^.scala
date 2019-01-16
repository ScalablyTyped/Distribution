package typings
package weixinDashAppLib

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
  def App[T /* <: weixinDashAppLib.wxNs.AppOptions */](app: T with (stdLib.ThisType[T with weixinDashAppLib.wxNs.App])): scala.Unit = js.native
  /**
    * behaviors 是用于组件间代码共享的特性
    * 类似于一些编程语言中的“mixins”或“traits”
    * 每个 behavior 可以包含一组属性、数据、生命周期函数和方法
    * 组件引用它时，它的属性、数据和方法会被合并到组件中，生命周期函数也会在对应时机被调用
    * 每个组件可以引用多个 behavior
    * behavior 也可以引用其他 behavior
    */
  def Behavior[D, M, P](): java.lang.String = js.native
  def Behavior[D, M, P](
    options: weixinDashAppLib.wxNs.ThisTypedComponentOptionsWithRecordProps[weixinDashAppLib.wxNs.Component[D, P], D, M, P]
  ): java.lang.String = js.native
  // #endregion
  // #region Compontent组件
  def Component[D, M, P](): java.lang.String = js.native
  def Component[D, M, P](
    options: weixinDashAppLib.wxNs.ThisTypedComponentOptionsWithRecordProps[weixinDashAppLib.wxNs.Component[D, P], D, M, P]
  ): java.lang.String = js.native
  // #endregion
  // #region Page
  /**
    * Page() 函数用来注册一个页面。
    * 接受一个 object 参数，其指定页面的初始数据、生命周期函数、事件处理函数等。
    */
  def Page[T /* <: weixinDashAppLib.wxNs.PageOptions with js.Object */](page: T with (stdLib.ThisType[T with (weixinDashAppLib.wxNs.Page[js.Object, js.Object])])): scala.Unit = js.native
  /**
    * 获取小程序实例
    */
  def getApp(): weixinDashAppLib.wxNs.App = js.native
  /**
    * getCurrentPages() 函数用于获取当前页面栈的实例，
    * 以数组形式按栈的顺序给出，第一个元素为首页，最后一个元素为当前页面。
    */
  def getCurrentPages(): js.Array[weixinDashAppLib.wxNs.Page[js.Object, js.Object]] = js.native
}

