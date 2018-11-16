package typings
package vegaLib.vegaMod.vgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parse extends js.Object {
  def data(dataSet: js.Array[Data], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def spec(spec: Spec, callback: js.Function1[/* chart */ ChartViewConstructor, scala.Unit]): scala.Unit = js.native
  def spec(url: java.lang.String, callback: js.Function1[/* chart */ ChartViewConstructor, scala.Unit]): scala.Unit = js.native
}

