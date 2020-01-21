package typings.xadesjs

import typings.xadesjs.anyMod.Any
import typings.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xmlCore.mod.XmlCollection
import typings.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signer_role", JSImport.Namespace)
@js.native
object signerRoleMod extends js.Object {
  @js.native
  class CertifiedRole () extends EncapsulatedPKIData
  
  @js.native
  class CertifiedRoles () extends XmlCollection[CertifiedRole]
  
  @js.native
  class ClaimedRole () extends Any
  
  @js.native
  class ClaimedRoles () extends XmlCollection[ClaimedRole]
  
  @js.native
  class SignerRole () extends XmlObject {
    var CertifiedRoles: typings.xadesjs.signerRoleMod.CertifiedRoles = js.native
    var ClaimedRoles: typings.xadesjs.signerRoleMod.ClaimedRoles = js.native
  }
  
}

