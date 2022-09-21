package typings.yandexMaps.global.ymaps

import typings.std.HTMLElement
import typings.yandexMaps.anon.TrafficImageZIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object map {
  
  @JSGlobal("ymaps.map.Balloon")
  @js.native
  open class Balloon protected ()
    extends typings.yandexMaps.mod.map.Balloon {
    def this(map: typings.yandexMaps.mod.Map_) = this()
  }
  
  @JSGlobal("ymaps.map.Container")
  @js.native
  open class Container protected ()
    extends typings.yandexMaps.mod.map.Container {
    def this(parentElement: String) = this()
    def this(parentElement: HTMLElement) = this()
  }
  
  @JSGlobal("ymaps.map.Converter")
  @js.native
  open class Converter protected ()
    extends typings.yandexMaps.mod.map.Converter {
    def this(map: typings.yandexMaps.mod.Map_) = this()
  }
  
  @JSGlobal("ymaps.map.Copyrights")
  @js.native
  open class Copyrights protected ()
    extends typings.yandexMaps.mod.map.Copyrights {
    def this(map: typings.yandexMaps.mod.Map_) = this()
  }
  
  @JSGlobal("ymaps.map.GeoObjects")
  @js.native
  open class GeoObjects protected ()
    extends typings.yandexMaps.mod.map.GeoObjects {
    def this(map: typings.yandexMaps.mod.Map_) = this()
    def this(map: typings.yandexMaps.mod.Map_, options: js.Object) = this()
  }
  
  @JSGlobal("ymaps.map.Hint")
  @js.native
  open class Hint protected ()
    extends typings.yandexMaps.mod.map.Hint {
    def this(map: typings.yandexMaps.mod.Map_) = this()
  }
  
  @JSGlobal("ymaps.map.ZoomRange")
  @js.native
  open class ZoomRange protected ()
    extends typings.yandexMaps.mod.map.ZoomRange {
    def this(map: typings.yandexMaps.mod.Map_, constraints: js.Array[Double]) = this()
  }
  
  object action {
    
    @JSGlobal("ymaps.map.action.Manager")
    @js.native
    open class Manager protected ()
      extends typings.yandexMaps.mod.map.action.Manager {
      def this(map: typings.yandexMaps.mod.Map_) = this()
    }
  }
  
  object behavior {
    
    @JSGlobal("ymaps.map.behavior.Manager")
    @js.native
    open class Manager protected ()
      extends typings.yandexMaps.mod.map.behavior.Manager {
      def this(map: typings.yandexMaps.mod.Map_) = this()
      def this(map: typings.yandexMaps.mod.Map_, behaviors: js.Array[js.Array[String] | String]) = this()
      def this(
        map: typings.yandexMaps.mod.Map_,
        behaviors: js.Array[js.Array[String] | String],
        options: js.Object
      ) = this()
      def this(map: typings.yandexMaps.mod.Map_, behaviors: Unit, options: js.Object) = this()
    }
  }
  
  object layer {
    
    @JSGlobal("ymaps.map.layer.Manager")
    @js.native
    open class Manager protected ()
      extends typings.yandexMaps.mod.map.layer.Manager {
      def this(map: typings.yandexMaps.mod.Map_) = this()
      def this(map: typings.yandexMaps.mod.Map_, options: TrafficImageZIndex) = this()
    }
  }
  
  object margin {
    
    @JSGlobal("ymaps.map.margin.Accessor")
    @js.native
    open class Accessor protected ()
      extends typings.yandexMaps.mod.map.margin.Accessor {
      def this(screenArea: js.Object) = this()
    }
    
    @JSGlobal("ymaps.map.margin.Manager")
    @js.native
    open class Manager protected ()
      extends typings.yandexMaps.mod.map.margin.Manager {
      def this(map: typings.yandexMaps.mod.Map_) = this()
    }
  }
  
  object pane {
    
    @JSGlobal("ymaps.map.pane.Manager")
    @js.native
    open class Manager protected ()
      extends typings.yandexMaps.mod.map.pane.Manager {
      def this(map: typings.yandexMaps.mod.Map_) = this()
    }
  }
}
