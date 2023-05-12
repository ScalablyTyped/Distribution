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
  
  var attrsProxy: Data | Null
  
  /* removed internal: withProxy */
  /* removed internal: ctx */
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
  
  /* removed internal: emitted */
  /* removed internal: propsDefaults */
  /* removed internal: setupState */
  /* removed internal: devtoolsRawSetupState */
  /* removed internal: setupContext */
  /* removed internal: suspense */
  /* removed internal: suspenseId */
  /* removed internal: asyncDep */
  /* removed internal: asyncResolved */
  var isMounted: Boolean
  
  var isUnmounted: Boolean
  
  var parent: ComponentInternalInstance | Null
  
  var props: Data
  
  /* removed internal: render */
  /* removed internal: ssrRender */
  /* removed internal: provides */
  /* removed internal: scope */
  /* removed internal: accessCache */
  /* removed internal: renderCache */
  /* removed internal: components */
  /* removed internal: directives */
  /* removed internal: filters */
  /* removed internal: propsOptions */
  /* removed internal: emitsOptions */
  /* removed internal: inheritAttrs */
  /* removed internal: isCE */
  /* removed internal: ceReload */
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
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
    js.Object, 
    js.Object
  ]) | Null
  
  var refs: Data
  
  var root: ComponentInternalInstance
  
  var slots: InternalSlots
  
  var slotsProxy: Slots | Null
  
  /* removed internal: next */
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
    val __obj = js.Dynamic.literal(appContext = appContext.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), isDeactivated = isDeactivated.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], isUnmounted = isUnmounted.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], subTree = subTree.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], vnode = vnode.asInstanceOf[js.Any], attrsProxy = null, exposeProxy = null, exposed = null, parent = null, proxy = null, slotsProxy = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInternalInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentInternalInstance] (val x: Self) extends AnyVal {
    
    inline def setAppContext(value: AppContext): Self = StObject.set(x, "appContext", value.asInstanceOf[js.Any])
    
    inline def setAttrs(value: Data): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsProxy(value: Data): Self = StObject.set(x, "attrsProxy", value.asInstanceOf[js.Any])
    
    inline def setAttrsProxyNull: Self = StObject.set(x, "attrsProxy", null)
    
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
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
          js.Object, 
          js.Object
        ]
    ): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyNull: Self = StObject.set(x, "proxy", null)
    
    inline def setRefs(value: Data): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: ComponentInternalInstance): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSlots(value: InternalSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsProxy(value: Slots): Self = StObject.set(x, "slotsProxy", value.asInstanceOf[js.Any])
    
    inline def setSlotsProxyNull: Self = StObject.set(x, "slotsProxy", null)
    
    inline def setSubTree(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "subTree", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: SchedulerJob): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setVnode(value: VNode[RendererNode, RendererElement, StringDictionary[Any]]): Self = StObject.set(x, "vnode", value.asInstanceOf[js.Any])
  }
}
