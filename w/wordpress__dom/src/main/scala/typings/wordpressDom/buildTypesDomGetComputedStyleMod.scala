package typings.wordpressDom

import typings.std.Element
import typings.std.ReturnType
import typings.wordpressDom.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomGetComputedStyleMod {
  
  @JSImport("@wordpress/dom/build-types/dom/get-computed-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
}
