package typings.wellKnownSymbols

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("well-known-symbols", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLabel(value: js.Symbol): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLabel")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def isWellKnown(value: js.Symbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWellKnown")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
