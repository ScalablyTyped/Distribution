package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  @JSGlobal("ymaps.layout.Image")
  @js.native
  open class Image ()
    extends typings.yandexMaps.mod.layout.Image
  
  @JSGlobal("ymaps.layout.ImageWithContent")
  @js.native
  open class ImageWithContent ()
    extends typings.yandexMaps.mod.layout.ImageWithContent
  
  @JSGlobal("ymaps.layout.PieChart")
  @js.native
  open class PieChart protected ()
    extends typings.yandexMaps.mod.layout.PieChart {
    def this(data: js.Object) = this()
  }
  
  @JSGlobal("ymaps.layout.storage")
  @js.native
  val storage: Storage = js.native
  
  object templateBased {
    
    @JSGlobal("ymaps.layout.templateBased.Base")
    @js.native
    open class Base protected ()
      extends typings.yandexMaps.mod.layout.templateBased.Base {
      def this(data: js.Object) = this()
    }
  }
}
