package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable2
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.pane.EventsPane
import typings.yandexMaps.mod.pane.MovablePane
import typings.yandexMaps.mod.pane.StaticPane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpaneEventsPane extends StObject {
  
  var EventsPane: Instantiable2[
    /* map */ Map_, 
    /* params */ CheckContextMenu, 
    typings.yandexMaps.mod.pane.EventsPane
  ]
  
  var MovablePane: Instantiable2[/* map */ Map_, /* params */ Css, typings.yandexMaps.mod.pane.MovablePane]
  
  var StaticPane: Instantiable2[/* map */ Map_, /* params */ Margin, typings.yandexMaps.mod.pane.StaticPane]
}
object TypeofpaneEventsPane {
  
  inline def apply(
    EventsPane: Instantiable2[/* map */ Map_, /* params */ CheckContextMenu, EventsPane],
    MovablePane: Instantiable2[/* map */ Map_, /* params */ Css, MovablePane],
    StaticPane: Instantiable2[/* map */ Map_, /* params */ Margin, StaticPane]
  ): TypeofpaneEventsPane = {
    val __obj = js.Dynamic.literal(EventsPane = EventsPane.asInstanceOf[js.Any], MovablePane = MovablePane.asInstanceOf[js.Any], StaticPane = StaticPane.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpaneEventsPane]
  }
  
  extension [Self <: TypeofpaneEventsPane](x: Self) {
    
    inline def setEventsPane(value: Instantiable2[/* map */ Map_, /* params */ CheckContextMenu, EventsPane]): Self = StObject.set(x, "EventsPane", value.asInstanceOf[js.Any])
    
    inline def setMovablePane(value: Instantiable2[/* map */ Map_, /* params */ Css, MovablePane]): Self = StObject.set(x, "MovablePane", value.asInstanceOf[js.Any])
    
    inline def setStaticPane(value: Instantiable2[/* map */ Map_, /* params */ Margin, StaticPane]): Self = StObject.set(x, "StaticPane", value.asInstanceOf[js.Any])
  }
}
