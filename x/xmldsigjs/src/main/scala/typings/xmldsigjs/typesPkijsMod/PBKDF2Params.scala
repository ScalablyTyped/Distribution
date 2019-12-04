package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PBKDF2Params")
@js.native
class PBKDF2Params () extends js.Object {
  def this(params: js.Any) = this()
  var iterationCount: Double = js.native
  var keyLength: Double = js.native
  var prf: AlgorithmIdentifier = js.native
  var salt: js.Any = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "PBKDF2Params")
@js.native
object PBKDF2Params extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

