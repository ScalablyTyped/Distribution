package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "layout")
@js.native
object layout extends js.Object {
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

