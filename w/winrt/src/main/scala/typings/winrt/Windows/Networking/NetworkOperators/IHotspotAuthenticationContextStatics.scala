package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHotspotAuthenticationContextStatics extends StObject {
  
  def tryGetAuthenticationContext(evenToken: String): Context
}
object IHotspotAuthenticationContextStatics {
  
  @scala.inline
  def apply(tryGetAuthenticationContext: String => Context): IHotspotAuthenticationContextStatics = {
    val __obj = js.Dynamic.literal(tryGetAuthenticationContext = js.Any.fromFunction1(tryGetAuthenticationContext))
    __obj.asInstanceOf[IHotspotAuthenticationContextStatics]
  }
  
  @scala.inline
  implicit class IHotspotAuthenticationContextStaticsMutableBuilder[Self <: IHotspotAuthenticationContextStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTryGetAuthenticationContext(value: String => Context): Self = StObject.set(x, "tryGetAuthenticationContext", js.Any.fromFunction1(value))
  }
}
