package typings
package atUirouterCoreLib.libTransitionTransitionServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionServicePluginAPI extends js.Object {
  /**
       * Defines a transition hook type and returns a transition hook registration
       * function (which can then be used to register hooks of this type).
       */
  def _defineEvent(
    name: java.lang.String,
    hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: scala.Double,
    criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType
  ): js.Any = js.native
  /**
       * Defines a transition hook type and returns a transition hook registration
       * function (which can then be used to register hooks of this type).
       */
  def _defineEvent(
    name: java.lang.String,
    hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: scala.Double,
    criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType,
    reverseSort: scala.Boolean
  ): js.Any = js.native
  /**
       * Defines a transition hook type and returns a transition hook registration
       * function (which can then be used to register hooks of this type).
       */
  def _defineEvent(
    name: java.lang.String,
    hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: scala.Double,
    criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType,
    reverseSort: scala.Boolean,
    getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler
  ): js.Any = js.native
  /**
       * Defines a transition hook type and returns a transition hook registration
       * function (which can then be used to register hooks of this type).
       */
  def _defineEvent(
    name: java.lang.String,
    hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: scala.Double,
    criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType,
    reverseSort: scala.Boolean,
    getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler,
    getErrorHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler
  ): js.Any = js.native
  /**
       * Defines a transition hook type and returns a transition hook registration
       * function (which can then be used to register hooks of this type).
       */
  def _defineEvent(
    name: java.lang.String,
    hookPhase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase,
    hookOrder: scala.Double,
    criteriaMatchPath: atUirouterCoreLib.libTransitionInterfaceMod.PathType,
    reverseSort: scala.Boolean,
    getResultHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler,
    getErrorHandler: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler,
    rejectIfSuperseded: scala.Boolean
  ): js.Any = js.native
  /**
       * Adds a Path to be used as a criterion against a TreeChanges path
       *
       * For example: the `exiting` path in [[HookMatchCriteria]] is a STATE scoped path.
       * It was defined by calling `defineTreeChangesCriterion('exiting', TransitionHookScope.STATE)`
       * Each state in the exiting path is checked against the criteria and returned as part of the match.
       *
       * Another example: the `to` path in [[HookMatchCriteria]] is a TRANSITION scoped path.
       * It was defined by calling `defineTreeChangesCriterion('to', TransitionHookScope.TRANSITION)`
       * Only the tail of the `to` path is checked against the criteria and returned as part of the match.
       */
  def _definePathType(name: java.lang.String, hookScope: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookScope): js.Any = js.native
  /**
       * Returns the known event types, such as `onBefore`
       * If a phase argument is provided, returns only events for the given phase.
       */
  def _getEvents(): js.Array[atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType] = js.native
  /**
       * Returns the known event types, such as `onBefore`
       * If a phase argument is provided, returns only events for the given phase.
       */
  def _getEvents(phase: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase): js.Array[atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType] = js.native
  /**
       * Gets a Path definition used as a criterion against a TreeChanges path
       */
  def _getPathTypes(): atUirouterCoreLib.libTransitionInterfaceMod.PathTypes = js.native
  /** Returns the hooks registered for the given hook name */
  def getHooks(hookName: java.lang.String): js.Array[atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook] = js.native
}

