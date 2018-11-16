package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the PlayReadyLicense class. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseIterator")
@js.native
abstract class PlayReadyLicenseIterator () extends js.Object {
  /** Gets the current item in the PlayReady license collection. */
  var current: IPlayReadyLicense = js.native
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady license collection. */
  var hasCurrent: scala.Boolean = js.native
  /**
                       * Retrieves all items in the PlayReady license collection.
                       */
  def getMany(): winrtDashUwpLib.Anon_ItemsReturnValueIPlayReadyLicense = js.native
  /**
                       * Advances the enumerator to the next item in the collection.
                       * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
                       */
  def moveNext(): scala.Boolean = js.native
}

