package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the S/MIME type of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageSmimeKind")
@js.native
object EmailMessageSmimeKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind with Double
  ] = js.native
  
  /* 1 */ val clearSigned: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.clearSigned with Double = js.native
  
  /* 3 */ val encrypted: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.encrypted with Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.none with Double = js.native
  
  /* 2 */ val opaqueSigned: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageSmimeKind.opaqueSigned with Double = js.native
}
