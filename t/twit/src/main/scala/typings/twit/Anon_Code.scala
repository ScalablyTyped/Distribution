package typings.twit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: Double
  var message: String
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, message: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

