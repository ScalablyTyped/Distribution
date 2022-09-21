package typings.yandexMaps.global.ymaps

import typings.yandexMaps.anon.CheckContextMenu
import typings.yandexMaps.anon.Css
import typings.yandexMaps.anon.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pane {
  
  @JSGlobal("ymaps.pane.EventsPane")
  @js.native
  open class EventsPane protected ()
    extends typings.yandexMaps.mod.pane.EventsPane {
    def this(map: typings.yandexMaps.mod.Map_, params: CheckContextMenu) = this()
  }
  
  @JSGlobal("ymaps.pane.MovablePane")
  @js.native
  open class MovablePane protected ()
    extends typings.yandexMaps.mod.pane.MovablePane {
    def this(map: typings.yandexMaps.mod.Map_, params: Css) = this()
  }
  
  @JSGlobal("ymaps.pane.StaticPane")
  @js.native
  open class StaticPane protected ()
    extends typings.yandexMaps.mod.pane.StaticPane {
    def this(map: typings.yandexMaps.mod.Map_, params: Margin) = this()
  }
}
