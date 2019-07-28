package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionEnumType extends IntrospectionType {
  var description: js.UndefOr[String] = js.undefined
  var enumValues: js.Array[IntrospectionEnumValue]
  var kind: ENUM
  var name: String
}

object IntrospectionEnumType {
  @scala.inline
  def apply(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String, description: String = null): IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues, kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionEnumType]
  }
}

