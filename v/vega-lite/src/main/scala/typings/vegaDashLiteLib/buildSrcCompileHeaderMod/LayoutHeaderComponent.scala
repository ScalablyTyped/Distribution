package typings
package vegaDashLiteLib.buildSrcCompileHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutHeaderComponent extends js.Object {
  var facetFieldDef: js.UndefOr[vegaDashLiteLib.buildSrcFacetMod.FacetFieldDef[java.lang.String]] = js.undefined
  /**
    * An array of header components for footers.
    * For facet, there should be only one header component, which is data-driven.
    * For repeat and concat, there can be multiple header components that explicitly list different axes.
    */
  var footer: js.UndefOr[js.Array[HeaderComponent]] = js.undefined
  /**
    * An array of header components for headers.
    * For facet, there should be only one header component, which is data-driven.
    * For repeat and concat, there can be multiple header components that explicitly list different axes.
    */
  var header: js.UndefOr[js.Array[HeaderComponent]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object LayoutHeaderComponent {
  @scala.inline
  def apply(
    facetFieldDef: vegaDashLiteLib.buildSrcFacetMod.FacetFieldDef[java.lang.String] = null,
    footer: js.Array[HeaderComponent] = null,
    header: js.Array[HeaderComponent] = null,
    title: java.lang.String = null
  ): LayoutHeaderComponent = {
    val __obj = js.Dynamic.literal()
    if (facetFieldDef != null) __obj.updateDynamic("facetFieldDef")(facetFieldDef)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LayoutHeaderComponent]
  }
}

