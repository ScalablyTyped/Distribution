package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResponseError
  extends nodeLib.Error {
  var method: java.lang.String
  var path: java.lang.String
  var status: scala.Double
  var text: java.lang.String
}

