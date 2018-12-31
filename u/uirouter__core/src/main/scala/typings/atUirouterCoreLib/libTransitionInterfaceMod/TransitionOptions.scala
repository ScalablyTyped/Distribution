package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOptions extends js.Object {
  /** @internalapi */
  var current: js.UndefOr[js.Function0[atUirouterCoreLib.libTransitionTransitionMod.Transition]] = js.undefined
  /**
    * You can define your own Transition Options inside this property and use them, e.g., from a Transition Hook
    */
  var custom: js.UndefOr[js.Any] = js.undefined
  /**
    * This option sets whether or not the transition's parameter values should be inherited from
    * the current parameter values.
    *
    * - If `true`, it will inherit parameter values from the current parameter values.
    * - If `false`, only the parameters which are provided to `transitionTo` will be used.
    *
    * @default `false`
    */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This option changes how the Transition interacts with the browser's location bar (URL).
    *
    * - If `true`, it will update the url in the location bar.
    * - If `false`, it will not update the url in the location bar.
    * - If it is the string `"replace"`, it will update the url and also replace the last history record.
    *
    * @default `true`
    */
  var location: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * @deprecated
    */
  @JSName("notify")
  var notify_FTransitionOptions: js.UndefOr[scala.Boolean] = js.undefined
  /** @internalapi
    * If this transition is a redirect, this property should be the original Transition (which was redirected to this one)
    */
  var redirectedFrom: js.UndefOr[atUirouterCoreLib.libTransitionTransitionMod.Transition] = js.undefined
  /**
    * When transitioning to relative path (e.g '`^`'), this option defines which state to be relative from.
    * @default `$state.current`
    */
  var relative: js.UndefOr[
    java.lang.String | atUirouterCoreLib.libStateInterfaceMod.StateDeclaration | atUirouterCoreLib.libStateStateObjectMod.StateObject
  ] = js.undefined
  /**
    * This option may be used to force states which are currently active to reload.
    *
    * During a normal transition, a state is "retained" if:
    * - It was previously active
    * - The state's parameter values have not changed
    * - All the parent states' parameter values have not changed
    *
    * Forcing a reload of a state will cause it to be exited and entered, which will:
    * - Refetch that state's resolve data
    * - Exit the state (onExit hook)
    * - Re-enter the state (onEnter hook)
    * - Re-render the views (controllers and templates)
    *
    * - When `true`, the destination state (and all parent states) will be reloaded.
    * - When it is a string and is the name of a state, or when it is a State object,
    *   that state and any children states will be reloaded.
    *
    * @default `false`
    */
  var reload: js.UndefOr[
    scala.Boolean | java.lang.String | atUirouterCoreLib.libStateInterfaceMod.StateDeclaration | atUirouterCoreLib.libStateStateObjectMod.StateObject
  ] = js.undefined
  /** @internalapi */
  var reloadState: js.UndefOr[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.undefined
  /** @internalapi */
  var source: js.UndefOr[
    atUirouterCoreLib.atUirouterCoreLibStrings.sref | atUirouterCoreLib.atUirouterCoreLibStrings.url | atUirouterCoreLib.atUirouterCoreLibStrings.redirect | atUirouterCoreLib.atUirouterCoreLibStrings.otherwise | atUirouterCoreLib.atUirouterCoreLibStrings.unknown
  ] = js.undefined
}

