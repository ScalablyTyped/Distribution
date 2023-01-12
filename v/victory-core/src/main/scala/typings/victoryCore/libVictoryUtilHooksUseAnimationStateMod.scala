package typings.victoryCore

import typings.std.Record
import typings.victoryCore.anon.GetAnimationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilHooksUseAnimationStateMod {
  
  @JSImport("victory-core/lib/victory-util/hooks/use-animation-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimationState(): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")().asInstanceOf[GetAnimationProps]
  inline def useAnimationState(initialState: AnimationState): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")(initialState.asInstanceOf[js.Any]).asInstanceOf[GetAnimationProps]
  
  trait AnimationState extends StObject {
    
    var animating: js.UndefOr[Boolean] = js.undefined
    
    var childrenTransitions: js.UndefOr[js.Array[Any]] = js.undefined
    
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    var nextProps: js.UndefOr[AnyObject] = js.undefined
    
    var nodesDoneLoad: js.UndefOr[Boolean] = js.undefined
    
    var nodesShouldEnter: js.UndefOr[Boolean] = js.undefined
    
    var nodesShouldLoad: js.UndefOr[Boolean] = js.undefined
    
    var nodesWillEnter: js.UndefOr[Boolean] = js.undefined
    
    var nodesWillExit: js.UndefOr[Boolean] = js.undefined
    
    var oldProps: js.UndefOr[AnyObject] = js.undefined
  }
  object AnimationState {
    
    inline def apply(): AnimationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimationState] (val x: Self) extends AnyVal {
      
      inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
      
      inline def setChildrenTransitions(value: js.Array[Any]): Self = StObject.set(x, "childrenTransitions", value.asInstanceOf[js.Any])
      
      inline def setChildrenTransitionsUndefined: Self = StObject.set(x, "childrenTransitions", js.undefined)
      
      inline def setChildrenTransitionsVarargs(value: Any*): Self = StObject.set(x, "childrenTransitions", js.Array(value*))
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setNextProps(value: AnyObject): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      inline def setNextPropsUndefined: Self = StObject.set(x, "nextProps", js.undefined)
      
      inline def setNodesDoneLoad(value: Boolean): Self = StObject.set(x, "nodesDoneLoad", value.asInstanceOf[js.Any])
      
      inline def setNodesDoneLoadUndefined: Self = StObject.set(x, "nodesDoneLoad", js.undefined)
      
      inline def setNodesShouldEnter(value: Boolean): Self = StObject.set(x, "nodesShouldEnter", value.asInstanceOf[js.Any])
      
      inline def setNodesShouldEnterUndefined: Self = StObject.set(x, "nodesShouldEnter", js.undefined)
      
      inline def setNodesShouldLoad(value: Boolean): Self = StObject.set(x, "nodesShouldLoad", value.asInstanceOf[js.Any])
      
      inline def setNodesShouldLoadUndefined: Self = StObject.set(x, "nodesShouldLoad", js.undefined)
      
      inline def setNodesWillEnter(value: Boolean): Self = StObject.set(x, "nodesWillEnter", value.asInstanceOf[js.Any])
      
      inline def setNodesWillEnterUndefined: Self = StObject.set(x, "nodesWillEnter", js.undefined)
      
      inline def setNodesWillExit(value: Boolean): Self = StObject.set(x, "nodesWillExit", value.asInstanceOf[js.Any])
      
      inline def setNodesWillExitUndefined: Self = StObject.set(x, "nodesWillExit", js.undefined)
      
      inline def setOldProps(value: AnyObject): Self = StObject.set(x, "oldProps", value.asInstanceOf[js.Any])
      
      inline def setOldPropsUndefined: Self = StObject.set(x, "oldProps", js.undefined)
    }
  }
  
  type AnyObject = Record[String, Any]
}
