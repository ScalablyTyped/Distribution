package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IntrospectionObjectType extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.Array[IntrospectionField]
  var interfaces: js.Array[IntrospectionNamedTypeRef]
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.OBJECT
  var name: java.lang.String
}

