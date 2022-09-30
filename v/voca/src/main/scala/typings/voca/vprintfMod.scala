package typings.voca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vprintfMod {
  
  inline def apply(format: String, replacements: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(format.asInstanceOf[js.Any]).`++`(replacements.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def apply(format: Unit, replacements: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(format.asInstanceOf[js.Any]).`++`(replacements.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("voca/vprintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
