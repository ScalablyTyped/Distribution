package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "PBES2Params")
@js.native
class PBES2Params () extends js.Object {
  def this(params: js.Any) = this()
  var encryptionScheme: AlgorithmIdentifier = js.native
  var keyDerivationFunc: AlgorithmIdentifier = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "PBES2Params")
@js.native
object PBES2Params extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

