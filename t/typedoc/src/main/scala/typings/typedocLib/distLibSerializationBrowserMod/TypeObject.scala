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

