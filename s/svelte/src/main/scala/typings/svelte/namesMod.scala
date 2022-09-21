package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namesMod {
  
  @JSImport("svelte/types/shared/utils/names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isHtml(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_html")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSvg(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_svg")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVoid(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_void")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
