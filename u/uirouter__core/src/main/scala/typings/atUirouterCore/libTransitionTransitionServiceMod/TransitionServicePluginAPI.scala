package typings.atUirouterCore.libTransitionTransitionServiceMod

import typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook
import typings.atUirouterCore.libTransitionInterfaceMod.PathType
import typings.atUirouterCore.libTransitionInterfaceMod.PathTypes
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope
import typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
import typings.atUirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetResultHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionServicePluginAPI extends js.Object {
  /**
    * Defines a transition hook type and returns a transition hook registration
    * function (which can then be used to register hooks of this type).
    */
  def _defineEvent(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType): js.Any = js.native
  def _defineEvent(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean
  ): js.Any = js.native
  def _defineEvent(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler
  ): js.Any = js.native
  def _defineEvent(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler
  ): js.Any = js.native
  def _defineEvent(
    name: String,
    hookPhase: TransitionHookPhase,
    hookOrder: Double,
    criteriaMatchPath: PathType,
    reverseSort: Boolean,
    getResultHandler: GetResultHandler,
    getErrorHandler: GetErrorHandler,
    rejectIfSuperseded: Boolean
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
  def _definePathType(name: String, hookScope: TransitionHookScope): js.Any = js.native
  /**
    * Returns the known event types, such as `onBefore`
    * If a phase argument is provided, returns only events for the given phase.
    */
  def _getEvents(): js.Array[TransitionEventType] = js.native
  def _getEvents(phase: TransitionHookPhase): js.Array[TransitionEventType] = js.native
  /**
    * Gets a Path definition used as a criterion against a TreeChanges path
    */
  def _getPathTypes(): PathTypes = js.native
  /** Returns the hooks registered for the given hook name */
  def getHooks(hookName: String): js.Array[RegisteredHook] = js.native
}

