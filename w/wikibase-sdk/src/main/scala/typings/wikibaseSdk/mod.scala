package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.distSrcHelpersParseResponsesMod.CirrusSearchPagesResponse
import typings.wikibaseSdk.distSrcHelpersParseResponsesMod.Titles
import typings.wikibaseSdk.distSrcHelpersParseResponsesMod.WbGetEntitiesResponse
import typings.wikibaseSdk.distSrcHelpersSimplifySparqlResultsMod.SimplifySparqlResultsOptions
import typings.wikibaseSdk.distSrcHelpersSitelinksMod.GetSitelinkUrlOptions
import typings.wikibaseSdk.distSrcHelpersSitelinksMod.SitelinkData
import typings.wikibaseSdk.distSrcHelpersTimeMod.TimeInputValue
import typings.wikibaseSdk.distSrcTypesClaimMod.Claim
import typings.wikibaseSdk.distSrcTypesClaimMod.Claims
import typings.wikibaseSdk.distSrcTypesClaimMod.PropertyClaims
import typings.wikibaseSdk.distSrcTypesClaimMod.PropertyQualifiers
import typings.wikibaseSdk.distSrcTypesClaimMod.Qualifier
import typings.wikibaseSdk.distSrcTypesClaimMod.Qualifiers
import typings.wikibaseSdk.distSrcTypesClaimMod.Reference
import typings.wikibaseSdk.distSrcTypesEntityMod.Entities
import typings.wikibaseSdk.distSrcTypesEntityMod.Entity
import typings.wikibaseSdk.distSrcTypesEntityMod.EntityId
import typings.wikibaseSdk.distSrcTypesEntityMod.Guid
import typings.wikibaseSdk.distSrcTypesEntityMod.NumericId
import typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedEntities
import typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedEntity
import typings.wikibaseSdk.distSrcTypesLexemeMod.Form
import typings.wikibaseSdk.distSrcTypesLexemeMod.Sense
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedForm
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedSense
import typings.wikibaseSdk.distSrcTypesOptionsMod.InstanceConfig
import typings.wikibaseSdk.distSrcTypesOptionsMod.SimplifyEntityOptions
import typings.wikibaseSdk.distSrcTypesOptionsMod.SimplifySitelinkOptions
import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaim
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaims
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedPropertyClaims
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifyClaimsOptions
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifySnakOptions
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifySnaksOptions
import typings.wikibaseSdk.distSrcTypesSitelinksMod.SimplifiedSitelinks
import typings.wikibaseSdk.distSrcTypesSitelinksMod.Site
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
import typings.wikibaseSdk.distSrcWikibaseSdkMod.Wbk
import typings.wikibaseSdk.wikibaseSdkStrings.form
import typings.wikibaseSdk.wikibaseSdkStrings.item
import typings.wikibaseSdk.wikibaseSdkStrings.lexeme
import typings.wikibaseSdk.wikibaseSdkStrings.property
import typings.wikibaseSdk.wikibaseSdkStrings.sense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wikibase-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: InstanceConfig): Wbk = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Wbk]
  
  @JSImport("wikibase-sdk", "EntityTypes")
  @js.native
  val EntityTypes: js.Tuple5[item, property, lexeme, form, sense] = js.native
  
  inline def WBK(config: InstanceConfig): Wbk = ^.asInstanceOf[js.Dynamic].applyDynamic("WBK")(config.asInstanceOf[js.Any]).asInstanceOf[Wbk]
  
  inline def getEntityIdFromGuid(guid: Guid): EntityId = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntityIdFromGuid")(guid.asInstanceOf[js.Any]).asInstanceOf[EntityId]
  
  inline def getImageUrl(filename: String): Url = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageUrl")(filename.asInstanceOf[js.Any]).asInstanceOf[Url]
  inline def getImageUrl(filename: String, width: Double): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageUrl")(filename.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Url]
  
  inline def getNumericId(id: String): NumericId = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumericId")(id.asInstanceOf[js.Any]).asInstanceOf[NumericId]
  
  inline def getSitelinkData(site: Url): SitelinkData = ^.asInstanceOf[js.Dynamic].applyDynamic("getSitelinkData")(site.asInstanceOf[js.Any]).asInstanceOf[SitelinkData]
  inline def getSitelinkData(site: Site): SitelinkData = ^.asInstanceOf[js.Dynamic].applyDynamic("getSitelinkData")(site.asInstanceOf[js.Any]).asInstanceOf[SitelinkData]
  
  inline def getSitelinkUrl(param0: GetSitelinkUrlOptions): Url = ^.asInstanceOf[js.Dynamic].applyDynamic("getSitelinkUrl")(param0.asInstanceOf[js.Any]).asInstanceOf[Url]
  
  inline def isEntityId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityId */ Boolean]
  
  inline def isEntityPageTitle(title: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityPageTitle */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityPageTitle")(title.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.EntityPageTitle */ Boolean]
  
  inline def isEntitySchemaId(id: String): /* is / * template literal string: E${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntitySchemaId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: E${number} * / string */ Boolean]
  
  inline def isFormId(id: String): /* is / * template literal string: L${number}-F${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: L${number}-F${number} * / string */ Boolean]
  
  inline def isGuid(id: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGuid")(id.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isHash(id: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHash")(id.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isItemId(id: String): /* is / * template literal string: Q${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItemId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: Q${number} * / string */ Boolean]
  
  inline def isLexemeId(id: String): /* is / * template literal string: L${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLexemeId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: L${number} * / string */ Boolean]
  
  inline def isMediaInfoId(id: String): /* is / * template literal string: M${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaInfoId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: M${number} * / string */ Boolean]
  
  inline def isNonNestedEntityId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.NonNestedEntityId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNestedEntityId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.NonNestedEntityId */ Boolean]
  
  inline def isNumericId(id: String): /* is / * template literal string: ${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: ${number} * / string */ Boolean]
  
  inline def isPropertyClaimsId(id: String): /* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.PropertyClaimsId */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyClaimsId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is wikibase-sdk.wikibase-sdk/dist/src/types/entity.PropertyClaimsId */ Boolean]
  
  inline def isPropertyId(id: String): /* is / * template literal string: P${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: P${number} * / string */ Boolean]
  
  inline def isRevisionId(id: String): /* is / * template literal string: ${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRevisionId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: ${number} * / string */ Boolean]
  
  inline def isSenseId(id: String): /* is / * template literal string: L${number}-S${number} * / string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSenseId")(id.asInstanceOf[js.Any]).asInstanceOf[/* is / * template literal string: L${number}-S${number} * / string */ Boolean]
  
  inline def isSitelinkKey(site: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSitelinkKey")(site.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def nonDeprecatedPropertyClaims(propertyClaims: PropertyClaims): PropertyClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("nonDeprecatedPropertyClaims")(propertyClaims.asInstanceOf[js.Any]).asInstanceOf[PropertyClaims]
  
  object parse {
    
    @JSImport("wikibase-sdk", "parse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def entities(res: WbGetEntitiesResponse): SimplifiedEntities = ^.asInstanceOf[js.Dynamic].applyDynamic("entities")(res.asInstanceOf[js.Any]).asInstanceOf[SimplifiedEntities]
    
    inline def pagesTitles(res: CirrusSearchPagesResponse): Titles = ^.asInstanceOf[js.Dynamic].applyDynamic("pagesTitles")(res.asInstanceOf[js.Any]).asInstanceOf[Titles]
  }
  
  object simplify {
    
    @JSImport("wikibase-sdk", "simplify")
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
  
  inline def simplifyAliases(aliases: Aliases): SimplifiedAliases = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyAliases")(aliases.asInstanceOf[js.Any]).asInstanceOf[SimplifiedAliases]
  
  inline def simplifyClaim(claim: Claim): SimplifiedClaim = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaim")(claim.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaim]
  inline def simplifyClaim(claim: Claim, options: SimplifySnakOptions): SimplifiedClaim = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaim")(claim.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaim]
  
  inline def simplifyClaims(claims: Claims): SimplifiedClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaims")(claims.asInstanceOf[js.Any]).asInstanceOf[SimplifiedClaims]
  inline def simplifyClaims(claims: Claims, options: SimplifySnaksOptions): SimplifiedClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyClaims")(claims.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedClaims]
  
  inline def simplifyDescriptions(descriptions: Descriptions): SimplifiedDescriptions = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyDescriptions")(descriptions.asInstanceOf[js.Any]).asInstanceOf[SimplifiedDescriptions]
  
  inline def simplifyEntities(entities: Entities): Record[String, SimplifiedEntity] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntities")(entities.asInstanceOf[js.Any]).asInstanceOf[Record[String, SimplifiedEntity]]
  inline def simplifyEntities(entities: Entities, options: SimplifyEntityOptions): Record[String, SimplifiedEntity] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntities")(entities.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, SimplifiedEntity]]
  
  inline def simplifyEntity(entity: Entity): SimplifiedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntity")(entity.asInstanceOf[js.Any]).asInstanceOf[SimplifiedEntity]
  inline def simplifyEntity(entity: Entity, options: SimplifyEntityOptions): SimplifiedEntity = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyEntity")(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedEntity]
  
  inline def simplifyForm(form: Form): SimplifiedForm = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForm")(form.asInstanceOf[js.Any]).asInstanceOf[SimplifiedForm]
  inline def simplifyForm(form: Form, options: SimplifyClaimsOptions): SimplifiedForm = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForm")(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedForm]
  
  inline def simplifyForms(forms: js.Array[Form]): js.Array[SimplifiedForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForms")(forms.asInstanceOf[js.Any]).asInstanceOf[js.Array[SimplifiedForm]]
  inline def simplifyForms(forms: js.Array[Form], options: SimplifyClaimsOptions): js.Array[SimplifiedForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForms")(forms.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[SimplifiedForm]]
  
  inline def simplifyGlosses(glosses: Glosses): SimplifiedGlosses = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyGlosses")(glosses.asInstanceOf[js.Any]).asInstanceOf[SimplifiedGlosses]
  
  inline def simplifyLabels(labels: Labels): SimplifiedLabels = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyLabels")(labels.asInstanceOf[js.Any]).asInstanceOf[SimplifiedLabels]
  
  inline def simplifyLemmas(lemmas: Lemmas): SimplifiedLemmas = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyLemmas")(lemmas.asInstanceOf[js.Any]).asInstanceOf[SimplifiedLemmas]
  
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
  
  inline def simplifyRepresentations(representations: Representations): SimplifiedRepresentations = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyRepresentations")(representations.asInstanceOf[js.Any]).asInstanceOf[SimplifiedRepresentations]
  
  inline def simplifySense(sense: Sense): SimplifiedSense = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySense")(sense.asInstanceOf[js.Any]).asInstanceOf[SimplifiedSense]
  inline def simplifySense(sense: Sense, options: SimplifyClaimsOptions): SimplifiedSense = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySense")(sense.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedSense]
  
  inline def simplifySenses(senses: js.Array[Sense]): js.Array[SimplifiedSense] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySenses")(senses.asInstanceOf[js.Any]).asInstanceOf[js.Array[SimplifiedSense]]
  inline def simplifySenses(senses: js.Array[Sense], options: SimplifyClaimsOptions): js.Array[SimplifiedSense] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySenses")(senses.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[SimplifiedSense]]
  
  inline def simplifySitelinks(sitelinks: Sitelinks): SimplifiedSitelinks = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySitelinks")(sitelinks.asInstanceOf[js.Any]).asInstanceOf[SimplifiedSitelinks]
  inline def simplifySitelinks(sitelinks: Sitelinks, options: SimplifySitelinkOptions): SimplifiedSitelinks = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySitelinks")(sitelinks.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedSitelinks]
  
  inline def simplifySparqlResults(input: SparqlResults): js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifySparqlResults")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw]]
  inline def simplifySparqlResults(input: SparqlResults, options: SimplifySparqlResultsOptions): js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifySparqlResults")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[(Record[String, SparqlValueType]) | SparqlValueRaw]]
  
  inline def truthyClaims(claims: Claims): Claims = ^.asInstanceOf[js.Dynamic].applyDynamic("truthyClaims")(claims.asInstanceOf[js.Any]).asInstanceOf[Claims]
  
  inline def truthyPropertyClaims(propertyClaims: PropertyClaims): PropertyClaims = ^.asInstanceOf[js.Dynamic].applyDynamic("truthyPropertyClaims")(propertyClaims.asInstanceOf[js.Any]).asInstanceOf[PropertyClaims]
  
  inline def wikibaseTimeToDateObject(wikibaseTime: TimeInputValue): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToDateObject")(wikibaseTime.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def wikibaseTimeToEpochTime(value: TimeInputValue): String | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToEpochTime")(value.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
  inline def wikibaseTimeToISOString(value: TimeInputValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToISOString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wikibaseTimeToSimpleDay(value: TimeInputValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wikibaseTimeToSimpleDay")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("wikibase-sdk", "wikimediaLanguageCodes")
  @js.native
  val wikimediaLanguageCodes: js.Array[Any] = js.native
}
