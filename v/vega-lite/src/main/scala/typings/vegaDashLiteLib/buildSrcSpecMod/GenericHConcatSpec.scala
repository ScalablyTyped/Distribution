package typings
package vegaDashLiteLib.buildSrcSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof vega-lite.vega-lite/build/src/spec.DataMixins ]:? vega-lite.vega-lite/build/src/spec.DataMixins[P]} */ trait GenericHConcatSpec[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */]
  extends vegaDashLiteLib.buildSrcToplevelpropsMod.ConcatLayout
     with vegaDashLiteLib.Anon_DataDescription
     with _GenericSpec[U, L] {
  /**
    * A list of views that should be concatenated and put into a row.
    */
  var hconcat: js.Array[GenericSpec[U, L]]
  /**
    * Scale, axis, and legend resolutions for horizontally concatenated charts.
    */
  var resolve: js.UndefOr[vegaDashLiteLib.buildSrcResolveMod.Resolve] = js.undefined
}

object GenericHConcatSpec {
  @scala.inline
  def apply[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */](
    hconcat: js.Array[GenericSpec[U, L]],
    bounds: vegaDashLiteLib.vegaDashLiteLibStrings.full | vegaDashLiteLib.vegaDashLiteLibStrings.flush = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    data: vegaDashLiteLib.buildSrcDataMod.Data = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    resolve: vegaDashLiteLib.buildSrcResolveMod.Resolve = null,
    spacing: scala.Int | scala.Double = null,
    title: java.lang.String | vegaDashLiteLib.buildSrcTitleMod.TitleParams = null,
    transform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform] = null
  ): GenericHConcatSpec[U, L] = {
    val __obj = js.Dynamic.literal(hconcat = hconcat)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[GenericHConcatSpec[U, L]]
  }
}

