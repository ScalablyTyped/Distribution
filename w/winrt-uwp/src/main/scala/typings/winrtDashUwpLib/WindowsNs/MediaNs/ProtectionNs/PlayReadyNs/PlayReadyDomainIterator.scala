package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the PlayReadyDomain class. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDomainIterator")
@js.native
abstract class PlayReadyDomainIterator () extends js.Object {
  /** Gets the current item in the PlayReady domain collection. */
  var current: IPlayReadyDomain = js.native
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady domain collection. */
  var hasCurrent: scala.Boolean = js.native
  /**
                       * Retrieves all items in the PlayReady domain collection.
                       */
  def getMany(): winrtDashUwpLib.Anon_ItemsReturnValueIPlayReadyDomain = js.native
  /**
                       * Advances the enumerator to the next item in the collection.
                       * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
                       */
  def moveNext(): scala.Boolean = js.native
}

