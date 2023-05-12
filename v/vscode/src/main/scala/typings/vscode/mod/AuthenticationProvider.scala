package typings.vscode.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationProvider extends StObject {
  
  /**
  		 * Prompts a user to login.
  		 *
  		 * If login is successful, the onDidChangeSessions event should be fired.
  		 *
  		 * If login fails, a rejected promise should be returned.
  		 *
  		 * If the provider has specified that it does not support multiple accounts,
  		 * then this should never be called if there is already an existing session matching these
  		 * scopes.
  		 * @param scopes A list of scopes, permissions, that the new session should be created with.
  		 * @returns A promise that resolves to an authentication session.
  		 */
  def createSession(scopes: js.Array[String]): Thenable[AuthenticationSession] = js.native
  
  /**
  		 * Get a list of sessions.
  		 * @param scopes An optional list of scopes. If provided, the sessions returned should match
  		 * these permissions, otherwise all sessions should be returned.
  		 * @returns A promise that resolves to an array of authentication sessions.
  		 */
  def getSessions(): Thenable[js.Array[AuthenticationSession]] = js.native
  def getSessions(scopes: js.Array[String]): Thenable[js.Array[AuthenticationSession]] = js.native
  
  /**
  		 * An {@link Event} which fires when the array of sessions has changed, or data
  		 * within a session has changed.
  		 */
  def onDidChangeSessions(listener: js.Function1[/* e */ AuthenticationProviderAuthenticationSessionsChangeEvent, Any]): Disposable = js.native
  def onDidChangeSessions(
    listener: js.Function1[/* e */ AuthenticationProviderAuthenticationSessionsChangeEvent, Any],
    thisArgs: Any
  ): Disposable = js.native
  def onDidChangeSessions(
    listener: js.Function1[/* e */ AuthenticationProviderAuthenticationSessionsChangeEvent, Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  def onDidChangeSessions(
    listener: js.Function1[/* e */ AuthenticationProviderAuthenticationSessionsChangeEvent, Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  
  /**
  		 * Removes the session corresponding to session id.
  		 *
  		 * If the removal is successful, the onDidChangeSessions event should be fired.
  		 *
  		 * If a session cannot be removed, the provider should reject with an error message.
  		 * @param sessionId The id of the session to remove.
  		 */
  def removeSession(sessionId: String): Thenable[Unit] = js.native
}
