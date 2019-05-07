package typings
package yandexDashMapsLib.yandexDashMapsMod

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
    class Base protected ()
      extends yandexDashMapsLib.yandexDashMapsMod.ILayout {
      def this(data: js.Object) = this()
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      def build(): scala.Unit = js.native
      def clear(): scala.Unit = js.native
      def onSublayoutSizeChange(sublayoutInfo: js.Object, nodeSizeByContent: js.Object): scala.Unit = js.native
      def rebuild(): scala.Unit = js.native
    }
    
  }
  
}

