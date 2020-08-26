package typings.uirouterCore.stateInterfaceMod

import typings.uirouterCore.viewInterfaceMod.ViewContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDeclaration extends js.Object {
  /**
    * The context that this view is declared within.
    */
  @JSName("$context")
  var $context: js.UndefOr[ViewContext] = js.native
  /**
    * The raw name for the view declaration, i.e., the [[StateDeclaration.views]] property name.
    */
  @JSName("$name")
  var $name: js.UndefOr[String] = js.native
  /**
    * A type identifier for the View
    *
    * This is used when loading prerequisites for the view, before it enters the DOM.  Different types of views
    * may load differently (e.g., templateProvider+controllerProvider vs component class)
    */
  @JSName("$type")
  var $type: js.UndefOr[String] = js.native
  /**
    * The normalized context anchor (state name) for the `uiViewName`
    *
    * When targeting a `ui-view`, the `uiViewName` address is anchored to a context name (state name).
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
    */
  @JSName("$uiViewName")
  var $uiViewName: js.UndefOr[String] = js.native
}

object ViewDeclaration {
  @scala.inline
  def apply(): ViewDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewDeclaration]
  }
  @scala.inline
  implicit class ViewDeclarationOps[Self <: ViewDeclaration] (val x: Self) extends AnyVal {
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
    def set$context(value: ViewContext): Self = this.set("$context", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$context: Self = this.set("$context", js.undefined)
    @scala.inline
    def set$name(value: String): Self = this.set("$name", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$name: Self = this.set("$name", js.undefined)
    @scala.inline
    def set$type(value: String): Self = this.set("$type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$type: Self = this.set("$type", js.undefined)
    @scala.inline
    def set$uiViewContextAnchor(value: String): Self = this.set("$uiViewContextAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$uiViewContextAnchor: Self = this.set("$uiViewContextAnchor", js.undefined)
    @scala.inline
    def set$uiViewName(value: String): Self = this.set("$uiViewName", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$uiViewName: Self = this.set("$uiViewName", js.undefined)
  }
  
}

