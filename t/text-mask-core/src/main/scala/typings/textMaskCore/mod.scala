package typings.textMaskCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("text-mask-core/dist/textMaskCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conformToMask(a: Any, b: Any, c: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("conformToMask")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createTextMaskInputElement(a: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createTextMaskInputElement")(a.asInstanceOf[js.Any]).asInstanceOf[Any]
}
