package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesClaimMod.Claims
import typings.wikibaseSdk.distSrcTypesClaimMod.PropertyClaims
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersRankMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/rank", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nonDeprecatedPropertyClaims(propertyClaims: PropertyClaims): PropertyClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("nonDeprecatedPropertyClaims")(propertyClaims.asInstanceOf[js.Any]).asInstanceOf[PropertyClaims]
  
  inline def truthyClaims(claims: Claims): Claims = ^.asInstanceOf[js.Dynamic].applyDynamic("truthyClaims")(claims.asInstanceOf[js.Any]).asInstanceOf[Claims]
  
  inline def truthyPropertyClaims(propertyClaims: PropertyClaims): PropertyClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("truthyPropertyClaims")(propertyClaims.asInstanceOf[js.Any]).asInstanceOf[PropertyClaims]
}
