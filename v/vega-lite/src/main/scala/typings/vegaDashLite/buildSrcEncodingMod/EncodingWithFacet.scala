package typings.vegaDashLite.buildSrcEncodingMod

import typings.vegaDashLite.buildSrcFacetMod.FacetFieldDef
import typings.vegaDashLite.buildSrcFacetMod.FacetMapping
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcFielddefMod.FieldDefWithCondition
import typings.vegaDashLite.buildSrcFielddefMod.MarkPropFieldDef
import typings.vegaDashLite.buildSrcFielddefMod.OrderFieldDef
import typings.vegaDashLite.buildSrcFielddefMod.PositionFieldDef
import typings.vegaDashLite.buildSrcFielddefMod.TextFieldDef
import typings.vegaDashLite.buildSrcFielddefMod.ValueDef
import typings.vegaDashLite.buildSrcFielddefMod.ValueDefWithCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingWithFacet[F]
  extends Encoding[F]
     with FacetMapping[F]

object EncodingWithFacet {
  @scala.inline
  def apply[F](
    color: FieldDefWithCondition[MarkPropFieldDef[F]] | ValueDefWithCondition[MarkPropFieldDef[F]] = null,
    column: FacetFieldDef[F] = null,
    detail: FieldDef[F] | js.Array[FieldDef[F]] = null,
    fill: FieldDefWithCondition[MarkPropFieldDef[F]] | ValueDefWithCondition[MarkPropFieldDef[F]] = null,
    href: FieldDefWithCondition[FieldDef[F]] | ValueDefWithCondition[FieldDef[F]] = null,
    key: FieldDef[F] = null,
    latitude: FieldDef[F] = null,
    latitude2: FieldDef[F] = null,
    longitude: FieldDef[F] = null,
    longitude2: FieldDef[F] = null,
    opacity: FieldDefWithCondition[MarkPropFieldDef[F]] | ValueDefWithCondition[MarkPropFieldDef[F]] = null,
    order: OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | ValueDef = null,
    row: FacetFieldDef[F] = null,
    shape: FieldDefWithCondition[MarkPropFieldDef[F]] | ValueDefWithCondition[MarkPropFieldDef[F]] = null,
    size: FieldDefWithCondition[MarkPropFieldDef[F]] | ValueDefWithCondition[MarkPropFieldDef[F]] = null,
    stroke: FieldDefWithCondition[MarkPropFieldDef[F]] | ValueDefWithCondition[MarkPropFieldDef[F]] = null,
    text: FieldDefWithCondition[TextFieldDef[F]] | ValueDefWithCondition[TextFieldDef[F]] = null,
    tooltip: FieldDefWithCondition[TextFieldDef[F]] | ValueDefWithCondition[TextFieldDef[F]] | js.Array[TextFieldDef[F]] = null,
    x: PositionFieldDef[F] | ValueDef = null,
    x2: FieldDef[F] | ValueDef = null,
    y: PositionFieldDef[F] | ValueDef = null,
    y2: FieldDef[F] | ValueDef = null
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

