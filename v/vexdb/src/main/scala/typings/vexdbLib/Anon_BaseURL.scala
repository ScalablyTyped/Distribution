package typings
package vexdbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseURL extends js.Object {
  var baseURL: java.lang.String
  var cache: Anon_Ttl
  var live: Anon_PollTime
}

object Anon_BaseURL {
  @scala.inline
  def apply(baseURL: java.lang.String, cache: Anon_Ttl, live: Anon_PollTime): Anon_BaseURL = {
    val __obj = js.Dynamic.literal(baseURL = baseURL, cache = cache, live = live)
  
    __obj.asInstanceOf[Anon_BaseURL]
  }
}

