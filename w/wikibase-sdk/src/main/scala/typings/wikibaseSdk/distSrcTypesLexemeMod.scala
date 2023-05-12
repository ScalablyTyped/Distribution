package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.distSrcTypesClaimMod.Claims
import typings.wikibaseSdk.distSrcTypesEntityMod.FormId
import typings.wikibaseSdk.distSrcTypesEntityMod.ItemId
import typings.wikibaseSdk.distSrcTypesEntityMod.PropertyId
import typings.wikibaseSdk.distSrcTypesEntityMod.SenseId
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifiedClaims
import typings.wikibaseSdk.distSrcTypesTermsMod.Glosses
import typings.wikibaseSdk.distSrcTypesTermsMod.Representations
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedGlosses
import typings.wikibaseSdk.distSrcTypesTermsMod.SimplifiedRepresentations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesLexemeMod {
  
  trait Form extends StObject {
    
    var claims: js.UndefOr[Claims] = js.undefined
    
    var grammaticalFeatures: js.UndefOr[js.Array[ItemId]] = js.undefined
    
    var id: FormId
    
    var representations: js.UndefOr[Representations] = js.undefined
  }
  object Form {
    
    inline def apply(id: FormId): Form = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Form]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: Claims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setGrammaticalFeatures(value: js.Array[ItemId]): Self = StObject.set(x, "grammaticalFeatures", value.asInstanceOf[js.Any])
      
      inline def setGrammaticalFeaturesUndefined: Self = StObject.set(x, "grammaticalFeatures", js.undefined)
      
      inline def setGrammaticalFeaturesVarargs(value: ItemId*): Self = StObject.set(x, "grammaticalFeatures", js.Array(value*))
      
      inline def setId(value: FormId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRepresentations(value: Representations): Self = StObject.set(x, "representations", value.asInstanceOf[js.Any])
      
      inline def setRepresentationsUndefined: Self = StObject.set(x, "representations", js.undefined)
    }
  }
  
  trait Sense extends StObject {
    
    var claims: js.UndefOr[Claims] = js.undefined
    
    var glosses: js.UndefOr[Glosses] = js.undefined
    
    var id: SenseId
  }
  object Sense {
    
    inline def apply(id: SenseId): Sense = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sense]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sense] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: Claims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setGlosses(value: Glosses): Self = StObject.set(x, "glosses", value.asInstanceOf[js.Any])
      
      inline def setGlossesUndefined: Self = StObject.set(x, "glosses", js.undefined)
      
      inline def setId(value: SenseId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimplifiedForm extends StObject {
    
    var claims: js.UndefOr[SimplifiedClaims] = js.undefined
    
    var grammaticalFeatures: js.UndefOr[js.Array[ItemId]] = js.undefined
    
    var id: FormId
    
    var representations: js.UndefOr[SimplifiedRepresentations] = js.undefined
  }
  object SimplifiedForm {
    
    inline def apply(id: FormId): SimplifiedForm = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplifiedForm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifiedForm] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: SimplifiedClaims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setGrammaticalFeatures(value: js.Array[ItemId]): Self = StObject.set(x, "grammaticalFeatures", value.asInstanceOf[js.Any])
      
      inline def setGrammaticalFeaturesUndefined: Self = StObject.set(x, "grammaticalFeatures", js.undefined)
      
      inline def setGrammaticalFeaturesVarargs(value: ItemId*): Self = StObject.set(x, "grammaticalFeatures", js.Array(value*))
      
      inline def setId(value: FormId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRepresentations(value: SimplifiedRepresentations): Self = StObject.set(x, "representations", value.asInstanceOf[js.Any])
      
      inline def setRepresentationsUndefined: Self = StObject.set(x, "representations", js.undefined)
    }
  }
  
  type SimplifiedForms = Record[PropertyId, js.Array[SimplifiedForm]]
  
  trait SimplifiedSense extends StObject {
    
    var claims: js.UndefOr[SimplifiedClaims] = js.undefined
    
    var glosses: js.UndefOr[SimplifiedGlosses] = js.undefined
    
    var id: SenseId
  }
  object SimplifiedSense {
    
    inline def apply(id: SenseId): SimplifiedSense = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplifiedSense]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifiedSense] (val x: Self) extends AnyVal {
      
      inline def setClaims(value: SimplifiedClaims): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
      
      inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
      
      inline def setGlosses(value: SimplifiedGlosses): Self = StObject.set(x, "glosses", value.asInstanceOf[js.Any])
      
      inline def setGlossesUndefined: Self = StObject.set(x, "glosses", js.undefined)
      
      inline def setId(value: SenseId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type SimplifiedSenses = Record[PropertyId, js.Array[SimplifiedSense]]
}
