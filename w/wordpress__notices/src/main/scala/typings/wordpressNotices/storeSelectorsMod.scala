package typings.wordpressNotices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeSelectorsMod {
  
  @JSImport("@wordpress/notices/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNotices(): js.Array[Notice] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotices")().asInstanceOf[js.Array[Notice]]
  inline def getNotices(context: String): js.Array[Notice] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNotices")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[Notice]]
}
