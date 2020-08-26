package typings.uirouterCore.transitionInterfaceMod

import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.transitionTransitionMod.Transition
import typings.uirouterCore.uirouterCoreStrings.otherwise
import typings.uirouterCore.uirouterCoreStrings.redirect
import typings.uirouterCore.uirouterCoreStrings.replace
import typings.uirouterCore.uirouterCoreStrings.sref
import typings.uirouterCore.uirouterCoreStrings.unknown
import typings.uirouterCore.uirouterCoreStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionOptions extends js.Object {
  /** @internal */
  var current: js.UndefOr[js.Function0[Transition]] = js.native
  /**
    * You can define your own Transition Options inside this property and use them, e.g., from a Transition Hook
    */
  var custom: js.UndefOr[js.Any] = js.native
  /**
    * This option sets whether or not the transition's parameter values should be inherited from
    * the current parameter values.
    *
    * - If `true`, it will inherit parameter values from the current parameter values.
    * - If `false`, only the parameters which are provided to `transitionTo` will be used.
    *
    * @default `false`
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * This option changes how the Transition interacts with the browser's location bar (URL).
    *
    * - If `true`, it will update the url in the location bar.
    * - If `false`, it will not update the url in the location bar.
    * - If it is the string `"replace"`, it will update the url and also replace the last history record.
    *
    * @default `true`
    */
  var location: js.UndefOr[Boolean | replace] = js.native
  /**
    * @deprecated
    */
  @JSName("notify")
  var notify_FTransitionOptions: js.UndefOr[Boolean] = js.native
  /** @internal
    * If this transition is a redirect, this property should be the original Transition (which was redirected to this one)
    */
  var redirectedFrom: js.UndefOr[Transition] = js.native
  /**
    * When transitioning to relative path (e.g '`^`'), this option defines which state to be relative from.
    * @default `$state.current`
    */
  var relative: js.UndefOr[String | StateDeclaration | StateObject] = js.native
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
  var reload: js.UndefOr[Boolean | String | StateDeclaration | StateObject] = js.native
  /** @internal */
  var reloadState: js.UndefOr[StateObject] = js.native
  /** @internal */
  var source: js.UndefOr[sref | url | redirect | otherwise | unknown] = js.native
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
  var supercede: js.UndefOr[Boolean] = js.native
}

object TransitionOptions {
  @scala.inline
  def apply(): TransitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionOptions]
  }
  @scala.inline
  implicit class TransitionOptionsOps[Self <: TransitionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrent(value: () => Transition): Self = this.set("current", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setCustom(value: js.Any): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInherit: Self = this.set("inherit", js.undefined)
    @scala.inline
    def setLocation(value: Boolean | replace): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setNotify(value: Boolean): Self = this.set("notify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotify: Self = this.set("notify", js.undefined)
    @scala.inline
    def setRedirectedFrom(value: Transition): Self = this.set("redirectedFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectedFrom: Self = this.set("redirectedFrom", js.undefined)
    @scala.inline
    def setRelative(value: String | StateDeclaration | StateObject): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    @scala.inline
    def setReload(value: Boolean | String | StateDeclaration | StateObject): Self = this.set("reload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
    @scala.inline
    def setReloadState(value: StateObject): Self = this.set("reloadState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReloadState: Self = this.set("reloadState", js.undefined)
    @scala.inline
    def setSource(value: sref | url | redirect | otherwise | unknown): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSupercede(value: Boolean): Self = this.set("supercede", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupercede: Self = this.set("supercede", js.undefined)
  }
  
}

