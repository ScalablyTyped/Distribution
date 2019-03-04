package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a name-value pair in a URL query string. */
trait IWwwFormUrlDecoderEntry extends js.Object {
  /** Represents the name of a parameter in a URL query string. */
  var name: java.lang.String
  /** Represents a named value in a URL query string. */
  var value: java.lang.String
}

object IWwwFormUrlDecoderEntry {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): IWwwFormUrlDecoderEntry = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[IWwwFormUrlDecoderEntry]
  }
}

