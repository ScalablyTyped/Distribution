package typings.tsDedent

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-dedent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(templ: String, values: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templ.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(templ: TemplateStringsArray, values: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(templ.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def dedent(templ: String, values: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dedent")(templ.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def dedent(templ: TemplateStringsArray, values: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dedent")(templ.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[String]
}
