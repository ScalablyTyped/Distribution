package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EAGER extends js.Object {
  var EAGER: java.lang.String
  var LAZY: java.lang.String
}

object Anon_EAGER {
  @scala.inline
  def apply(EAGER: java.lang.String, LAZY: java.lang.String): Anon_EAGER = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EAGER")(EAGER)
    __obj.updateDynamic("LAZY")(LAZY)
    __obj.asInstanceOf[Anon_EAGER]
  }
}

