package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identity extends js.Object {
  var identity: scala.Boolean
  var kind: java.lang.String
  var name: java.lang.String
}

object Anon_Identity {
  @scala.inline
  def apply(identity: scala.Boolean, kind: java.lang.String, name: java.lang.String): Anon_Identity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Identity]
  }
}

