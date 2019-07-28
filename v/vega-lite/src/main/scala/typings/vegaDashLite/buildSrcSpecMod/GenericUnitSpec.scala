package typings.vegaDashLite.buildSrcSpecMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashLite.Anon_DataDescription
import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcProjectionMod.Projection
import typings.vegaDashLite.buildSrcSelectionMod.SelectionDef
import typings.vegaDashLite.buildSrcTitleMod.TitleParams
import typings.vegaDashLite.buildSrcTransformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof vega-lite.vega-lite/build/src/spec.DataMixins ]:? vega-lite.vega-lite/build/src/spec.DataMixins[P]} */ trait GenericUnitSpec[E /* <: Encoding[_] */, M]
  extends Anon_DataDescription
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
  var projection: js.UndefOr[Projection] = js.undefined
  /**
    * A key-value mapping between selection names and definitions.
    */
  var selection: js.UndefOr[StringDictionary[SelectionDef]] = js.undefined
}

object GenericUnitSpec {
  @scala.inline
  def apply[E /* <: Encoding[_] */, M](
    mark: M,
    data: Data = null,
    description: String = null,
    encoding: E = null,
    height: Int | Double = null,
    name: String = null,
    projection: Projection = null,
    selection: StringDictionary[SelectionDef] = null,
    title: String | TitleParams = null,
    transform: js.Array[Transform] = null,
    width: Int | Double = null
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

