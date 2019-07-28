package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.OBJECT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionObjectType extends IntrospectionType {
  var description: js.UndefOr[String] = js.undefined
  var fields: js.Array[IntrospectionField]
  var interfaces: js.Array[IntrospectionNamedTypeRef]
  var kind: OBJECT
  var name: String
}

object IntrospectionObjectType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    kind: OBJECT,
    name: String,
    description: String = null
  ): IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields, interfaces = interfaces, kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionObjectType]
  }
}

