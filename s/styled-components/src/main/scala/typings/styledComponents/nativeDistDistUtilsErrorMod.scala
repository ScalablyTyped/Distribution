package typings.styledComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistUtilsErrorMod {
  
  @JSImport("styled-components/native/dist/dist/utils/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(code: String, interpolations: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(code.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
  inline def default(code: Double, interpolations: Any*): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(code.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Error]
}
