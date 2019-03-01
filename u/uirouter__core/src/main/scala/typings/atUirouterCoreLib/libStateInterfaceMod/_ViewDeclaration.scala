package typings
package atUirouterCoreLib.libStateInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ViewDeclaration extends js.Object {
  /**
    * The context that this view is declared within.
    * @internalapi
    */
  @JSName("$context")
  var $context: js.UndefOr[atUirouterCoreLib.libViewInterfaceMod.ViewContext] = js.undefined
  /**
    * The raw name for the view declaration, i.e., the [[StateDeclaration.views]] property name.
    * @internalapi
    */
  @JSName("$name")
  var $name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A type identifier for the View
    *
    * This is used when loading prerequisites for the view, before it enters the DOM.  Different types of views
    * may load differently (e.g., templateProvider+controllerProvider vs component class)
    * @internalapi
    */
  @JSName("$type")
  var $type: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The normalized context anchor (state name) for the `uiViewName`
    *
    * When targeting a `ui-view`, the `uiViewName` address is anchored to a context name (state name).
    * @internalapi
    */
  @JSName("$uiViewContextAnchor")
  var $uiViewContextAnchor: js.UndefOr[java.lang.String] = js.undefined
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
  var $uiViewName: js.UndefOr[java.lang.String] = js.undefined
}

object _ViewDeclaration {
  @scala.inline
  def apply(
    $context: atUirouterCoreLib.libViewInterfaceMod.ViewContext = null,
    $name: java.lang.String = null,
    $type: java.lang.String = null,
    $uiViewContextAnchor: java.lang.String = null,
    $uiViewName: java.lang.String = null
  ): _ViewDeclaration = {
    val __obj = js.Dynamic.literal()
    if ($context != null) __obj.updateDynamic("$context")($context)
    if ($name != null) __obj.updateDynamic("$name")($name)
    if ($type != null) __obj.updateDynamic("$type")($type)
    if ($uiViewContextAnchor != null) __obj.updateDynamic("$uiViewContextAnchor")($uiViewContextAnchor)
    if ($uiViewName != null) __obj.updateDynamic("$uiViewName")($uiViewName)
    __obj.asInstanceOf[_ViewDeclaration]
  }
}

