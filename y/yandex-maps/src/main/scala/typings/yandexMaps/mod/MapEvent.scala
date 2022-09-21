package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "MapEvent")
@js.native
open class MapEvent[OriginalEvent, TargetGeometry] protected () extends Event_[OriginalEvent, TargetGeometry] {
  def this(originalEvent: js.Object, sourceEvent: IEvent[js.Object, js.Object]) = this()
  
  @JSName("get")
  def get_domEvent(name: typings.yandexMaps.yandexMapsStrings.domEvent): js.UndefOr[DomEvent_[OriginalEvent, TargetGeometry]] = js.native
}
