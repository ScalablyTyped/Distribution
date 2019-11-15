package typings.syslogDashClient.syslogDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Severity extends js.Object

@JSImport("syslog-client", "Severity")
@js.native
object Severity extends js.Object {
  @js.native
  sealed trait Alert extends Severity
  
  @js.native
  sealed trait Critical extends Severity
  
  @js.native
  sealed trait Debug extends Severity
  
  @js.native
  sealed trait Emergency extends Severity
  
  @js.native
  sealed trait Error extends Severity
  
  @js.native
  sealed trait Informational extends Severity
  
  @js.native
  sealed trait Notice extends Severity
  
  @js.native
  sealed trait Warning extends Severity
  
  /* 1 */ val Alert: typings.syslogDashClient.syslogDashClientMod.Severity.Alert with Double = js.native
  /* 2 */ val Critical: typings.syslogDashClient.syslogDashClientMod.Severity.Critical with Double = js.native
  /* 7 */ val Debug: typings.syslogDashClient.syslogDashClientMod.Severity.Debug with Double = js.native
  /* 0 */ val Emergency: typings.syslogDashClient.syslogDashClientMod.Severity.Emergency with Double = js.native
  /* 3 */ val Error: typings.syslogDashClient.syslogDashClientMod.Severity.Error with Double = js.native
  /* 6 */ val Informational: typings.syslogDashClient.syslogDashClientMod.Severity.Informational with Double = js.native
  /* 5 */ val Notice: typings.syslogDashClient.syslogDashClientMod.Severity.Notice with Double = js.native
  /* 4 */ val Warning: typings.syslogDashClient.syslogDashClientMod.Severity.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Severity with Double] = js.native
}

