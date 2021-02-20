package typings.xmldsigjs.mod

import typings.xmldsigjs.rsaKeyMod.RsaPSSSignParams
import org.scalablytyped.runtime.StObject
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
object PssAlgorithmParams {
  
  @JSImport("xmldsigjs", "PssAlgorithmParams.FromAlgorithm")
  @js.native
  def FromAlgorithm(algorithm: RsaPSSSignParams): typings.xmldsigjs.rsaKeyMod.PssAlgorithmParams = js.native
}
