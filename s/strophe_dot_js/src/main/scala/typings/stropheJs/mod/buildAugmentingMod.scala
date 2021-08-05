package typings.stropheJs.mod

import typings.stropheJs.mod.Strophe.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildAugmentingMod {
  
  inline def apply(name: String): Builder = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Builder]
  inline def apply(name: String, attrs: js.Any): Builder = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Builder]
  
  @JSImport("$build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
