package typings.xadesjs

import typings.xadesjs.buildTypesXmlAnyMod.Any
import typings.xadesjs.buildTypesXmlEncapsulatedUnderscorePkiUnderscoreDataMod.EncapsulatedPKIData
import typings.xmlDashCore.xmlDashCoreMod.XmlCollection
import typings.xmlDashCore.xmlDashCoreMod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signer_role", JSImport.Namespace)
@js.native
object buildTypesXmlSignerUnderscoreRoleMod extends js.Object {
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
    var CertifiedRoles: typings.xadesjs.buildTypesXmlSignerUnderscoreRoleMod.CertifiedRoles = js.native
    var ClaimedRoles: typings.xadesjs.buildTypesXmlSignerUnderscoreRoleMod.ClaimedRoles = js.native
  }
  
}

