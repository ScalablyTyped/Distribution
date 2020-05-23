package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a name-value pair in a URL query string. Use the IWwwFormUrlDecoderEntry interface instead; see Remarks. */
trait WwwFormUrlDecoderEntry extends js.Object {
  /** Represents the name of a parameter in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Name ) instead; see Remarks. */
  var name: String
  /** Represents a named value in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Value ) instead; see Remarks. */
  var value: String
}

object WwwFormUrlDecoderEntry {
  @scala.inline
  def apply(name: String, value: String): WwwFormUrlDecoderEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WwwFormUrlDecoderEntry]
  }
}

