package typings.wrapAnsi

import typings.wrapAnsi.anon.Hard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String, columns: Double): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: String, columns: Double, options: Hard): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], columns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("wrap-ansi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
