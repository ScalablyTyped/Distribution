package typings.utility.utilityMod

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
  var invalid: Boolean
  var `val`: String
}

object IReplaceInvalidHttpHeaderCharReturns {
  @scala.inline
  def apply(invalid: Boolean, `val`: String): IReplaceInvalidHttpHeaderCharReturns = {
    val __obj = js.Dynamic.literal(invalid = invalid)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[IReplaceInvalidHttpHeaderCharReturns]
  }
}

