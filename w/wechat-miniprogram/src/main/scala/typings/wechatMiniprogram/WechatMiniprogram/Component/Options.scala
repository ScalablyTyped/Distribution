package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typings.wechatMiniprogram.anon.PartialILifetime
import typings.wechatMiniprogram.anon.PartialPageLifetimes
import typings.wechatMiniprogram.anon.Partialcreatedvoidattache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Component.Data<TData>> & std.Partial<wechat-miniprogram.WechatMiniprogram.Component.Property<TProperty>> & std.Partial<wechat-miniprogram.WechatMiniprogram.Component.Method<TMethod, TIsPage>> & std.Partial<wechat-miniprogram.WechatMiniprogram.Component.OtherOption> & std.Partial<wechat-miniprogram.WechatMiniprogram.Component.Lifetimes> & std.ThisType<wechat-miniprogram.WechatMiniprogram.Component.Instance<TData, TProperty, TMethod, TCustomInstanceProperty, TIsPage>> */
trait Options[TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: MethodOption */, TCustomInstanceProperty /* <: IAnyObject */, TIsPage /* <: Boolean */] extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var behaviors: js.UndefOr[js.Array[BehaviorIdentifier]] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: js.UndefOr[TData] = js.undefined
  
  var definitionFilter: js.UndefOr[DefinitionFilter] = js.undefined
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
  
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var lifetimes: js.UndefOr[Partialcreatedvoidattache] = js.undefined
  
  var methods: js.UndefOr[TMethod & (js.Object | PartialILifetime)] = js.undefined
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var observers: js.UndefOr[Record[String, js.Function1[/* repeated */ js.Any, js.Any]]] = js.undefined
  
  var options: js.UndefOr[ComponentOptions] = js.undefined
  
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
  
  var properties: js.UndefOr[TProperty] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var relations: js.UndefOr[StringDictionary[RelationOption]] = js.undefined
}
object Options {
  
  inline def apply[TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: MethodOption */, TCustomInstanceProperty /* <: IAnyObject */, TIsPage /* <: Boolean */](): Options[TData, TProperty, TMethod, TCustomInstanceProperty, TIsPage] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TData, TProperty, TMethod, TCustomInstanceProperty, TIsPage]]
  }
  
  extension [Self <: Options[?, ?, ?, ?, ?], TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: MethodOption */, TCustomInstanceProperty /* <: IAnyObject */, TIsPage /* <: Boolean */](x: Self & (Options[TData, TProperty, TMethod, TCustomInstanceProperty, TIsPage])) {
    
    inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
    
    inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    inline def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value :_*))
    
    inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefinitionFilter(
      value: (/* defFields */ TrivialOption, /* definitionFilterArr */ js.UndefOr[
          js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias wechat-miniprogram.WechatMiniprogram.Component.DefinitionFilter */ js.Object
          ]
        ]) => Unit
    ): Self = StObject.set(x, "definitionFilter", js.Any.fromFunction2(value))
    
    inline def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
    
    inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setError(value: /* err */ Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
    
    inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
    
    inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value :_*))
    
    inline def setLifetimes(value: Partialcreatedvoidattache): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
    
    inline def setLifetimesUndefined: Self = StObject.set(x, "lifetimes", js.undefined)
    
    inline def setMethods(value: TMethod & (js.Object | PartialILifetime)): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
    
    inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    inline def setObservers(value: Record[String, js.Function1[/* repeated */ js.Any, js.Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
    
    inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
    
    inline def setOptions(value: ComponentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
    
    inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
    
    inline def setProperties(value: TProperty): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
  }
}
