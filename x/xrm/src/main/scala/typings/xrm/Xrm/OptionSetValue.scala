package typings.xrm.Xrm

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
  var text: String
  /**
    * The value, as a number
    */
  var value: Double
}

object OptionSetValue {
  @scala.inline
  def apply(text: String, value: Double): OptionSetValue = {
    val __obj = js.Dynamic.literal(text = text, value = value)
  
    __obj.asInstanceOf[OptionSetValue]
  }
}

