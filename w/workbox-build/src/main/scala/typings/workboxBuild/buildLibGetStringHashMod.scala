package typings.workboxBuild

import typings.node.cryptoMod.BinaryLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLibGetStringHashMod {
  
  @JSImport("workbox-build/build/lib/get-string-hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStringHash(input: BinaryLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringHash")(input.asInstanceOf[js.Any]).asInstanceOf[String]
}
