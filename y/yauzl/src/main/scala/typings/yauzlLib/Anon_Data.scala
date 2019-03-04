package typings
package yauzlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer
  var id: scala.Double
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer, id: scala.Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, id = id)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

