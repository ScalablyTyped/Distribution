package typings.typedoc.distLibSerializationBrowserMod

import typings.typedoc.typedocStrings.Object
import typings.typedoc.typedocStrings.`this`
import typings.typedoc.typedocStrings.array
import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.intersection
import typings.typedoc.typedocStrings.intrinsic
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.reference
import typings.typedoc.typedocStrings.reflection
import typings.typedoc.typedocStrings.string
import typings.typedoc.typedocStrings.stringLiteral
import typings.typedoc.typedocStrings.tuple
import typings.typedoc.typedocStrings.typeParameter
import typings.typedoc.typedocStrings.union
import typings.typedoc.typedocStrings.unknown
import typings.typedoc.typedocStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeObject extends js.Object {
  var constraint: js.UndefOr[TypeObject] = js.undefined
  var declaration: js.UndefOr[ReflectionObject] = js.undefined
  var elementType: js.UndefOr[TypeObject] = js.undefined
  var elements: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[Object | string | number | boolean | `this` | String] = js.undefined
  var `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String
  var typeArguments: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var types: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TypeObject {
  @scala.inline
  def apply(
    `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String,
    constraint: TypeObject = null,
    declaration: ReflectionObject = null,
    elementType: TypeObject = null,
    elements: js.Array[TypeObject] = null,
    id: Int | Double = null,
    name: Object | string | number | boolean | `this` | String = null,
    typeArguments: js.Array[TypeObject] = null,
    types: js.Array[TypeObject] = null,
    value: String = null
  ): TypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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

