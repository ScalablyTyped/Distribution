package typings
package vegaDashLiteLib.buildSrcEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingWithFacet[F]
  extends Encoding[F]
     with vegaDashLiteLib.buildSrcFacetMod.FacetMapping[F]

object EncodingWithFacet {
  @scala.inline
  def apply[F](
    color: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    column: vegaDashLiteLib.buildSrcFacetMod.FacetFieldDef[F] = null,
    detail: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = null,
    fill: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    href: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]] = null,
    key: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    latitude: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    latitude2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    longitude: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    longitude2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] = null,
    opacity: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    order: vegaDashLiteLib.buildSrcFielddefMod.OrderFieldDef[F] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.OrderFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    row: vegaDashLiteLib.buildSrcFacetMod.FacetFieldDef[F] = null,
    shape: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    size: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    stroke: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.MarkPropFieldDef[F]] = null,
    text: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] = null,
    tooltip: vegaDashLiteLib.buildSrcFielddefMod.FieldDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | vegaDashLiteLib.buildSrcFielddefMod.ValueDefWithCondition[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] | js.Array[vegaDashLiteLib.buildSrcFielddefMod.TextFieldDef[F]] = null,
    x: vegaDashLiteLib.buildSrcFielddefMod.PositionFieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    x2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    y: vegaDashLiteLib.buildSrcFielddefMod.PositionFieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null,
    y2: vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F] | vegaDashLiteLib.buildSrcFielddefMod.ValueDef = null
  ): EncodingWithFacet[F] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude)
    if (latitude2 != null) __obj.updateDynamic("latitude2")(latitude2)
    if (longitude != null) __obj.updateDynamic("longitude")(longitude)
    if (longitude2 != null) __obj.updateDynamic("longitude2")(longitude2)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingWithFacet[F]]
  }
}

