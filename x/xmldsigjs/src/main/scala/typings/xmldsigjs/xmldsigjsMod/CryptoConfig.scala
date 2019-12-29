package typings.xmldsigjs.xmldsigjsMod

import typings.std.Algorithm
import typings.std.AlgorithmIdentifier
import typings.xmldsigjs.buildTypesAlgorithmMod.HashAlgorithm
import typings.xmldsigjs.buildTypesAlgorithmMod.IHashAlgorithm
import typings.xmldsigjs.buildTypesAlgorithmMod.ISignatureAlgorithm
import typings.xmldsigjs.buildTypesAlgorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig ()
  extends typings.xmldsigjs.buildTypesCryptoUnderscoreConfigMod.CryptoConfig

/* static members */
@JSImport("xmldsigjs", "CryptoConfig")
@js.native
object CryptoConfig extends js.Object {
  def CreateFromName(): typings.xmldsigjs.buildTypesXmlMod.Transform = js.native
  /**
    * Creates Transform from given name
    * if name is not exist then throws error
    *
    * @static
    * @param {(string |)} [name=null]
    * @returns
    *
    * @memberOf CryptoConfig
    */
  def CreateFromName(name: String): typings.xmldsigjs.buildTypesXmlMod.Transform = js.native
  def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
  def CreateSignatureAlgorithm(method: typings.xmldsigjs.buildTypesXmlSignatureUnderscoreMethodMod.SignatureMethod): SignatureAlgorithm = js.native
  def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
  def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
}

