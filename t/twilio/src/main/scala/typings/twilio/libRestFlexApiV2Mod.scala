package typings.twilio

import typings.twilio.libRestFlexApiBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestFlexApiV2Mod {
  
  @JSImport("twilio/lib/rest/flexApi/V2", JSImport.Default)
  @js.native
  open class default protected () extends V2 {
    /**
      * Initialize the V2 version of FlexApi
      *
      * @param domain - The Twilio (Twilio.FlexApi) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V2
    extends typings.twilio.libBaseVersionMod.default {
    
    /** webChannels - { Twilio.FlexApi.V2.WebChannelsListInstance } resource */
    /* protected */ var _webChannels: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebChannelsListInstance */ Any
      ] = js.native
    
    /** Getter for webChannels resource */
    def webChannels: Any = js.native
  }
}
