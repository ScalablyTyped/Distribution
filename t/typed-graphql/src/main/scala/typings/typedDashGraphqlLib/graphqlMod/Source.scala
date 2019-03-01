package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// language/source.js
trait Source extends js.Object {
  var body: java.lang.String
  var name: java.lang.String
}

object Source {
  @scala.inline
  def apply(body: java.lang.String, name: java.lang.String): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Source]
  }
}

