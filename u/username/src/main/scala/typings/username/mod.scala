package typings.username

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("username", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def username(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("username")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def usernameSync(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("usernameSync")().asInstanceOf[js.UndefOr[String]]
}
