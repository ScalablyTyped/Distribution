package typings.xadesjs

import typings.xadesjs.buildTypesXmlAnyMod.Any
import typings.xadesjs.buildTypesXmlEncapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesCollection
import typings.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlSignerRoleMod {
  
  @JSImport("xadesjs/build/types/xml/signer_role", "CertifiedRole")
  @js.native
  open class CertifiedRole () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signer_role", "CertifiedRoles")
  @js.native
  open class CertifiedRoles () extends XadesCollection[CertifiedRole] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signer_role", "ClaimedRole")
  @js.native
  open class ClaimedRole () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signer_role", "ClaimedRoles")
  @js.native
  open class ClaimedRoles () extends XadesCollection[ClaimedRole] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/xml/signer_role", "SignerRole")
  @js.native
  open class SignerRole () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CertifiedRoles: typings.xadesjs.buildTypesXmlSignerRoleMod.CertifiedRoles = js.native
    
    var ClaimedRoles: typings.xadesjs.buildTypesXmlSignerRoleMod.ClaimedRoles = js.native
  }
}
