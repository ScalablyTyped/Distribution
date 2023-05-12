package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.anon.After
import typings.wikibaseSdk.anon.Amount
import typings.wikibaseSdk.anon.Entitytype
import typings.wikibaseSdk.distSrcTypesEntityMod.PropertyId
import typings.wikibaseSdk.wikibaseSdkStrings.`wikibase-entityid`
import typings.wikibaseSdk.wikibaseSdkStrings.quantity
import typings.wikibaseSdk.wikibaseSdkStrings.string
import typings.wikibaseSdk.wikibaseSdkStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesClaimMod {
  
  trait Claim extends StObject {
    
    var id: String
    
    var mainsnak: Snak
    
    var qualifiers: js.UndefOr[Qualifiers] = js.undefined
    
    var `qualifiers-order`: js.UndefOr[js.Array[String]] = js.undefined
    
    var rank: Rank
    
    var references: js.UndefOr[js.Array[Reference]] = js.undefined
    
    var `type`: DataType
  }
  object Claim {
    
    inline def apply(id: String, mainsnak: Snak, rank: Rank, `type`: DataType): Claim = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mainsnak = mainsnak.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Claim]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Claim] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMainsnak(value: Snak): Self = StObject.set(x, "mainsnak", value.asInstanceOf[js.Any])
      
      inline def setQualifiers(value: Qualifiers): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      inline def `setQualifiers-order`(value: js.Array[String]): Self = StObject.set(x, "qualifiers-order", value.asInstanceOf[js.Any])
      
      inline def `setQualifiers-orderUndefined`: Self = StObject.set(x, "qualifiers-order", js.undefined)
      
      inline def `setQualifiers-orderVarargs`(value: String*): Self = StObject.set(x, "qualifiers-order", js.Array(value*))
      
      inline def setQualifiersUndefined: Self = StObject.set(x, "qualifiers", js.undefined)
      
      inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setReferences(value: js.Array[Reference]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: Reference*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClaimSnakQuantity
    extends StObject
       with SnakValue {
    
    @JSName("type")
    var type_ClaimSnakQuantity: quantity
    
    @JSName("value")
    var value_ClaimSnakQuantity: Amount
  }
  object ClaimSnakQuantity {
    
    inline def apply(value: Amount): ClaimSnakQuantity = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("quantity")
      __obj.asInstanceOf[ClaimSnakQuantity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClaimSnakQuantity] (val x: Self) extends AnyVal {
      
      inline def setType(value: quantity): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Amount): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClaimSnakString
    extends StObject
       with SnakValue {
    
    @JSName("type")
    var type_ClaimSnakString: string
    
    @JSName("value")
    var value_ClaimSnakString: String
  }
  object ClaimSnakString {
    
    inline def apply(value: String): ClaimSnakString = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[ClaimSnakString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClaimSnakString] (val x: Self) extends AnyVal {
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClaimSnakTimeValue
    extends StObject
       with SnakValue {
    
    @JSName("type")
    var type_ClaimSnakTimeValue: time
    
    @JSName("value")
    var value_ClaimSnakTimeValue: After
  }
  object ClaimSnakTimeValue {
    
    inline def apply(value: After): ClaimSnakTimeValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("time")
      __obj.asInstanceOf[ClaimSnakTimeValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClaimSnakTimeValue] (val x: Self) extends AnyVal {
      
      inline def setType(value: time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: After): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ClaimSnakWikibaseItem = SnakEntityValue
  
  type Claims = Record[PropertyId, PropertyClaims]
  
  /* keyof wikibase-sdk.anon.CommonsMedia */ /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.wikibaseSdkStrings.commonsMedia
    - typings.wikibaseSdk.wikibaseSdkStrings.`external-id`
    - typings.wikibaseSdk.wikibaseSdkStrings.`geo-shape`
    - typings.wikibaseSdk.wikibaseSdkStrings.`globe-coordinate`
    - typings.wikibaseSdk.wikibaseSdkStrings.math
    - typings.wikibaseSdk.wikibaseSdkStrings.monolingualtext
    - typings.wikibaseSdk.wikibaseSdkStrings.`musical-notation`
    - typings.wikibaseSdk.wikibaseSdkStrings.quantity
    - typings.wikibaseSdk.wikibaseSdkStrings.string
    - typings.wikibaseSdk.wikibaseSdkStrings.`tabular-data`
    - typings.wikibaseSdk.wikibaseSdkStrings.time
    - typings.wikibaseSdk.wikibaseSdkStrings.url
    - typings.wikibaseSdk.wikibaseSdkStrings.`wikibase-entityid`
    - typings.wikibaseSdk.wikibaseSdkStrings.`wikibase-form`
    - typings.wikibaseSdk.wikibaseSdkStrings.`wikibase-item`
    - typings.wikibaseSdk.wikibaseSdkStrings.`wikibase-lexeme`
    - typings.wikibaseSdk.wikibaseSdkStrings.`wikibase-property`
    - typings.wikibaseSdk.wikibaseSdkStrings.`wikibase-sense`
  */
  trait DataType extends StObject
  
  type PropertyClaims = js.Array[Claim]
  
  type PropertyQualifiers = js.Array[Qualifier]
  
  type PropertySnaks = js.Array[Snak]
  
  trait Qualifier
    extends StObject
       with Snak {
    
    @JSName("id")
    var id_Qualifier: String
  }
  object Qualifier {
    
    inline def apply(datatype: String, hash: String, id: String, property: String, snaktype: SnakType): Qualifier = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], snaktype = snaktype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Qualifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Qualifier] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type Qualifiers = Record[PropertyId, PropertyQualifiers]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.wikibaseSdkStrings.normal
    - typings.wikibaseSdk.wikibaseSdkStrings.preferred
    - typings.wikibaseSdk.wikibaseSdkStrings.deprecated
  */
  trait Rank extends StObject
  object Rank {
    
    inline def deprecated: typings.wikibaseSdk.wikibaseSdkStrings.deprecated = "deprecated".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.deprecated]
    
    inline def normal: typings.wikibaseSdk.wikibaseSdkStrings.normal = "normal".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.normal]
    
    inline def preferred: typings.wikibaseSdk.wikibaseSdkStrings.preferred = "preferred".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.preferred]
  }
  
  trait Reference extends StObject {
    
    var hash: String
    
    var snaks: Record[PropertyId, js.Array[ReferenceSnak]]
    
    var `snaks-order`: js.Array[String]
  }
  object Reference {
    
    inline def apply(hash: String, snaks: Record[PropertyId, js.Array[ReferenceSnak]], `snaks-order`: js.Array[String]): Reference = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], snaks = snaks.asInstanceOf[js.Any])
      __obj.updateDynamic("snaks-order")(`snaks-order`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setSnaks(value: Record[PropertyId, js.Array[ReferenceSnak]]): Self = StObject.set(x, "snaks", value.asInstanceOf[js.Any])
      
      inline def `setSnaks-order`(value: js.Array[String]): Self = StObject.set(x, "snaks-order", value.asInstanceOf[js.Any])
      
      inline def `setSnaks-orderVarargs`(value: String*): Self = StObject.set(x, "snaks-order", js.Array(value*))
    }
  }
  
  trait ReferenceSnak
    extends StObject
       with Snak {
    
    @JSName("id")
    var id_ReferenceSnak: String
  }
  object ReferenceSnak {
    
    inline def apply(datatype: String, hash: String, id: String, property: String, snaktype: SnakType): ReferenceSnak = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], snaktype = snaktype.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceSnak]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReferenceSnak] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type References = js.Array[Reference]
  
  trait Snak extends StObject {
    
    var datatype: String
    
    var datavalue: js.UndefOr[SnakValue] = js.undefined
    
    var hash: String
    
    var id: js.UndefOr[String] = js.undefined
    
    var property: String
    
    var snaktype: SnakType
  }
  object Snak {
    
    inline def apply(datatype: String, hash: String, property: String, snaktype: SnakType): Snak = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], snaktype = snaktype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Snak]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Snak] (val x: Self) extends AnyVal {
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatavalue(value: SnakValue): Self = StObject.set(x, "datavalue", value.asInstanceOf[js.Any])
      
      inline def setDatavalueUndefined: Self = StObject.set(x, "datavalue", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSnaktype(value: SnakType): Self = StObject.set(x, "snaktype", value.asInstanceOf[js.Any])
    }
  }
  
  trait SnakEntityValue
    extends StObject
       with SnakValue {
    
    @JSName("type")
    var type_SnakEntityValue: `wikibase-entityid`
    
    @JSName("value")
    var value_SnakEntityValue: Entitytype
  }
  object SnakEntityValue {
    
    inline def apply(value: Entitytype): SnakEntityValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("wikibase-entityid")
      __obj.asInstanceOf[SnakEntityValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnakEntityValue] (val x: Self) extends AnyVal {
      
      inline def setType(value: `wikibase-entityid`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Entitytype): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wikibaseSdk.wikibaseSdkStrings.value
    - typings.wikibaseSdk.wikibaseSdkStrings.somevalue
    - typings.wikibaseSdk.wikibaseSdkStrings.novalue
  */
  trait SnakType extends StObject
  object SnakType {
    
    inline def novalue: typings.wikibaseSdk.wikibaseSdkStrings.novalue = "novalue".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.novalue]
    
    inline def somevalue: typings.wikibaseSdk.wikibaseSdkStrings.somevalue = "somevalue".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.somevalue]
    
    inline def value: typings.wikibaseSdk.wikibaseSdkStrings.value = "value".asInstanceOf[typings.wikibaseSdk.wikibaseSdkStrings.value]
  }
  
  trait SnakValue extends StObject {
    
    var `type`: DataType
    
    var value: Any
  }
  object SnakValue {
    
    inline def apply(`type`: DataType, value: Any): SnakValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnakValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnakValue] (val x: Self) extends AnyVal {
      
      inline def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Snaks = Record[PropertyId, PropertySnaks]
}
