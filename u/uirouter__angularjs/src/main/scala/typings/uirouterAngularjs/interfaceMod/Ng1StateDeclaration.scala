package typings.uirouterAngularjs.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.transitionInterfaceMod.HookResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ng1StateDeclaration
  extends _Ng1StateDeclaration
     with Ng1ViewDeclaration {
  /**
    * A state hook invoked when a state is being entered.
    *
    * The hook can inject global services.
    * It can also inject `$transition$` or `$state$` (from the current transition).
    *
    * ### Example:
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onEnter: (MyService, $transition$, $state$) => {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   }
    * });
    * ```
    *
    * #### Example:`
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onEnter: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   } ]
    * });
    * ```
    */
  @JSName("onEnter")
  var onEnter_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.native
  /**
    * A state hook invoked when a state is being exited.
    *
    * The hook can inject global services.
    * It can also inject `$transition$` or `$state$` (from the current transition).
    *
    * ### Example:
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onExit: (MyService, $transition$, $state$) => {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   }
    * });
    * ```
    *
    * #### Example:`
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onExit: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   } ]
    * });
    * ```
    */
  @JSName("onExit")
  var onExit_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.native
  /**
    * A state hook invoked when a state is being retained.
    *
    * The hook can inject global services.
    * It can also inject `$transition$` or `$state$` (from the current transition).
    *
    * #### Example:
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onRetain: (MyService, $transition$, $state$) => {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   }
    * });
    * ```
    *
    * #### Example:`
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onRetain: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   } ]
    * });
    * ```
    */
  @JSName("onRetain")
  var onRetain_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.native
  /**
    * An optional object which defines multiple named views.
    *
    * Each key is the name of a view, and each value is a [[Ng1ViewDeclaration]].
    * Unnamed views are internally renamed to `$default`.
    *
    * A view's name is used to match an active `<ui-view>` directive in the DOM.  When the state
    * is entered, the state's views are activated and matched with active `<ui-view>` directives:
    *
    * - The view's name is processed into a ui-view target:
    *   - ui-view address: an address to a ui-view
    *   - state anchor: the state to anchor the address to
    *
    *  Examples:
    *
    *  Targets three named ui-views in the parent state's template
    *
    * #### Example:
    * ```js
    * views: {
    *   header: {
    *     controller: "headerCtrl",
    *     templateUrl: "header.html"
    *   },
    *   body: {
    *     controller: "bodyCtrl",
    *     templateUrl: "body.html"
    *   },
    *   footer: "footerComponent"
    * }
    * ```
    *
    * #### Example:
    * ```js
    * // Targets named ui-view="header" in the template of the ancestor state 'top'
    * // and the named `ui-view="body" from the parent state's template.
    * views: {
    *   'header@top': {
    *     controller: "msgHeaderCtrl",
    *     templateUrl: "msgHeader.html"
    *   },
    *   'body': {
    *     controller: "messagesCtrl",
    *     templateUrl: "messages.html"
    *   }
    * }
    * ```
    *
    * ## View targeting details
    *
    * There are a few styles of view addressing/targeting.
    * The most common is a simple `ui-view` name
    *
    * #### Simple ui-view name
    *
    * Addresses without an `@` are anchored to the parent state.
    *
    * #### Example:
    * ```js
    * // target the `<div ui-view='foo'></div>` created in the parent state's view
    * views: {
    *   foo: {...}
    * }
    * ```
    *
    * #### View name anchored to a state
    *
    * You can anchor the `ui-view` name to a specific state by including an `@`
    *
    * #### Example:
    * targets the `<div ui-view='foo'></div>` which was created in a view owned by the state `bar.baz`
    * ```js
    * views: {
    *   'foo@bar.baz': {...}
    * }
    * ```
    *
    * #### Absolute addressing
    *
    * You can address a `ui-view` absolutely, using dotted notation, by prefixing the address with a `!`.
    * Dotted addresses traverse the hierarchy of `ui-view`s active in the DOM:
    *
    * #### Example:
    * absolutely targets the `<div ui-view='nested'></div>`
    * ... which was created in the unnamed/$default root `<ui-view></ui-view>`
    * ```js
    * views: {
    *   '!$default.nested': {...}
    * }
    * ```
    *
    * #### Relative addressing
    *
    * Absolute addressing is actually relative addressing, anchored to the unnamed root state (`""`).
    * You can also use relative addressing anchored to *any state*, in order to target a target deeply nested `ui-views`:
    * The `ui-view` is targeted relative to the anchored state by traversing the nested `ui-view` names.
    *
    * #### Example:
    * targets the `<div ui-view='bar'></div>`
    * ... which was created inside the
    * `<div ui-view='foo'></div>`
    * ... which was created inside the parent state's template.
    * ```js
    * views: {
    *   'foo.bar': {...}
    * }
    * ```
    *
    * #### Example:
    * targets the `<div ui-view='bar'></div>`
    * ... which was created in `<div ui-view='foo'></div>`
    * ... which was created in a template from the state `baz.qux`
    * ```js
    * views: {
    *   'foo.bar@baz.qux': {...}
    * }
    * ```
    *
    * #### Example:
    * a view can relatively target a named `ui-view` defined on an ancestor using `^` (meaning "parent")
    * ```js
    * views: {
    *   'foo@^': {...}, // foo@(parent state) (same as simply 'foo')
    *   'bar@^.^': {...}, // bar@(grandparent state)
    *   'baz@^.^.^': {...}, // baz@(great-grandparent state)
    * }
    * ```
    *
    * For additional in-depth details about how `ui-view` addressing works, see the internal api [[ViewService.match]].
    *
    * ---
    *
    * ## State template+controller and `views:` incompatiblity
    *
    * If a state has a `views` object, any state-level view properties ([[Ng1ViewDeclaration]]) are ignored.  Therefore,
    * if _any view_ for a state is declared in the `views` object, then _all of the state's views_ must be defined in
    * the `views` object.  The state declaration must not have any of the following fields:
    * - component
    * - bindings
    * - resolveAs
    * - template
    * - templateUrl
    * - templateProvider
    * - controller
    * - controllerAs
    * - controllerProvider
    */
  @JSName("views")
  var views_Ng1StateDeclaration: js.UndefOr[StringDictionary[String | Ng1ViewDeclaration]] = js.native
}

