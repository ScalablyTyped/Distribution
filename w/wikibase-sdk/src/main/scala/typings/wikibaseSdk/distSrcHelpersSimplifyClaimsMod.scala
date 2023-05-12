package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesClaimMod.Claim
import typings.wikibaseSdk.distSrcTypesClaimMod.Claims
import typings.wikibaseSdk.distSrcTypesClaimMod.PropertyClaims
import typings.wikibaseSdk.distSrcTypesClaimMod.PropertyQualifiers
import typings.wikibaseSdk.distSrcTypesClaimMod.Qualifier
import typings.wikibaseSdk.distSrcTypesClaimMod.Qualifiers
import typings.wikibaseSdk.distSrcTypesClaimMod.Reference
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaim
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaims
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedPropertyClaims
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifySnakOptions
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifySnaksOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSimplifyClaimsMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/simplify_claims", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simplifyClaim(claim: Claim): SimplifiedClaim = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaim")(claim.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaim]
  inline def simplifyClaim(claim: Claim, options: SimplifySnakOptions): SimplifiedClaim = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaim")(claim.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaim]
  
  inline def simplifyClaims(claims: Claims): SimplifiedClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaims")(claims.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaims]
  inline def simplifyClaims(claims: Claims, options: SimplifySnaksOptions): SimplifiedClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaims")(claims.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaims]
  
  inline def simplifyPropertyClaims(propertyClaims: PropertyClaims): SimplifiedPropertyClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyPropertyClaims")(propertyClaims.asInstanceOf[js.Any]).asInstanceOf[SimplifiedPropertyClaims]
  inline def simplifyPropertyClaims(propertyClaims: PropertyClaims, options: SimplifySnaksOptions): SimplifiedPropertyClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyPropertyClaims")(propertyClaims.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedPropertyClaims]
  
  inline def simplifyPropertyQualifiers(propertyQualifiers: PropertyQualifiers): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyPropertyQualifiers")(propertyQualifiers.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def simplifyPropertyQualifiers(propertyQualifiers: PropertyQualifiers, options: SimplifySnaksOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyPropertyQualifiers")(propertyQualifiers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def simplifyQualifier(qualifier: Qualifier): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyQualifier")(qualifier.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def simplifyQualifier(qualifier: Qualifier, options: SimplifySnakOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyQualifier")(qualifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def simplifyQualifiers(qualifiers: Qualifiers): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyQualifiers")(qualifiers.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def simplifyQualifiers(qualifiers: Qualifiers, options: SimplifySnaksOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyQualifiers")(qualifiers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def simplifyReferenceRecord(refRecord: Reference): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyReferenceRecord")(refRecord.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def simplifyReferenceRecord(refRecord: Reference, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyReferenceRecord")(refRecord.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def simplifyReferences(references: js.Array[Reference]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyReferences")(references.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def simplifyReferences(references: js.Array[Reference], options: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyReferences")(references.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
