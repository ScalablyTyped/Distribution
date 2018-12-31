package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var alias: js.UndefOr[Name] = js.undefined
  var arguments: js.UndefOr[js.Array[Argument]] = js.undefined
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var selectionSet: js.UndefOr[SelectionSet] = js.undefined
}

