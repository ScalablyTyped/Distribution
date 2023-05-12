package typings.twilio

import typings.twilio.libRestContentBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestContentV1Mod {
  
  @JSImport("twilio/lib/rest/content/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Content
      *
      * @param domain - The Twilio (Twilio.Content) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** contentAndApprovals - { Twilio.Content.V1.ContentAndApprovalsListInstance } resource */
    /* protected */ var _contentAndApprovals: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContentAndApprovalsListInstance */ Any
      ] = js.native
    
    /** contents - { Twilio.Content.V1.ContentListInstance } resource */
    /* protected */ var _contents: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContentListInstance */ Any
      ] = js.native
    
    /** legacyContents - { Twilio.Content.V1.LegacyContentListInstance } resource */
    /* protected */ var _legacyContents: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyContentListInstance */ Any
      ] = js.native
    
    /** Getter for contentAndApprovals resource */
    def contentAndApprovals: Any = js.native
    
    /** Getter for contents resource */
    def contents: Any = js.native
    
    /** Getter for legacyContents resource */
    def legacyContents: Any = js.native
  }
}
