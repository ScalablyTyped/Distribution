package typings.xadesjs

import typings.xadesjs.xmlEncapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xadesjs.xmlXmlBaseMod.XadesCollection
import typings.xadesjs.xmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlRevocationValuesMod {
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "CRLValues")
  @js.native
  open class CRLValues () extends XadesCollection[EncapsulatedCRLValue] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "EncapsulatedCRLValue")
  @js.native
  open class EncapsulatedCRLValue () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "EncapsulatedOCSPValue")
  @js.native
  open class EncapsulatedOCSPValue () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "OCSPValues")
  @js.native
  open class OCSPValues () extends XadesCollection[EncapsulatedOCSPValue] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "OtherValue")
  @js.native
  open class OtherValue () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "OtherValues")
  @js.native
  open class OtherValues () extends XadesCollection[OtherValue] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/revocation_values", "RevocationValues")
  @js.native
  open class RevocationValues () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CRLValues: typings.xadesjs.xmlRevocationValuesMod.CRLValues = js.native
    
    var Id: String = js.native
    
    var OCSPValues: typings.xadesjs.xmlRevocationValuesMod.OCSPValues = js.native
    
    var OtherValues: typings.xadesjs.xmlRevocationValuesMod.OtherValues = js.native
  }
}
