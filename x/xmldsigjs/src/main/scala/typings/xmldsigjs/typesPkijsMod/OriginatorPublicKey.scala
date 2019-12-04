package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "OriginatorPublicKey")
@js.native
class OriginatorPublicKey () extends js.Object {
  def this(params: js.Any) = this()
  var algorithm: AlgorithmIdentifier = js.native
  var publicKey: BitString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "OriginatorPublicKey")
@js.native
object OriginatorPublicKey extends js.Object {
  /**
    * Compare values with default values for all class members
    * @param {string} memberName String name for a class member
    * @param {*} memberValue Value to compare with default value
    */
  def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

