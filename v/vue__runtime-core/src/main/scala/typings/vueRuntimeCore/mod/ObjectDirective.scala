package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDirective[T, V] extends StObject {
  
  var beforeMount: js.UndefOr[DirectiveHook[T, Null, V]] = js.undefined
  
  var beforeUnmount: js.UndefOr[DirectiveHook[T, Null, V]] = js.undefined
  
  var beforeUpdate: js.UndefOr[DirectiveHook[T, VNode[Any, T, StringDictionary[Any]], V]] = js.undefined
  
  var created: js.UndefOr[DirectiveHook[T, Null, V]] = js.undefined
  
  var deep: js.UndefOr[Boolean] = js.undefined
  
  var getSSRProps: js.UndefOr[SSRDirectiveHook] = js.undefined
  
  var mounted: js.UndefOr[DirectiveHook[T, Null, V]] = js.undefined
  
  var unmounted: js.UndefOr[DirectiveHook[T, Null, V]] = js.undefined
  
  var updated: js.UndefOr[DirectiveHook[T, VNode[Any, T, StringDictionary[Any]], V]] = js.undefined
}
object ObjectDirective {
  
  inline def apply[T, V](): ObjectDirective[T, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDirective[T, V]]
  }
  
  extension [Self <: ObjectDirective[?, ?], T, V](x: Self & (ObjectDirective[T, V])) {
    
    inline def setBeforeMount(
      value: (T, /* binding */ DirectiveBinding[V], /* vnode */ VNode[Any, T, StringDictionary[Any]], Null) => Unit
    ): Self = StObject.set(x, "beforeMount", js.Any.fromFunction4(value))
    
    inline def setBeforeMountUndefined: Self = StObject.set(x, "beforeMount", js.undefined)
    
    inline def setBeforeUnmount(
      value: (T, /* binding */ DirectiveBinding[V], /* vnode */ VNode[Any, T, StringDictionary[Any]], Null) => Unit
    ): Self = StObject.set(x, "beforeUnmount", js.Any.fromFunction4(value))
    
    inline def setBeforeUnmountUndefined: Self = StObject.set(x, "beforeUnmount", js.undefined)
    
    inline def setBeforeUpdate(
      value: (T, /* binding */ DirectiveBinding[V], /* vnode */ VNode[Any, T, StringDictionary[Any]], VNode[Any, T, StringDictionary[Any]]) => Unit
    ): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction4(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setCreated(
      value: (T, /* binding */ DirectiveBinding[V], /* vnode */ VNode[Any, T, StringDictionary[Any]], Null) => Unit
    ): Self = StObject.set(x, "created", js.Any.fromFunction4(value))
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    inline def setGetSSRProps(
      value: (/* binding */ DirectiveBinding[Any], /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => js.UndefOr[Data]
    ): Self = StObject.set(x, "getSSRProps", js.Any.fromFunction2(value))
    
    inline def setGetSSRPropsUndefined: Self = StObject.set(x, "getSSRProps", js.undefined)
    
    inline def setMounted(
      value: (T, /* binding */ DirectiveBinding[V], /* vnode */ VNode[Any, T, StringDictionary[Any]], Null) => Unit
    ): Self = StObject.set(x, "mounted", js.Any.fromFunction4(value))
    
    inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
    
    inline def setUnmounted(
      value: (T, /* binding */ DirectiveBinding[V], /* vnode */ VNode[Any, T, StringDictionary[Any]], Null) => Unit
    ): Self = StObject.set(x, "unmounted", js.Any.fromFunction4(value))
    
    inline def setUnmountedUndefined: Self = StObject.set(x, "unmounted", js.undefined)
    
    inline def setUpdated(
      value: (T, /* binding */ DirectiveBinding[V], /* vnode */ VNode[Any, T, StringDictionary[Any]], VNode[Any, T, StringDictionary[Any]]) => Unit
    ): Self = StObject.set(x, "updated", js.Any.fromFunction4(value))
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
