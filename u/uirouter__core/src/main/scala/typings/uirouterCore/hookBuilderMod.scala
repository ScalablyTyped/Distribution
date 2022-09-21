package typings.uirouterCore

import typings.uirouterCore.hookRegistryMod.RegisteredHook
import typings.uirouterCore.transitionEventTypeMod.TransitionEventType
import typings.uirouterCore.transitionHookMod.TransitionHook
import typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import typings.uirouterCore.transitionInterfaceMod.TreeChanges
import typings.uirouterCore.transitionTransitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hookBuilderMod {
  
  @JSImport("@uirouter/core/lib/transition/hookBuilder", "HookBuilder")
  @js.native
  open class HookBuilder protected () extends StObject {
    def this(transition: Transition) = this()
    
    /**
      * Returns an array of newly built TransitionHook objects.
      *
      * - Finds all RegisteredHooks registered for the given `hookType` which matched the transition's [[TreeChanges]].
      * - Finds [[PathNode]] (or `PathNode[]`) to use as the TransitionHook context(s)
      * - For each of the [[PathNode]]s, creates a TransitionHook
      *
      * @param hookType the type of the hook registration function, e.g., 'onEnter', 'onFinish'.
      */
    def buildHooks(hookType: TransitionEventType): js.Array[TransitionHook] = js.native
    
    def buildHooksForPhase(phase: TransitionHookPhase): js.Array[TransitionHook] = js.native
    
    /**
      * Finds all RegisteredHooks from:
      * - The Transition object instance hook registry
      * - The TransitionService ($transitions) global hook registry
      *
      * which matched:
      * - the eventType
      * - the matchCriteria (to, from, exiting, retained, entering)
      *
      * @returns an array of matched [[RegisteredHook]]s
      */
    def getMatchingHooks(hookType: TransitionEventType, treeChanges: TreeChanges, transition: Transition): js.Array[RegisteredHook] = js.native
    
    /* private */ var transition: Any = js.native
  }
}
