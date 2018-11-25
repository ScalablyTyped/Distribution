package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectTypeDefinition extends js.Object {
  var fields: js.Array[FieldDefinition]
  var interfaces: js.UndefOr[js.Array[NamedType]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

