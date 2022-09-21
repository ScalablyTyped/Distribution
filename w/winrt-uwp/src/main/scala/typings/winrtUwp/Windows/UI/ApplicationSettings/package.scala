package typings.winrtUwp.Windows.UI.ApplicationSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Represents the method that's invoked by the account settings pane when the user deletes a credential. */
type CredentialCommandCredentialDeletedHandler = js.Function1[/* command */ CredentialCommand, Unit]

/** Represents the method that's invoked when the user selects an account and a specific action in the account settings pane. */
type WebAccountCommandInvokedHandler = js.Function2[/* command */ WebAccountCommand, /* args */ WebAccountInvokedArgs, Unit]

/** Represents the method that's invoked when the user selects an account and a specific action in the account settings pane. */
type WebAccountProviderCommandInvokedHandler = js.Function1[/* command */ WebAccountProviderCommand, Unit]
