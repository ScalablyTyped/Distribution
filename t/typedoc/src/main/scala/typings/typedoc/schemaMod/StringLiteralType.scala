package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.stringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.StringLiteralType, 'type' | 'value'> */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ trait StringLiteralType extends SomeType {
  var `type`: ModelToObject[stringLiteral] | stringLiteral
  var value: ModelToObject[String] | String
}

object StringLiteralType {
  @scala.inline
  def apply(`type`: ModelToObject[stringLiteral] | stringLiteral, value: ModelToObject[String] | String): StringLiteralType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteralType]
  }
}

