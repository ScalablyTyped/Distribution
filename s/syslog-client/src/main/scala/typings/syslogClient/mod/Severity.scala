package typings.syslogClient.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Severity with Double] = js.native
  /* 1 */ @js.native
  object Alert extends TopLevel[Alert with Double]
  
  /* 2 */ @js.native
  object Critical extends TopLevel[Critical with Double]
  
  /* 7 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  /* 0 */ @js.native
  object Emergency extends TopLevel[Emergency with Double]
  
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 6 */ @js.native
  object Informational extends TopLevel[Informational with Double]
  
  /* 5 */ @js.native
  object Notice extends TopLevel[Notice with Double]
  
  /* 4 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

