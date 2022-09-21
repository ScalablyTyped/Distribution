package typings.uuidToHex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(uuidString: String): String = ^.asInstanceOf[js.Dynamic].apply(uuidString.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(uuidString: String, addLeadingZero: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(uuidString.asInstanceOf[js.Any], addLeadingZero.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("uuid-to-hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
