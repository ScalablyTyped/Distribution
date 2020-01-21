package typings.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyCredentialCreationOption extends js.Object

/** Represents the options for creating key credentials. */
@JSGlobal("Windows.Security.Credentials.KeyCredentialCreationOption")
@js.native
object KeyCredentialCreationOption extends js.Object {
  /** Fail if a key credential already exists. */
  @js.native
  sealed trait failIfExists extends KeyCredentialCreationOption
  
  /** Replace any existing key credentials. */
  @js.native
  sealed trait replaceExisting extends KeyCredentialCreationOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyCredentialCreationOption with Double] = js.native
  /* 1 */ @js.native
  object failIfExists extends TopLevel[failIfExists with Double]
  
  /* 0 */ @js.native
  object replaceExisting extends TopLevel[replaceExisting with Double]
  
}

