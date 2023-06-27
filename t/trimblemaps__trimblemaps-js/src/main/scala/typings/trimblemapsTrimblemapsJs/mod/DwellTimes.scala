package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.anon.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DwellTimes {
  
  @JSImport("@trimblemaps/trimblemaps-js", "DwellTimes")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobalDwellTimes(options: Token): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalDwellTimes")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
