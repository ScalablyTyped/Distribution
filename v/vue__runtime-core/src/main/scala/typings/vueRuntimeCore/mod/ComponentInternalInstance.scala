package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInternalInstance extends StObject {
  
  var appContext: AppContext
  
  var attrs: Data
  
  /* Excluded from this release type: withProxy */
  /* Excluded from this release type: ctx */
  var data: Data
  
  /**
    * Render effect instance
    */
  var effect: typings.vueReactivity.mod.ReactiveEffect[Any]
  
  var emit: EmitFn[
    ObjectEmitsOptions, 
    /* keyof @vue/runtime-core.@vue/runtime-core.ObjectEmitsOptions */ String
  ]
  
  var exposeProxy: (Record[String, Any]) | Null
  
  var exposed: (Record[String, Any]) | Null
  
  var isDeactivated: Boolean
  
  /* Excluded from this release type: emitted */
  /* Excluded from this release type: propsDefaults */
  /* Excluded from this release type: setupState */
  /* Excluded from this release type: devtoolsRawSetupState */
  /* Excluded from this release type: setupContext */
  /* Excluded from this release type: suspense */
  /* Excluded from this release type: suspenseId */
  /* Excluded from this release type: asyncDep */
  /* Excluded from this release type: asyncResolved */
  var isMounted: Boolean
  
  var isUnmounted: Boolean
  
  var parent: ComponentInternalInstance | Null
  
  var props: Data
  
  /* Excluded from this release type: render */
  /* Excluded from this release type: ssrRender */
  /* Excluded from this release type: provides */
  /* Excluded from this release type: scope */
  /* Excluded from this release type: accessCache */
  /* Excluded from this release type: renderCache */
  /* Excluded from this release type: components */
  /* Excluded from this release type: directives */
  /* Excluded from this release type: filters */
  /* Excluded from this release type: propsOptions */
  /* Excluded from this release type: emitsOptions */
  /* Excluded from this release type: inheritAttrs */
  /* Excluded from this release type: isCE */
  /* Excluded from this release type: ceReload */
  var proxy: (ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
    js.Object
  ]) | Null
  
  var refs: Data
  
  var root: ComponentInternalInstance
  
  var slots: InternalSlots
  
  /* Excluded from this release type: next */
  /**
    * Root vnode of this component's own vdom tree
    */
  var subTree: VNode[RendererNode, RendererElement, StringDictionary[Any]]
  
  var `type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
  
  var uid: Double
  
  /**
    * Bound effect runner to be passed to schedulers
    */
  var update: SchedulerJob
  
  /**
    * Vnode representing this component in its parent's vdom tree
    */
  var vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]]
}
object ComponentInternalInstance {
  
  inline def apply(
    appContext: AppContext,
    attrs: Data,
    data: Data,
    effect: typings.vueReactivity.mod.ReactiveEffect[Any],
    emit: (/* event */ String, /* repeated */ Any) => Unit,
    isDeactivated: Boolean,
    isMounted: Boolean,
    isUnmounted: Boolean,
    props: Data,
    refs: Data,
    root: ComponentInternalInstance,
    slots: InternalSlots,
    subTree: VNode[RendererNode, RendererElement, StringDictionary[Any]],
    `type`: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions],
    uid: Double,
    update: SchedulerJob,
    vnode: VNode[RendererNode, RendererElement, StringDictionary[Any]]
  ): ComponentInternalInstance = {
    val __obj = js.Dynamic.literal(appContext = appContext.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), isDeactivated = isDeactivated.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], isUnmounted = isUnmounted.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], subTree = subTree.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], vnode = vnode.asInstanceOf[js.Any], exposeProxy = null, exposed = null, parent = null, proxy = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInternalInstance]
  }
  
  extension [Self <: ComponentInternalInstance](x: Self) {
    
    inline def setAppContext(value: AppContext): Self = StObject.set(x, "appContext", value.asInstanceOf[js.Any])
    
    inline def setAttrs(value: Data): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: typings.vueReactivity.mod.ReactiveEffect[Any]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEmit(value: (/* event */ String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
    
    inline def setExposeProxy(value: Record[String, Any]): Self = StObject.set(x, "exposeProxy", value.asInstanceOf[js.Any])
    
    inline def setExposeProxyNull: Self = StObject.set(x, "exposeProxy", null)
    
    inline def setExposed(value: Record[String, Any]): Self = StObject.set(x, "exposed", value.asInstanceOf[js.Any])
    
    inline def setExposedNull: Self = StObject.set(x, "exposed", null)
    
    inline def setIsDeactivated(value: Boolean): Self = StObject.set(x, "isDeactivated", value.asInstanceOf[js.Any])
    
    inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    inline def setIsUnmounted(value: Boolean): Self = StObject.set(x, "isUnmounted", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ComponentInternalInstance): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setProps(value: Data): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setProxy(
      value: ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
          js.Object
        ]
    ): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyNull: Self = StObject.set(x, "proxy", null)
    
    inline def setRefs(value: Data): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ComponentInternalInstance): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: InternalSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSubTree(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "subTree", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: SchedulerJob): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setVnode(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "vnode", value.asInstanceOf[js.Any])
  }
}
