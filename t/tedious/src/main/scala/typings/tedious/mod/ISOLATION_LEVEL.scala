package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ISOLATION_LEVEL extends StObject
@JSImport("tedious", "ISOLATION_LEVEL")
@js.native
object ISOLATION_LEVEL extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ISOLATION_LEVEL with Double] = js.native
  
  @js.native
  sealed trait NO_CHANGE extends ISOLATION_LEVEL
  /* 0x00 */ val NO_CHANGE: typings.tedious.mod.ISOLATION_LEVEL.NO_CHANGE with Double = js.native
  
  @js.native
  sealed trait READ_COMMITTED extends ISOLATION_LEVEL
  /* 0x02 */ val READ_COMMITTED: typings.tedious.mod.ISOLATION_LEVEL.READ_COMMITTED with Double = js.native
  
  @js.native
  sealed trait READ_UNCOMMITTED extends ISOLATION_LEVEL
  /* 0x01 */ val READ_UNCOMMITTED: typings.tedious.mod.ISOLATION_LEVEL.READ_UNCOMMITTED with Double = js.native
  
  @js.native
  sealed trait REPEATABLE_READ extends ISOLATION_LEVEL
  /* 0x03 */ val REPEATABLE_READ: typings.tedious.mod.ISOLATION_LEVEL.REPEATABLE_READ with Double = js.native
  
  @js.native
  sealed trait SERIALIZABLE extends ISOLATION_LEVEL
  /* 0x04 */ val SERIALIZABLE: typings.tedious.mod.ISOLATION_LEVEL.SERIALIZABLE with Double = js.native
  
  @js.native
  sealed trait SNAPSHOT extends ISOLATION_LEVEL
  /* 0x05 */ val SNAPSHOT: typings.tedious.mod.ISOLATION_LEVEL.SNAPSHOT with Double = js.native
}
