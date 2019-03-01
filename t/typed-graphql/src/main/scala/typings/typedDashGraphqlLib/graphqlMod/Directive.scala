package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Directives
trait Directive extends Node {
  var arguments: js.UndefOr[js.Array[Argument]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object Directive {
  @scala.inline
  def apply(kind: java.lang.String, name: Name, arguments: js.Array[Argument] = null, loc: Location = null): Directive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Directive]
  }
}

