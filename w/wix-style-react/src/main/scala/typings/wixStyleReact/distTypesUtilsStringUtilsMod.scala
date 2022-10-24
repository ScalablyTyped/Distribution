package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsStringUtilsMod {
  
  @JSImport("wix-style-react/dist/types/utils/StringUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def includesCaseInsensitive(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includesCaseInsensitive")().asInstanceOf[Boolean]
  inline def includesCaseInsensitive(a: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("includesCaseInsensitive")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def includesCaseInsensitive(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includesCaseInsensitive")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includesCaseInsensitive(a: Unit, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includesCaseInsensitive")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isString(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
