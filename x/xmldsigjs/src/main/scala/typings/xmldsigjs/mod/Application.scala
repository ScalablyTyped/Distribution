package typings.xmldsigjs.mod

import typings.std.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldsigjs", "Application")
@js.native
class Application ()
  extends typings.xmldsigjs.applicationMod.Application
/* static members */
object Application {
  
  @JSImport("xmldsigjs", "Application.isNodePlugin")
  @js.native
  def isNodePlugin(): Boolean = js.native
  
  /**
    * Sets crypto engine for the current Application
    * @param  {string} name
    * @param  {Crypto} crypto
    * @returns void
    */
  @JSImport("xmldsigjs", "Application.setEngine")
  @js.native
  def setEngine(name: String, crypto: Crypto): Unit = js.native
}
