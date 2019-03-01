package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeObject extends js.Object {
  var constraint: js.UndefOr[TypeObject] = js.undefined
  var declaration: js.UndefOr[ReflectionObject] = js.undefined
  var elementType: js.UndefOr[TypeObject] = js.undefined
  var elements: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[
    typedocLib.typedocLibStrings.Object | typedocLib.typedocLibStrings.string | typedocLib.typedocLibStrings.number | typedocLib.typedocLibStrings.boolean | typedocLib.typedocLibStrings.`this` | java.lang.String
  ] = js.undefined
  var `type`: typedocLib.typedocLibStrings.void | typedocLib.typedocLibStrings.array | typedocLib.typedocLibStrings.intersection | typedocLib.typedocLibStrings.intrinsic | typedocLib.typedocLibStrings.reference | typedocLib.typedocLibStrings.reflection | typedocLib.typedocLibStrings.stringLiteral | typedocLib.typedocLibStrings.tuple | typedocLib.typedocLibStrings.typeParameter | typedocLib.typedocLibStrings.union | typedocLib.typedocLibStrings.unknown | java.lang.String
  var typeArguments: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var types: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TypeObject {
  @scala.inline
  def apply(
    `type`: typedocLib.typedocLibStrings.void | typedocLib.typedocLibStrings.array | typedocLib.typedocLibStrings.intersection | typedocLib.typedocLibStrings.intrinsic | typedocLib.typedocLibStrings.reference | typedocLib.typedocLibStrings.reflection | typedocLib.typedocLibStrings.stringLiteral | typedocLib.typedocLibStrings.tuple | typedocLib.typedocLibStrings.typeParameter | typedocLib.typedocLibStrings.union | typedocLib.typedocLibStrings.unknown | java.lang.String,
    constraint: TypeObject = null,
    declaration: ReflectionObject = null,
    elementType: TypeObject = null,
    elements: js.Array[TypeObject] = null,
    id: scala.Int | scala.Double = null,
    name: typedocLib.typedocLibStrings.Object | typedocLib.typedocLibStrings.string | typedocLib.typedocLibStrings.number | typedocLib.typedocLibStrings.boolean | typedocLib.typedocLibStrings.`this` | java.lang.String = null,
    typeArguments: js.Array[TypeObject] = null,
    types: js.Array[TypeObject] = null,
    value: java.lang.String = null
  ): TypeObject = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (declaration != null) __obj.updateDynamic("declaration")(declaration)
    if (elementType != null) __obj.updateDynamic("elementType")(elementType)
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments)
    if (types != null) __obj.updateDynamic("types")(types)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TypeObject]
  }
}

