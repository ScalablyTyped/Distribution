package typings.tcomb

import typings.tcomb.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromJSONMod {
  
  @JSImport("tcomb/lib/fromJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: Any, `type`: Type[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
}
