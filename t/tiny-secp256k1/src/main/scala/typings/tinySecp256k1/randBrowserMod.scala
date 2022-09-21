package typings.tinySecp256k1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object randBrowserMod {
  
  @JSImport("tiny-secp256k1/lib/rand.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateInt32(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("generateInt32")().asInstanceOf[Double]
}
