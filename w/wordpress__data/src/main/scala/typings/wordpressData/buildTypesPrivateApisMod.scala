package typings.wordpressData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPrivateApisMod {
  
  @JSImport("@wordpress/data/build-types/private-apis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lock(`object`: Any, privateData: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(`object`.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlock(`object`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(`object`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
