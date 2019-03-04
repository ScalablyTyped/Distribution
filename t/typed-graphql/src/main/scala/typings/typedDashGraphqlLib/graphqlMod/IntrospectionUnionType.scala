package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionUnionType extends IntrospectionType {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.UNION
  var name: java.lang.String
  var possibleTypes: js.Array[IntrospectionNamedTypeRef]
}

object IntrospectionUnionType {
  @scala.inline
  def apply(
    kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.UNION,
    name: java.lang.String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef],
    description: java.lang.String = null
  ): IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, possibleTypes = possibleTypes)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionUnionType]
  }
}

