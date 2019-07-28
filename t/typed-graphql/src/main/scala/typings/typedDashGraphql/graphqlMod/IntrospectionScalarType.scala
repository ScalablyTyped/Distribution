package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.SCALAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionScalarType extends IntrospectionType {
  var description: js.UndefOr[String] = js.undefined
  var kind: SCALAR
  var name: String
}

object IntrospectionScalarType {
  @scala.inline
  def apply(kind: SCALAR, name: String, description: String = null): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionScalarType]
  }
}

