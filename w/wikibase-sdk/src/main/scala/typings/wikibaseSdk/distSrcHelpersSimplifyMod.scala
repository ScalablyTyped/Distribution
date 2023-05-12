package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.distSrcHelpersSimplifySparqlResultsMod.SimplifySparqlResultsOptions
import typings.wikibaseSdk.distSrcTypesClaimMod.Claim
import typings.wikibaseSdk.distSrcTypesClaimMod.Claims
import typings.wikibaseSdk.distSrcTypesClaimMod.PropertyClaims
import typings.wikibaseSdk.distSrcTypesClaimMod.PropertyQualifiers
import typings.wikibaseSdk.distSrcTypesClaimMod.Qualifier
import typings.wikibaseSdk.distSrcTypesClaimMod.Qualifiers
import typings.wikibaseSdk.distSrcTypesClaimMod.Reference
import typings.wikibaseSdk.distSrcTypesEntityMod.Entities
import typings.wikibaseSdk.distSrcTypesEntityMod.Entity
import typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedEntity
import typings.wikibaseSdk.distSrcTypesLexemeMod.Form
import typings.wikibaseSdk.distSrcTypesLexemeMod.Sense
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedForm
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedSense
import typings.wikibaseSdk.distSrcTypesOptionsMod.SimplifyEntityOptions
import typings.wikibaseSdk.distSrcTypesOptionsMod.SimplifySitelinkOptions
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaim
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaims
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedPropertyClaims
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifyClaimsOptions
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifySnakOptions
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifySnaksOptions
import typings.wikibaseSdk.distSrcTypesSitelinksMod.SimplifiedSitelinks
import typings.wikibaseSdk.distSrcTypesSitelinksMod.Sitelinks
import typings.wikibaseSdk.distSrcTypesSparqlMod.SparqlResults
import typings.wikibaseSdk.distSrcTypesSparqlMod.SparqlValueRaw
import typings.wikibaseSdk.distSrcTypesSparqlMod.SparqlValueType
import typings.wikibaseSdk.distSrcTypesTermsMod.Aliases
import typings.wikibaseSdk.distSrcTypesTermsMod.Descriptions
import typings.wikibaseSdk.distSrcTypesTermsMod.Glosses
import typings.wikibaseSdk.distSrcTypesTermsMod.Labels
import typings.wikibaseSdk.distSrcTypesTermsMod.Lemmas
import typings.wikibaseSdk.distSrcTypesTermsMod.Representations
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedAliases
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedDescriptions
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedGlosses
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedLabels
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedLemmas
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedRepresentations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSimplifyMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/simplify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aliases(aliases: Aliases): SimplifiedAliases = ^.asInstanceOf[js.Dynamic].applyDynamic("aliases")(aliases.asInstanceOf[js.Any]).asInstanceOf[SimplifiedAliases]
  
  inline def claim(claim: Claim): SimplifiedClaim = ^.asInstanceOf[js.Dynamic].applyDynamic("claim")(claim.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaim]
  inline def claim(claim: Claim, options: SimplifySnakOptions): SimplifiedClaim = (^.asInstanceOf[js.Dynamic].applyDynamic("claim")(claim.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaim]
  
  inline def claims(claims: Claims): SimplifiedClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("claims")(claims.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaims]
  inline def claims(claims: Claims, options: SimplifySnaksOptions): SimplifiedClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("claims")(claims.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaims]
  
  inline def descriptions(descriptions: Descriptions): SimplifiedDescriptions = ^.asInstanceOf[js.Dynamic].applyDynamic("descriptions")(descriptions.asInstanceOf[js.Any]).asInstanceOf[SimplifiedDescriptions]
  
  inline def entities(entities: Entities): Record[String, SimplifiedEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("entities")(entities.asInstanceOf[js.Any]).asInstanceOf[Record[String, SimplifiedEntity]]
  inline def entities(entities: Entities, options: SimplifyEntityOptions): Record[String, SimplifiedEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("entities")(entities.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, SimplifiedEntity]]
  
  inline def entity(entity: Entity): SimplifiedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("entity")(entity.asInstanceOf[js.Any]).asInstanceOf[SimplifiedEntity]
  inline def entity(entity: Entity, options: SimplifyEntityOptions): SimplifiedEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("entity")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedEntity]
  
  inline def form(form: Form): SimplifiedForm = ^.asInstanceOf[js.Dynamic].applyDynamic("form")(form.asInstanceOf[js.Any]).asInstanceOf[SimplifiedForm]
  inline def form(form: Form, options: SimplifyClaimsOptions): SimplifiedForm = (^.asInstanceOf[js.Dynamic].applyDynamic("form")(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedForm]
  
  inline def forms(forms: js.Array[Form]): js.Array[SimplifiedForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("forms")(forms.asInstanceOf[js.Any]).asInstanceOf[js.Array[SimplifiedForm]]
  inline def forms(forms: js.Array[Form], options: SimplifyClaimsOptions): js.Array[SimplifiedForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("forms")(forms.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[SimplifiedForm]]
  
  inline def glosses(glosses: Glosses): SimplifiedGlosses = ^.asInstanceOf[js.Dynamic].applyDynamic("glosses")(glosses.asInstanceOf[js.Any]).asInstanceOf[SimplifiedGlosses]
  
  inline def labels(labels: Labels): SimplifiedLabels = ^.asInstanceOf[js.Dynamic].applyDynamic("labels")(labels.asInstanceOf[js.Any]).asInstanceOf[SimplifiedLabels]
  
  inline def lemmas(lemmas: Lemmas): SimplifiedLemmas = ^.asInstanceOf[js.Dynamic].applyDynamic("lemmas")(lemmas.asInstanceOf[js.Any]).asInstanceOf[SimplifiedLemmas]
  
  inline def propertyClaims(propertyClaims: PropertyClaims): SimplifiedPropertyClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyClaims")(propertyClaims.asInstanceOf[js.Any]).asInstanceOf[SimplifiedPropertyClaims]
  inline def propertyClaims(propertyClaims: PropertyClaims, options: SimplifySnaksOptions): SimplifiedPropertyClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyClaims")(propertyClaims.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedPropertyClaims]
  
  inline def propertyQualifiers(propertyQualifiers: PropertyQualifiers): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyQualifiers")(propertyQualifiers.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def propertyQualifiers(propertyQualifiers: PropertyQualifiers, options: SimplifySnaksOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("propertyQualifiers")(propertyQualifiers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def propertySnaks(propertyClaims: PropertyClaims): SimplifiedPropertyClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("propertySnaks")(propertyClaims.asInstanceOf[js.Any]).asInstanceOf[SimplifiedPropertyClaims]
  inline def propertySnaks(propertyClaims: PropertyClaims, options: SimplifySnaksOptions): SimplifiedPropertyClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("propertySnaks")(propertyClaims.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedPropertyClaims]
  
  inline def qualifier(qualifier: Qualifier): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("qualifier")(qualifier.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def qualifier(qualifier: Qualifier, options: SimplifySnakOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("qualifier")(qualifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def qualifiers(qualifiers: Qualifiers): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("qualifiers")(qualifiers.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def qualifiers(qualifiers: Qualifiers, options: SimplifySnaksOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("qualifiers")(qualifiers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def references(references: js.Array[Reference]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("references")(references.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def references(references: js.Array[Reference], options: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("references")(references.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def representations(representations: Representations): SimplifiedRepresentations = ^.asInstanceOf[js.Dynamic].applyDynamic("representations")(representations.asInstanceOf[js.Any]).asInstanceOf[SimplifiedRepresentations]
  
  inline def sense(sense: Sense): SimplifiedSense = ^.asInstanceOf[js.Dynamic].applyDynamic("sense")(sense.asInstanceOf[js.Any]).asInstanceOf[SimplifiedSense]
  inline def sense(sense: Sense, options: SimplifyClaimsOptions): SimplifiedSense = (^.asInstanceOf[js.Dynamic].applyDynamic("sense")(sense.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedSense]
  
  inline def senses(senses: js.Array[Sense]): js.Array[SimplifiedSense] = ^.asInstanceOf[js.Dynamic].applyDynamic("senses")(senses.asInstanceOf[js.Any]).asInstanceOf[js.Array[SimplifiedSense]]
  inline def senses(senses: js.Array[Sense], options: SimplifyClaimsOptions): js.Array[SimplifiedSense] = (^.asInstanceOf[js.Dynamic].applyDynamic("senses")(senses.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[SimplifiedSense]]
  
  inline def sitelinks(sitelinks: Sitelinks): SimplifiedSitelinks = ^.asInstanceOf[js.Dynamic].applyDynamic("sitelinks")(sitelinks.asInstanceOf[js.Any]).asInstanceOf[SimplifiedSitelinks]
  inline def sitelinks(sitelinks: Sitelinks, options: SimplifySitelinkOptions): SimplifiedSitelinks = (^.asInstanceOf[js.Dynamic].applyDynamic("sitelinks")(sitelinks.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedSitelinks]
  
  inline def snak(claim: Claim): SimplifiedClaim = ^.asInstanceOf[js.Dynamic].applyDynamic("snak")(claim.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaim]
  inline def snak(claim: Claim, options: SimplifySnakOptions): SimplifiedClaim = (^.asInstanceOf[js.Dynamic].applyDynamic("snak")(claim.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaim]
  
  inline def snaks(claims: Claims): SimplifiedClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("snaks")(claims.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaims]
  inline def snaks(claims: Claims, options: SimplifySnaksOptions): SimplifiedClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("snaks")(claims.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaims]
  
  inline def sparqlResults(input: SparqlResults): js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw] = ^.asInstanceOf[js.Dynamic].applyDynamic("sparqlResults")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw]]
  inline def sparqlResults(input: SparqlResults, options: SimplifySparqlResultsOptions): js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparqlResults")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw]]
}
