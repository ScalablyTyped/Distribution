package typings.winrtUwp.Windows.Security.Credentials

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
  
}

