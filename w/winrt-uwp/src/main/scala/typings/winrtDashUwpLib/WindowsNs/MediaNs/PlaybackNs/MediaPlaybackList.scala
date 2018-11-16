package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of MediaPlaybackItem objects that can be played back. Provides methods for switching the currently playing item and enabling looping and shuffling. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackList")
@js.native
class MediaPlaybackList () extends js.Object {
  /** Gets or sets a value indicating whether the playback list will loop when the end of the list is reached. */
  var autoRepeatEnabled: scala.Boolean = js.native
  /** Gets the currently playing MediaPlaybackItem . */
  var currentItem: MediaPlaybackItem = js.native
  /** Gets the index of the current item in the MediaPlaybackList . */
  var currentItemIndex: scala.Double = js.native
  /** Gets an IObservableVector representation of the playback list. */
  var items: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableVector[MediaPlaybackItem] = js.native
  /** Gets or sets the maximum time before a MediaPlaybackItem in the list is expected to play that the media content associated with the item is retrieved. */
  var maxPrefetchTime: scala.Double = js.native
  /** Occurs when the currently playing MediaPlaybackItem changes. */
  @JSName("oncurrentitemchanged")
  var oncurrentitemchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, CurrentMediaPlaybackItemChangedEventArgs] = js.native
  /** Occurs when an error is encountered with a MediaPlaybackItem in the playback list. */
  @JSName("onitemfailed")
  var onitemfailed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, MediaPlaybackItemFailedEventArgs] = js.native
  /** Occurs when a MediaPlaybackItem in the playback list is successfully opened. */
  @JSName("onitemopened")
  var onitemopened_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, MediaPlaybackItemOpenedEventArgs] = js.native
  /** Gets or sets a value indicating whether the items in the playback list are played in a random order. */
  var shuffleEnabled: scala.Boolean = js.native
  /** Gets a read-only list of of MediaPlaybackItem objects that will be played in shuffle mode, in the order in which they will be played. */
  var shuffledItems: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[MediaPlaybackItem] = js.native
  /** Gets or sets the MediaPlaybackItem that will be played first. */
  var startingItem: MediaPlaybackItem = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentitemchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.currentitemchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, CurrentMediaPlaybackItemChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemfailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, MediaPlaybackItemFailedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemopened(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemopened,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, MediaPlaybackItemOpenedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Changes the current item of the MediaPlaybackList to the next item in the list.
                   * @return The new current MediaPlaybackItem .
                   */
  def moveNext(): MediaPlaybackItem = js.native
  /**
                   * Changes the current item of the MediaPlaybackList to the previous item in the list.
                   * @return The new current MediaPlaybackItem .
                   */
  def movePrevious(): MediaPlaybackItem = js.native
  /**
                   * Changes the current item of the MediaPlaybackList to the item with the specified index.
                   * @param itemIndex The index of the item to make current.
                   * @return The new current MediaPlaybackItem .
                   */
  def moveTo(itemIndex: scala.Double): MediaPlaybackItem = js.native
  /** Occurs when the currently playing MediaPlaybackItem changes. */
  def oncurrentitemchanged(
    ev: CurrentMediaPlaybackItemChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlaybackList]
  ): scala.Unit = js.native
  /** Occurs when an error is encountered with a MediaPlaybackItem in the playback list. */
  def onitemfailed(ev: MediaPlaybackItemFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlaybackList]): scala.Unit = js.native
  /** Occurs when a MediaPlaybackItem in the playback list is successfully opened. */
  def onitemopened(ev: MediaPlaybackItemOpenedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaPlaybackList]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currentitemchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.currentitemchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, CurrentMediaPlaybackItemChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemfailed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemfailed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, MediaPlaybackItemFailedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemopened(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.itemopened,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[MediaPlaybackList, MediaPlaybackItemOpenedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Sets the list of MediaPlaybackItem objects that will be played in shuffle mode, in the order in which they will be played.
                   * @param value The list of MediaPlaybackItem objects that will be played in shuffle mode.
                   */
  def setShuffledItems(value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[MediaPlaybackItem]): scala.Unit = js.native
}

