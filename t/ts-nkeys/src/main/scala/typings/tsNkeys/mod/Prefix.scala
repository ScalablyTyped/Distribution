package typings.tsNkeys.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Prefix extends js.Object
@JSImport("ts-nkeys", "Prefix")
@js.native
object Prefix extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Prefix with Double] = js.native
  
  @js.native
  sealed trait Account extends Prefix
  /* 0 */ @js.native
  object Account extends TopLevel[Account with Double]
  
  @js.native
  sealed trait Cluster extends Prefix
  /* 16 */ @js.native
  object Cluster extends TopLevel[Cluster with Double]
  
  @js.native
  sealed trait Operator extends Prefix
  /* 112 */ @js.native
  object Operator extends TopLevel[Operator with Double]
  
  @js.native
  sealed trait Private extends Prefix
  /* 120 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Seed extends Prefix
  /* 144 */ @js.native
  object Seed extends TopLevel[Seed with Double]
  
  @js.native
  sealed trait Server extends Prefix
  /* 104 */ @js.native
  object Server extends TopLevel[Server with Double]
  
  @js.native
  sealed trait User extends Prefix
  /* 160 */ @js.native
  object User extends TopLevel[User with Double]
}
