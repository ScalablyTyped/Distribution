package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: String
  var request: String
}

object Anon_Path {
  @scala.inline
  def apply(path: String, request: String): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path, request = request)
  
    __obj.asInstanceOf[Anon_Path]
  }
}

