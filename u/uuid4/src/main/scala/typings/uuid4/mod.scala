package typings.uuid4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  
  @JSImport("uuid4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def valid(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
