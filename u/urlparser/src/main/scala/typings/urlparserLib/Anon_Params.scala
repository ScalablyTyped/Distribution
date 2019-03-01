package typings
package urlparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.Object
  var parts: js.Array[java.lang.String]
}

object Anon_Params {
  @scala.inline
  def apply(params: js.Object, parts: js.Array[java.lang.String]): Anon_Params = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("parts")(parts)
    __obj.asInstanceOf[Anon_Params]
  }
}

