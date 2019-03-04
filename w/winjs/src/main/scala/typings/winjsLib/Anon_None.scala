package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_None extends js.Object {
  /**
    * The dialog was dismissed without the user selecting any of the commands. The user may have dismissed the dialog by hitting the escape key or pressing the hardware back button.
    **/
  var none: java.lang.String
  /**
    * The user dismissed the dialog by pressing the primary command.
    **/
  var primary: java.lang.String
  /**
    * The user dismissed the dialog by pressing the secondary command.
    **/
  var secondary: java.lang.String
}

object Anon_None {
  @scala.inline
  def apply(none: java.lang.String, primary: java.lang.String, secondary: java.lang.String): Anon_None = {
    val __obj = js.Dynamic.literal(none = none, primary = primary, secondary = secondary)
  
    __obj.asInstanceOf[Anon_None]
  }
}

