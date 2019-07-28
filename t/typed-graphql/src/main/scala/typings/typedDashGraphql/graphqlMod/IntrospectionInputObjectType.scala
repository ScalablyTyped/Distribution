package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.INPUT_OBJECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInputObjectType extends IntrospectionType {
  var description: js.UndefOr[String] = js.undefined
  var inputFields: js.Array[IntrospectionInputValue]
  var kind: INPUT_OBJECT
  var name: String
}

object IntrospectionInputObjectType {
  @scala.inline
  def apply(
    inputFields: js.Array[IntrospectionInputValue],
    kind: INPUT_OBJECT,
    name: String,
    description: String = null
  ): IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields, kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionInputObjectType]
  }
}

