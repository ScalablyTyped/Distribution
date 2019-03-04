package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait summaryItem extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
}

object summaryItem {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String): summaryItem = {
    val __obj = js.Dynamic.literal(message = message, name = name)
  
    __obj.asInstanceOf[summaryItem]
  }
}

