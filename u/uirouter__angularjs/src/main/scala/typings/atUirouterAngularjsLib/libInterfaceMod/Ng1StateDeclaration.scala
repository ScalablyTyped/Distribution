package typings
package atUirouterAngularjsLib.libInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


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
  var onEnter_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | atUirouterCoreLib.libCommonCommonMod.IInjectable] = js.undefined
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
  var onExit_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | atUirouterCoreLib.libCommonCommonMod.IInjectable] = js.undefined
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
  var onRetain_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | atUirouterCoreLib.libCommonCommonMod.IInjectable] = js.undefined
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
  var views_Ng1StateDeclaration: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | Ng1ViewDeclaration]
  ] = js.undefined
}

