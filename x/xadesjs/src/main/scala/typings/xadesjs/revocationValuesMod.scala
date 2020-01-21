package typings.xadesjs

import typings.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/revocation_values", JSImport.Namespace)
@js.native
object revocationValuesMod extends js.Object {
  @js.native
  class CRLValues () extends XmlCollection[EncapsulatedCRLValue]
  
  @js.native
  class EncapsulatedCRLValue () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedOCSPValue () extends EncapsulatedPKIData
  
  @js.native
  class OCSPValues () extends XmlCollection[EncapsulatedOCSPValue]
  
  @js.native
  class OtherValue () extends EncapsulatedPKIData
  
  @js.native
  class OtherValues () extends XmlCollection[OtherValue]
  
  @js.native
  class RevocationValues () extends XmlObject {
    var CRLValues: typings.xadesjs.revocationValuesMod.CRLValues = js.native
    var Id: String = js.native
    var OCSPValues: typings.xadesjs.revocationValuesMod.OCSPValues = js.native
    var OtherValues: typings.xadesjs.revocationValuesMod.OtherValues = js.native
  }
  
}

