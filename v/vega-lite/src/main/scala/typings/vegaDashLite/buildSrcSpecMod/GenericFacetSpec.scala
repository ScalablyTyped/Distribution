package typings.vegaDashLite.buildSrcSpecMod

import typings.vegaDashLite.Anon_DataDescription
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcFacetMod.FacetMapping
import typings.vegaDashLite.buildSrcFielddefMod.RepeatRef
import typings.vegaDashLite.buildSrcResolveMod.Resolve
import typings.vegaDashLite.buildSrcTitleMod.TitleParams
import typings.vegaDashLite.buildSrcToplevelpropsMod.GenericCompositionLayout
import typings.vegaDashLite.buildSrcTransformMod.Transform
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.RowCol
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgLayoutAlign
import typings.vegaDashLite.vegaDashLiteStrings.flush
import typings.vegaDashLite.vegaDashLiteStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof vega-lite.vega-lite/build/src/spec.DataMixins ]:? vega-lite.vega-lite/build/src/spec.DataMixins[P]} */ trait GenericFacetSpec[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */]
  extends GenericCompositionLayout
     with Anon_DataDescription
     with _GenericSpec[U, L] {
  /**
    * An object that describes mappings between `row` and `column` channels and their field definitions.
    */
  var facet: FacetMapping[String | RepeatRef]
  /**
    * Scale, axis, and legend resolutions for facets.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
  /**
    * A specification of the view that gets faceted.
    */
  var spec: L | U
}

object GenericFacetSpec {
  @scala.inline
  def apply[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */](
    facet: FacetMapping[String | RepeatRef],
    spec: L | U,
    align: VgLayoutAlign | RowCol[VgLayoutAlign] = null,
    bounds: full | flush = null,
    center: Boolean | RowCol[Boolean] = null,
    data: Data = null,
    description: String = null,
    name: String = null,
    resolve: Resolve = null,
    spacing: Double | RowCol[Double] = null,
    title: String | TitleParams = null,
    transform: js.Array[Transform] = null
  ): GenericFacetSpec[U, L] = {
    val __obj = js.Dynamic.literal(facet = facet, spec = spec.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[GenericFacetSpec[U, L]]
  }
}

