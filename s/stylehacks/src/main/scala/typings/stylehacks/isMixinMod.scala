package typings.stylehacks

import typings.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMixinMod {
  
  inline def apply(node: Rule_): Boolean = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("stylehacks/types/isMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
