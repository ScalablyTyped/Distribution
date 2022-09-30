package typings.victoryCore.mod

import typings.victoryCore.anon.ChildrenTransitions
import typings.victoryCore.transitionsMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transitions {
  
  @JSImport("victory-core/lib", "Transitions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitialTransitionState(oldChildren: Any, nextChildren: Any): ChildrenTransitions = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialTransitionState")(oldChildren.asInstanceOf[js.Any], nextChildren.asInstanceOf[js.Any])).asInstanceOf[ChildrenTransitions]
  
  inline def getTransitionPropsFactory(props: Any, state: Any, setState: Any): js.Function2[/* child */ Any, /* index */ Any, TransitionProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionPropsFactory")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], setState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* child */ Any, /* index */ Any, TransitionProps]]
}
