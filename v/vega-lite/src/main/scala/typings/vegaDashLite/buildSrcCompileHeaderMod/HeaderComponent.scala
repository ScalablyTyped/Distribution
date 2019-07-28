package typings.vegaDashLite.buildSrcCompileHeaderMod

import typings.vegaDashLite.Anon_Signal
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderComponent extends js.Object {
  var axes: js.Array[VgAxis]
  var labels: Boolean
  var sizeSignal: Anon_Signal
}

object HeaderComponent {
  @scala.inline
  def apply(axes: js.Array[VgAxis], labels: Boolean, sizeSignal: Anon_Signal): HeaderComponent = {
    val __obj = js.Dynamic.literal(axes = axes, labels = labels, sizeSignal = sizeSignal)
  
    __obj.asInstanceOf[HeaderComponent]
  }
}

