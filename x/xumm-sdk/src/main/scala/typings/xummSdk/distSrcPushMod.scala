package typings.xummSdk

import typings.xummSdk.distSrcMetaMod.Meta
import typings.xummSdk.distSrcTypesPushEventPushPostBodyMod.EventPushPostBody
import typings.xummSdk.distSrcTypesPushEventResponseMod.EventResponse
import typings.xummSdk.distSrcTypesPushPushResponseMod.PushResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPushMod {
  
  @JSImport("xumm-sdk/dist/src/Push", "Push")
  @js.native
  open class Push protected () extends StObject {
    def this(MetaObject: Meta) = this()
    
    /* private */ var Meta: Any = js.native
    
    def event(data: EventPushPostBody): js.Promise[EventResponse] = js.native
    
    def notification(data: EventPushPostBody): js.Promise[PushResponse] = js.native
    
    /* private */ var userdata: Any = js.native
  }
}
