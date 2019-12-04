package typings.xmldsigjs.typesPkijsMod

import typings.std.ArrayBuffer
import typings.xmldsigjs.Anon_ContentEncryptionAlgorithm
import typings.xmldsigjs.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/types/pkijs", "EncryptedData")
@js.native
class EncryptedData () extends js.Object {
  def this(params: js.Any) = this()
  var encryptedContentInfo: EncryptedContentInfo = js.native
  var unprotectedAttrs: js.Array[Attribute] = js.native
  var version: Double = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    */
  def decrypt(parameters: Anon_Password): js.Thenable[ArrayBuffer] = js.native
  /**
    * Create a new CMS Encrypted Data content
    * @param {*} parameters Parameters neccessary for encryption
    * @returns {Promise}
    */
  def encrypt(parameters: Anon_ContentEncryptionAlgorithm): js.Thenable[ArrayBuffer] = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

/* static members */
@JSImport("xmldsigjs/types/pkijs", "EncryptedData")
@js.native
object EncryptedData extends js.Object {
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

