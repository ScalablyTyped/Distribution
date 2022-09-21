package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symMessageParserMod {
  
  @JSImport("symphony-api-client-node/SymMessageParser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCashtags(message: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCashtags")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getHashtags(message: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashtags")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getMentions(message: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMentions")(message.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
