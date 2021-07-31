package typings.tedious.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ISOLATION_LEVEL extends StObject
@JSImport("tedious", "ISOLATION_LEVEL")
@js.native
object ISOLATION_LEVEL extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ISOLATION_LEVEL & Double] = js.native
  
  @js.native
  sealed trait NO_CHANGE
    extends StObject
       with ISOLATION_LEVEL
  /* 0x00 */ val NO_CHANGE: typings.tedious.mod.ISOLATION_LEVEL.NO_CHANGE & Double = js.native
  
  @js.native
  sealed trait READ_COMMITTED
    extends StObject
       with ISOLATION_LEVEL
  /* 0x02 */ val READ_COMMITTED: typings.tedious.mod.ISOLATION_LEVEL.READ_COMMITTED & Double = js.native
  
  @js.native
  sealed trait READ_UNCOMMITTED
    extends StObject
       with ISOLATION_LEVEL
  /* 0x01 */ val READ_UNCOMMITTED: typings.tedious.mod.ISOLATION_LEVEL.READ_UNCOMMITTED & Double = js.native
  
  @js.native
  sealed trait REPEATABLE_READ
    extends StObject
       with ISOLATION_LEVEL
  /* 0x03 */ val REPEATABLE_READ: typings.tedious.mod.ISOLATION_LEVEL.REPEATABLE_READ & Double = js.native
  
  @js.native
  sealed trait SERIALIZABLE
    extends StObject
       with ISOLATION_LEVEL
  /* 0x04 */ val SERIALIZABLE: typings.tedious.mod.ISOLATION_LEVEL.SERIALIZABLE & Double = js.native
  
  @js.native
  sealed trait SNAPSHOT
    extends StObject
       with ISOLATION_LEVEL
  /* 0x05 */ val SNAPSHOT: typings.tedious.mod.ISOLATION_LEVEL.SNAPSHOT & Double = js.native
}
