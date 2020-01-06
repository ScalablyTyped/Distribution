package typings.atUirouterCore.libTransitionInterfaceMod

import typings.atUirouterCore.atUirouterCoreStrings.otherwise
import typings.atUirouterCore.atUirouterCoreStrings.redirect
import typings.atUirouterCore.atUirouterCoreStrings.sref
import typings.atUirouterCore.atUirouterCoreStrings.unknown
import typings.atUirouterCore.atUirouterCoreStrings.url
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libTransitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionOptions extends js.Object {
  /** @internalapi */
  var current: js.UndefOr[js.Function0[Transition]] = js.undefined
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
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
    * This option changes how the Transition interacts with the browser's location bar (URL).
    *
    * - If `true`, it will update the url in the location bar.
    * - If `false`, it will not update the url in the location bar.
    * - If it is the string `"replace"`, it will update the url and also replace the last history record.
    *
    * @default `true`
    */
  var location: js.UndefOr[Boolean | String] = js.undefined
  /**
    * @deprecated
    */
  @JSName("notify")
  var notify_FTransitionOptions: js.UndefOr[Boolean] = js.undefined
  /** @internalapi
    * If this transition is a redirect, this property should be the original Transition (which was redirected to this one)
    */
  var redirectedFrom: js.UndefOr[Transition] = js.undefined
  /**
    * When transitioning to relative path (e.g '`^`'), this option defines which state to be relative from.
    * @default `$state.current`
    */
  var relative: js.UndefOr[String | StateDeclaration | StateObject] = js.undefined
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
  var reload: js.UndefOr[Boolean | String | StateDeclaration | StateObject] = js.undefined
  /** @internalapi */
  var reloadState: js.UndefOr[StateObject] = js.undefined
  /** @internalapi */
  var source: js.UndefOr[sref | url | redirect | otherwise | unknown] = js.undefined
  /**
    * This option may be used to cancel the active transition (if one is active) in favour of the this one.
    * This is the default behaviour or ui-router.
    *
    *
    * - When `true`, the active transition will be canceled and new transition will begin.
    * - when `false`, the transition will be canceled if a transition is already running. This can be useful in cases where
    * you only want to navigate to a different state if you are not already navigating somewhere.
    *
    * @default `true`
    */
  var supercede: js.UndefOr[Boolean] = js.undefined
}

object TransitionOptions {
  @scala.inline
  def apply(
    current: () => Transition = null,
    custom: js.Any = null,
    inherit: js.UndefOr[Boolean] = js.undefined,
    location: Boolean | String = null,
    notify: js.UndefOr[Boolean] = js.undefined,
    redirectedFrom: Transition = null,
    relative: String | StateDeclaration | StateObject = null,
    reload: Boolean | String | StateDeclaration | StateObject = null,
    reloadState: StateObject = null,
    source: sref | url | redirect | otherwise | unknown = null,
    supercede: js.UndefOr[Boolean] = js.undefined
  ): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(js.Any.fromFunction0(current))
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.asInstanceOf[js.Any])
    if (redirectedFrom != null) __obj.updateDynamic("redirectedFrom")(redirectedFrom.asInstanceOf[js.Any])
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (reload != null) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    if (reloadState != null) __obj.updateDynamic("reloadState")(reloadState.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(supercede)) __obj.updateDynamic("supercede")(supercede.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionOptions]
  }
}

