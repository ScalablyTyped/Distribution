package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "MapEvent")
@js.native
open class MapEvent[OriginalEvent, TargetGeometry] protected () extends Event_[OriginalEvent, TargetGeometry] {
  def this(originalEvent: js.Object, sourceEvent: IEvent[js.Object, js.Object]) = this()
  
  @JSName("get")
  @scala.annotation.targetName("get_domEvent")
  def get(name: "domEvent"): js.UndefOr[DomEvent_[OriginalEvent, TargetGeometry]] = js.native
  @JSName("get")
  @scala.annotation.targetName("get_coords_globalPixels_pagePixels_clientPixels")
  def get(name: "coords" | "globalPixels" | "pagePixels" | "clientPixels"): js.Tuple2[Double, Double] = js.native
}
