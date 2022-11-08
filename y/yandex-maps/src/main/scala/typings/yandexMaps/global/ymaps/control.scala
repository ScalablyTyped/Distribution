package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.IControl
import typings.yandexMaps.mod.control.IButtonParameters
import typings.yandexMaps.mod.control.IFullscreenControlParameters
import typings.yandexMaps.mod.control.IGeolocationControlParameters
import typings.yandexMaps.mod.control.IListBoxItemParameters
import typings.yandexMaps.mod.control.IListBoxParameters
import typings.yandexMaps.mod.control.IManagerOptions
import typings.yandexMaps.mod.control.IRouteButtonParameters
import typings.yandexMaps.mod.control.IRouteEditorParameters
import typings.yandexMaps.mod.control.IRoutePanelParameters
import typings.yandexMaps.mod.control.IRulerControlParameters
import typings.yandexMaps.mod.control.ISearchControlParameters
import typings.yandexMaps.mod.control.ITypeSelectorParameters
import typings.yandexMaps.mod.control.IZoomControlParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @JSGlobal("ymaps.control.Button")
  @js.native
  open class Button ()
    extends typings.yandexMaps.mod.control.Button {
    def this(parameters: String) = this()
    def this(parameters: IButtonParameters) = this()
  }
  
  @JSGlobal("ymaps.control.FullscreenControl")
  @js.native
  open class FullscreenControl ()
    extends typings.yandexMaps.mod.control.FullscreenControl {
    def this(parameters: IFullscreenControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.GeolocationControl")
  @js.native
  open class GeolocationControl ()
    extends typings.yandexMaps.mod.control.GeolocationControl {
    def this(parameters: IGeolocationControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.ListBox")
  @js.native
  open class ListBox ()
    extends typings.yandexMaps.mod.control.ListBox {
    def this(parameters: IListBoxParameters) = this()
  }
  
  @JSGlobal("ymaps.control.ListBoxItem")
  @js.native
  open class ListBoxItem ()
    extends typings.yandexMaps.mod.control.ListBoxItem {
    def this(parameters: IListBoxItemParameters) = this()
  }
  
  @JSGlobal("ymaps.control.Manager")
  @js.native
  open class Manager protected ()
    extends typings.yandexMaps.mod.control.Manager {
    def this(map: typings.yandexMaps.mod.Map_) = this()
    def this(map: typings.yandexMaps.mod.Map_, controls: js.Array[String | IControl]) = this()
    def this(map: typings.yandexMaps.mod.Map_, controls: js.Array[String | IControl], options: IManagerOptions) = this()
    def this(map: typings.yandexMaps.mod.Map_, controls: Unit, options: IManagerOptions) = this()
  }
  
  @JSGlobal("ymaps.control.RouteButton")
  @js.native
  open class RouteButton ()
    extends typings.yandexMaps.mod.control.RouteButton {
    def this(parameters: IRouteButtonParameters) = this()
  }
  
  @JSGlobal("ymaps.control.RouteEditor")
  @js.native
  open class RouteEditor ()
    extends typings.yandexMaps.mod.control.RouteEditor {
    def this(parameters: IRouteEditorParameters) = this()
  }
  
  @JSGlobal("ymaps.control.RoutePanel")
  @js.native
  open class RoutePanel ()
    extends typings.yandexMaps.mod.control.RoutePanel {
    def this(parameters: IRoutePanelParameters) = this()
  }
  
  @JSGlobal("ymaps.control.RulerControl")
  @js.native
  open class RulerControl ()
    extends typings.yandexMaps.mod.control.RulerControl {
    def this(parameters: IRulerControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.SearchControl")
  @js.native
  open class SearchControl ()
    extends typings.yandexMaps.mod.control.SearchControl {
    def this(parameters: ISearchControlParameters) = this()
  }
  
  @JSGlobal("ymaps.control.TypeSelector")
  @js.native
  open class TypeSelector ()
    extends typings.yandexMaps.mod.control.TypeSelector {
    def this(parameters: ITypeSelectorParameters) = this()
  }
  
  @JSGlobal("ymaps.control.ZoomControl")
  @js.native
  open class ZoomControl ()
    extends typings.yandexMaps.mod.control.ZoomControl {
    def this(parameters: IZoomControlParameters) = this()
  }
}