object Ng1StateDeclaration {
  @scala.inline
  def apply(): Ng1StateDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ng1StateDeclaration]
  }
  @scala.inline
  implicit class Ng1StateDeclarationOps[Self <: Ng1StateDeclaration] (val x: Self) extends AnyVal {
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
    def setOnEnterVarargs(value: js.Any*): Self = this.set("onEnter", js.Array(value :_*))
    @scala.inline
    def setOnEnterFunction1(value: /* repeated */ js.Any => HookResult): Self = this.set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEnter(value: Ng1StateTransitionHook | IInjectable): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnExitVarargs(value: js.Any*): Self = this.set("onExit", js.Array(value :_*))
    @scala.inline
    def setOnExitFunction1(value: /* repeated */ js.Any => HookResult): Self = this.set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def setOnExit(value: Ng1StateTransitionHook | IInjectable): Self = this.set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    @scala.inline
    def setOnRetainVarargs(value: js.Any*): Self = this.set("onRetain", js.Array(value :_*))
    @scala.inline
    def setOnRetainFunction1(value: /* repeated */ js.Any => HookResult): Self = this.set("onRetain", js.Any.fromFunction1(value))
    @scala.inline
    def setOnRetain(value: Ng1StateTransitionHook | IInjectable): Self = this.set("onRetain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRetain: Self = this.set("onRetain", js.undefined)
    @scala.inline
    def setViews(value: StringDictionary[String | Ng1ViewDeclaration]): Self = this.set("views", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
  
}

