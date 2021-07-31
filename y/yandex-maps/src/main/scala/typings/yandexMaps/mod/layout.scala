package typings.yandexMaps.mod

import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layout {
  
  @JSImport("yandex-maps", "layout.storage")
  @js.native
  val storage: Storage = js.native
  
  object templateBased {
    
    @JSImport("yandex-maps", "layout.templateBased.Base")
    @js.native
    class Base protected ()
      extends StObject
         with ILayout {
      def this(data: js.Object) = this()
      
      def build(): Unit = js.native
      
      def clear(): Unit = js.native
      
      /* CompleteClass */
      var events: IEventManager[js.Object] = js.native
      
      def onSublayoutSizeChange(sublayoutInfo: js.Object, nodeSizeByContent: js.Object): Unit = js.native
      
      def rebuild(): Unit = js.native
    }
  }
}
