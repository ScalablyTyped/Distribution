package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ISOLATION_LEVEL extends js.Object

@JSImport("tedious", "ISOLATION_LEVEL")
@js.native
object ISOLATION_LEVEL extends js.Object {
  @js.native
  sealed trait NO_CHANGE
    extends tediousLib.tediousMod.ISOLATION_LEVEL
  
  @js.native
  sealed trait READ_COMMITTED
    extends tediousLib.tediousMod.ISOLATION_LEVEL
  
  @js.native
  sealed trait READ_UNCOMMITTED
    extends tediousLib.tediousMod.ISOLATION_LEVEL
  
  @js.native
  sealed trait REPEATABLE_READ
    extends tediousLib.tediousMod.ISOLATION_LEVEL
  
  @js.native
  sealed trait SERIALIZABLE
    extends tediousLib.tediousMod.ISOLATION_LEVEL
  
  @js.native
  sealed trait SNAPSHOT
    extends tediousLib.tediousMod.ISOLATION_LEVEL
  
  /* 0x00 */ val NO_CHANGE: NO_CHANGE with scala.Double = js.native
  /* 0x02 */ val READ_COMMITTED: READ_COMMITTED with scala.Double = js.native
  /* 0x01 */ val READ_UNCOMMITTED: READ_UNCOMMITTED with scala.Double = js.native
  /* 0x03 */ val REPEATABLE_READ: REPEATABLE_READ with scala.Double = js.native
  /* 0x04 */ val SERIALIZABLE: SERIALIZABLE with scala.Double = js.native
  /* 0x05 */ val SNAPSHOT: SNAPSHOT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tediousLib.tediousMod.ISOLATION_LEVEL with scala.Double] = js.native
}

