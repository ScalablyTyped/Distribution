package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Async extends js.Object {
  var async: Anon_NOWAIT
  var when: Anon_EAGER
}

object Anon_Async {
  @scala.inline
  def apply(async: Anon_NOWAIT, when: Anon_EAGER): Anon_Async = {
    val __obj = js.Dynamic.literal(async = async, when = when)
  
    __obj.asInstanceOf[Anon_Async]
  }
}

