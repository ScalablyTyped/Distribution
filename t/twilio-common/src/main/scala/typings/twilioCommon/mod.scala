package typings.twilioCommon

import typings.node.eventsMod.EventEmitter
import typings.twilioCommon.twilioCommonStrings.error
import typings.twilioCommon.twilioCommonStrings.tokenExpired
import typings.twilioCommon.twilioCommonStrings.tokenUpdated
import typings.twilioCommon.twilioCommonStrings.tokenWillExpire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twilio-common", "AccessManager")
  @js.native
  open class AccessManager protected () extends EventEmitter {
    def this(initialToken: String) = this()
    
    val expires: js.UndefOr[js.Date] = js.native
    
    val identity: js.UndefOr[String] = js.native
    
    val isExpired: Boolean = js.native
    
    def on(
      `type`: tokenExpired | tokenWillExpire | tokenUpdated,
      listener: js.Function1[/* manager */ this.type, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(`type`: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
    
    val token: String = js.native
    
    def updateToken(newToken: String): js.Promise[AccessManager] = js.native
  }
}
