package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNode[HostNode, HostElement, ExtraProps] extends StObject {
  
  var anchor: HostNode | Null
  
  /* Excluded from this release type: dynamicProps */
  /* Excluded from this release type: dynamicChildren */
  var appContext: AppContext | Null
  
  /* Excluded from this release type: slotScopeIds */
  var children: VNodeNormalizedChildren
  
  var component: ComponentInternalInstance | Null
  
  var dirs: js.Array[DirectiveBinding[Any]] | Null
  
  var el: HostNode | Null
  
  var key: String | Double | js.Symbol | Null
  
  var patchFlag: Double
  
  var props: (VNodeProps & ExtraProps) | Null
  
  var ref: VNodeNormalizedRef | Null
  
  /**
    * SFC only. This is assigned on vnode creation using currentScopeId
    * which is set alongside currentRenderingInstance.
    */
  var scopeId: String | Null
  
  /* Excluded from this release type: ssContent */
  /* Excluded from this release type: ssFallback */
  var shapeFlag: Double
  
  /* Excluded from this release type: staticCount */
  var suspense: SuspenseBoundary | Null
  
  var target: HostElement | Null
  
  var targetAnchor: HostNode | Null
  
  var transition: TransitionHooks[HostElement] | Null
  
  /* Excluded from this release type: __v_isVNode */
  /* Excluded from this release type: __v_skip */
  var `type`: VNodeTypes
}
object VNode {
  
  inline def apply[HostNode, HostElement, ExtraProps](patchFlag: Double, shapeFlag: Double, `type`: VNodeTypes): VNode[HostNode, HostElement, ExtraProps] = {
    val __obj = js.Dynamic.literal(patchFlag = patchFlag.asInstanceOf[js.Any], shapeFlag = shapeFlag.asInstanceOf[js.Any], anchor = null, appContext = null, children = null, component = null, dirs = null, el = null, key = null, props = null, ref = null, scopeId = null, suspense = null, target = null, targetAnchor = null, transition = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[HostNode, HostElement, ExtraProps]]
  }
  
  extension [Self <: VNode[?, ?, ?], HostNode, HostElement, ExtraProps](x: Self & (VNode[HostNode, HostElement, ExtraProps])) {
    
    inline def setAnchor(value: HostNode): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAppContext(value: AppContext): Self = StObject.set(x, "appContext", value.asInstanceOf[js.Any])
    
    inline def setAppContextNull: Self = StObject.set(x, "appContext", null)
    
    inline def setChildren(value: VNodeNormalizedChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setComponent(value: ComponentInternalInstance): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setDirs(value: js.Array[DirectiveBinding[Any]]): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
    
    inline def setDirsNull: Self = StObject.set(x, "dirs", null)
    
    inline def setDirsVarargs(value: DirectiveBinding[Any]*): Self = StObject.set(x, "dirs", js.Array(value*))
    
    inline def setEl(value: HostNode): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElNull: Self = StObject.set(x, "el", null)
    
    inline def setKey(value: String | Double | js.Symbol): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setPatchFlag(value: Double): Self = StObject.set(x, "patchFlag", value.asInstanceOf[js.Any])
    
    inline def setProps(value: VNodeProps & ExtraProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsNull: Self = StObject.set(x, "props", null)
    
    inline def setRef(value: VNodeNormalizedRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefVarargs(value: VNodeNormalizedRefAtom*): Self = StObject.set(x, "ref", js.Array(value*))
    
    inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
    
    inline def setShapeFlag(value: Double): Self = StObject.set(x, "shapeFlag", value.asInstanceOf[js.Any])
    
    inline def setSuspense(value: SuspenseBoundary): Self = StObject.set(x, "suspense", value.asInstanceOf[js.Any])
    
    inline def setSuspenseNull: Self = StObject.set(x, "suspense", null)
    
    inline def setTarget(value: HostElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetAnchor(value: HostNode): Self = StObject.set(x, "targetAnchor", value.asInstanceOf[js.Any])
    
    inline def setTargetAnchorNull: Self = StObject.set(x, "targetAnchor", null)
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTransition(value: TransitionHooks[HostElement]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionNull: Self = StObject.set(x, "transition", null)
    
    inline def setType(value: VNodeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
