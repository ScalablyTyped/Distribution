package typings.wikibaseSdk

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wikibaseSdk.distSrcTypesClaimMod.DataType
import typings.wikibaseSdk.distSrcTypesClaimMod.Rank
import typings.wikibaseSdk.distSrcTypesEntityMod.Guid
import typings.wikibaseSdk.distSrcTypesEntityMod.PropertyId
import typings.wikibaseSdk.wikibaseSdkStrings.`simple-day`
import typings.wikibaseSdk.wikibaseSdkStrings.epoch
import typings.wikibaseSdk.wikibaseSdkStrings.iso
import typings.wikibaseSdk.wikibaseSdkStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesSimplifyClaimsMod {
  
  trait CustomSimplifiedClaim
    extends StObject
       with CustomSimplifiedSnak {
    
    @JSName("id")
    var id_CustomSimplifiedClaim: Guid
    
    var qualifiers: js.UndefOr[SimplifiedQualifiers] = js.undefined
    
    var rank: js.UndefOr[Rank] = js.undefined
    
    var references: js.UndefOr[SimplifiedReferences] = js.undefined
  }
  object CustomSimplifiedClaim {
    
    inline def apply(id: Guid, value: Any): CustomSimplifiedClaim = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSimplifiedClaim]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomSimplifiedClaim] (val x: Self) extends AnyVal {
      
      inline def setId(value: Guid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setQualifiers(value: SimplifiedQualifiers): Self = StObject.set(x, "qualifiers", value.asInstanceOf[js.Any])
      
      inline def setQualifiersUndefined: Self = StObject.set(x, "qualifiers", js.undefined)
      
      inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      
      inline def setReferences(value: SimplifiedReferences): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: SimplifiedReference*): Self = StObject.set(x, "references", js.Array(value*))
    }
  }
  
  trait CustomSimplifiedSnak extends StObject {
    
    var id: String
    
    var `type`: js.UndefOr[DataType] = js.undefined
    
    var value: Any
  }
  object CustomSimplifiedSnak {
    
    inline def apply(id: String, value: Any): CustomSimplifiedSnak = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSimplifiedSnak]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomSimplifiedSnak] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SimplifiedClaim = String | Double | CustomSimplifiedClaim
  
  type SimplifiedClaims = Record[PropertyId, SimplifiedPropertyClaims]
  
  type SimplifiedPropertyClaims = js.Array[SimplifiedClaim]
  
  type SimplifiedPropertyQualifiers = js.Array[SimplifiedQualifier]
  
  type SimplifiedPropertySnaks = js.Array[SimplifiedSnak]
  
  type SimplifiedQualifier = SimplifiedSnak
  
  type SimplifiedQualifiers = StringDictionary[SimplifiedPropertyQualifiers]
  
  type SimplifiedReference = StringDictionary[SimplifiedReferenceSnak]
  
  type SimplifiedReferenceSnak = SimplifiedSnak
  
  type SimplifiedReferences = js.Array[SimplifiedReference]
  
  type SimplifiedSnak = String | Double | CustomSimplifiedSnak
  
  type SimplifiedSnaks = Record[PropertyId, SimplifiedPropertySnaks]
  
  type SimplifyClaimsOptions = SimplifySnaksOptions
  
  trait SimplifySnakOptions extends StObject {
    
    var entityPrefix: js.UndefOr[String] = js.undefined
    
    var keepAll: js.UndefOr[Boolean] = js.undefined
    
    var keepHashes: js.UndefOr[Boolean] = js.undefined
    
    var keepIds: js.UndefOr[Boolean] = js.undefined
    
    var keepQualifiers: js.UndefOr[Boolean] = js.undefined
    
    var keepRanks: js.UndefOr[Boolean] = js.undefined
    
    var keepReferences: js.UndefOr[Boolean] = js.undefined
    
    var keepRichValues: js.UndefOr[Boolean] = js.undefined
    
    var keepSnaktypes: js.UndefOr[Boolean] = js.undefined
    
    var keepTypes: js.UndefOr[Boolean] = js.undefined
    
    var novalueValue: js.UndefOr[Any] = js.undefined
    
    var propertyPrefix: js.UndefOr[String] = js.undefined
    
    var somevalueValue: js.UndefOr[Any] = js.undefined
    
    var timeConverter: js.UndefOr[iso | epoch | `simple-day` | none] = js.undefined
  }
  object SimplifySnakOptions {
    
    inline def apply(): SimplifySnakOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimplifySnakOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifySnakOptions] (val x: Self) extends AnyVal {
      
      inline def setEntityPrefix(value: String): Self = StObject.set(x, "entityPrefix", value.asInstanceOf[js.Any])
      
      inline def setEntityPrefixUndefined: Self = StObject.set(x, "entityPrefix", js.undefined)
      
      inline def setKeepAll(value: Boolean): Self = StObject.set(x, "keepAll", value.asInstanceOf[js.Any])
      
      inline def setKeepAllUndefined: Self = StObject.set(x, "keepAll", js.undefined)
      
      inline def setKeepHashes(value: Boolean): Self = StObject.set(x, "keepHashes", value.asInstanceOf[js.Any])
      
      inline def setKeepHashesUndefined: Self = StObject.set(x, "keepHashes", js.undefined)
      
      inline def setKeepIds(value: Boolean): Self = StObject.set(x, "keepIds", value.asInstanceOf[js.Any])
      
      inline def setKeepIdsUndefined: Self = StObject.set(x, "keepIds", js.undefined)
      
      inline def setKeepQualifiers(value: Boolean): Self = StObject.set(x, "keepQualifiers", value.asInstanceOf[js.Any])
      
      inline def setKeepQualifiersUndefined: Self = StObject.set(x, "keepQualifiers", js.undefined)
      
      inline def setKeepRanks(value: Boolean): Self = StObject.set(x, "keepRanks", value.asInstanceOf[js.Any])
      
      inline def setKeepRanksUndefined: Self = StObject.set(x, "keepRanks", js.undefined)
      
      inline def setKeepReferences(value: Boolean): Self = StObject.set(x, "keepReferences", value.asInstanceOf[js.Any])
      
      inline def setKeepReferencesUndefined: Self = StObject.set(x, "keepReferences", js.undefined)
      
      inline def setKeepRichValues(value: Boolean): Self = StObject.set(x, "keepRichValues", value.asInstanceOf[js.Any])
      
      inline def setKeepRichValuesUndefined: Self = StObject.set(x, "keepRichValues", js.undefined)
      
      inline def setKeepSnaktypes(value: Boolean): Self = StObject.set(x, "keepSnaktypes", value.asInstanceOf[js.Any])
      
      inline def setKeepSnaktypesUndefined: Self = StObject.set(x, "keepSnaktypes", js.undefined)
      
      inline def setKeepTypes(value: Boolean): Self = StObject.set(x, "keepTypes", value.asInstanceOf[js.Any])
      
      inline def setKeepTypesUndefined: Self = StObject.set(x, "keepTypes", js.undefined)
      
      inline def setNovalueValue(value: Any): Self = StObject.set(x, "novalueValue", value.asInstanceOf[js.Any])
      
      inline def setNovalueValueUndefined: Self = StObject.set(x, "novalueValue", js.undefined)
      
      inline def setPropertyPrefix(value: String): Self = StObject.set(x, "propertyPrefix", value.asInstanceOf[js.Any])
      
      inline def setPropertyPrefixUndefined: Self = StObject.set(x, "propertyPrefix", js.undefined)
      
      inline def setSomevalueValue(value: Any): Self = StObject.set(x, "somevalueValue", value.asInstanceOf[js.Any])
      
      inline def setSomevalueValueUndefined: Self = StObject.set(x, "somevalueValue", js.undefined)
      
      inline def setTimeConverter(value: iso | epoch | `simple-day` | none): Self = StObject.set(x, "timeConverter", value.asInstanceOf[js.Any])
      
      inline def setTimeConverterUndefined: Self = StObject.set(x, "timeConverter", js.undefined)
    }
  }
  
  trait SimplifySnaksOptions
    extends StObject
       with SimplifySnakOptions {
    
    var keepNonDeprecated: js.UndefOr[Boolean] = js.undefined
    
    var keepNonTruthy: js.UndefOr[Boolean] = js.undefined
  }
  object SimplifySnaksOptions {
    
    inline def apply(): SimplifySnaksOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimplifySnaksOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifySnaksOptions] (val x: Self) extends AnyVal {
      
      inline def setKeepNonDeprecated(value: Boolean): Self = StObject.set(x, "keepNonDeprecated", value.asInstanceOf[js.Any])
      
      inline def setKeepNonDeprecatedUndefined: Self = StObject.set(x, "keepNonDeprecated", js.undefined)
      
      inline def setKeepNonTruthy(value: Boolean): Self = StObject.set(x, "keepNonTruthy", value.asInstanceOf[js.Any])
      
      inline def setKeepNonTruthyUndefined: Self = StObject.set(x, "keepNonTruthy", js.undefined)
    }
  }
}
