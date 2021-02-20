package typings.uirouterCore.mod

import typings.uirouterCore.anon.UiViewContextAnchor
import typings.uirouterCore.commonCommonMod.TypedMap
import typings.uirouterCore.viewInterfaceMod.ActiveUIView
import typings.uirouterCore.viewInterfaceMod.ViewConfig
import typings.uirouterCore.viewInterfaceMod.ViewContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "ViewService")
@js.native
class ViewService protected ()
  extends typings.uirouterCore.viewMod.ViewService {
  /** @internal */
  def this(/** @internal */ router: typings.uirouterCore.routerMod.UIRouter) = this()
}
/* static members */
object ViewService {
  
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
    * @internal
    */
  @JSImport("@uirouter/core", "ViewService.matches")
  @js.native
  def matches(uiViewsByFqn: TypedMap[ActiveUIView], uiView: ActiveUIView): js.Function1[/* viewConfig */ ViewConfig, Boolean] = js.native
  
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
  @JSImport("@uirouter/core", "ViewService.normalizeUIViewTarget")
  @js.native
  def normalizeUIViewTarget(context: ViewContext): UiViewContextAnchor = js.native
  @JSImport("@uirouter/core", "ViewService.normalizeUIViewTarget")
  @js.native
  def normalizeUIViewTarget(context: ViewContext, rawViewName: String): UiViewContextAnchor = js.native
}
