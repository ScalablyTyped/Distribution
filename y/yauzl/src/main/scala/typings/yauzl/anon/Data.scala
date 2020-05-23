package typings.yauzl.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Buffer
  var id: Double
}

object Data {
  @scala.inline
  def apply(data: Buffer, id: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

