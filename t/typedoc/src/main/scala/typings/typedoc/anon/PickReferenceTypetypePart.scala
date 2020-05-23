package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ReferenceType, 'type'> & std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ReferenceType> */
trait PickReferenceTypetypePart extends js.Object {
  var id: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[ModelToObject[String] | String] = js.undefined
  var `type`: js.UndefOr[(ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)] = js.undefined
  var typeArguments: js.UndefOr[ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]] = js.undefined
}

object PickReferenceTypetypePart {
  @scala.inline
  def apply(
    id: js.UndefOr[Double] = js.undefined,
    name: ModelToObject[String] | String = null,
    `type`: (ModelToObject[/* "reference" */ String]) | (/* "reference" */ String) = null,
    typeArguments: ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type] = null
  ): PickReferenceTypetypePart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickReferenceTypetypePart]
  }
}

