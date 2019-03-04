package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var range: Range
  var uri: java.lang.String
}

object Location {
  @scala.inline
  def apply(range: Range, uri: java.lang.String): Location = {
    val __obj = js.Dynamic.literal(range = range, uri = uri)
  
    __obj.asInstanceOf[Location]
  }
}

