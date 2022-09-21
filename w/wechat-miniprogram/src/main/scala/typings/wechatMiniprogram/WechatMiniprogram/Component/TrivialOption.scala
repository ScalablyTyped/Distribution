package typings.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
import typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
import typings.wechatMiniprogram.anon.PartialILifetime
import typings.wechatMiniprogram.anon.PartialPageLifetimes
import typings.wechatMiniprogram.anon.Partialcreatedvoidattache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.WechatMiniprogram.Component.Options<wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, false> */
trait TrivialOption extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var behaviors: js.UndefOr[js.Array[BehaviorIdentifier]] = js.undefined
  
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var data: js.UndefOr[IAnyObject] = js.undefined
  
  var definitionFilter: js.UndefOr[DefinitionFilter] = js.undefined
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  
  var `export`: js.UndefOr[js.Function0[IAnyObject]] = js.undefined
  
  var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var lifetimes: js.UndefOr[Partialcreatedvoidattache] = js.undefined
  
  var methods: js.UndefOr[IAnyObject & (js.Object | PartialILifetime)] = js.undefined
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var observers: js.UndefOr[Record[String, js.Function1[/* repeated */ Any, Any]]] = js.undefined
  
  var options: js.UndefOr[ComponentOptions] = js.undefined
  
  var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
  
  var properties: js.UndefOr[IAnyObject] = js.undefined
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var relations: js.UndefOr[StringDictionary[RelationOption]] = js.undefined
}
object TrivialOption {
  
  inline def apply(): TrivialOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrivialOption]
  }
  
  extension [Self <: TrivialOption](x: Self) {
    
    inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
    
    inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    inline def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
    
    inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
    
    inline def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value*))
    
    inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefinitionFilter(value: DefinitionFilter): Self = StObject.set(x, "definitionFilter", value.asInstanceOf[js.Any])
    
    inline def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
    
    inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExport(value: () => IAnyObject): Self = StObject.set(x, "export", js.Any.fromFunction0(value))
    
    inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
    
    inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
    
    inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
    
    inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value*))
    
    inline def setLifetimes(value: Partialcreatedvoidattache): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
    
    inline def setLifetimesUndefined: Self = StObject.set(x, "lifetimes", js.undefined)
    
    inline def setMethods(value: IAnyObject & (js.Object | PartialILifetime)): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
    
    inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    inline def setObservers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
    
    inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
    
    inline def setOptions(value: ComponentOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
    
    inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
    
    inline def setProperties(value: IAnyObject): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    
    inline def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
  }
}
