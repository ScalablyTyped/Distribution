package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFlexApiMod {
  
  @JSImport("twilio/lib/rest/FlexApi", JSImport.Namespace)
  @js.native
  open class ^ protected () extends FlexApi {
    /**
      * Initialize flex_api domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait FlexApi
    extends typings.twilio.libBaseDomainMod.^ {
    
    val channel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChannelListInstance */ Any = js.native
    
    val configuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigurationListInstance */ Any = js.native
    
    val flexFlow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlexFlowListInstance */ Any = js.native
    
    val goodData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GoodDataListInstance */ Any = js.native
    
    val interaction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InteractionListInstance */ Any = js.native
    
    val userRoles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UserRolesListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestFlexApiV1Mod.^ = js.native
    
    val webChannel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebChannelListInstance */ Any = js.native
  }
}
