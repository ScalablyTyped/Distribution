package typings.titanium.Titanium.Android

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import typings.titanium.showParams
import typings.titanium.titaniumStrings.pause
import typings.titanium.titaniumStrings.resume
import typings.titanium.titaniumStrings.start
import typings.titanium.titaniumStrings.startlistening
import typings.titanium.titaniumStrings.stop
import typings.titanium.titaniumStrings.stoplistening
import typings.titanium.titaniumStrings.taskremoved
import typings.titanium.titaniumStrings.tileadded
import typings.titanium.titaniumStrings.tiledialogcancelled
import typings.titanium.titaniumStrings.tiledialognegative
import typings.titanium.titaniumStrings.tiledialogneutral
import typings.titanium.titaniumStrings.tiledialogoptionselected
import typings.titanium.titaniumStrings.tiledialogpositive
import typings.titanium.titaniumStrings.tileremoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Android service for creating custom quick settings tiles and handling user's interaction with them.
  */
@js.native
trait QuickSettingsService extends Service {
  
  @JSName("addEventListener")
  def addEventListener_startlistening(
    name: startlistening,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceStartlisteningEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stoplistening(
    name: stoplistening,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceStoplisteningEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tileadded(
    name: tileadded,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTileaddedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tiledialogcancelled(
    name: tiledialogcancelled,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialogcancelledEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tiledialognegative(
    name: tiledialognegative,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialognegativeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tiledialogneutral(
    name: tiledialogneutral,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialogneutralEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tiledialogoptionselected(
    name: tiledialogoptionselected,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* event */ QuickSettingsServiceTiledialogoptionselectedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tiledialogpositive(
    name: tiledialogpositive,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialogpositiveEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tileremoved(
    name: tileremoved,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTileremovedEvent, Unit]
  ): Unit = js.native
  
  @JSName("fireEvent")
  def fireEvent_pause(name: pause, event: QuickSettingsServicePauseEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume, event: QuickSettingsServiceResumeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_start(name: start, event: QuickSettingsServiceStartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_startlistening(name: startlistening): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_startlistening(name: startlistening, event: QuickSettingsServiceStartlisteningEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stop(name: stop, event: QuickSettingsServiceStopEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stoplistening(name: stoplistening): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_stoplistening(name: stoplistening, event: QuickSettingsServiceStoplisteningEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_taskremoved(name: taskremoved, event: QuickSettingsServiceTaskremovedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tileadded(name: tileadded): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tileadded(name: tileadded, event: QuickSettingsServiceTileaddedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogcancelled(name: tiledialogcancelled): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogcancelled(name: tiledialogcancelled, event: QuickSettingsServiceTiledialogcancelledEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialognegative(name: tiledialognegative): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialognegative(name: tiledialognegative, event: QuickSettingsServiceTiledialognegativeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogneutral(name: tiledialogneutral): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogneutral(name: tiledialogneutral, event: QuickSettingsServiceTiledialogneutralEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogoptionselected(name: tiledialogoptionselected): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogoptionselected(name: tiledialogoptionselected, event: QuickSettingsServiceTiledialogoptionselectedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogpositive(name: tiledialogpositive): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tiledialogpositive(name: tiledialogpositive, event: QuickSettingsServiceTiledialogpositiveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tileremoved(name: tileremoved): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_tileremoved(name: tileremoved, event: QuickSettingsServiceTileremovedEvent): Unit = js.native
  
  /**
    * Returns the Tile's current icon.
    */
  def getIcon(): String | Blob | File = js.native
  
  /**
    * Returns the Tile's current label.
    */
  def getLabel(): String = js.native
  
  /**
    * Returns the Tile's current state.
    */
  def getState(): Double = js.native
  
  /**
    * Returns 'true' if the device is currently locked, 'false' otherwise.
    */
  def isLocked(): Boolean = js.native
  
  /**
    * Returns 'true' if the device is in secure state, 'false' otherwise.
    */
  def isSecure(): Boolean = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_startlistening(
    name: startlistening,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceStartlisteningEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_stoplistening(
    name: stoplistening,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceStoplisteningEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileadded(
    name: tileadded,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTileaddedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tiledialogcancelled(
    name: tiledialogcancelled,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialogcancelledEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tiledialognegative(
    name: tiledialognegative,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialognegativeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tiledialogneutral(
    name: tiledialogneutral,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialogneutralEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tiledialogoptionselected(
    name: tiledialogoptionselected,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* event */ QuickSettingsServiceTiledialogoptionselectedEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tiledialogpositive(
    name: tiledialogpositive,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTiledialogpositiveEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tileremoved(
    name: tileremoved,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ QuickSettingsServiceTileremovedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Changes the Tile's icon.
    */
  def setIcon(icon: String): Unit = js.native
  def setIcon(icon: Blob): Unit = js.native
  def setIcon(icon: File): Unit = js.native
  
  /**
    * Changes the Tile's label.
    */
  def setLabel(label: String): Unit = js.native
  
  /**
    * Sets the state of the Tile.
    */
  def setState(state: Double): Unit = js.native
  
  /**
    * Opens an Alert dialog.
    */
  def showDialog(options: showParams): Unit = js.native
  
  /**
    * Colapses the quick settings menu and starts an activity for the passed Intent.
    */
  def startActivityAndCollapse(intent: Intent): Unit = js.native
  
  /**
    * Prompts the user to unlock the device and runs the JS code.
    */
  def unlockAndRun(jsCode: String): Unit = js.native
  
  /**
    * Applies current tile's properties.
    */
  def updateTile(): Unit = js.native
}
