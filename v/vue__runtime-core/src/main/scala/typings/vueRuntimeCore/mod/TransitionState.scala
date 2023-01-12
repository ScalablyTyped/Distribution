package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionState extends StObject {
  
  var isLeaving: Boolean
  
  var isMounted: Boolean
  
  var isUnmounting: Boolean
  
  var leavingVNodes: Map[Any, Record[String, VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
}
object TransitionState {
  
  inline def apply(
    isLeaving: Boolean,
    isMounted: Boolean,
    isUnmounting: Boolean,
    leavingVNodes: Map[Any, Record[String, VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
  ): TransitionState = {
    val __obj = js.Dynamic.literal(isLeaving = isLeaving.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], isUnmounting = isUnmounting.asInstanceOf[js.Any], leavingVNodes = leavingVNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionState] (val x: Self) extends AnyVal {
    
    inline def setIsLeaving(value: Boolean): Self = StObject.set(x, "isLeaving", value.asInstanceOf[js.Any])
    
    inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    
    inline def setIsUnmounting(value: Boolean): Self = StObject.set(x, "isUnmounting", value.asInstanceOf[js.Any])
    
    inline def setLeavingVNodes(value: Map[Any, Record[String, VNode[RendererNode, RendererElement, StringDictionary[Any]]]]): Self = StObject.set(x, "leavingVNodes", value.asInstanceOf[js.Any])
  }
}
