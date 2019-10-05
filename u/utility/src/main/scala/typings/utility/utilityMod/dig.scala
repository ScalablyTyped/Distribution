package typings.utility.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "dig")
@js.native
object dig extends js.Object {
  /**
    * avoid if (a && a.b && a.b.c)
    * @param {Object} obj
    * @param {...String} keys
    * @return {Object}
    */
  def apply(obj: ObjStatic, args: js.Any*): js.Any = js.native
}

