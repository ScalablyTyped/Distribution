package typings
package teechartLib.TeeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISeriesList extends js.Object {
  var chart: IChart
  var items: js.Array[ISeries]
  def anyUsesAxes(): scala.Boolean
  def clicked(position: IPoint): scala.Boolean
  //each(f: function): void;
  def firstVisible(): ISeries
}

