package typings
package typeDashCheckLib.TypeCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TC extends js.Object {
  var VERSION: java.lang.String = js.native
  def parseType(typeDescription: java.lang.String): js.Object = js.native
  def parsedTypeCheck(parsedType: js.Any, obj: js.Any): scala.Boolean = js.native
  def typeCheck(typeDescription: java.lang.String, inst: js.Any): scala.Boolean = js.native
  def typeCheck(typeDescription: java.lang.String, inst: js.Any, options: Options): scala.Boolean = js.native
}

