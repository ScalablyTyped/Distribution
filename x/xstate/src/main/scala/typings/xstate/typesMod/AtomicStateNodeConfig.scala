package typings.xstate.typesMod

import typings.xstate.xstateBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.xstate.typesMod.SimpleOrStateNodeConfig because Already inherited */ @js.native
trait AtomicStateNodeConfig[TContext, TEvent /* <: EventObject */]
  extends StateNodeConfig[TContext, StateSchema[js.Any], TEvent] {
  
  @JSName("initial")
  var initial_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("onDone")
  var onDone_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("parallel")
  var parallel_AtomicStateNodeConfig: js.UndefOr[`false`] = js.native
  
  @JSName("states")
  var states_AtomicStateNodeConfig: js.UndefOr[scala.Nothing] = js.native
}
object AtomicStateNodeConfig {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](): AtomicStateNodeConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtomicStateNodeConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class AtomicStateNodeConfigMutableBuilder[Self <: AtomicStateNodeConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (AtomicStateNodeConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setParallel(value: `false`): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
  }
}
