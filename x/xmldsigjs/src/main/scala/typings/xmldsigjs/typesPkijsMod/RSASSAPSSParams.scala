package typings.xmldsigjs.typesPkijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "RSASSAPSSParams")
@js.native
class RSASSAPSSParams () extends js.Object {
  def this(params: js.Any) = this()
  /**
    * Algorithms of hashing (DEFAULT sha1)
    * 
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var hashAlgorithm: AlgorithmIdentifier = js.native
  /**
    * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
    * 
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var maskGenAlgorithm: AlgorithmIdentifier = js.native
  /**
    * Salt length (DEFAULT 20)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var saltLength: Double = js.native
  /**
    * (DEFAULT 1)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var trailerField: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "RSASSAPSSParams")
@js.native
object RSASSAPSSParams extends js.Object {
  def defaultValues(memberName: String): js.Any = js.native
  def schema(): js.Any = js.native
  def schema(parameters: js.Any): js.Any = js.native
}

