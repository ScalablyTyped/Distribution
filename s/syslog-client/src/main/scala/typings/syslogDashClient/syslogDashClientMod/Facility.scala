package typings.syslogDashClient.syslogDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Facility extends js.Object

@JSImport("syslog-client", "Facility")
@js.native
object Facility extends js.Object {
  @js.native
  sealed trait Alert extends Facility
  
  @js.native
  sealed trait Audit extends Facility
  
  @js.native
  sealed trait Kernel extends Facility
  
  @js.native
  sealed trait Local0 extends Facility
  
  @js.native
  sealed trait Local1 extends Facility
  
  @js.native
  sealed trait Local2 extends Facility
  
  @js.native
  sealed trait Local3 extends Facility
  
  @js.native
  sealed trait Local4 extends Facility
  
  @js.native
  sealed trait Local5 extends Facility
  
  @js.native
  sealed trait Local6 extends Facility
  
  @js.native
  sealed trait Local7 extends Facility
  
  @js.native
  sealed trait System extends Facility
  
  @js.native
  sealed trait User extends Facility
  
  /* 14 */ val Alert: typings.syslogDashClient.syslogDashClientMod.Facility.Alert with Double = js.native
  /* 13 */ val Audit: typings.syslogDashClient.syslogDashClientMod.Facility.Audit with Double = js.native
  /* 0 */ val Kernel: typings.syslogDashClient.syslogDashClientMod.Facility.Kernel with Double = js.native
  /* 16 */ val Local0: typings.syslogDashClient.syslogDashClientMod.Facility.Local0 with Double = js.native
  /* 17 */ val Local1: typings.syslogDashClient.syslogDashClientMod.Facility.Local1 with Double = js.native
  /* 18 */ val Local2: typings.syslogDashClient.syslogDashClientMod.Facility.Local2 with Double = js.native
  /* 19 */ val Local3: typings.syslogDashClient.syslogDashClientMod.Facility.Local3 with Double = js.native
  /* 20 */ val Local4: typings.syslogDashClient.syslogDashClientMod.Facility.Local4 with Double = js.native
  /* 21 */ val Local5: typings.syslogDashClient.syslogDashClientMod.Facility.Local5 with Double = js.native
  /* 22 */ val Local6: typings.syslogDashClient.syslogDashClientMod.Facility.Local6 with Double = js.native
  /* 23 */ val Local7: typings.syslogDashClient.syslogDashClientMod.Facility.Local7 with Double = js.native
  /* 3 */ val System: typings.syslogDashClient.syslogDashClientMod.Facility.System with Double = js.native
  /* 1 */ val User: typings.syslogDashClient.syslogDashClientMod.Facility.User with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Facility with Double] = js.native
}

