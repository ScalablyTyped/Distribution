package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionScalarType extends IntrospectionType {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.SCALAR
  var name: java.lang.String
}

object IntrospectionScalarType {
  @scala.inline
  def apply(
    kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.SCALAR,
    name: java.lang.String,
    description: java.lang.String = null
  ): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionScalarType]
  }
}

