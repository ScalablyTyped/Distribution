package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.typedocStrings.stringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.StringLiteralType, 'type'> */
trait PickStringLiteralTypetype extends js.Object {
  var `type`: ModelToObject[stringLiteral] | stringLiteral
}

object PickStringLiteralTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[stringLiteral] | stringLiteral): PickStringLiteralTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStringLiteralTypetype]
  }
}

