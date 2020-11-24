package typings.wechatMiniprogram.WechatMiniprogram.Behavior

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Component.RelationOption
import typings.wechatMiniprogram.anon.PartialPageLifetimes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<wechat-miniprogram.WechatMiniprogram.Component.OtherOption, 'options'> */
@js.native
trait OtherOption extends js.Object {
  
  var behaviors: js.Array[BehaviorIdentifier] = js.native
  
  var definitionFilter: js.UndefOr[typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter] = js.native
  
  var externalClasses: js.UndefOr[js.Array[String]] = js.native
  
  var observers: Record[String, js.Function1[/* repeated */ _, _]] = js.native
  
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.native
  
  var relations: StringDictionary[RelationOption] = js.native
}
object OtherOption {
  
  @scala.inline
  def apply(
    behaviors: js.Array[BehaviorIdentifier],
    observers: Record[String, js.Function1[/* repeated */ _, _]],
    relations: StringDictionary[RelationOption]
  ): OtherOption = {
    val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
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
    def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = this.set("behaviors", js.Array(value :_*))
    
    @scala.inline
    def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservers(value: Record[String, js.Function1[/* repeated */ _, _]]): Self = this.set("observers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelations(value: StringDictionary[RelationOption]): Self = this.set("relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionFilter(
      value: (/* defFields */ typings.wechatMiniprogram.WechatMiniprogram.Component.TrivialOption, /* definitionFilterArr */ js.UndefOr[
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
