package typings.yauzl

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Buffer
  var id: Double
}

object Anon_Data {
  @scala.inline
  def apply(data: Buffer, id: Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, id = id)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

