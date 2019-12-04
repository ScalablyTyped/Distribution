package typings.xmldsigjs.typesPkijsMod

import typings.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "OtherPrimeInfo")
@js.native
class OtherPrimeInfo () extends js.Object {
  def this(params: js.Any) = this()
  var coefficient: Integer = js.native
  var exponent: Integer = js.native
  var prime: Integer = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  def fromJSON(json: JsonOtherPrimeInfo): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "OtherPrimeInfo")
@js.native
object OtherPrimeInfo extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

