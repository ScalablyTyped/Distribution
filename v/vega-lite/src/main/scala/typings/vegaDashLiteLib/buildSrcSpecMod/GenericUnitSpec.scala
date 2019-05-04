package typings
package vegaDashLiteLib.buildSrcSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof vega-lite.vega-lite/build/src/spec.DataMixins ]:? vega-lite.vega-lite/build/src/spec.DataMixins[P]} */ trait GenericUnitSpec[E /* <: vegaDashLiteLib.buildSrcEncodingMod.Encoding[_] */, M]
  extends vegaDashLiteLib.Anon_DataDescription
     with LayoutSizeMixins {
  /**
    * A key-value mapping between encoding channels and definition of fields.
    */
  var encoding: js.UndefOr[E] = js.undefined
  /**
    * A string describing the mark type (one of `"bar"`, `"circle"`, `"square"`, `"tick"`, `"line"`,
    * `"area"`, `"point"`, `"rule"`, `"geoshape"`, and `"text"`) or a [mark definition object](https://vega.github.io/vega-lite/docs/mark.html#mark-def).
    */
  var mark: M
  /**
    * An object defining properties of geographic projection, which will be applied to `shape` path for `"geoshape"` marks
    * and to `latitude` and `"longitude"` channels for other marks.
    */
  var projection: js.UndefOr[vegaDashLiteLib.buildSrcProjectionMod.Projection] = js.undefined
  /**
    * A key-value mapping between selection names and definitions.
    */
  var selection: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.buildSrcSelectionMod.SelectionDef]
  ] = js.undefined
}

object GenericUnitSpec {
  @scala.inline
  def apply[E /* <: vegaDashLiteLib.buildSrcEncodingMod.Encoding[_] */, M](
    mark: M,
    data: vegaDashLiteLib.buildSrcDataMod.Data = null,
    description: java.lang.String = null,
    encoding: E = null,
    height: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    projection: vegaDashLiteLib.buildSrcProjectionMod.Projection = null,
    selection: org.scalablytyped.runtime.StringDictionary[vegaDashLiteLib.buildSrcSelectionMod.SelectionDef] = null,
    title: java.lang.String | vegaDashLiteLib.buildSrcTitleMod.TitleParams = null,
    transform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform] = null,
    width: scala.Int | scala.Double = null
  ): GenericUnitSpec[E, M] = {
    val __obj = js.Dynamic.literal(mark = mark.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericUnitSpec[E, M]]
  }
}

