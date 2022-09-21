package typings.vegaEventSelector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-event-selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseSelector(selectorName: String, source: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelector")(selectorName.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
