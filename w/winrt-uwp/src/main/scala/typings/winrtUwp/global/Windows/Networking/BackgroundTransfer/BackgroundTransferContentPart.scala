package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
@js.native
/** Creates a BackgroundTransferContentPart object. */
class BackgroundTransferContentPart ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
  /**
    * Creates a BackgroundTransferContentPart object that identifies the content it represents.
    * @param name Identifies the content.
    */
  def this(name: String) = this()
  /**
    * Creates a BackgroundTransferContentPart object that identifies the file content and the name of the file that it represents.
    * @param name Identifies the content.
    * @param fileName The fully qualified file name, including the local path.
    */
  def this(name: String, fileName: String) = this()
}
