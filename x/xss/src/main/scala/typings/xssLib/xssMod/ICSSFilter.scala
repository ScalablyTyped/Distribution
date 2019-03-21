package typings
package xssLib.xssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICSSFilter
  extends xssLib.xssMod.Global.XSSNs.ICSSFilter

object ICSSFilter {
  @scala.inline
  def apply(process: java.lang.String => java.lang.String): ICSSFilter = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[ICSSFilter]
  }
}

