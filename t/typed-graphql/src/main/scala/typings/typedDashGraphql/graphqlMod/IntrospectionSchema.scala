package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionSchema extends js.Object {
  var directives: js.Array[IntrospectionDirective]
  var mutationType: js.UndefOr[IntrospectionNamedTypeRef] = js.undefined
  var queryType: IntrospectionNamedTypeRef
  var subscriptionType: js.UndefOr[IntrospectionNamedTypeRef] = js.undefined
  var types: js.Array[IntrospectionType]
}

object IntrospectionSchema {
  @scala.inline
  def apply(
    directives: js.Array[IntrospectionDirective],
    queryType: IntrospectionNamedTypeRef,
    types: js.Array[IntrospectionType],
    mutationType: IntrospectionNamedTypeRef = null,
    subscriptionType: IntrospectionNamedTypeRef = null
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives, queryType = queryType, types = types)
    if (mutationType != null) __obj.updateDynamic("mutationType")(mutationType)
    if (subscriptionType != null) __obj.updateDynamic("subscriptionType")(subscriptionType)
    __obj.asInstanceOf[IntrospectionSchema]
  }
}

