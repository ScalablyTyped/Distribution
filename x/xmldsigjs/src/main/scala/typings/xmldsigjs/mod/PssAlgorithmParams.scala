package typings.xmldsigjs.mod

import typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.RsaPSSSignParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "PssAlgorithmParams")
@js.native
open class PssAlgorithmParams ()
  extends typings.xmldsigjs.buildTypesXmlKeyInfosMod.PssAlgorithmParams {
  def this(algorithm: RsaPSSSignParams) = this()
}
/* static members */
object PssAlgorithmParams {
  
  @JSImport("xmldsigjs", "PssAlgorithmParams")
  @js.native
  val ^ : js.Any = js.native
  
  inline def FromAlgorithm(algorithm: RsaPSSSignParams): typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams = ^.asInstanceOf[js.Dynamic].applyDynamic("FromAlgorithm")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.xmldsigjs.buildTypesXmlKeyInfosRsaKeyMod.PssAlgorithmParams]
}
