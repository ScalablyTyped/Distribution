package typings.utility.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "getParamNames")
@js.native
object getParamNames extends js.Object {
  /**
    * Get a function parameter's names.
    *
    * @param {Function} func
    * @param {Boolean} [useCache], default is true
    * @return {Array} names
    */
  def apply(func: js.Function1[/* repeated */ js.Any, _]): js.Array[String] = js.native
  def apply(func: js.Function1[/* repeated */ js.Any, _], cache: Boolean): js.Array[String] = js.native
}

