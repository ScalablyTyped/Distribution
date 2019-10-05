package typings.winrtDashUwp.Windows.Media.Playback

import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IObservableVector
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.currentitemchanged
import typings.winrtDashUwp.winrtDashUwpStrings.itemfailed
import typings.winrtDashUwp.winrtDashUwpStrings.itemopened
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a list of MediaPlaybackItem objects that can be played back. Provides methods for switching the currently playing item and enabling looping and shuffling. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackList")
@js.native
/** Initializes a new instance of the MediaPlaybackList class. */
class MediaPlaybackList () extends js.Object {
  /** Gets or sets a value indicating whether the playback list will loop when the end of the list is reached. */
  var autoRepeatEnabled: Boolean = js.native
  /** Gets the currently playing MediaPlaybackItem . */
  var currentItem: MediaPlaybackItem = js.native
  /** Gets the index of the current item in the MediaPlaybackList . */
  var currentItemIndex: Double = js.native
  /** Gets an IObservableVector representation of the playback list. */
  var items: IObservableVector[MediaPlaybackItem] = js.native
  /** Gets or sets the maximum time before a MediaPlaybackItem in the list is expected to play that the media content associated with the item is retrieved. */
  var maxPrefetchTime: Double = js.native
  /** Occurs when the currently playing MediaPlaybackItem changes. */
  @JSName("oncurrentitemchanged")
  var oncurrentitemchanged_Original: TypedEventHandler[MediaPlaybackList, CurrentMediaPlaybackItemChangedEventArgs] = js.native
  /** Occurs when an error is encountered with a MediaPlaybackItem in the playback list. */
  @JSName("onitemfailed")
  var onitemfailed_Original: TypedEventHandler[MediaPlaybackList, MediaPlaybackItemFailedEventArgs] = js.native
  /** Occurs when a MediaPlaybackItem in the playback list is successfully opened. */
  @JSName("onitemopened")
  var onitemopened_Original: TypedEventHandler[MediaPlaybackList, MediaPlaybackItemOpenedEventArgs] = js.native
  /** Gets or sets a value indicating whether the items in the playback list are played in a random order. */
  var shuffleEnabled: Boolean = js.native
  /** Gets a read-only list of of MediaPlaybackItem objects that will be played in shuffle mode, in the order in which they will be played. */
  var shuffledItems: IVectorView[MediaPlaybackItem] = js.native
  /** Gets or sets the MediaPlaybackItem that will be played first. */
  var startingItem: MediaPlaybackItem = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentitemchanged(
    `type`: currentitemchanged,
    listener: TypedEventHandler[MediaPlaybackList, CurrentMediaPlaybackItemChangedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemfailed(
    `type`: itemfailed,
    listener: TypedEventHandler[MediaPlaybackList, MediaPlaybackItemFailedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_itemopened(
    `type`: itemopened,
    listener: TypedEventHandler[MediaPlaybackList, MediaPlaybackItemOpenedEventArgs]
  ): Unit = js.native
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
  def moveTo(itemIndex: Double): MediaPlaybackItem = js.native
  /** Occurs when the currently playing MediaPlaybackItem changes. */
  def oncurrentitemchanged(ev: CurrentMediaPlaybackItemChangedEventArgs with WinRTEvent[MediaPlaybackList]): Unit = js.native
  /** Occurs when an error is encountered with a MediaPlaybackItem in the playback list. */
  def onitemfailed(ev: MediaPlaybackItemFailedEventArgs with WinRTEvent[MediaPlaybackList]): Unit = js.native
  /** Occurs when a MediaPlaybackItem in the playback list is successfully opened. */
  def onitemopened(ev: MediaPlaybackItemOpenedEventArgs with WinRTEvent[MediaPlaybackList]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_currentitemchanged(
    `type`: currentitemchanged,
    listener: TypedEventHandler[MediaPlaybackList, CurrentMediaPlaybackItemChangedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemfailed(
    `type`: itemfailed,
    listener: TypedEventHandler[MediaPlaybackList, MediaPlaybackItemFailedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_itemopened(
    `type`: itemopened,
    listener: TypedEventHandler[MediaPlaybackList, MediaPlaybackItemOpenedEventArgs]
  ): Unit = js.native
  /**
    * Sets the list of MediaPlaybackItem objects that will be played in shuffle mode, in the order in which they will be played.
    * @param value The list of MediaPlaybackItem objects that will be played in shuffle mode.
    */
  def setShuffledItems(value: IIterable[MediaPlaybackItem]): Unit = js.native
}

