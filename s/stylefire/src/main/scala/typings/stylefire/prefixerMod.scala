package typings.stylefire

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixerMod {
  
  @JSImport("stylefire/lib/css/prefixer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def default(key: String, asDashCase: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], asDashCase.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
