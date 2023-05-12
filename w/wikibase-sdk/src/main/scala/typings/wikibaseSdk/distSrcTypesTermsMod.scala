package typings.wikibaseSdk

import typings.std.Partial
import typings.std.Record
import typings.wikibaseSdk.distSrcTypesOptionsMod.WmLanguageCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesTermsMod {
  
  type Aliases = WmLanguageRecord[js.Array[Term]]
  
  type Descriptions = WmLanguageRecord[Term]
  
  type Glosses = WmLanguageRecord[Term]
  
  type Labels = WmLanguageRecord[Term]
  
  type Lemmas = WmLanguageRecord[Term]
  
  type Representations = WmLanguageRecord[Term]
  
  type SimplifiedAliases = WmLanguageRecord[js.Array[SimplifiedTerm]]
  
  type SimplifiedDescriptions = WmLanguageRecord[SimplifiedTerm]
  
  type SimplifiedGlosses = WmLanguageRecord[SimplifiedTerm]
  
  type SimplifiedLabels = WmLanguageRecord[SimplifiedTerm]
  
  type SimplifiedLemmas = WmLanguageRecord[SimplifiedTerm]
  
  type SimplifiedRepresentations = WmLanguageRecord[SimplifiedTerm]
  
  type SimplifiedTerm = String
  
  trait Term extends StObject {
    
    val language: WmLanguageCode
    
    val value: String
  }
  object Term {
    
    inline def apply(language: WmLanguageCode, value: String): Term = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Term]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: WmLanguageCode): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type WmLanguageRecord[V] = Partial[Record[WmLanguageCode, V]]
}
