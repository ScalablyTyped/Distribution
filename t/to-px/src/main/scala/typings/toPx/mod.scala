package typings.toPx

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(str: String): Double | Null = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def apply(str: String, element: HTMLElement): Double | Null = (^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  @JSImport("to-px", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
