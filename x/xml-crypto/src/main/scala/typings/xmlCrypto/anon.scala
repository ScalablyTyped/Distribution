package typings.xmlCrypto

import org.scalablytyped.runtime.StringDictionary
import typings.xmlCrypto.xmlCryptoStrings.after
import typings.xmlCrypto.xmlCryptoStrings.append
import typings.xmlCrypto.xmlCryptoStrings.before
import typings.xmlCrypto.xmlCryptoStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: append | prepend | before | after
    
    var reference: String
  }
  object Action {
    
    inline def apply(action: append | prepend | before | after, reference: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: append | prepend | before | after): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var existingPrefixes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var location: js.UndefOr[Action] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object Attrs {
    
    inline def apply(): Attrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attrs]
    }
    
    extension [Self <: Attrs](x: Self) {
      
      inline def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setExistingPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "existingPrefixes", value.asInstanceOf[js.Any])
      
      inline def setExistingPrefixesUndefined: Self = StObject.set(x, "existingPrefixes", js.undefined)
      
      inline def setLocation(value: Action): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait CanonicalizationAlgorithm extends StObject {
    
    var canonicalizationAlgorithm: js.UndefOr[String] = js.undefined
    
    var idAttribute: js.UndefOr[String] = js.undefined
    
    var implicitTransforms: js.UndefOr[js.Array[String]] = js.undefined
    
    var signatureAlgorithm: js.UndefOr[String] = js.undefined
  }
  object CanonicalizationAlgorithm {
    
    inline def apply(): CanonicalizationAlgorithm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanonicalizationAlgorithm]
    }
    
    extension [Self <: CanonicalizationAlgorithm](x: Self) {
      
      inline def setCanonicalizationAlgorithm(value: String): Self = StObject.set(x, "canonicalizationAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setCanonicalizationAlgorithmUndefined: Self = StObject.set(x, "canonicalizationAlgorithm", js.undefined)
      
      inline def setIdAttribute(value: String): Self = StObject.set(x, "idAttribute", value.asInstanceOf[js.Any])
      
      inline def setIdAttributeUndefined: Self = StObject.set(x, "idAttribute", js.undefined)
      
      inline def setImplicitTransforms(value: js.Array[String]): Self = StObject.set(x, "implicitTransforms", value.asInstanceOf[js.Any])
      
      inline def setImplicitTransformsUndefined: Self = StObject.set(x, "implicitTransforms", js.undefined)
      
      inline def setImplicitTransformsVarargs(value: String*): Self = StObject.set(x, "implicitTransforms", js.Array(value :_*))
      
      inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    }
  }
}
