package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.OBJECT
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
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionObjectType]
  }
}

