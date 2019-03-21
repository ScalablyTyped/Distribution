package typings
package xssLib.xssMod.Global.XSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICSSFilter extends js.Object {
  def process(value: java.lang.String): java.lang.String
}

object ICSSFilter {
  @scala.inline
  def apply(process: java.lang.String => java.lang.String): ICSSFilter = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[ICSSFilter]
  }
}

