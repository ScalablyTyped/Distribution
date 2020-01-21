package typings.tedious.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ISOLATION_LEVEL extends js.Object

@JSImport("tedious", "ISOLATION_LEVEL")
@js.native
object ISOLATION_LEVEL extends js.Object {
  @js.native
  sealed trait NO_CHANGE extends ISOLATION_LEVEL
  
  @js.native
  sealed trait READ_COMMITTED extends ISOLATION_LEVEL
  
  @js.native
  sealed trait READ_UNCOMMITTED extends ISOLATION_LEVEL
  
  @js.native
  sealed trait REPEATABLE_READ extends ISOLATION_LEVEL
  
  @js.native
  sealed trait SERIALIZABLE extends ISOLATION_LEVEL
  
  @js.native
  sealed trait SNAPSHOT extends ISOLATION_LEVEL
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ISOLATION_LEVEL with Double] = js.native
  /* 0x00 */ @js.native
  object NO_CHANGE extends TopLevel[NO_CHANGE with Double]
  
  /* 0x02 */ @js.native
  object READ_COMMITTED extends TopLevel[READ_COMMITTED with Double]
  
  /* 0x01 */ @js.native
  object READ_UNCOMMITTED extends TopLevel[READ_UNCOMMITTED with Double]
  
  /* 0x03 */ @js.native
  object REPEATABLE_READ extends TopLevel[REPEATABLE_READ with Double]
  
  /* 0x04 */ @js.native
  object SERIALIZABLE extends TopLevel[SERIALIZABLE with Double]
  
  /* 0x05 */ @js.native
  object SNAPSHOT extends TopLevel[SNAPSHOT with Double]
  
}

