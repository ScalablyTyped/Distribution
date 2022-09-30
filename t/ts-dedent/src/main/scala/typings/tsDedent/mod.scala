package typings.tsDedent

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-dedent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(templ: String, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(templ.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def default(templ: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(templ.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def dedent(templ: String, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dedent")(scala.List(templ.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  inline def dedent(templ: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dedent")(scala.List(templ.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
