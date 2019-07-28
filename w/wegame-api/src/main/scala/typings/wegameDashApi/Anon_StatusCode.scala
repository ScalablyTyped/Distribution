package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatusCode extends js.Object {
  var statusCode: Double
  var tempFilePath: String
}

object Anon_StatusCode {
  @scala.inline
  def apply(statusCode: Double, tempFilePath: String): Anon_StatusCode = {
    val __obj = js.Dynamic.literal(statusCode = statusCode, tempFilePath = tempFilePath)
  
    __obj.asInstanceOf[Anon_StatusCode]
  }
}

