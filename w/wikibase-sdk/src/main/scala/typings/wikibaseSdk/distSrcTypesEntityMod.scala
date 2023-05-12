package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.anon.From
import typings.wikibaseSdk.distSrcTypesClaimMod.Claims
import typings.wikibaseSdk.distSrcTypesClaimMod.DataType
import typings.wikibaseSdk.distSrcTypesLexemeMod.Form
import typings.wikibaseSdk.distSrcTypesLexemeMod.Sense
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedForms
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedSenses
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaims
import typings.wikibaseSdk.distSrcTypesSitelinksMod.SimplifiedSitelinks
import typings.wikibaseSdk.distSrcTypesSitelinksMod.Sitelinks
import typings.wikibaseSdk.distSrcTypesTermsMod.Aliases
import typings.wikibaseSdk.distSrcTypesTermsMod.Descriptions
import typings.wikibaseSdk.distSrcTypesTermsMod.Labels
import typings.wikibaseSdk.distSrcTypesTermsMod.Lemmas
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedAliases
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedDescriptions
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedLabels
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedLemmas
import typings.wikibaseSdk.wikibaseSdkStrings.form
import typings.wikibaseSdk.wikibaseSdkStrings.item
import typings.wikibaseSdk.wikibaseSdkStrings.lexeme
import typings.wikibaseSdk.wikibaseSdkStrings.property
import typings.wikibaseSdk.wikibaseSdkStrings.sense
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesEntityMod {
  
  @JSImport("wikibase-sdk/dist/src/types/entity", "EntityTypes")
  @js.native
  val EntityTypes: js.Tuple5[item, property, lexeme, form, sense] = js.native
  
  type Entities = Record[EntityId, Entity]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.distSrcTypesEntityMod.Property
    - typings.wikibaseSdk.distSrcTypesEntityMod.Item
    - typings.wikibaseSdk.distSrcTypesEntityMod.Lexeme
  */
  trait Entity extends StObject
  object Entity {
    
    inline def Item(id: ItemId): typings.wikibaseSdk.distSrcTypesEntityMod.Item = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("item")
      __obj.asInstanceOf[typings.wikibaseSdk.distSrcTypesEntityMod.Item]
    }
    
    inline def Lexeme(id: LexemeId, language: ItemId, lexicalCategory: ItemId): typings.wikibaseSdk.distSrcTypesEntityMod.Lexeme = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("lexeme")
      __obj.asInstanceOf[typings.wikibaseSdk.distSrcTypesEntityMod.Lexeme]
    }
    
    inline def Property(id: PropertyId): typings.wikibaseSdk.distSrcTypesEntityMod.Property = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("property")
      __obj.asInstanceOf[typings.wikibaseSdk.distSrcTypesEntityMod.Property]
    }
  }
  
  type EntityId = NonNestedEntityId | FormId | SenseId
  
  trait EntityInfo extends StObject {
    
    var lastrevid: js.UndefOr[Double] = js.undefined
    
    var modified: js.UndefOr[String] = js.undefined
    
    var ns: js.UndefOr[Double] = js.undefined
    
    var pageid: js.UndefOr[Double] = js.undefined
    
    var redirects: js.UndefOr[From] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object EntityInfo {
    
    inline def apply(): EntityInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EntityInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntityInfo] (val x: Self) extends AnyVal {
      
      inline def setLastrevid(value: Double): Self = StObject.set(x, "lastrevid", value.asInstanceOf[js.Any])
      
      inline def setLastrevidUndefined: Self = StObject.set(x, "lastrevid", js.undefined)
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setNs(value: Double): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setPageid(value: Double): Self = StObject.set(x, "pageid", value.asInstanceOf[js.Any])
      
      inline def setPageidUndefined: Self = StObject.set(x, "pageid", js.undefined)
      
      inline def setRedirects(value: From): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type EntityPageTitle = NamespacedEntityId | ItemId
  
  type EntitySchemaId = /* template literal string: E${number} */ String
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.wikibaseSdkStrings.item
    - typings.wikibaseSdk.wikibaseSdkStrings.property
    - typings.wikibaseSdk.wikibaseSdkStrings.lexeme
    - typings.wikibaseSdk.wikibaseSdkStrings.form
    - typings.wikibaseSdk.wikibaseSdkStrings.sense
  */
  trait EntityType extends StObject
  
  type FormId = /* template literal string: L${number}-F${number} */ String
  
  type Guid = String
  
  type Hash = String
  
  trait Item
    extends StObject
       with EntityInfo
       with Entity {
    
    var aliases: js.UndefOr[Aliases] = js.undefined
    
    var claims: js.UndefOr[Claims] = js.undefined
    
    var descriptions: js.UndefOr[Descriptions] = js.undefined
    
    var id: ItemId
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var sitelinks: js.UndefOr[Sitelinks] = js.undefined
    
    var `type`: item
  }
  object Item {
    
    inline def apply(id: ItemId): Item = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("item")
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setClaims(value: Claims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setDescriptions(value: Descriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      inline def setId(value: ItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setSitelinks(value: Sitelinks): Self = StObject.set(x, "sitelinks", value.asInstanceOf[js.Any])
      
      inline def setSitelinksUndefined: Self = StObject.set(x, "sitelinks", js.undefined)
      
      inline def setType(value: item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ItemId = /* template literal string: Q${number} */ String
  
  trait Lexeme
    extends StObject
       with EntityInfo
       with Entity {
    
    var claims: js.UndefOr[Claims] = js.undefined
    
    var forms: js.UndefOr[js.Array[Form]] = js.undefined
    
    var id: LexemeId
    
    var language: ItemId
    
    var lemmas: js.UndefOr[Lemmas] = js.undefined
    
    var lexicalCategory: ItemId
    
    var senses: js.UndefOr[js.Array[Sense]] = js.undefined
    
    var `type`: lexeme
  }
  object Lexeme {
    
    inline def apply(id: LexemeId, language: ItemId, lexicalCategory: ItemId): Lexeme = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("lexeme")
      __obj.asInstanceOf[Lexeme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lexeme] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: Claims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setForms(value: js.Array[Form]): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      inline def setFormsUndefined: Self = StObject.set(x, "forms", js.undefined)
      
      inline def setFormsVarargs(value: Form*): Self = StObject.set(x, "forms", js.Array(value*))
      
      inline def setId(value: LexemeId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: ItemId): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLemmas(value: Lemmas): Self = StObject.set(x, "lemmas", value.asInstanceOf[js.Any])
      
      inline def setLemmasUndefined: Self = StObject.set(x, "lemmas", js.undefined)
      
      inline def setLexicalCategory(value: ItemId): Self = StObject.set(x, "lexicalCategory", value.asInstanceOf[js.Any])
      
      inline def setSenses(value: js.Array[Sense]): Self = StObject.set(x, "senses", value.asInstanceOf[js.Any])
      
      inline def setSensesUndefined: Self = StObject.set(x, "senses", js.undefined)
      
      inline def setSensesVarargs(value: Sense*): Self = StObject.set(x, "senses", js.Array(value*))
      
      inline def setType(value: lexeme): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type LexemeId = /* template literal string: L${number} */ String
  
  type MediaInfoId = /* template literal string: M${number} */ String
  
  type NamespacedEntityId = /* template literal string: Item:${ItemId} */ String
  
  type NonNestedEntityId = ItemId | PropertyId | LexemeId | MediaInfoId
  
  type NumericId = /* template literal string: ${number} */ String
  
  trait Property
    extends StObject
       with EntityInfo
       with Entity {
    
    var aliases: js.UndefOr[Aliases] = js.undefined
    
    var claims: js.UndefOr[Claims] = js.undefined
    
    var datatype: js.UndefOr[DataType] = js.undefined
    
    var descriptions: js.UndefOr[Descriptions] = js.undefined
    
    var id: PropertyId
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var `type`: property
  }
  object Property {
    
    inline def apply(id: PropertyId): Property = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("property")
      __obj.asInstanceOf[Property]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setClaims(value: Claims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setDatatype(value: DataType): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setDescriptions(value: Descriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      inline def setId(value: PropertyId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setType(value: property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type PropertyClaimsId = /* template literal string: ${EntityId}#${PropertyId} */ String
  
  type PropertyId = /* template literal string: P${number} */ String
  
  type RevisionId = /* template literal string: ${number} */ String
  
  type SenseId = /* template literal string: L${number}-S${number} */ String
  
  type SimplifiedEntities = Record[EntityId, SimplifiedEntity]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedProperty
    - typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedItem
    - typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedLexeme
  */
  trait SimplifiedEntity extends StObject
  object SimplifiedEntity {
    
    inline def SimplifiedItem(id: EntityId, lexicalCategory: String): typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("item")
      __obj.asInstanceOf[typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedItem]
    }
    
    inline def SimplifiedLexeme(id: EntityId, language: ItemId, lexicalCategory: ItemId): typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedLexeme = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("lexeme")
      __obj.asInstanceOf[typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedLexeme]
    }
    
    inline def SimplifiedProperty(datatype: DataType, id: EntityId, lexicalCategory: String): typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedProperty = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("property")
      __obj.asInstanceOf[typings.wikibaseSdk.distSrcTypesEntityMod.SimplifiedProperty]
    }
  }
  
  trait SimplifiedEntityInfo extends StObject {
    
    var id: EntityId
    
    var modified: js.UndefOr[String] = js.undefined
  }
  object SimplifiedEntityInfo {
    
    inline def apply(id: EntityId): SimplifiedEntityInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplifiedEntityInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifiedEntityInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
    }
  }
  
  trait SimplifiedItem
    extends StObject
       with SimplifiedEntityInfo
       with SimplifiedEntity {
    
    var aliases: js.UndefOr[SimplifiedAliases] = js.undefined
    
    var claims: js.UndefOr[SimplifiedClaims] = js.undefined
    
    var descriptions: js.UndefOr[SimplifiedDescriptions] = js.undefined
    
    var labels: js.UndefOr[SimplifiedLabels] = js.undefined
    
    var lexicalCategory: String
    
    var sitelinks: js.UndefOr[SimplifiedSitelinks] = js.undefined
    
    var `type`: item
  }
  object SimplifiedItem {
    
    inline def apply(id: EntityId, lexicalCategory: String): SimplifiedItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("item")
      __obj.asInstanceOf[SimplifiedItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifiedItem] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: SimplifiedAliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setClaims(value: SimplifiedClaims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setDescriptions(value: SimplifiedDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      inline def setLabels(value: SimplifiedLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLexicalCategory(value: String): Self = StObject.set(x, "lexicalCategory", value.asInstanceOf[js.Any])
      
      inline def setSitelinks(value: SimplifiedSitelinks): Self = StObject.set(x, "sitelinks", value.asInstanceOf[js.Any])
      
      inline def setSitelinksUndefined: Self = StObject.set(x, "sitelinks", js.undefined)
      
      inline def setType(value: item): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimplifiedLexeme
    extends StObject
       with SimplifiedEntityInfo
       with SimplifiedEntity {
    
    var claims: js.UndefOr[SimplifiedClaims] = js.undefined
    
    var forms: js.UndefOr[SimplifiedForms] = js.undefined
    
    var language: ItemId
    
    var lemmas: js.UndefOr[SimplifiedLemmas] = js.undefined
    
    var lexicalCategory: ItemId
    
    var senses: js.UndefOr[SimplifiedSenses] = js.undefined
    
    var `type`: lexeme
  }
  object SimplifiedLexeme {
    
    inline def apply(id: EntityId, language: ItemId, lexicalCategory: ItemId): SimplifiedLexeme = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("lexeme")
      __obj.asInstanceOf[SimplifiedLexeme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifiedLexeme] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: SimplifiedClaims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setForms(value: SimplifiedForms): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      inline def setFormsUndefined: Self = StObject.set(x, "forms", js.undefined)
      
      inline def setLanguage(value: ItemId): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLemmas(value: SimplifiedLemmas): Self = StObject.set(x, "lemmas", value.asInstanceOf[js.Any])
      
      inline def setLemmasUndefined: Self = StObject.set(x, "lemmas", js.undefined)
      
      inline def setLexicalCategory(value: ItemId): Self = StObject.set(x, "lexicalCategory", value.asInstanceOf[js.Any])
      
      inline def setSenses(value: SimplifiedSenses): Self = StObject.set(x, "senses", value.asInstanceOf[js.Any])
      
      inline def setSensesUndefined: Self = StObject.set(x, "senses", js.undefined)
      
      inline def setType(value: lexeme): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimplifiedProperty
    extends StObject
       with SimplifiedEntityInfo
       with SimplifiedEntity {
    
    var aliases: js.UndefOr[SimplifiedAliases] = js.undefined
    
    var claims: js.UndefOr[SimplifiedClaims] = js.undefined
    
    var datatype: DataType
    
    var descriptions: js.UndefOr[SimplifiedDescriptions] = js.undefined
    
    var labels: js.UndefOr[SimplifiedLabels] = js.undefined
    
    var lexicalCategory: String
    
    var `type`: property
  }
  object SimplifiedProperty {
    
    inline def apply(datatype: DataType, id: EntityId, lexicalCategory: String): SimplifiedProperty = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lexicalCategory = lexicalCategory.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("property")
      __obj.asInstanceOf[SimplifiedProperty]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifiedProperty] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: SimplifiedAliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setClaims(value: SimplifiedClaims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setDatatype(value: DataType): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDescriptions(value: SimplifiedDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
      
      inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
      
      inline def setLabels(value: SimplifiedLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLexicalCategory(value: String): Self = StObject.set(x, "lexicalCategory", value.asInstanceOf[js.Any])
      
      inline def setType(value: property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
