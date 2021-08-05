package typings.wechatMiniprogram

import typings.std.ArrayBuffer
import typings.std.Record
import typings.wechatMiniprogram.DB.DatabaseCommand
import typings.wechatMiniprogram.DB.IGeo
import typings.wechatMiniprogram.DB.IGeoIntersectsCommandOptions
import typings.wechatMiniprogram.DB.IGeoJSONLineString
import typings.wechatMiniprogram.DB.IGeoJSONMultiLineString
import typings.wechatMiniprogram.DB.IGeoJSONMultiPoint
import typings.wechatMiniprogram.DB.IGeoJSONMultiPolygon
import typings.wechatMiniprogram.DB.IGeoJSONPolygon
import typings.wechatMiniprogram.DB.IGeoNearCommandOptions
import typings.wechatMiniprogram.DB.IGeoWithinCommandOptions
import typings.wechatMiniprogram.DB.IRegExpConstructor
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("App")
  @js.native
  def App: Constructor = js.native
  inline def App_=(x: Constructor): Unit = js.Dynamic.global.updateDynamic("App")(x.asInstanceOf[js.Any])
  
  /** 注册一个 `behavior`，接受一个 `Object` 类型的参数。*/
  @JSGlobal("Behavior")
  @js.native
  def Behavior: typings.wechatMiniprogram.WechatMiniprogram.Behavior.Constructor = js.native
  inline def Behavior_=(x: typings.wechatMiniprogram.WechatMiniprogram.Behavior.Constructor): Unit = js.Dynamic.global.updateDynamic("Behavior")(x.asInstanceOf[js.Any])
  
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
  inline def Component_=(x: typings.wechatMiniprogram.WechatMiniprogram.Component.Constructor): Unit = js.Dynamic.global.updateDynamic("Component")(x.asInstanceOf[js.Any])
  
  // === Database ===
  object DB {
    
    /**
      * A contract that all API provider must adhere to
      */
    @JSGlobal("DB.APIBaseContract")
    @js.native
    class APIBaseContract[PromiseReturn, CallbackReturn, Param /* <: IAPIParam[js.Any] */, Context] ()
      extends StObject
         with typings.wechatMiniprogram.DB.APIBaseContract[PromiseReturn, CallbackReturn, Param, Context] {
      
      /**
        * In case of callback-style invocation, this function will be called
        */
      /* CompleteClass */
      override def getCallbackReturn(param: Param, context: Context): CallbackReturn = js.native
      
      /* CompleteClass */
      override def getContext(param: Param): Context = js.native
      
      /* CompleteClass */
      override def getFinalParam[T /* <: Param */](param: Param, context: Context): T = js.native
      
      /* CompleteClass */
      override def run[T /* <: Param */](param: T): js.Promise[PromiseReturn] = js.native
    }
    
    @JSGlobal("DB.Batch")
    @js.native
    class Batch ()
      extends StObject
         with typings.wechatMiniprogram.DB.Batch
    
    @JSGlobal("DB.CollectionReference")
    @js.native
    class CollectionReference protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.CollectionReference {
      /* private */ def this(name: String, database: typings.wechatMiniprogram.DB.Database) = this()
    }
    
    /**
      * The class of all exposed cloud database instances
      */
    @JSGlobal("DB.Database")
    @js.native
    /* private */ class Database ()
      extends StObject
         with typings.wechatMiniprogram.DB.Database {
      
      /* CompleteClass */
      override val Geo: IGeo = js.native
      
      /* CompleteClass */
      override def RegExp(options: IRegExpOptions): typings.wechatMiniprogram.DB.RegExp = js.native
      /* CompleteClass */
      @JSName("RegExp")
      override val RegExp_Original: IRegExpConstructor = js.native
      
      /* CompleteClass */
      override def collection(collectionName: String): typings.wechatMiniprogram.DB.CollectionReference = js.native
      
      /* CompleteClass */
      override val command: DatabaseCommand = js.native
      
      /* CompleteClass */
      override val config: ICloudConfig = js.native
      
      /* CompleteClass */
      override def serverDate(): typings.wechatMiniprogram.DB.ServerDate = js.native
    }
    
    @JSGlobal("DB.DatabaseAggregateCommand")
    @js.native
    class DatabaseAggregateCommand ()
      extends StObject
         with typings.wechatMiniprogram.DB.DatabaseAggregateCommand
    
    @JSGlobal("DB.DatabaseLogicCommand")
    @js.native
    class DatabaseLogicCommand ()
      extends StObject
         with typings.wechatMiniprogram.DB.DatabaseLogicCommand {
      
      /* CompleteClass */
      override def and(expressions: typings.wechatMiniprogram.DB.DatabaseLogicCommand*): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def nor(expressions: typings.wechatMiniprogram.DB.DatabaseLogicCommand*): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def not(expression: typings.wechatMiniprogram.DB.DatabaseLogicCommand): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def or(expressions: typings.wechatMiniprogram.DB.DatabaseLogicCommand*): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
    }
    
    @JSGlobal("DB.DatabaseProjectionCommand")
    @js.native
    class DatabaseProjectionCommand ()
      extends StObject
         with typings.wechatMiniprogram.DB.DatabaseProjectionCommand
    
    @JSGlobal("DB.DatabaseQueryCommand")
    @js.native
    class DatabaseQueryCommand ()
      extends StObject
         with typings.wechatMiniprogram.DB.DatabaseQueryCommand {
      
      /* CompleteClass */
      override def all(`val`: js.Array[js.Any]): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def and(expressions: typings.wechatMiniprogram.DB.DatabaseLogicCommand*): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def elemMatch(`val`: js.Any): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def eq(`val`: js.Any): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def exists(`val`: Boolean): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def geoIntersects(options: IGeoIntersectsCommandOptions): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def geoNear(options: IGeoNearCommandOptions): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def geoWithin(options: IGeoWithinCommandOptions): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def gt(`val`: js.Any): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def gte(`val`: js.Any): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def in(`val`: js.Array[js.Any]): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def lt(`val`: js.Any): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def lte(`val`: js.Any): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def mod(divisor: Double, remainder: Double): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def neq(`val`: js.Any): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def nin(`val`: js.Array[js.Any]): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def nor(expressions: typings.wechatMiniprogram.DB.DatabaseLogicCommand*): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def not(expression: typings.wechatMiniprogram.DB.DatabaseLogicCommand): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def or(expressions: typings.wechatMiniprogram.DB.DatabaseLogicCommand*): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
      
      /* CompleteClass */
      override def size(`val`: Double): typings.wechatMiniprogram.DB.DatabaseLogicCommand = js.native
    }
    
    @JSGlobal("DB.DatabaseUpdateCommand")
    @js.native
    class DatabaseUpdateCommand ()
      extends StObject
         with typings.wechatMiniprogram.DB.DatabaseUpdateCommand
    
    @JSGlobal("DB.DocumentReference")
    @js.native
    class DocumentReference protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.DocumentReference {
      /* private */ def this(docId: String, database: typings.wechatMiniprogram.DB.Database) = this()
      /* private */ def this(docId: Double, database: typings.wechatMiniprogram.DB.Database) = this()
    }
    
    @JSGlobal("DB.GeoLineString")
    @js.native
    abstract class GeoLineString protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.GeoLineString {
      def this(points: js.Array[typings.wechatMiniprogram.DB.GeoPoint]) = this()
      
      /* CompleteClass */
      var points: js.Array[typings.wechatMiniprogram.DB.GeoPoint] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONLineString = js.native
    }
    
    @JSGlobal("DB.GeoMultiLineString")
    @js.native
    abstract class GeoMultiLineString protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.GeoMultiLineString {
      def this(lines: js.Array[typings.wechatMiniprogram.DB.GeoLineString]) = this()
      
      /* CompleteClass */
      var lines: js.Array[typings.wechatMiniprogram.DB.GeoLineString] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONMultiLineString = js.native
    }
    
    @JSGlobal("DB.GeoMultiPoint")
    @js.native
    abstract class GeoMultiPoint protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.GeoMultiPoint {
      def this(points: js.Array[typings.wechatMiniprogram.DB.GeoPoint]) = this()
      
      /* CompleteClass */
      var points: js.Array[typings.wechatMiniprogram.DB.GeoPoint] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONMultiPoint = js.native
    }
    
    @JSGlobal("DB.GeoMultiPolygon")
    @js.native
    abstract class GeoMultiPolygon protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.GeoMultiPolygon {
      def this(polygons: js.Array[typings.wechatMiniprogram.DB.GeoPolygon]) = this()
      
      /* CompleteClass */
      var polygons: js.Array[typings.wechatMiniprogram.DB.GeoPolygon] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONMultiPolygon = js.native
    }
    
    @JSGlobal("DB.GeoPoint")
    @js.native
    abstract class GeoPoint protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.GeoPoint {
      def this(longitude: Double, latitude: Double) = this()
      
      /* CompleteClass */
      var latitude: Double = js.native
      
      /* CompleteClass */
      var longitude: Double = js.native
      
      /* CompleteClass */
      override def toJSON(): Record[String, js.Any] = js.native
    }
    
    @JSGlobal("DB.GeoPolygon")
    @js.native
    abstract class GeoPolygon protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.GeoPolygon {
      def this(lines: js.Array[typings.wechatMiniprogram.DB.GeoLineString]) = this()
      
      /* CompleteClass */
      var lines: js.Array[typings.wechatMiniprogram.DB.GeoLineString] = js.native
      
      /* CompleteClass */
      override def toJSON(): IGeoJSONPolygon = js.native
    }
    
    @JSGlobal("DB.LOGIC_COMMANDS_LITERAL")
    @js.native
    object LOGIC_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL & String] = js.native
      
      /* "and" */ val AND: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.AND & String = js.native
      
      /* "nor" */ val NOR: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.NOR & String = js.native
      
      /* "not" */ val NOT: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.NOT & String = js.native
      
      /* "or" */ val OR: typings.wechatMiniprogram.DB.LOGIC_COMMANDS_LITERAL.OR & String = js.native
    }
    
    @JSGlobal("DB.PROJECTION_COMMANDS_LITERAL")
    @js.native
    object PROJECTION_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.PROJECTION_COMMANDS_LITERAL & String] = js.native
      
      /* "slice" */ val SLICE: typings.wechatMiniprogram.DB.PROJECTION_COMMANDS_LITERAL.SLICE & String = js.native
    }
    
    @JSGlobal("DB.QUERY_COMMANDS_LITERAL")
    @js.native
    object QUERY_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL & String] = js.native
      
      /* "all" */ val ALL: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.ALL & String = js.native
      
      /* "elemMatch" */ val ELEM_MATCH: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.ELEM_MATCH & String = js.native
      
      /* "eq" */ val EQ: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.EQ & String = js.native
      
      /* "exists" */ val EXISTS: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.EXISTS & String = js.native
      
      /* "geoIntersects" */ val GEO_INTERSECTS: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_INTERSECTS & String = js.native
      
      /* "geoNear" */ val GEO_NEAR: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_NEAR & String = js.native
      
      /* "geoWithin" */ val GEO_WITHIN: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GEO_WITHIN & String = js.native
      
      /* "gt" */ val GT: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GT & String = js.native
      
      /* "gte" */ val GTE: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.GTE & String = js.native
      
      /* "in" */ val IN: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.IN & String = js.native
      
      /* "lt" */ val LT: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.LT & String = js.native
      
      /* "lte" */ val LTE: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.LTE & String = js.native
      
      /* "mod" */ val MOD: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.MOD & String = js.native
      
      /* "neq" */ val NEQ: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.NEQ & String = js.native
      
      /* "nin" */ val NIN: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.NIN & String = js.native
      
      /* "size" */ val SIZE: typings.wechatMiniprogram.DB.QUERY_COMMANDS_LITERAL.SIZE & String = js.native
    }
    
    @JSGlobal("DB.Query")
    @js.native
    class Query ()
      extends StObject
         with typings.wechatMiniprogram.DB.Query
    
    @JSGlobal("DB.RealtimeListener")
    @js.native
    class RealtimeListener ()
      extends StObject
         with typings.wechatMiniprogram.DB.RealtimeListener {
      
      // "And Now His Watch Is Ended"
      /* CompleteClass */
      override def close(): js.Promise[Unit] = js.native
    }
    
    @JSGlobal("DB.RegExp")
    @js.native
    abstract class RegExp protected ()
      extends StObject
         with typings.wechatMiniprogram.DB.RegExp {
      def this(options: IRegExpOptions) = this()
      
      /* CompleteClass */
      override val options: String = js.native
      
      /* CompleteClass */
      override val regexp: String = js.native
    }
    
    @JSGlobal("DB.ServerDate")
    @js.native
    abstract class ServerDate ()
      extends StObject
         with typings.wechatMiniprogram.DB.ServerDate {
      def this(options: IServerDateOptions) = this()
      
      /* CompleteClass */
      override val options: IServerDateOptions = js.native
    }
    
    @JSGlobal("DB.UPDATE_COMMANDS_LITERAL")
    @js.native
    object UPDATE_COMMANDS_LITERAL extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL & String] = js.native
      
      /* "addToSet" */ val ADD_TO_SET: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.ADD_TO_SET & String = js.native
      
      /* "bit" */ val BIT: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.BIT & String = js.native
      
      /* "inc" */ val INC: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.INC & String = js.native
      
      /* "max" */ val MAX: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MAX & String = js.native
      
      /* "min" */ val MIN: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MIN & String = js.native
      
      /* "mul" */ val MUL: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.MUL & String = js.native
      
      /* "pop" */ val POP: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.POP & String = js.native
      
      /* "pull" */ val PULL: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PULL & String = js.native
      
      /* "pullAll" */ val PULL_ALL: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PULL_ALL & String = js.native
      
      /* "push" */ val PUSH: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.PUSH & String = js.native
      
      /* "remove" */ val REMOVE: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.REMOVE & String = js.native
      
      /* "rename" */ val RENAME: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.RENAME & String = js.native
      
      /* "set" */ val SET: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.SET & String = js.native
      
      /* "shift" */ val SHIFT: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.SHIFT & String = js.native
      
      /* "unshift" */ val UNSHIFT: typings.wechatMiniprogram.DB.UPDATE_COMMANDS_LITERAL.UNSHIFT & String = js.native
    }
  }
  
  object ICloud {
    
    // === end ===
    // === API: CDN ===
    @JSGlobal("ICloud.CDN")
    @js.native
    abstract class CDN protected ()
      extends StObject
         with typings.wechatMiniprogram.ICloud.CDN {
      def this(target: String) = this()
      def this(target: ArrayBuffer) = this()
      def this(target: ICDNFilePathSpec) = this()
      
      /* CompleteClass */
      var target: String | ArrayBuffer | ICDNFilePathSpec = js.native
    }
    
    // === end ===
    // === API: CloudID ===
    @JSGlobal("ICloud.CloudID")
    @js.native
    abstract class CloudID protected ()
      extends StObject
         with typings.wechatMiniprogram.ICloud.CloudID {
      def this(cloudID: String) = this()
    }
  }
  
  @JSGlobal("InternalSymbol")
  @js.native
  class InternalSymbol ()
    extends StObject
       with typings.wechatMiniprogram.InternalSymbol
  
  /**
    * 注册小程序中的一个页面。接受一个 `Object` 类型参数，其指定页面的初始数据、生命周期回调、事件处理函数等。
    */
  @JSGlobal("Page")
  @js.native
  def Page: typings.wechatMiniprogram.WechatMiniprogram.Page.Constructor = js.native
  inline def Page_=(x: typings.wechatMiniprogram.WechatMiniprogram.Page.Constructor): Unit = js.Dynamic.global.updateDynamic("Page")(x.asInstanceOf[js.Any])
  
  /** [clearInterval(number intervalID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearInterval.html)
    *
    * 取消由 setInterval 设置的定时器。 */
  inline def clearInterval(/** 要取消的定时器的 ID */
  intervalID: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [clearTimeout(number timeoutID)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/clearTimeout.html)
    *
    * 取消由 setTimeout 设置的定时器。 */
  inline def clearTimeout(/** 要取消的定时器的 ID */
  timeoutID: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutID.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("console")
  @js.native
  val console: Console = js.native
  
  @JSGlobal("exports")
  @js.native
  def exports: js.Any = js.native
  inline def exports_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("getApp")
  @js.native
  def getApp: GetApp = js.native
  inline def getApp_=(x: GetApp): Unit = js.Dynamic.global.updateDynamic("getApp")(x.asInstanceOf[js.Any])
  
  /**
    * 获取当前页面栈。数组中第一个元素为首页，最后一个元素为当前页面。
    *  __注意：__
    *  - __不要尝试修改页面栈，会导致路由以及页面状态错误。__
    *  - 不要在 `App.onLaunch` 的时候调用 `getCurrentPages()`，此时 `page` 还没有生成。
    */
  @JSGlobal("getCurrentPages")
  @js.native
  def getCurrentPages: GetCurrentPages = js.native
  inline def getCurrentPages_=(x: GetCurrentPages): Unit = js.Dynamic.global.updateDynamic("getCurrentPages")(x.asInstanceOf[js.Any])
  
  object module {
    
    @JSGlobal("module")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("module.exports")
    @js.native
    def exports: js.Any = js.native
    inline def exports_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
  }
  
  inline def require(module: String): js.Any = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [number setInterval(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setInterval.html)
    *
    * 设定一个定时器。按照指定的周期（以毫秒计）来执行注册的回调函数 */
  inline def setInterval(/** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any]): Double = js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setInterval(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any],
    /** 执行回调函数之间的时间间隔，单位 ms。 */
  delay: Unit,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [number setTimeout(function callback, number delay, any rest)](https://developers.weixin.qq.com/miniprogram/dev/api/base/timer/setTimeout.html)
    *
    * 设定一个定时器。在定时到期以后执行注册的回调函数 */
  inline def setTimeout(/** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any]): Double = js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Double,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def setTimeout(
    /** 回调函数 */
  callback: js.Function1[/* repeated */ js.Any, js.Any],
    /** 延迟的时间，函数的调用会在该延迟之后发生，单位 ms。 */
  delay: Unit,
    /** param1, param2, ..., paramN 等附加参数，它们会作为参数传递给回调函数。 */
  rest: js.Any
  ): Double = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("wx")
  @js.native
  val wx: Wx = js.native
}
