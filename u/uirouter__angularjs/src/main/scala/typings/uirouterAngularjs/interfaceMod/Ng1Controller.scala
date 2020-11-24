package typings.uirouterAngularjs.interfaceMod

import typings.uirouterCore.mod.Transition
import typings.uirouterCore.transitionInterfaceMod.HookResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ng1Controller extends js.Object {
  
  /** @hidden */
  @JSName("$onInit")
  def $onInit(): Unit = js.native
  
  /**
    * This callback is called when the view's state is about to be exited.
    *
    * This callback is used to inform a view that it is about to be exited, due to a new [[Transition]].
    * The callback can ask for user confirmation, and cancel or alter the new Transition.  The callback should
    * return a value, or a promise for a value.  If a promise is returned, the new Transition waits until the
    * promise settles.
    *
    *
    * Called when:
    * - The view is still active
    * - A new Transition is about to run
    * - The new Transition will exit the view's state
    *
    * Called with:
    * - The new Transition
    *
    * Relevant return Values:
    * - `false`: The transition is cancelled.
    * - A rejected promise: The transition is cancelled.
    * - [[TargetState]]: The transition is redirected to the new target state.
    * - Anything else: the transition will continue normally (the state and view will be deactivated)
    *
    * #### Example:
    * ```js
    * app.component('myComponent', {
    *   template: '<input ng-model="$ctrl.data" type="text">',
    *   bindings: { 'data': '<' },
    *   controller: function() {
    *
    *     this.originalData = angular.copy(this.data);
    *
    *     this.uiCanExit = function() {
    *       if (!angular.equals(this.data, this.originalData)) {
    *         // Note: This could also return a Promise and request async
    *         // confirmation using something like ui-bootstrap $modal
    *         return window.confirm("Data has changed.  Exit anyway and lose changes?");
    *       }
    *     }
    *   }
    * }
    * ```
    *
    * @param transition the new Transition that is about to exit the component's state
    * @return a HookResult, or a promise for a HookResult
    */
  def uiCanExit(transition: Transition): HookResult = js.native
  
  /**
    * This callback is called when parameter values have changed.
    *
    * This callback can be used to respond to changing parameter values in the current state, or in parent/child states.
    * This callback is especially handy when using dynamic parameters ([[ParamDeclaration.dynamic]])
    *
    * Called when:
    * - The view is still active
    * - A new transition has completed successfully
    * - The state for the view (controller) was not reloaded
    * - At least one parameter value was changed
    *
    * Called with:
    * @param newValues an object containing the changed parameter values
    * @param $transition$ the new Transition which triggered this callback
    *
    * #### Example:
    * ```js
    * angular.module('foo').controller('FancyCtrl', function() {
    *   this.uiOnParamsChanged = function(newParams) {
    *     console.log("new params: ", newParams);
    *   }
    * });
    * ```
    */
  def uiOnParamsChanged(newValues: js.Any, DollartransitionDollar: Transition): Unit = js.native
}
object Ng1Controller {
  
  @scala.inline
  def apply(
    $onInit: () => Unit,
    uiCanExit: Transition => HookResult,
    uiOnParamsChanged: (js.Any, Transition) => Unit
  ): Ng1Controller = {
    val __obj = js.Dynamic.literal($onInit = js.Any.fromFunction0($onInit), uiCanExit = js.Any.fromFunction1(uiCanExit), uiOnParamsChanged = js.Any.fromFunction2(uiOnParamsChanged))
    __obj.asInstanceOf[Ng1Controller]
  }
  
  @scala.inline
  implicit class Ng1ControllerOps[Self <: Ng1Controller] (val x: Self) extends AnyVal {
    
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
    def set$onInit(value: () => Unit): Self = this.set("$onInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUiCanExit(value: Transition => HookResult): Self = this.set("uiCanExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUiOnParamsChanged(value: (js.Any, Transition) => Unit): Self = this.set("uiOnParamsChanged", js.Any.fromFunction2(value))
  }
}
