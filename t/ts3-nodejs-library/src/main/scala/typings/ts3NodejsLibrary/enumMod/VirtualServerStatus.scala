package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualServerStatus extends js.Object
@JSImport("ts3-nodejs-library/lib/types/enum", "VirtualServerStatus")
@js.native
object VirtualServerStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VirtualServerStatus with String] = js.native
  
  @js.native
  sealed trait BOOTING_UP extends VirtualServerStatus
  /* "booting up" */ @js.native
  object BOOTING_UP extends TopLevel[BOOTING_UP with String]
  
  @js.native
  sealed trait DEPLOY_RUNNING extends VirtualServerStatus
  /* "deploy running" */ @js.native
  object DEPLOY_RUNNING extends TopLevel[DEPLOY_RUNNING with String]
  
  @js.native
  sealed trait OFFLINE extends VirtualServerStatus
  /* "offline" */ @js.native
  object OFFLINE extends TopLevel[OFFLINE with String]
  
  @js.native
  sealed trait ONLINE extends VirtualServerStatus
  /* "online" */ @js.native
  object ONLINE extends TopLevel[ONLINE with String]
  
  @js.native
  sealed trait ONLINE_VIRTUAL extends VirtualServerStatus
  /* "online virtual" */ @js.native
  object ONLINE_VIRTUAL extends TopLevel[ONLINE_VIRTUAL with String]
  
  @js.native
  sealed trait OTHER_INSTANCE extends VirtualServerStatus
  /* "other instance" */ @js.native
  object OTHER_INSTANCE extends TopLevel[OTHER_INSTANCE with String]
  
  @js.native
  sealed trait SHUTTING_DOWN extends VirtualServerStatus
  /* "shutting down" */ @js.native
  object SHUTTING_DOWN extends TopLevel[SHUTTING_DOWN with String]
  
  @js.native
  sealed trait UNKNOWN extends VirtualServerStatus
  /* "unknown" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
}
