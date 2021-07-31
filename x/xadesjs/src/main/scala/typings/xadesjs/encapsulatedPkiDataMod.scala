package typings.xadesjs

import typings.std.Uint8Array
import typings.xadesjs.xmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encapsulatedPkiDataMod {
  
  @JSImport("xadesjs/build/types/xml/encapsulated_pki_data", "EncapsulatedPKIData")
  @js.native
  class EncapsulatedPKIData () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Encoding: EncodingType = js.native
    
    var Id: String = js.native
    
    var Value: Uint8Array = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.xadesjs.xadesjsStrings.der
    - typings.xadesjs.xadesjsStrings.ber
    - typings.xadesjs.xadesjsStrings.cer
    - typings.xadesjs.xadesjsStrings.per
    - typings.xadesjs.xadesjsStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | Null
  
  trait _EncodingType extends StObject
}
