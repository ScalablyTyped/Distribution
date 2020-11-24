package typings.titanium.global.Titanium.UI.iOS

import typings.titanium.Titanium.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of constants for the system icon styles that can be used on a tab group tab.
  */
@JSGlobal("Titanium.UI.iOS.SystemIcon")
@js.native
object SystemIcon extends js.Object {
  
  /**
    * Bookmark style icon
    */
  val BOOKMARKS: Double = js.native
  
  /**
    * Contacts style icon
    */
  val CONTACTS: Double = js.native
  
  /**
    * Downloads style icon
    */
  val DOWNLOADS: Double = js.native
  
  /**
    * Favorites style icon
    */
  val FAVORITES: Double = js.native
  
  /**
    * Featured style icon
    */
  val FEATURED: Double = js.native
  
  /**
    * History style icon
    */
  val HISTORY: Double = js.native
  
  /**
    * More style icon
    */
  val MORE: Double = js.native
  
  /**
    * Most recent style icon
    */
  val MOST_RECENT: Double = js.native
  
  /**
    * Most viewed style icon
    */
  val MOST_VIEWED: Double = js.native
  
  /**
    * Recents style icon
    */
  val RECENTS: Double = js.native
  
  /**
    * Search style icon
    */
  val SEARCH: Double = js.native
  
  /**
    * Top rated style icon
    */
  val TOP_RATED: Double = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  def fireEvent(name: String): Unit = js.native
  def fireEvent(name: String, event: js.Any): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ Event, Unit]): Unit = js.native
}
