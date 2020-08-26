package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wechatMiniprogram.anon.PartialPageLifetimes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherOption extends js.Object {
  /** 类似于mixins和traits的组件间代码复用机制，参见 [behaviors](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/behaviors.html) */
  var behaviors: js.Array[String] = js.native
  /** 定义段过滤器，用于自定义组件扩展，参见 [自定义组件扩展](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/extend.html)
    *
    * 最低基础库版本： [`2.2.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) */
  var definitionFilter: js.UndefOr[DefinitionFilter] = js.native
  /** 组件接受的外部样式类，参见 [外部样式类](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/wxml-wxss.html) */
  var externalClasses: js.UndefOr[js.Array[String]] = js.native
  /**
    * 组件数据字段监听器，用于监听 properties 和 data 的变化，参见 [数据监听器](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/observer.html)
    *
    * 最低基础库版本：[`2.6.1`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)
    */
  var observers: Record[String, js.Function1[/* repeated */ _, _]] = js.native
  /** 一些选项（文档中介绍相关特性时会涉及具体的选项设置，这里暂不列举） */
  var options: ComponentOptions = js.native
  /** 组件所在页面的生命周期声明对象，参见 [组件生命周期](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/lifetimes.html)
    *
    * 最低基础库版本： [`2.2.3`](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) */
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.native
  /** 组件间关系定义，参见 [组件间关系](https://developers.weixin.qq.com/miniprogram/dev/framework/custom-component/lifetimes.html) */
  var relations: StringDictionary[RelationOption] = js.native
}

object OtherOption {
  @scala.inline
  def apply(
    behaviors: js.Array[String],
    observers: Record[String, js.Function1[/* repeated */ _, _]],
    options: ComponentOptions,
    relations: StringDictionary[RelationOption]
  ): OtherOption = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherOption]
  }
  @scala.inline
  implicit class OtherOptionOps[Self <: OtherOption] (val x: Self) extends AnyVal {
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
    def setBehaviorsVarargs(value: String*): Self = this.set("behaviors", js.Array(value :_*))
    @scala.inline
    def setBehaviors(value: js.Array[String]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def setObservers(value: Record[String, js.Function1[/* repeated */ _, _]]): Self = this.set("observers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: ComponentOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelations(value: StringDictionary[RelationOption]): Self = this.set("relations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionFilter(
      value: (/* defFields */ TrivialOption, /* definitionFilterArr */ js.UndefOr[
          js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter */ js.Object
          ]
        ]) => Unit
    ): Self = this.set("definitionFilter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDefinitionFilter: Self = this.set("definitionFilter", js.undefined)
    @scala.inline
    def setExternalClassesVarargs(value: String*): Self = this.set("externalClasses", js.Array(value :_*))
    @scala.inline
    def setExternalClasses(value: js.Array[String]): Self = this.set("externalClasses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalClasses: Self = this.set("externalClasses", js.undefined)
    @scala.inline
    def setPageLifetimes(value: PartialPageLifetimes): Self = this.set("pageLifetimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageLifetimes: Self = this.set("pageLifetimes", js.undefined)
  }
  
}

