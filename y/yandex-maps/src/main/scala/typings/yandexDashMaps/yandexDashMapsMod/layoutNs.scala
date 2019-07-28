package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "layout")
@js.native
object layoutNs extends js.Object {
  @JSName("templateBased")
  @js.native
  object templateBasedNs extends js.Object {
    @js.native
    class Base protected () extends ILayout {
      def this(data: js.Object) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
      def build(): Unit = js.native
      def clear(): Unit = js.native
      def onSublayoutSizeChange(sublayoutInfo: js.Object, nodeSizeByContent: js.Object): Unit = js.native
      def rebuild(): Unit = js.native
    }
    
  }
  
}

