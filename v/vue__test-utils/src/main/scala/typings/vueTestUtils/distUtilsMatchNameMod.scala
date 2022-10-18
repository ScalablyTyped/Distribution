package typings.vueTestUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMatchNameMod {
  
  @JSImport("@vue/test-utils/dist/utils/matchName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matchName(target: String, sourceName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchName")(target.asInstanceOf[js.Any], sourceName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
