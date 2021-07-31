package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
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
  
  /** 组件接受的外部样式类，参见 [外部样式类](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html) */
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 组件数据字段监听器，用于监听 properties 和 data 的变化，参见 [数据监听器](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html)
    *
    * 最低基础库版本：[`2.6.1`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  var observers: Record[String, js.Function1[/* repeated */ js.Any, js.Any]]
  
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
  
  @scala.inline
  def apply(
    behaviors: js.Array[BehaviorIdentifier],
    observers: Record[String, js.Function1[/* repeated */ js.Any, js.Any]],
    options: ComponentOptions,
    relations: StringDictionary[RelationOption]
  ): OtherOption = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOption]
  }
  
  @scala.inline
  implicit class OtherOptionMutableBuilder[Self <: OtherOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
    
    @scala.inline
    def setDefinitionFilter(
      value: (/* defFields */ TrivialOption, /* definitionFilterArr */ js.UndefOr[
          js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter */ js.Object
          ]
        ]) => Unit
    ): Self = StObject.set(x, "definitionFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
    
    @scala.inline
    def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
    
    @scala.inline
    def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value :_*))
    
    @scala.inline
    def setObservers(value: Record[String, js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ComponentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
    
    @scala.inline
    def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
  }
}
