package typings.vegaDashLite.buildSrcSpecMod

import typings.vegaDashLite.Anon_DataDescription
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcResolveMod.Resolve
import typings.vegaDashLite.buildSrcTitleMod.TitleParams
import typings.vegaDashLite.buildSrcTransformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof vega-lite.vega-lite/build/src/spec.DataMixins ]:? vega-lite.vega-lite/build/src/spec.DataMixins[P]} */ trait GenericLayerSpec[U /* <: GenericUnitSpec[_, _] */]
  extends Anon_DataDescription
     with LayoutSizeMixins {
  /**
    * Layer or single view specifications to be layered.
    *
    * __Note__: Specifications inside `layer` cannot use `row` and `column` channels as layering facet specifications is not allowed.
    */
  var layer: js.Array[GenericLayerSpec[U] | U]
  /**
    * Scale, axis, and legend resolutions for layers.
    */
  var resolve: js.UndefOr[Resolve] = js.undefined
}

object GenericLayerSpec {
  @scala.inline
  def apply[U /* <: GenericUnitSpec[_, _] */](
    layer: js.Array[GenericLayerSpec[U] | U],
    data: Data = null,
    description: String = null,
    height: Int | Double = null,
    name: String = null,
    resolve: Resolve = null,
    title: String | TitleParams = null,
    transform: js.Array[Transform] = null,
    width: Int | Double = null
  ): GenericLayerSpec[U] = {
    val __obj = js.Dynamic.literal(layer = layer)
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericLayerSpec[U]]
  }
}

