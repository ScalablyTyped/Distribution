package typings.twilio

import typings.twilio.libRestVideoBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestVideoV1Mod {
  
  @JSImport("twilio/lib/rest/video/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Video
      *
      * @param domain - The Twilio (Twilio.Video) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** compositionHooks - { Twilio.Video.V1.CompositionHookListInstance } resource */
    /* protected */ var _compositionHooks: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionHookListInstance */ Any
      ] = js.native
    
    /** compositionSettings - { Twilio.Video.V1.CompositionSettingsListInstance } resource */
    /* protected */ var _compositionSettings: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionSettingsListInstance */ Any
      ] = js.native
    
    /** compositions - { Twilio.Video.V1.CompositionListInstance } resource */
    /* protected */ var _compositions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompositionListInstance */ Any
      ] = js.native
    
    /** recordingSettings - { Twilio.Video.V1.RecordingSettingsListInstance } resource */
    /* protected */ var _recordingSettings: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecordingSettingsListInstance */ Any
      ] = js.native
    
    /** recordings - { Twilio.Video.V1.RecordingListInstance } resource */
    /* protected */ var _recordings: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RecordingListInstance */ Any
      ] = js.native
    
    /** rooms - { Twilio.Video.V1.RoomListInstance } resource */
    /* protected */ var _rooms: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RoomListInstance */ Any
      ] = js.native
    
    /** Getter for compositionHooks resource */
    def compositionHooks: Any = js.native
    
    /** Getter for compositionSettings resource */
    def compositionSettings: Any = js.native
    
    /** Getter for compositions resource */
    def compositions: Any = js.native
    
    /** Getter for recordingSettings resource */
    def recordingSettings: Any = js.native
    
    /** Getter for recordings resource */
    def recordings: Any = js.native
    
    /** Getter for rooms resource */
    def rooms: Any = js.native
  }
}
