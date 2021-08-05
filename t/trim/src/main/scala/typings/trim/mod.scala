package typings.trim

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): String = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("trim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def left(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def right(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
