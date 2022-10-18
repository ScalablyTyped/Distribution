package typings.swr

import typings.swr.distTypesMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsSerializeMod {
  
  @JSImport("swr/dist/utils/serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serialize(key: Key): js.Tuple3[String, js.Array[Any], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, js.Array[Any], String]]
}
