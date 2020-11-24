package typings.xadesjs

import typings.std.Uint8Array
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/xml/encapsulated_pki_data", JSImport.Namespace)
@js.native
object encapsulatedPkiDataMod extends js.Object {
  
  @js.native
  class EncapsulatedPKIData () extends XmlObject {
    
    var Encoding: EncodingType = js.native
    
    var Id: String = js.native
    
    var Value: Uint8Array = js.native
  }
  
  trait _EncodingType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.xadesjs.xadesjsStrings.der
    - typings.xadesjs.xadesjsStrings.ber
    - typings.xadesjs.xadesjsStrings.cer
    - typings.xadesjs.xadesjsStrings.per
    - typings.xadesjs.xadesjsStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | Null
}
