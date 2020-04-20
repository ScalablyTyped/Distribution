package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickSettingsServiceEventMap extends ProxyEventMap {
  var pause: QuickSettingsServicePauseEvent
  var resume: QuickSettingsServiceResumeEvent
  var start: QuickSettingsServiceStartEvent
  var startlistening: QuickSettingsServiceStartlisteningEvent
  var stop: QuickSettingsServiceStopEvent
  var stoplistening: QuickSettingsServiceStoplisteningEvent
  var taskremoved: QuickSettingsServiceTaskremovedEvent
  var tileadded: QuickSettingsServiceTileaddedEvent
  var tiledialogcancelled: QuickSettingsServiceTiledialogcancelledEvent
  var tiledialognegative: QuickSettingsServiceTiledialognegativeEvent
  var tiledialogneutral: QuickSettingsServiceTiledialogneutralEvent
  var tiledialogoptionselected: QuickSettingsServiceTiledialogoptionselectedEvent
  var tiledialogpositive: QuickSettingsServiceTiledialogpositiveEvent
  var tileremoved: QuickSettingsServiceTileremovedEvent
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
}

