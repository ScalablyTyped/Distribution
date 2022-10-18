package typings.yaml

import typings.yaml.distParseCstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeUtilContainsNewlineMod {
  
  @JSImport("yaml/dist/compose/util-contains-newline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def containsNewline(): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("containsNewline")().asInstanceOf[Boolean | Null]
  inline def containsNewline(key: Token): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("containsNewline")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
}
