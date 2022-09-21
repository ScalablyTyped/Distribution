package typings.typeformEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileMod {
  
  @JSImport("@typeform/embed/types/utils/mobile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBigScreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigScreen")().asInstanceOf[Boolean]
  
  inline def isFullscreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullscreen")().asInstanceOf[Boolean]
  
  inline def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]
}
