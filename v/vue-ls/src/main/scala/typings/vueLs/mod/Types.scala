package typings.vueLs.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Types extends js.Object
@JSImport("vue-ls", "Types")
@js.native
object Types extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Types with String] = js.native
  
  @js.native
  sealed trait Local extends Types
  /* "local" */ @js.native
  object Local extends TopLevel[Local with String]
  
  @js.native
  sealed trait Memory extends Types
  /* "memory" */ @js.native
  object Memory extends TopLevel[Memory with String]
  
  @js.native
  sealed trait Session extends Types
  /* "session" */ @js.native
  object Session extends TopLevel[Session with String]
}
