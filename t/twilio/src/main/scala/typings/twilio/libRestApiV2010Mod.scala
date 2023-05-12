package typings.twilio

import typings.twilio.libRestApiBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestApiV2010Mod {
  
  @JSImport("twilio/lib/rest/api/V2010", JSImport.Default)
  @js.native
  open class default protected () extends V2010 {
    /**
      * Initialize the V2010 version of Api
      *
      * @param domain - The Twilio (Twilio.Api) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2010
    extends typings.twilio.libBaseVersionMod.default {
    
    /** account - { Twilio.Api.V2010.AccountContext } resource */
    /* protected */ var _account: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AccountContext */ Any
      ] = js.native
    
    /** accounts - { Twilio.Api.V2010.AccountListInstance } resource */
    /* protected */ var _accounts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AccountListInstance */ Any
      ] = js.native
    
    /** Getter for account resource */
    def account: Any = js.native
    
    /** Getter for accounts resource */
    def accounts: Any = js.native
  }
}
