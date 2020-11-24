package typings.yandexMaps.mod

import typings.yandexMaps.mod.util.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "layout")
@js.native
object layout extends js.Object {
  
  val storage: Storage = js.native
  
  @js.native
  object templateBased extends js.Object {
    
    @js.native
    class Base protected () extends ILayout {
      def this(data: js.Object) = this()
      
      def build(): Unit = js.native
      
      def clear(): Unit = js.native
      
      def onSublayoutSizeChange(sublayoutInfo: js.Object, nodeSizeByContent: js.Object): Unit = js.native
      
      def rebuild(): Unit = js.native
    }
  }
}
