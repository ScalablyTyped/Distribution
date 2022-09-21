package typings.typeformEmbed

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyInitMod {
  
  @JSImport("@typeform/embed/types/utils/lazy-init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lazyInitialize(target: Element, onIntersection: fn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyInitialize")(target.asInstanceOf[js.Any], onIntersection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type fn = js.Function0[Unit]
}
