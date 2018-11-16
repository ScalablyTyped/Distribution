package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationCacheStatus extends js.Object

@JSGlobal("WebdriverIO.ApplicationCacheStatus")
@js.native
object ApplicationCacheStatus extends js.Object {
  @js.native
  sealed trait CHECKING
    extends webdriverioLib.WebdriverIONs.ApplicationCacheStatus
  
  @js.native
  sealed trait DOWNLOADING
    extends webdriverioLib.WebdriverIONs.ApplicationCacheStatus
  
  @js.native
  sealed trait IDLE
    extends webdriverioLib.WebdriverIONs.ApplicationCacheStatus
  
  @js.native
  sealed trait OBSOLETE
    extends webdriverioLib.WebdriverIONs.ApplicationCacheStatus
  
  @js.native
  sealed trait UNCACHED
    extends webdriverioLib.WebdriverIONs.ApplicationCacheStatus
  
  @js.native
  sealed trait UPDATE_READY
    extends webdriverioLib.WebdriverIONs.ApplicationCacheStatus
  
  /* 2 */ val CHECKING: CHECKING with scala.Double = js.native
  /* 3 */ val DOWNLOADING: DOWNLOADING with scala.Double = js.native
  /* 1 */ val IDLE: IDLE with scala.Double = js.native
  /* 5 */ val OBSOLETE: OBSOLETE with scala.Double = js.native
  /* 0 */ val UNCACHED: UNCACHED with scala.Double = js.native
  /* 4 */ val UPDATE_READY: UPDATE_READY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webdriverioLib.WebdriverIONs.ApplicationCacheStatus with scala.Double] = js.native
}

