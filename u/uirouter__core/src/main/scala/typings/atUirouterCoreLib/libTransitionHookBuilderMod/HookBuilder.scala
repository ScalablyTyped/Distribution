package typings
package atUirouterCoreLib.libTransitionHookBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/hookBuilder", "HookBuilder")
@js.native
class HookBuilder protected () extends js.Object {
  def this(transition: atUirouterCoreLib.libTransitionTransitionMod.Transition) = this()
  var transition: js.Any = js.native
  /**
       * Returns an array of newly built TransitionHook objects.
       *
       * - Finds all RegisteredHooks registered for the given `hookType` which matched the transition's [[TreeChanges]].
       * - Finds [[PathNode]] (or `PathNode[]`) to use as the TransitionHook context(s)
       * - For each of the [[PathNode]]s, creates a TransitionHook
       *
       * @param hookType the type of the hook registration function, e.g., 'onEnter', 'onFinish'.
       */
  def buildHooks(hookType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType): js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook] = js.native
  def buildHooksForPhase(phase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase): js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook] = js.native
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
  def getMatchingHooks(
    hookType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType,
    treeChanges: atUirouterCoreLib.libTransitionInterfaceMod.TreeChanges
  ): js.Array[atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook] = js.native
}

