package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestStudioMod {
  
  @JSImport("twilio/lib/rest/Studio", JSImport.Namespace)
  @js.native
  open class ^ () extends Studio
  
  @js.native
  trait Studio
    extends typings.twilio.libRestStudioBaseMod.^ {
    
    /**
      * @deprecated - Use v2.flowValidate instead
      */
    def flowValidate: Any = js.native
    
    /**
      * @deprecated - Use v2.flows instead
      */
    def flows: Any = js.native
  }
}
