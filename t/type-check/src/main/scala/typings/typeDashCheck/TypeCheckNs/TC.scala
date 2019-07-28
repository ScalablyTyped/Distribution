package typings.typeDashCheck.TypeCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TC extends js.Object {
  var VERSION: String = js.native
  def parseType(typeDescription: String): js.Object = js.native
  def parsedTypeCheck(parsedType: js.Any, obj: js.Any): Boolean = js.native
  def typeCheck(typeDescription: String, inst: js.Any): Boolean = js.native
  def typeCheck(typeDescription: String, inst: js.Any, options: Options): Boolean = js.native
}

