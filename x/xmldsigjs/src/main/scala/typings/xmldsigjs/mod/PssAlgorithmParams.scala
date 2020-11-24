package typings.xmldsigjs.mod

import typings.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
class PssAlgorithmParams ()
  extends typings.xmldsigjs.keyInfosMod.PssAlgorithmParams {
  def this(algorithm: RsaPSSSignParams) = this()
}
/* static members */
@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
object PssAlgorithmParams extends js.Object {
  
  def FromAlgorithm(algorithm: RsaPSSSignParams): typings.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
}
