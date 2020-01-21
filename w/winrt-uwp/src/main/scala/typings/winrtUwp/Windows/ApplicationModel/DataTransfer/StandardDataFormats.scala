package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains static properties that return string values. Each string corresponds to a known format ID. Use this class to avoid errors in using string constants to specify data formats. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
@js.native
abstract class StandardDataFormats () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.DataTransfer.StandardDataFormats")
@js.native
object StandardDataFormats extends js.Object {
  /** A read-only property that returns the format ID string value corresponding to the activation link format. */
  var applicationLink: String = js.native
  /** A read-only property that returns the format ID string value corresponding to the Bitmap format. */
  var bitmap: String = js.native
  /** A read-only property that returns the format ID string value corresponding to the HTML format. */
  var html: String = js.native
  /** A read-only property that returns the format ID string value corresponding to the Rich Text Format (RTF). */
  var rtf: String = js.native
  /** A read-only property that returns the format ID string value corresponding to the StorageItem format. */
  var storageItems: String = js.native
  /** A read-only property that returns the format ID string value corresponding to the Text format. */
  var text: String = js.native
  /** A read-only property that returns the format ID string value corresponding to the Uniform Resource Identifier (URI) format. */
  var uri: String = js.native
  /** A read-only property that returns the format ID string value corresponding to the web link format. */
  var webLink: String = js.native
}

