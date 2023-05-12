package typings.tufjsModels

import typings.node.cryptoMod.VerifyKeyObjectInput
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsVerifyMod {
  
  @JSImport("@tufjs/models/dist/utils/verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifySignature(metaDataSignedData: JSONObject, key: VerifyKeyObjectInput, signature: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySignature")(metaDataSignedData.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
