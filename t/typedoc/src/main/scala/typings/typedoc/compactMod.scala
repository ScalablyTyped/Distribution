package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compactMod {
  
  @JSImport("typedoc/dist/lib/output/helpers/compact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compact(options: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(options.asInstanceOf[js.Any]).asInstanceOf[String]
}
