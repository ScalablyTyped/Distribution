package typings.titanium.Titanium.Android

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class QuickSettingsServiceEventMapOps[Self <: QuickSettingsServiceEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPause(value: QuickSettingsServicePauseEvent): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def setResume(value: QuickSettingsServiceResumeEvent): Self = this.set("resume", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: QuickSettingsServiceStartEvent): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartlistening(value: QuickSettingsServiceStartlisteningEvent): Self = this.set("startlistening", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: QuickSettingsServiceStopEvent): Self = this.set("stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoplistening(value: QuickSettingsServiceStoplisteningEvent): Self = this.set("stoplistening", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskremoved(value: QuickSettingsServiceTaskremovedEvent): Self = this.set("taskremoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileadded(value: QuickSettingsServiceTileaddedEvent): Self = this.set("tileadded", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiledialogcancelled(value: QuickSettingsServiceTiledialogcancelledEvent): Self = this.set("tiledialogcancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiledialognegative(value: QuickSettingsServiceTiledialognegativeEvent): Self = this.set("tiledialognegative", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiledialogneutral(value: QuickSettingsServiceTiledialogneutralEvent): Self = this.set("tiledialogneutral", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiledialogoptionselected(value: QuickSettingsServiceTiledialogoptionselectedEvent): Self = this.set("tiledialogoptionselected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiledialogpositive(value: QuickSettingsServiceTiledialogpositiveEvent): Self = this.set("tiledialogpositive", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileremoved(value: QuickSettingsServiceTileremovedEvent): Self = this.set("tileremoved", value.asInstanceOf[js.Any])
  }
  
}

