package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataStatusCode extends js.Object {
  var data: String
  var statusCode: Double
}

object Anon_DataStatusCode {
  @scala.inline
  def apply(data: String, statusCode: Double): Anon_DataStatusCode = {
    val __obj = js.Dynamic.literal(data = data, statusCode = statusCode)
  
    __obj.asInstanceOf[Anon_DataStatusCode]
  }
}

