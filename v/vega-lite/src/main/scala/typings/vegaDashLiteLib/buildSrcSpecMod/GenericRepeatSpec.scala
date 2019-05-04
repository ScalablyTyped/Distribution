package typings
package vegaDashLiteLib.buildSrcSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof vega-lite.vega-lite/build/src/spec.DataMixins ]:? vega-lite.vega-lite/build/src/spec.DataMixins[P]} */ trait GenericRepeatSpec[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */]
  extends vegaDashLiteLib.buildSrcToplevelpropsMod.GenericCompositionLayout
     with vegaDashLiteLib.Anon_DataDescription
     with _GenericSpec[U, L] {
  /**
    * An object that describes what fields should be repeated into views that are laid out as a `row` or `column`.
    */
  var repeat: vegaDashLiteLib.buildSrcRepeatMod.Repeat
  /**
    * Scale and legend resolutions for repeated charts.
    */
  var resolve: js.UndefOr[vegaDashLiteLib.buildSrcResolveMod.Resolve] = js.undefined
  var spec: GenericSpec[U, L]
}

object GenericRepeatSpec {
  @scala.inline
  def apply[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */](
    repeat: vegaDashLiteLib.buildSrcRepeatMod.Repeat,
    spec: GenericSpec[U, L],
    align: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayoutAlign | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLayoutAlign] = null,
    bounds: vegaDashLiteLib.vegaDashLiteLibStrings.full | vegaDashLiteLib.vegaDashLiteLibStrings.flush = null,
    center: scala.Boolean | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[scala.Boolean] = null,
    data: vegaDashLiteLib.buildSrcDataMod.Data = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    resolve: vegaDashLiteLib.buildSrcResolveMod.Resolve = null,
    spacing: scala.Double | vegaDashLiteLib.buildSrcVegaDotSchemaMod.RowCol[scala.Double] = null,
    title: java.lang.String | vegaDashLiteLib.buildSrcTitleMod.TitleParams = null,
    transform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform] = null
  ): GenericRepeatSpec[U, L] = {
    val __obj = js.Dynamic.literal(repeat = repeat, spec = spec.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[GenericRepeatSpec[U, L]]
  }
}

