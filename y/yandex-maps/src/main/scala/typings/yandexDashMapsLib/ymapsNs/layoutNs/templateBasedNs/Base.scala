package typings
package yandexDashMapsLib.ymapsNs.layoutNs.templateBasedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ymaps.layout.templateBased.Base")
@js.native
class Base protected ()
  extends yandexDashMapsLib.ymapsNs.ILayout {
  def this(data: js.Object) = this()
  /* CompleteClass */
  override var events: yandexDashMapsLib.ymapsNs.IEventManager = js.native
  def build(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def onSublayoutSizeChange(sublayoutInfo: js.Object, nodeSizeByContent: js.Object): scala.Unit = js.native
  def rebuild(): scala.Unit = js.native
}

