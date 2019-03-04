package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an OptionSet value.
  */
trait OptionSetValue extends js.Object {
  /**
    * The label text.
    */
  var text: java.lang.String
  /**
    * The value, as a number
    */
  var value: scala.Double
}

object OptionSetValue {
  @scala.inline
  def apply(text: java.lang.String, value: scala.Double): OptionSetValue = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[OptionSetValue]
  }
}

