package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object download {
  
  @JSImport("ya-disk", "download")
  @js.native
  val ^ : js.Any = js.native
  
  inline def link(token: String, path: String): js.Promise[Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Link]]
}
