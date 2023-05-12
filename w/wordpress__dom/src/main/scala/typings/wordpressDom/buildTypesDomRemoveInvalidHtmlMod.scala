package typings.wordpressDom

import typings.wordpressDom.buildTypesDomCleanNodeListMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomRemoveInvalidHtmlMod {
  
  @JSImport("@wordpress/dom/build-types/dom/remove-invalid-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(HTML: String, schema: Schema, `inline`: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(HTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any])).asInstanceOf[String]
}
