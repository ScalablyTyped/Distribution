package typings.winrtDashUwp.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a name-value pair in a URL query string. Use the IWwwFormUrlDecoderEntry interface instead; see Remarks. */
@JSGlobal("Windows.Foundation.WwwFormUrlDecoderEntry")
@js.native
abstract class WwwFormUrlDecoderEntry () extends js.Object {
  /** Represents the name of a parameter in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Name ) instead; see Remarks. */
  var name: String = js.native
  /** Represents a named value in a URL query string. Use the IWwwFormUrlDecoderEntry interface version ( IWwwFormUrlDecoderEntry.Value ) instead; see Remarks. */
  var value: String = js.native
}

