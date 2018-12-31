package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentDefinition extends js.Object {
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var selectionSet: SelectionSet
  var typeCondition: NamedType
}

