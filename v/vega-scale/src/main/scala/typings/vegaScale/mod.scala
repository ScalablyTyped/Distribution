package typings.vegaScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheme(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def scheme(name: String, scheme: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[Any]
}
