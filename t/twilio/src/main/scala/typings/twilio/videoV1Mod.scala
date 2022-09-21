package typings.twilio

import typings.twilio.compositionHookMod.CompositionHookContext
import typings.twilio.compositionHookMod.CompositionHookListInstance
import typings.twilio.compositionMod.CompositionContext
import typings.twilio.compositionMod.CompositionListInstance
import typings.twilio.compositionSettingsMod.CompositionSettingsContext
import typings.twilio.compositionSettingsMod.CompositionSettingsListInstance
import typings.twilio.recordingSettingsMod.RecordingSettingsContext
import typings.twilio.recordingSettingsMod.RecordingSettingsListInstance
import typings.twilio.v1RecordingMod.RecordingContext
import typings.twilio.v1RecordingMod.RecordingListInstance
import typings.twilio.v1RoomMod.RoomContext
import typings.twilio.v1RoomMod.RoomListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoV1Mod {
  
  @JSImport("twilio/lib/rest/video/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Video
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.videoMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def compositionHooks(sid: String): CompositionHookContext = js.native
    @JSName("compositionHooks")
    val compositionHooks_Original: CompositionHookListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def compositionSettings(sid: String): CompositionSettingsContext = js.native
    @JSName("compositionSettings")
    val compositionSettings_Original: CompositionSettingsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def compositions(sid: String): CompositionContext = js.native
    @JSName("compositions")
    val compositions_Original: CompositionListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordingSettings(sid: String): RecordingSettingsContext = js.native
    @JSName("recordingSettings")
    val recordingSettings_Original: RecordingSettingsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def recordings(sid: String): RecordingContext = js.native
    @JSName("recordings")
    val recordings_Original: RecordingListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def rooms(sid: String): RoomContext = js.native
    @JSName("rooms")
    val rooms_Original: RoomListInstance = js.native
  }
}
