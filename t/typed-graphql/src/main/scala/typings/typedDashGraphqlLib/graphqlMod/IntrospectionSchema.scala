package typings
package typedDashGraphqlLib.graphqlMod

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

