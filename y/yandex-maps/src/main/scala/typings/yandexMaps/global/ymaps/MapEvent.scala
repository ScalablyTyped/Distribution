package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.IEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ymaps.MapEvent")
@js.native
open class MapEvent[OriginalEvent, TargetGeometry] protected ()
  extends typings.yandexMaps.mod.MapEvent[OriginalEvent, TargetGeometry] {
  def this(originalEvent: js.Object, sourceEvent: IEvent[js.Object, js.Object]) = this()
}
