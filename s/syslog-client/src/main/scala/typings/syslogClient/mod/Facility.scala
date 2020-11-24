package typings.syslogClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Facility extends js.Object
@JSImport("syslog-client", "Facility")
@js.native
object Facility extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Facility with Double] = js.native
  
  @js.native
  sealed trait Alert extends Facility
  /* 14 */ @js.native
  object Alert extends TopLevel[Alert with Double]
  
  @js.native
  sealed trait Audit extends Facility
  /* 13 */ @js.native
  object Audit extends TopLevel[Audit with Double]
  
  @js.native
  sealed trait Kernel extends Facility
  /* 0 */ @js.native
  object Kernel extends TopLevel[Kernel with Double]
  
  @js.native
  sealed trait Local0 extends Facility
  /* 16 */ @js.native
  object Local0 extends TopLevel[Local0 with Double]
  
  @js.native
  sealed trait Local1 extends Facility
  /* 17 */ @js.native
  object Local1 extends TopLevel[Local1 with Double]
  
  @js.native
  sealed trait Local2 extends Facility
  /* 18 */ @js.native
  object Local2 extends TopLevel[Local2 with Double]
  
  @js.native
  sealed trait Local3 extends Facility
  /* 19 */ @js.native
  object Local3 extends TopLevel[Local3 with Double]
  
  @js.native
  sealed trait Local4 extends Facility
  /* 20 */ @js.native
  object Local4 extends TopLevel[Local4 with Double]
  
  @js.native
  sealed trait Local5 extends Facility
  /* 21 */ @js.native
  object Local5 extends TopLevel[Local5 with Double]
  
  @js.native
  sealed trait Local6 extends Facility
  /* 22 */ @js.native
  object Local6 extends TopLevel[Local6 with Double]
  
  @js.native
  sealed trait Local7 extends Facility
  /* 23 */ @js.native
  object Local7 extends TopLevel[Local7 with Double]
  
  @js.native
  sealed trait System extends Facility
  /* 3 */ @js.native
  object System extends TopLevel[System with Double]
  
  @js.native
  sealed trait User extends Facility
  /* 1 */ @js.native
  object User extends TopLevel[User with Double]
}
