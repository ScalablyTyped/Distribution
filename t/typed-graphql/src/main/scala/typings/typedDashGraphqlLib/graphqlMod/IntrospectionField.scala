package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IntrospectionField extends js.Object {
  var args: js.Array[IntrospectionInputValue]
  var deprecationReason: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var isDeprecated: scala.Boolean
  var name: java.lang.String
  var `type`: IntrospectionTypeRef
}

