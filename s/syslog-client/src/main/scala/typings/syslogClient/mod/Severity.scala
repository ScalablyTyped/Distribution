package typings.syslogClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Severity extends js.Object
@JSImport("syslog-client", "Severity")
@js.native
object Severity extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Severity with Double] = js.native
  
  @js.native
  sealed trait Alert extends Severity
  /* 1 */ @js.native
  object Alert extends TopLevel[Alert with Double]
  
  @js.native
  sealed trait Critical extends Severity
  /* 2 */ @js.native
  object Critical extends TopLevel[Critical with Double]
  
  @js.native
  sealed trait Debug extends Severity
  /* 7 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  @js.native
  sealed trait Emergency extends Severity
  /* 0 */ @js.native
  object Emergency extends TopLevel[Emergency with Double]
  
  @js.native
  sealed trait Error extends Severity
  /* 3 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait Informational extends Severity
  /* 6 */ @js.native
  object Informational extends TopLevel[Informational with Double]
  
  @js.native
  sealed trait Notice extends Severity
  /* 5 */ @js.native
  object Notice extends TopLevel[Notice with Double]
  
  @js.native
  sealed trait Warning extends Severity
  /* 4 */ @js.native
  object Warning extends TopLevel[Warning with Double]
}
