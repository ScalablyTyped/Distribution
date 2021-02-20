package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickSettingsServiceEventMap extends ProxyEventMap {
  
  var pause: QuickSettingsServicePauseEvent = js.native
  
  var resume: QuickSettingsServiceResumeEvent = js.native
  
  var start: QuickSettingsServiceStartEvent = js.native
  
  var startlistening: QuickSettingsServiceStartlisteningEvent = js.native
  
  var stop: QuickSettingsServiceStopEvent = js.native
  
  var stoplistening: QuickSettingsServiceStoplisteningEvent = js.native
  
  var taskremoved: QuickSettingsServiceTaskremovedEvent = js.native
  
  var tileadded: QuickSettingsServiceTileaddedEvent = js.native
  
  var tiledialogcancelled: QuickSettingsServiceTiledialogcancelledEvent = js.native
  
  var tiledialognegative: QuickSettingsServiceTiledialognegativeEvent = js.native
  
  var tiledialogneutral: QuickSettingsServiceTiledialogneutralEvent = js.native
  
  var tiledialogoptionselected: QuickSettingsServiceTiledialogoptionselectedEvent = js.native
  
  var tiledialogpositive: QuickSettingsServiceTiledialogpositiveEvent = js.native
  
  var tileremoved: QuickSettingsServiceTileremovedEvent = js.native
}
object QuickSettingsServiceEventMap {
  
  @scala.inline
  def apply(
    pause: QuickSettingsServicePauseEvent,
    resume: QuickSettingsServiceResumeEvent,
    start: QuickSettingsServiceStartEvent,
    startlistening: QuickSettingsServiceStartlisteningEvent,
    stop: QuickSettingsServiceStopEvent,
    stoplistening: QuickSettingsServiceStoplisteningEvent,
    taskremoved: QuickSettingsServiceTaskremovedEvent,
    tileadded: QuickSettingsServiceTileaddedEvent,
    tiledialogcancelled: QuickSettingsServiceTiledialogcancelledEvent,
    tiledialognegative: QuickSettingsServiceTiledialognegativeEvent,
    tiledialogneutral: QuickSettingsServiceTiledialogneutralEvent,
    tiledialogoptionselected: QuickSettingsServiceTiledialogoptionselectedEvent,
    tiledialogpositive: QuickSettingsServiceTiledialogpositiveEvent,
    tileremoved: QuickSettingsServiceTileremovedEvent
  ): QuickSettingsServiceEventMap = {
    val __obj = js.Dynamic.literal(pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startlistening = startlistening.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], stoplistening = stoplistening.asInstanceOf[js.Any], taskremoved = taskremoved.asInstanceOf[js.Any], tileadded = tileadded.asInstanceOf[js.Any], tiledialogcancelled = tiledialogcancelled.asInstanceOf[js.Any], tiledialognegative = tiledialognegative.asInstanceOf[js.Any], tiledialogneutral = tiledialogneutral.asInstanceOf[js.Any], tiledialogoptionselected = tiledialogoptionselected.asInstanceOf[js.Any], tiledialogpositive = tiledialogpositive.asInstanceOf[js.Any], tileremoved = tileremoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickSettingsServiceEventMap]
  }
  
  @scala.inline
  implicit class QuickSettingsServiceEventMapMutableBuilder[Self <: QuickSettingsServiceEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPause(value: QuickSettingsServicePauseEvent): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: QuickSettingsServiceResumeEvent): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: QuickSettingsServiceStartEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartlistening(value: QuickSettingsServiceStartlisteningEvent): Self = StObject.set(x, "startlistening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: QuickSettingsServiceStopEvent): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoplistening(value: QuickSettingsServiceStoplisteningEvent): Self = StObject.set(x, "stoplistening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskremoved(value: QuickSettingsServiceTaskremovedEvent): Self = StObject.set(x, "taskremoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileadded(value: QuickSettingsServiceTileaddedEvent): Self = StObject.set(x, "tileadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiledialogcancelled(value: QuickSettingsServiceTiledialogcancelledEvent): Self = StObject.set(x, "tiledialogcancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiledialognegative(value: QuickSettingsServiceTiledialognegativeEvent): Self = StObject.set(x, "tiledialognegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiledialogneutral(value: QuickSettingsServiceTiledialogneutralEvent): Self = StObject.set(x, "tiledialogneutral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiledialogoptionselected(value: QuickSettingsServiceTiledialogoptionselectedEvent): Self = StObject.set(x, "tiledialogoptionselected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiledialogpositive(value: QuickSettingsServiceTiledialogpositiveEvent): Self = StObject.set(x, "tiledialogpositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileremoved(value: QuickSettingsServiceTileremovedEvent): Self = StObject.set(x, "tileremoved", value.asInstanceOf[js.Any])
  }
}
