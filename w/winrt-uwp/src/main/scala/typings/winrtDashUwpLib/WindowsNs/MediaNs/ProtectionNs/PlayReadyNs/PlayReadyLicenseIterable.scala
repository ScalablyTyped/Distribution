package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes the PlayReadyLicense class iterator. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseIterable")
@js.native
/** Initializes a new instance of the PlayReadyLicenseIterable class. */
class PlayReadyLicenseIterable () extends js.Object {
  /**
    * Initializes a new instance of the PlayReadyLicenseIterable class.
    * @param contentHeader The content header used to locate associated licenses.
    * @param fullyEvaluated Indicates whether evaluated license chains should be enumerated or if all licenses (including those that are unusable) should be enumerated. This parameter is true if evaluated license chains should be enumerated, or false if all licenses should be enumerated.
    */
  def this(contentHeader: PlayReadyContentHeader, fullyEvaluated: scala.Boolean) = this()
  /**
    * Returns an iterator that iterates over the items in the PlayReady license collection.
    * @return The PlayReady license iterator.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[IPlayReadyLicense] = js.native
}

