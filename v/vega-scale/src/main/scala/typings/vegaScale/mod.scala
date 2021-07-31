package typings.vegaScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def scheme(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def scheme(name: String, scheme: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheme")(name.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
