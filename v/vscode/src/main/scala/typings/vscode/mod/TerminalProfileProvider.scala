package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalProfileProvider extends StObject {
  
  /**
    * Provide the terminal profile.
    * @param token A cancellation token that indicates the result is no longer needed.
    * @returns The terminal profile.
    */
  def provideTerminalProfile(token: CancellationToken): ProviderResult[TerminalProfile]
}
object TerminalProfileProvider {
  
  inline def apply(provideTerminalProfile: CancellationToken => ProviderResult[TerminalProfile]): TerminalProfileProvider = {
    val __obj = js.Dynamic.literal(provideTerminalProfile = js.Any.fromFunction1(provideTerminalProfile))
    __obj.asInstanceOf[TerminalProfileProvider]
  }
  
  extension [Self <: TerminalProfileProvider](x: Self) {
    
    inline def setProvideTerminalProfile(value: CancellationToken => ProviderResult[TerminalProfile]): Self = StObject.set(x, "provideTerminalProfile", js.Any.fromFunction1(value))
  }
}
