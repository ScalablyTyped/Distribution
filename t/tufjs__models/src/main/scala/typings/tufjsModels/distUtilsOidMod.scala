package typings.tufjsModels

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsOidMod {
  
  @JSImport("@tufjs/models/dist/utils/oid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeOIDString(oid: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeOIDString")(oid.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
