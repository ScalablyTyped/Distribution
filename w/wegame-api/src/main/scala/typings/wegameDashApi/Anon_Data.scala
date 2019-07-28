package typings.wegameDashApi

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: String | ArrayBuffer
}

object Anon_Data {
  @scala.inline
  def apply(data: String | ArrayBuffer): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}

