package typings
package vegaDashLiteLib.buildSrcSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedLayerSpec extends GenericLayerSpec[CompositeUnitSpec] {
  /**
    * A shared key-value mapping between encoding channels and definition of fields in the underlying layers.
    */
  var encoding: js.UndefOr[
    vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String | vegaDashLiteLib.buildSrcFielddefMod.RepeatRef]
  ] = js.undefined
  /**
    * An object defining properties of the geographic projection shared by underlying layers.
    */
  var projection: js.UndefOr[vegaDashLiteLib.buildSrcProjectionMod.Projection] = js.undefined
}

object ExtendedLayerSpec {
  @scala.inline
  def apply(
    layer: js.Array[GenericLayerSpec[CompositeUnitSpec] | CompositeUnitSpec],
    data: vegaDashLiteLib.buildSrcDataMod.Data = null,
    description: java.lang.String = null,
    encoding: vegaDashLiteLib.buildSrcEncodingMod.Encoding[java.lang.String | vegaDashLiteLib.buildSrcFielddefMod.RepeatRef] = null,
    height: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    projection: vegaDashLiteLib.buildSrcProjectionMod.Projection = null,
    resolve: vegaDashLiteLib.buildSrcResolveMod.Resolve = null,
    title: java.lang.String | vegaDashLiteLib.buildSrcTitleMod.TitleParams = null,
    transform: js.Array[vegaDashLiteLib.buildSrcTransformMod.Transform] = null,
    width: scala.Int | scala.Double = null
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

