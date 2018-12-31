package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInterfaceType extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.Array[IntrospectionField]
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.INTERFACE
  var name: java.lang.String
  var possibleTypes: js.Array[IntrospectionNamedTypeRef]
}

