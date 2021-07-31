package typings.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VirtualServerStatus extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "VirtualServerStatus")
@js.native
object VirtualServerStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VirtualServerStatus & String] = js.native
  
  @js.native
  sealed trait BOOTING_UP
    extends StObject
       with VirtualServerStatus
  /* "booting up" */ val BOOTING_UP: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.BOOTING_UP & String = js.native
  
  @js.native
  sealed trait DEPLOY_RUNNING
    extends StObject
       with VirtualServerStatus
  /* "deploy running" */ val DEPLOY_RUNNING: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.DEPLOY_RUNNING & String = js.native
  
  @js.native
  sealed trait OFFLINE
    extends StObject
       with VirtualServerStatus
  /* "offline" */ val OFFLINE: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.OFFLINE & String = js.native
  
  @js.native
  sealed trait ONLINE
    extends StObject
       with VirtualServerStatus
  /* "online" */ val ONLINE: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.ONLINE & String = js.native
  
  @js.native
  sealed trait ONLINE_VIRTUAL
    extends StObject
       with VirtualServerStatus
  /* "online virtual" */ val ONLINE_VIRTUAL: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.ONLINE_VIRTUAL & String = js.native
  
  @js.native
  sealed trait OTHER_INSTANCE
    extends StObject
       with VirtualServerStatus
  /* "other instance" */ val OTHER_INSTANCE: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.OTHER_INSTANCE & String = js.native
  
  @js.native
  sealed trait SHUTTING_DOWN
    extends StObject
       with VirtualServerStatus
  /* "shutting down" */ val SHUTTING_DOWN: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.SHUTTING_DOWN & String = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with VirtualServerStatus
  /* "unknown" */ val UNKNOWN: typings.ts3NodejsLibrary.enumMod.VirtualServerStatus.UNKNOWN & String = js.native
}
