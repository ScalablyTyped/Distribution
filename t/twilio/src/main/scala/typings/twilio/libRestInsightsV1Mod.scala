package typings.twilio

import typings.twilio.libRestInsightsBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestInsightsV1Mod {
  
  @JSImport("twilio/lib/rest/insights/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Insights
      *
      * @param domain - The Twilio (Twilio.Insights) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** callSummaries - { Twilio.Insights.V1.CallSummariesListInstance } resource */
    /* protected */ var _callSummaries: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallSummariesListInstance */ Any
      ] = js.native
    
    /** calls - { Twilio.Insights.V1.CallListInstance } resource */
    /* protected */ var _calls: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CallListInstance */ Any
      ] = js.native
    
    /** conferences - { Twilio.Insights.V1.ConferenceListInstance } resource */
    /* protected */ var _conferences: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConferenceListInstance */ Any
      ] = js.native
    
    /** rooms - { Twilio.Insights.V1.RoomListInstance } resource */
    /* protected */ var _rooms: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoomListInstance */ Any
      ] = js.native
    
    /** settings - { Twilio.Insights.V1.SettingListInstance } resource */
    /* protected */ var _settings: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SettingListInstance */ Any
      ] = js.native
    
    /** Getter for callSummaries resource */
    def callSummaries: Any = js.native
    
    /** Getter for calls resource */
    def calls: Any = js.native
    
    /** Getter for conferences resource */
    def conferences: Any = js.native
    
    /** Getter for rooms resource */
    def rooms: Any = js.native
    
    /** Getter for settings resource */
    def settings: Any = js.native
  }
}
