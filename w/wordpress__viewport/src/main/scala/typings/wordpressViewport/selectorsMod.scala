package typings.wordpressViewport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/viewport/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isViewportMatch(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isViewportMatch")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
