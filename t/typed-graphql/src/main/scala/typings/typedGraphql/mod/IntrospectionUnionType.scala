package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.UNION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionUnionType extends IntrospectionType {
  var description: js.UndefOr[String] = js.undefined
  var kind: UNION
  var name: String
  var possibleTypes: js.Array[IntrospectionNamedTypeRef]
}

object IntrospectionUnionType {
  @scala.inline
  def apply(
    kind: UNION,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef],
    description: String = null
  ): IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionUnionType]
  }
}

