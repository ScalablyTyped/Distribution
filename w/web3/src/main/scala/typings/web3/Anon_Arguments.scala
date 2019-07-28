package typings.web3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arguments extends js.Object {
  var arguments: js.Array[_]
  var data: String
}

object Anon_Arguments {
  @scala.inline
  def apply(arguments: js.Array[_], data: String): Anon_Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments, data = data)
  
    __obj.asInstanceOf[Anon_Arguments]
  }
}

