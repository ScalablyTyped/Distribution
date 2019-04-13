package typings
package utilityLib.utilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ----------------0_0-----------------
  * @description Defines For Date
  * @see https://github.com/node-modules/utility#date-utils
  * ---------------0^0------------------
  */
trait IYYYYMMDDHHmmssStaticOptions extends js.Object {
  var dateSep: js.UndefOr[java.lang.String] = js.undefined
  var timeSep: js.UndefOr[java.lang.String] = js.undefined
}

object IYYYYMMDDHHmmssStaticOptions {
  @scala.inline
  def apply(dateSep: java.lang.String = null, timeSep: java.lang.String = null): IYYYYMMDDHHmmssStaticOptions = {
    val __obj = js.Dynamic.literal()
    if (dateSep != null) __obj.updateDynamic("dateSep")(dateSep)
    if (timeSep != null) __obj.updateDynamic("timeSep")(timeSep)
    __obj.asInstanceOf[IYYYYMMDDHHmmssStaticOptions]
  }
}

