package typings
package vegaDashLiteLib.buildSrcCompileHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderComponent extends js.Object {
  var axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis]
  var labels: scala.Boolean
  var sizeSignal: vegaDashLiteLib.Anon_Signal
}

object HeaderComponent {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgAxis],
    labels: scala.Boolean,
    sizeSignal: vegaDashLiteLib.Anon_Signal
  ): HeaderComponent = {
    val __obj = js.Dynamic.literal(axes = axes, labels = labels, sizeSignal = sizeSignal)
  
    __obj.asInstanceOf[HeaderComponent]
  }
}

