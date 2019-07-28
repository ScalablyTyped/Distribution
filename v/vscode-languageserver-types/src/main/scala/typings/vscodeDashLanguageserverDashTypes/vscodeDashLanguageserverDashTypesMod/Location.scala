package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var range: Range
  var uri: String
}

object Location {
  @scala.inline
  def apply(range: Range, uri: String): Location = {
    val __obj = js.Dynamic.literal(range = range, uri = uri)
  
    __obj.asInstanceOf[Location]
  }
}

