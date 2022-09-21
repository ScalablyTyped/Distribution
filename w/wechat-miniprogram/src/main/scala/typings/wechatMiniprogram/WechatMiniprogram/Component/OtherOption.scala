package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typings.wechatMiniprogram.anon.PartialPageLifetimes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherOption extends StObject {
  
  /** 类似于mixins和traits的组件间代码复用机制，参见 [behaviors](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/behaviors.html) */
  var behaviors: js.Array[BehaviorIdentifier]
  
  /** 定义段过滤器，用于自定义组件扩展，参见 [自定义组件扩展](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/extend.html)
    *
    * 最低基础库版本： [`2.2.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) */
  var definitionFilter: js.UndefOr[DefinitionFilter] = js.undefined
  
  /**
    * 组件自定义导出，当使用 `behavior: wx://component-export` 时，这个定义段可以用于指定组件被 selectComponent 调用时的返回值，参见 [组件间通信与事件](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/events.html)
    * 最低基础库版本： [`2.2.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) */
  def `export`(): IAnyObject
  
  /** 组件接受的外部样式类，参见 [外部样式类](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html) */
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 组件数据字段监听器，用于监听 properties 和 data 的变化，参见 [数据监听器](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html)
    *
    * 最低基础库版本：[`2.6.1`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  var observers: Record[String, js.Function1[/* repeated */ Any, Any]]
  
  /** 一些选项（文档中介绍相关特性时会涉及具体的选项设置，这里暂不列举） */
  var options: ComponentOptions
  
  /** 组件所在页面的生命周期声明对象，参见 [组件生命周期](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/lifetimes.html)
    *
    * 最低基础库版本： [`2.2.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) */
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
  
  /** 组件间关系定义，参见 [组件间关系](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/lifetimes.html) */
  var relations: StringDictionary[RelationOption]
}
object OtherOption {
  
  inline def apply(
    behaviors: js.Array[BehaviorIdentifier],
    `export`: () => IAnyObject,
    observers: Record[String, js.Function1[/* repeated */ Any, Any]],
    options: ComponentOptions,
    relations: StringDictionary[RelationOption]
  ): OtherOption = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
    __obj.updateDynamic("export")(js.Any.fromFunction0(`export`))
    __obj.asInstanceOf[OtherOption]
  }
  
  extension [Self <: OtherOption](x: Self) {
    
    inline def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def setDefinitionFilter(value: DefinitionFilter): Self = StObject.set(x, "definitionFilter", value.asInstanceOf[js.Any])
    
    inline def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
    
    inline def setExport(value: () => IAnyObject): Self = StObject.set(x, "export", js.Any.fromFunction0(value))
    
    inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
    
    inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
    
    inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value*))
    
    inline def setObservers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ComponentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
    
    inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
    
    inline def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
  }
}
