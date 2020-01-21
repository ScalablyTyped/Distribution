package typings.uirouterCore.stateInterfaceMod

import typings.uirouterCore.viewInterfaceMod.ViewContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDeclaration extends js.Object {
  /**
    * The context that this view is declared within.
    * @internalapi
    */
  @JSName("$context")
  var $context: js.UndefOr[ViewContext] = js.native
  /**
    * The raw name for the view declaration, i.e., the [[StateDeclaration.views]] property name.
    * @internalapi
    */
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
  /**
    * A type identifier for the View
    *
    * This is used when loading prerequisites for the view, before it enters the DOM.  Different types of views
    * may load differently (e.g., templateProvider+controllerProvider vs component class)
    * @internalapi
    */
  @JSName("$type")
  var $type: js.UndefOr[String] = js.native
  /**
    * The normalized context anchor (state name) for the `uiViewName`
    *
    * When targeting a `ui-view`, the `uiViewName` address is anchored to a context name (state name).
    * @internalapi
    */
  @JSName("$uiViewContextAnchor")
  var $uiViewContextAnchor: js.UndefOr[String] = js.native
  /**
    * The normalized address for the `ui-view` which this ViewConfig targets.
    *
    * A ViewConfig targets a `ui-view` in the DOM (relative to the `uiViewContextAnchor`) which has
    * a specific name.
    * @example `header` or `$default`
    *
    * The `uiViewName` can also target a _nested view_ by providing a dot-notation address
    * @example `foo.bar` or `foo.$default.bar`
    * @internalapi
    */
  @JSName("$uiViewName")
  var $uiViewName: js.UndefOr[String] = js.native
}

