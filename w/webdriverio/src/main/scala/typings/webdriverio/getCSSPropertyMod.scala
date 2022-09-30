package typings.webdriverio

import typings.webdriverio.typesMod.ParsedCSSValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCSSPropertyMod {
  
  @JSImport("webdriverio/build/commands/element/getCSSProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cssProperty: String): js.Promise[ParsedCSSValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssProperty.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedCSSValue]]
}
