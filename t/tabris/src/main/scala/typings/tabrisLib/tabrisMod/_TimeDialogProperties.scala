package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TimeDialog
trait _TimeDialogProperties extends _NativeObjectProperties {
  /**
    * The time to be displayed in the dialog. The current date is used when no date is provided.
    */
  var date: stdLib.Date
}

object _TimeDialogProperties {
  @scala.inline
  def apply(date: stdLib.Date): _TimeDialogProperties = {
    val __obj = js.Dynamic.literal(date = date)
  
    __obj.asInstanceOf[_TimeDialogProperties]
  }
}

