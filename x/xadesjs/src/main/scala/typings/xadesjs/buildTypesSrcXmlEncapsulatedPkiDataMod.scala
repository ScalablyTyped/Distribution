package typings.xadesjs

import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlEncapsulatedPkiDataMod {
  
  @JSImport("xadesjs/build/types/src/xml/encapsulated_pki_data", "EncapsulatedPKIData")
  @js.native
  open class EncapsulatedPKIData () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Encoding: EncodingType = js.native
    
    var Id: String = js.native
    
    var Value: js.typedarray.Uint8Array = js.native
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
