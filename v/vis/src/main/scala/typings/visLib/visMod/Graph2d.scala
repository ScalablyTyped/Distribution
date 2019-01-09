package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vis", "Graph2d")
@js.native
class Graph2d protected () extends js.Object {
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType) = this()
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType, options: Graph2dOptions) = this()
  def this(container: stdLib.HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType, options: Graph2dOptions) = this()
  def addCustomTime(time: DateType): IdType = js.native
  def addCustomTime(time: DateType, id: IdType): IdType = js.native
  def destroy(): scala.Unit = js.native
  def fit(): scala.Unit = js.native
  def fit(options: TimelineAnimationOptions): scala.Unit = js.native
  def focus(ids: js.Array[IdType]): scala.Unit = js.native
  def focus(ids: js.Array[IdType], options: TimelineAnimationOptions): scala.Unit = js.native
  def focus(ids: IdType): scala.Unit = js.native
  def focus(ids: IdType, options: TimelineAnimationOptions): scala.Unit = js.native
  def focus(selection: js.Any): scala.Unit = js.native
  def getCurrentTime(): stdLib.Date = js.native
  def getCustomTime(): stdLib.Date = js.native
  def getCustomTime(id: IdType): stdLib.Date = js.native
  def getEventProperties(event: stdLib.Event): TimelineEventPropertiesResult = js.native
  def getItemRange(): js.Any = js.native
  def getLegend(): TimelineWindow = js.native
   // TODO
  def getSelection(): js.Array[IdType] = js.native
  def getVisibleItems(): js.Array[IdType] = js.native
  def getWindow(): visLib.Anon_End = js.native
  @JSName("getWindow")
  def getWindow_TimelineWindow(): TimelineWindow = js.native
  def moveTo(time: DateType): scala.Unit = js.native
  def moveTo(time: DateType, options: TimelineAnimationOptions): scala.Unit = js.native
  def off(event: TimelineEvents, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def on(): scala.Unit = js.native
  def on(event: java.lang.String): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function1[/* properties */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(event: TimelineEvents, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def redraw(): scala.Unit = js.native
  def removeCustomTime(id: IdType): scala.Unit = js.native
  def setCurrentTime(time: DateType): scala.Unit = js.native
  def setCustomTime(time: DateType): scala.Unit = js.native
  def setCustomTime(time: DateType, id: IdType): scala.Unit = js.native
  def setCustomTimeTitle(title: java.lang.String): scala.Unit = js.native
  def setCustomTimeTitle(title: java.lang.String, id: IdType): scala.Unit = js.native
  def setData(data: visLib.Anon_Groups): scala.Unit = js.native
  def setGroups(): scala.Unit = js.native
  def setGroups(groups: js.Array[TimelineGroup]): scala.Unit = js.native
  def setGroups(groups: DataGroupCollectionType): scala.Unit = js.native
  def setItems(): scala.Unit = js.native
  def setItems(items: js.Array[TimelineItem]): scala.Unit = js.native
  def setItems(items: DataItemCollectionType): scala.Unit = js.native
  def setOptions(options: TimelineOptions): scala.Unit = js.native
  def setSelection(ids: js.Array[IdType]): scala.Unit = js.native
  def setSelection(ids: IdType): scala.Unit = js.native
  def setWindow(start: js.Any, date: js.Any): scala.Unit = js.native
  def setWindow(start: DateType, end: DateType): scala.Unit = js.native
  def setWindow(start: DateType, end: DateType, options: TimelineAnimationOptions): scala.Unit = js.native
}

