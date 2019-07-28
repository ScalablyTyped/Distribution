package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: js.Any
  var scene: String
  var shareTicket: String
}

object Anon_Query {
  @scala.inline
  def apply(query: js.Any, scene: String, shareTicket: String): Anon_Query = {
    val __obj = js.Dynamic.literal(query = query, scene = scene, shareTicket = shareTicket)
  
    __obj.asInstanceOf[Anon_Query]
  }
}

