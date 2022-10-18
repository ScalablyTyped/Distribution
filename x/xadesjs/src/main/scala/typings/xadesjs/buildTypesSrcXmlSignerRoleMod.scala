package typings.xadesjs

import typings.xadesjs.buildTypesSrcXmlAnyMod.Any
import typings.xadesjs.buildTypesSrcXmlEncapsulatedPkiDataMod.EncapsulatedPKIData
import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesCollection
import typings.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlSignerRoleMod {
  
  @JSImport("xadesjs/build/types/src/xml/signer_role", "CertifiedRole")
  @js.native
  open class CertifiedRole () extends EncapsulatedPKIData {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signer_role", "CertifiedRoles")
  @js.native
  open class CertifiedRoles () extends XadesCollection[CertifiedRole] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signer_role", "ClaimedRole")
  @js.native
  open class ClaimedRole () extends Any {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signer_role", "ClaimedRoles")
  @js.native
  open class ClaimedRoles () extends XadesCollection[ClaimedRole] {
    def this(properties: js.Object) = this()
  }
  
  @JSImport("xadesjs/build/types/src/xml/signer_role", "SignerRole")
  @js.native
  open class SignerRole () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var CertifiedRoles: typings.xadesjs.buildTypesSrcXmlSignerRoleMod.CertifiedRoles = js.native
    
    var ClaimedRoles: typings.xadesjs.buildTypesSrcXmlSignerRoleMod.ClaimedRoles = js.native
  }
}
