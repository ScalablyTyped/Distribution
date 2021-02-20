package typings.wechatMiniprogram

import typings.std.ArrayBuffer
import typings.wechatMiniprogram.DB.IRegExpOptions
import typings.wechatMiniprogram.DB.IServerDateOptions
import typings.wechatMiniprogram.ICloud.ICDNFilePathSpec
import typings.wechatMiniprogram.WechatMiniprogram.App.Constructor
import typings.wechatMiniprogram.WechatMiniprogram.App.GetApp
import typings.wechatMiniprogram.WechatMiniprogram.Console
import typings.wechatMiniprogram.WechatMiniprogram.Page.GetCurrentPages
import typings.wechatMiniprogram.WechatMiniprogram.Wx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("App")
  @js.native
  def App: Constructor = js.native
  @scala.inline
  def App_=(x: Constructor): Unit = js.Dynamic.global.updateDynamic("App")(x.asInstanceOf[js.Any])
  
  /** 注册一个 `behavior`，接受一个 `Object` 类型的参数。*/
  @JSGlobal("Behavior")
  @js.native
  def Behavior: typings.wechatMiniprogram.WechatMiniprogram.Behavior.Constructor = js.native
  @scala.inline
  def Behavior_=(x: typings.wechatMiniprogram.WechatMiniprogram.Behavior.Constructor): Unit = js.Dynamic.global.updateDynamic("Behavior")(x.asInstanceOf[js.Any])
  
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
  def Component: typings.wechatMiniprogram.WechatMiniprogram.Component.Constructor = js.native
  @scala.inline
  def Component_=(x: typings.wechatMiniprogram.WechatMiniprogram.Component.Constructor): Unit = js.Dynamic.global.updateDynamic("Component")(x.asInstanceOf[js.Any])
  
  // === Database ===
  object DB {
    
    /**
      * A contract that all API provider must adhere to
      */
    @JSGlobal("DB.APIBaseContract")
    @js.native
    class APIBaseContract[PromiseReturn, CallbackReturn, Param /* <: IAPIParam[_] */, Context] ()
      extends typings.wechatMiniprogram.DB.APIBaseContract[PromiseReturn, CallbackReturn, Param, Context]
    
    @JSGlobal("DB.Batch")
    @js.native
    class Batch ()
      extends typings.wechatMiniprogram.DB.Batch
    
    @JSGlobal("DB.CollectionReference")
    @js.native
    class CollectionReference protected ()
      extends typings.wechatMiniprogram.DB.CollectionReference {
      protected def this(name: String, database: typings.wechatMiniprogram.DB.Database) = this()
    }
    
    /**
      * The class of all exposed cloud database instances
      */
    @JSGlobal("DB.Database")
    @js.native
    class Database protected ()
      extends typings.wechatMiniprogram.DB.Database
    
    @JSGlobal("DB.DatabaseAggregateCommand")
    @js.native
    class DatabaseAggregateCommand ()
      extends typings.wechatMiniprogram.DB.DatabaseAggregateCommand
    
    @JSGlobal("DB.DatabaseLogicCommand")
    @js.native
    class DatabaseLogicCommand ()
      extends typings.wechatMiniprogram.DB.DatabaseLogicCommand
    
    @JSGlobal("DB.DatabaseProjectionCommand")
    @js.native
    class DatabaseProjectionCommand ()
      extends typings.wechatMiniprogram.DB.DatabaseProjectionCommand
    
    @JSGlobal("DB.DatabaseQueryCommand")
    @js.native
    class DatabaseQueryCommand ()
      extends typings.wechatMiniprogram.DB.DatabaseQueryCommand
    
    @JSGlobal("DB.DatabaseUpdateCommand")
    @js.native
    class DatabaseUpdateCommand ()
      extends typings.wechatMiniprogram.DB.DatabaseUpdateCommand
    
    @JSGlobal("DB.DocumentReference")
    @js.native
    class DocumentReference protected ()
      extends typings.wechatMiniprogram.DB.DocumentReference {
      protected def this(docId: String, database: typings.wechatMiniprogram.DB.Database) = this()
      protected def this(docId: Double, database: typings.wechatMiniprogram.DB.Database) = this()
    }
    
    @JSGlobal("DB.GeoLineString")
    @js.native
    abstract class GeoLineString protected ()
      extends typings.wechatMiniprogram.DB.GeoLineString {
      def this(points: js.Array[typings.wechatMiniprogram.DB.GeoPoint]) = this()
    }
    
    @JSGlobal("DB.GeoMultiLineString")
    @js.native
    abstract class GeoMultiLineString protected ()
      extends typings.wechatMiniprogram.DB.GeoMultiLineString {
      def this(lines: js.Array[typings.wechatMiniprogram.DB.GeoLineString]) = this()
    }
    
    @JSGlobal("DB.GeoMultiPoint")
    @js.native
    abstract class GeoMultiPoint protected ()
      extends typings.wechatMiniprogram.DB.GeoMultiPoint {
      def this(points: js.Array[typings.wechatMiniprogram.DB.GeoPoint]) = this()
    }
    
    @JSGlobal("DB.GeoMultiPolygon")
    @js.native
    abstract class GeoMultiPolygon protected ()
      extends typings.wechatMiniprogram.DB.GeoMultiPolygon {
      def this(polygons: js.Array[typings.wechatMiniprogram.DB.GeoPolygon]) = this()
    }
    
    @JSGlobal("DB.GeoPoint")
    @js.native
    abstract class GeoPoint protected ()
      extends typings.wechatMiniprogram.DB.GeoPoint {
      def this(longitude: Double, latitude: Double) = this()
    }
    
    @JSGlobal("DB.GeoPolygon")
    @js.native
    abstract class GeoPolygon protected ()
      extends typings.wechatMiniprogram.DB.GeoPolygon {
      def this(lines: js.Array[typings.wechatMiniprogram.DB.GeoLineString]) = this()
    }
    
    @JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
    @js.native
    object LOGIC_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL with String] = js.native
      
      /* "and" */ val AND: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.AND with String = js.native
      
      /* "nor" */ val NOR: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.NOR with String = js.native
      
      /* "not" */ val NOT: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.NOT with String = js.native
      
      /* "or" */ val OR: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.OR with String = js.native
    }
    
    @JSGlobal("DB.PROJECTION_COMMANDS_LITERAL")
    @js.native
    object PROJECTION_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.PROJECTION_COMMANDS_LITERAL with String] = js.native
      
      /* "slice" */ val SLICE: typings.wechatMiniprogram.DB.PROJECTION_COMMANDS_LITERAL.SLICE with String = js.native
    }
    
    @JSGlobal("DB.QUERY_COMMANDS_LITERAL")
    @js.native
    object QUERY_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL with String] = js.native
      
      /* "all" */ val ALL: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.ALL with String = js.native
      
      /* "elemMatch" */ val ELEM_MATCH: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.ELEM_MATCH with String = js.native
      
      /* "eq" */ val EQ: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.EQ with String = js.native
      
      /* "exists" */ val EXISTS: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.EXISTS with String = js.native
      
      /* "geoIntersects" */ val GEO_INTERSECTS: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_INTERSECTS with String = js.native
      
      /* "geoNear" */ val GEO_NEAR: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_NEAR with String = js.native
      
      /* "geoWithin" */ val GEO_WITHIN: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_WITHIN with String = js.native
      
      /* "gt" */ val GT: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GT with String = js.native
      
      /* "gte" */ val GTE: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GTE with String = js.native
      
      /* "in" */ val IN: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.IN with String = js.native
      
      /* "lt" */ val LT: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.LT with String = js.native
      
      /* "lte" */ val LTE: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.LTE with String = js.native
      
      /* "mod" */ val MOD: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.MOD with String = js.native
      
      /* "neq" */ val NEQ: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.NEQ with String = js.native
      
      /* "nin" */ val NIN: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.NIN with String = js.native
      
      /* "size" */ val SIZE: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.SIZE with String = js.native
    }
    
    @JSGlobal("DB.Query")
    @js.native
    class Query ()
      extends typings.wechatMiniprogram.DB.Query
    
    @JSGlobal("DB.RealtimeListener")
    @js.native
    class RealtimeListener ()
      extends typings.wechatMiniprogram.DB.RealtimeListener
    
    @JSGlobal("DB.RegExp")
    @js.native
    abstract class RegExp protected ()
      extends typings.wechatMiniprogram.DB.RegExp {
      def this(options: IRegExpOptions) = this()
    }
    
    @JSGlobal("DB.ServerDate")
    @js.native
    abstract class ServerDate ()
      extends typings.wechatMiniprogram.DB.ServerDate {
      def this(options: IServerDateOptions) = this()
    }
    
    @JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
    @js.native
    object UPDATE_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL with String] = js.native
      
      /* "addToSet" */ val ADD_TO_SET: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.ADD_TO_SET with String = js.native
      
      /* "bit" */ val BIT: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.BIT with String = js.native
      
      /* "inc" */ val INC: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.INC with String = js.native
      
      /* "max" */ val MAX: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MAX with String = js.native
      
      /* "min" */ val MIN: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MIN with String = js.native
      
      /* "mul" */ val MUL: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MUL with String = js.native
      
      /* "pop" */ val POP: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.POP with String = js.native
      
      /* "pull" */ val PULL: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PULL with String = js.native
      
      /* "pullAll" */ val PULL_ALL: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PULL_ALL with String = js.native
      
      /* "push" */ val PUSH: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PUSH with String = js.native
      
      /* "remove" */ val REMOVE: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.REMOVE with String = js.native
      
      /* "rename" */ val RENAME: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.RENAME with String = js.native
      
      /* "set" */ val SET: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.SET with String = js.native
      
      /* "shift" */ val SHIFT: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.SHIFT with String = js.native
      
      /* "unshift" */ val UNSHIFT: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT with String = js.native
    }
  }
  
  object ICloud {
    
    // === end ===
    // === API: CDN ===
    @JSGlobal("ICloud.CDN")
    @js.native
    abstract class CDN protected ()
      extends typings.wechatMiniprogram.ICloud.CDN {
      def this(target: String) = this()
      def this(target: ArrayBuffer) = this()
      def this(target: ICDNFilePathSpec) = this()
    }
    
    // === end ===
    // === API: CloudID ===
    @JSGlobal("ICloud.CloudID")
    @js.native
    abstract class CloudID protected ()
      extends typings.wechatMiniprogram.ICloud.CloudID {
      def this(cloudID: String) = this()
    }
  }
  
  @JSGlobal("InternalSymbol")
  @js.native
  class InternalSymbol ()
    extends typings.wechatMiniprogram.InternalSymbol
  
  /**
    * 注册小程序中的一个页面。接受一个 `Object` 类型参数，其指定页面的初始数据、生命周期回调、事件处理函数等。
    */
  @JSGlobal("Page")
  @js.native
  def Page: typings.wechatMiniprogram.WechatMiniprogram.Page.Constructor = js.native
  @scala.inline
  def Page_=(x: typings.wechatMiniprogram.WechatMiniprogram.Page.Constructor): Unit = js.Dynamic.global.updateDynamic("Page")(x.asInstanceOf[js.Any])
  
  /** [clearInterval(number intervalID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearInterval.html)
    *
    * 取消由 setInterval 设置的定时器。 */
  @JSGlobal("clearInterval")
  @js.native
  def clearInterval(/** 要取消的定时器的 ID */
  intervalID: Double): Unit = js.native
  
  /** [clearTimeout(number timeoutID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearTimeout.html)
    *
    * 取消由 setTimeout 设置的定时器。 */
  @JSGlobal("clearTimeout")
  @js.native
  def clearTimeout(/** 要取消的定时器的 ID */
  timeoutID: Double): Unit = js.native
  
  @JSGlobal("console")
  @js.native
  val console: Console = js.native
  
  @JSGlobal("exports")
  @js.native
  def exports: js.Any = js.native
  @scala.inline
  def exports_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("getApp")
  @js.native
  def getApp: GetApp = js.native
  @scala.inline
  def getApp_=(x: GetApp): Unit = js.Dynamic.global.updateDynamic("getApp")(x.asInstanceOf[js.Any])
  
  /**
    * 获取当前页面栈。数组中第一个元素为首页，最后一个元素为当前页面。
    *  __注意：__
    *  - __不要尝试修改页面栈，会导致路由以及页面状态错误。__
    *  - 不要在 `App.onLaunch` 的时候调用 `getCurrentPages()`，此时 `page` 还没有生成。
    */
  @JSGlobal("getCurrentPages")
  @js.native
  def getCurrentPages: GetCurrentPages = js.native
  @scala.inline
  def getCurrentPages_=(x: GetCurrentPages): Unit = js.Dynamic.global.updateDynamic("getCurrentPages")(x.asInstanceOf[js.Any])
  
  object module {
    
    @JSGlobal("module")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("module.exports")
    @js.native
    def exports: js.Any = js.native
    @scala.inline
    def exports_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("require")
  @js.native
  def require(module: String): js.Any = js.native
  
  /** [number setInterval(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setInterval.html)
    *
    * 设定一个定时器。按照指定的周期（以毫秒计）来执行注册的回调函数 */
  @JSGlobal("setInterval")
  @js.native
  def setInterval(/** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  @JSGlobal("setInterval")
  @js.native
  def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: js.UndefOr[scala.Nothing],
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
  @JSGlobal("setInterval")
  @js.native
  def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double
  ): Double = js.native
  @JSGlobal("setInterval")
  @js.native
  def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
  
  /** [number setTimeout(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setTimeout.html)
    *
    * 设定一个定时器。在定时到期以后执行注册的回调函数 */
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(/** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _]): Double = js.native
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: js.UndefOr[scala.Nothing],
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double
  ): Double = js.native
  @JSGlobal("setTimeout")
  @js.native
  def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, _],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = js.native
  
  @JSGlobal("wx")
  @js.native
  val wx: Wx = js.native
}
