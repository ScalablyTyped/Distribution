package typings
package atUirouterCoreLib.libViewViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/view/view", "ViewService")
@js.native
class ViewService protected () extends js.Object {
  /** @hidden */
  def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  /** @hidden */ var _listeners: js.Any = js.native
  /** @internalapi */
  var _pluginapi: ViewServicePluginAPI = js.native
  /** @hidden */ var _rootContext: js.Any = js.native
  /** @hidden */
  var _rootViewContext: js.Any = js.native
  /** @hidden */ var _uiViews: js.Any = js.native
  /** @hidden */ var _viewConfigFactories: js.Any = js.native
  /** @hidden */
  var _viewConfigFactory: js.Any = js.native
  /** @hidden */ var _viewConfigs: js.Any = js.native
  var router: js.Any = js.native
  def activateViewConfig(viewConfig: atUirouterCoreLib.libViewInterfaceMod.ViewConfig): scala.Unit = js.native
  /**
    * Returns the list of views on the page containing loaded content.
    *
    * @return {Array} Returns an array of fully-qualified view names.
    */
  def active(): js.Array[_] = js.native
  /**
    * Returns the list of views currently available on the page, by fully-qualified name.
    *
    * @return {Array} Returns an array of fully-qualified view names.
    */
  def available(): js.Array[_] = js.native
  def createViewConfig(
    path: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode],
    decl: atUirouterCoreLib.libStateInterfaceMod._ViewDeclaration
  ): js.Array[atUirouterCoreLib.libViewInterfaceMod.ViewConfig] = js.native
  /**
    * Deactivates a ViewConfig.
    *
    * This function deactivates a `ViewConfig`.
    * After calling [[sync]], it will un-pair from any `ui-view` with which it is currently paired.
    *
    * @param viewConfig The ViewConfig view to deregister.
    */
  def deactivateViewConfig(viewConfig: atUirouterCoreLib.libViewInterfaceMod.ViewConfig): scala.Unit = js.native
  /**
    * Registers a `ui-view` component
    *
    * When a `ui-view` component is created, it uses this method to register itself.
    * After registration the [[sync]] method is used to ensure all `ui-view` are configured with the proper [[ViewConfig]].
    *
    * Note: the `ui-view` component uses the `ViewConfig` to determine what view should be loaded inside the `ui-view`,
    * and what the view's state context is.
    *
    * Note: There is no corresponding `deregisterUIView`.
    *       A `ui-view` should hang on to the return value of `registerUIView` and invoke it to deregister itself.
    *
    * @param uiView The metadata for a UIView
    * @return a de-registration function used when the view is destroyed.
    */
  def registerUIView(uiView: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView): js.Function0[scala.Unit] = js.native
  def sync(): scala.Unit = js.native
}

@JSImport("@uirouter/core/lib/view/view", "ViewService")
@js.native
object ViewService extends js.Object {
  /**
    * Given a ui-view and a ViewConfig, determines if they "match".
    *
    * A ui-view has a fully qualified name (fqn) and a context object.  The fqn is built from its overall location in
    * the DOM, describing its nesting relationship to any parent ui-view tags it is nested inside of.
    *
    * A ViewConfig has a target ui-view name and a context anchor.  The ui-view name can be a simple name, or
    * can be a segmented ui-view path, describing a portion of a ui-view fqn.
    *
    * In order for a ui-view to match ViewConfig, ui-view's $type must match the ViewConfig's $type
    *
    * If the ViewConfig's target ui-view name is a simple name (no dots), then a ui-view matches if:
    * - the ui-view's name matches the ViewConfig's target name
    * - the ui-view's context matches the ViewConfig's anchor
    *
    * If the ViewConfig's target ui-view name is a segmented name (with dots), then a ui-view matches if:
    * - There exists a parent ui-view where:
    *    - the parent ui-view's name matches the first segment (index 0) of the ViewConfig's target name
    *    - the parent ui-view's context matches the ViewConfig's anchor
    * - And the remaining segments (index 1..n) of the ViewConfig's target name match the tail of the ui-view's fqn
    *
    * Example:
    *
    * DOM:
    * <ui-view>                        <!-- created in the root context (name: "") -->
    *   <ui-view name="foo">                <!-- created in the context named: "A"      -->
    *     <ui-view>                    <!-- created in the context named: "A.B"    -->
    *       <ui-view name="bar">            <!-- created in the context named: "A.B.C"  -->
    *       </ui-view>
    *     </ui-view>
    *   </ui-view>
    * </ui-view>
    *
    * uiViews: [
    *  { fqn: "$default",                  creationContext: { name: "" } },
    *  { fqn: "$default.foo",              creationContext: { name: "A" } },
    *  { fqn: "$default.foo.$default",     creationContext: { name: "A.B" } }
    *  { fqn: "$default.foo.$default.bar", creationContext: { name: "A.B.C" } }
    * ]
    *
    * These four view configs all match the ui-view with the fqn: "$default.foo.$default.bar":
    *
    * - ViewConfig1: { uiViewName: "bar",                       uiViewContextAnchor: "A.B.C" }
    * - ViewConfig2: { uiViewName: "$default.bar",              uiViewContextAnchor: "A.B" }
    * - ViewConfig3: { uiViewName: "foo.$default.bar",          uiViewContextAnchor: "A" }
    * - ViewConfig4: { uiViewName: "$default.foo.$default.bar", uiViewContextAnchor: "" }
    *
    * Using ViewConfig3 as an example, it matches the ui-view with fqn "$default.foo.$default.bar" because:
    * - The ViewConfig's segmented target name is: [ "foo", "$default", "bar" ]
    * - There exists a parent ui-view (which has fqn: "$default.foo") where:
    *    - the parent ui-view's name "foo" matches the first segment "foo" of the ViewConfig's target name
    *    - the parent ui-view's context "A" matches the ViewConfig's anchor context "A"
    * - And the remaining segments [ "$default", "bar" ].join("."_ of the ViewConfig's target name match
    *   the tail of the ui-view's fqn "default.bar"
    *
    * @internalapi
    */
  def matches(
    uiViewsByFqn: atUirouterCoreLib.libCommonCommonMod.TypedMap[atUirouterCoreLib.libViewInterfaceMod.ActiveUIView],
    uiView: atUirouterCoreLib.libViewInterfaceMod.ActiveUIView
  ): js.Function1[/* viewConfig */ atUirouterCoreLib.libViewInterfaceMod.ViewConfig, scala.Boolean] = js.native
  /**
    * Normalizes a view's name from a state.views configuration block.
    *
    * This should be used by a framework implementation to calculate the values for
    * [[_ViewDeclaration.$uiViewName]] and [[_ViewDeclaration.$uiViewContextAnchor]].
    *
    * @param context the context object (state declaration) that the view belongs to
    * @param rawViewName the name of the view, as declared in the [[StateDeclaration.views]]
    *
    * @returns the normalized uiViewName and uiViewContextAnchor that the view targets
    */
  def normalizeUIViewTarget(context: atUirouterCoreLib.libViewInterfaceMod.ViewContext): atUirouterCoreLib.Anon_UiViewContextAnchor = js.native
  def normalizeUIViewTarget(context: atUirouterCoreLib.libViewInterfaceMod.ViewContext, rawViewName: java.lang.String): atUirouterCoreLib.Anon_UiViewContextAnchor = js.native
}

