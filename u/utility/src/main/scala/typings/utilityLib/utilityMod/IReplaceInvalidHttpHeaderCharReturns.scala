package typings
package utilityLib.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ------------------0_0--------------------
  * @description Defines For String Methods
  * @see https://github.com/node-modules/utility#others
  * -------------------0^0---------------------
  */
trait IReplaceInvalidHttpHeaderCharReturns extends js.Object {
  var invalid: scala.Boolean
  var `val`: java.lang.String
}

object IReplaceInvalidHttpHeaderCharReturns {
  @scala.inline
  def apply(invalid: scala.Boolean, `val`: java.lang.String): IReplaceInvalidHttpHeaderCharReturns = {
    val __obj = js.Dynamic.literal(invalid = invalid)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
  }
}

