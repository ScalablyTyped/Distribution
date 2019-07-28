package typings.vegaDashLite.buildSrcSpecMod

import typings.vegaDashLite.buildSrcDataMod.Data
import typings.vegaDashLite.buildSrcEncodingMod.Encoding
import typings.vegaDashLite.buildSrcFielddefMod.RepeatRef
import typings.vegaDashLite.buildSrcProjectionMod.Projection
import typings.vegaDashLite.buildSrcResolveMod.Resolve
import typings.vegaDashLite.buildSrcTitleMod.TitleParams
import typings.vegaDashLite.buildSrcTransformMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedLayerSpec extends GenericLayerSpec[CompositeUnitSpec] {
  /**
    * A shared key-value mapping between encoding channels and definition of fields in the underlying layers.
    */
  var encoding: js.UndefOr[Encoding[String | RepeatRef]] = js.undefined
  /**
    * An object defining properties of the geographic projection shared by underlying layers.
    */
  var projection: js.UndefOr[Projection] = js.undefined
}

object ExtendedLayerSpec {
  @scala.inline
  def apply(
    layer: js.Array[GenericLayerSpec[CompositeUnitSpec] | CompositeUnitSpec],
    data: Data = null,
    description: String = null,
    encoding: Encoding[String | RepeatRef] = null,
    height: Int | Double = null,
    name: String = null,
    projection: Projection = null,
    resolve: Resolve = null,
    title: String | TitleParams = null,
    transform: js.Array[Transform] = null,
    width: Int | Double = null
  ): ExtendedLayerSpec = {
    val __obj = js.Dynamic.literal(layer = layer)
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedLayerSpec]
  }
}

