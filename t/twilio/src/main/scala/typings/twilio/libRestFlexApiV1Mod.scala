package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFlexApiV1Mod {
  
  @JSImport("twilio/lib/rest/flexApi/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of FlexApi
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestFlexApiMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val channel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ChannelListInstance */ Any = js.native
    
    val configuration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigurationListInstance */ Any = js.native
    
    val flexFlow: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FlexFlowListInstance */ Any = js.native
    
    val interaction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InteractionListInstance */ Any = js.native
    
    val webChannel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebChannelListInstance */ Any = js.native
  }
}
