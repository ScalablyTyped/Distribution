package typings.vegaDashLite.buildSrcSpecMod

import typings.vegaDashLite.Anon_DataDescription
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcResolveMod.Resolve
import typings.vegaDashLite.buildSrcTitleMod.TitleParams
import typings.vegaDashLite.buildSrcToplevelpropsMod.ConcatLayout
import typings.vegaDashLite.buildSrcTransformMod.Transform
import typings.vegaDashLite.vegaDashLiteStrings.flush
import typings.vegaDashLite.vegaDashLiteStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof vega-lite.vega-lite/build/src/spec.DataMixins ]:? vega-lite.vega-lite/build/src/spec.DataMixins[P]} */ trait GenericVConcatSpec[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */]
  extends ConcatLayout
     with Anon_DataDescription
     with _GenericSpec[U, L] {
  /**
    * Scale, axis, and legend resolutions for vertically concatenated charts.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
  /**
    * A list of views that should be concatenated and put into a column.
    */
  var vconcat: js.Array[GenericSpec[U, L]]
}

object GenericVConcatSpec {
  @scala.inline
  def apply[U /* <: GenericUnitSpec[_, _] */, L /* <: GenericLayerSpec[_] */](
    vconcat: js.Array[GenericSpec[U, L]],
    bounds: full | flush = null,
    center: js.UndefOr[Boolean] = js.undefined,
    data: Data = null,
    description: String = null,
    name: String = null,
    resolve: Resolve = null,
    spacing: Int | Double = null,
    title: String | TitleParams = null,
    transform: js.Array[Transform] = null
  ): GenericVConcatSpec[U, L] = {
    val __obj = js.Dynamic.literal(vconcat = vconcat)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[GenericVConcatSpec[U, L]]
  }
}

