package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageStack extends js.Object {
  var message: java.lang.String
  var stack: java.lang.String
}

object Anon_MessageStack {
  @scala.inline
  def apply(message: java.lang.String, stack: java.lang.String): Anon_MessageStack = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Anon_MessageStack]
  }
}

