package typings.winrtDashUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a name-value pair in a URL query string. */
trait IWwwFormUrlDecoderEntry extends js.Object {
  /** Represents the name of a parameter in a URL query string. */
  var name: String
  /** Represents a named value in a URL query string. */
  var value: String
}

object IWwwFormUrlDecoderEntry {
  @scala.inline
  def apply(name: String, value: String): IWwwFormUrlDecoderEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWwwFormUrlDecoderEntry]
  }
}

