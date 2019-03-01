package typings
package yamlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handle extends js.Object {
  var handle: java.lang.String
  var suffix: java.lang.String
}

object Anon_Handle {
  @scala.inline
  def apply(handle: java.lang.String, suffix: java.lang.String): Anon_Handle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(handle)
    __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[Anon_Handle]
  }
}

