package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonHocUtilsMod {
  
  @JSImport("wix-style-react/dist/types/common/hocUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDisplayName(Component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(Component.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isStatelessComponent(Component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatelessComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def wrapDisplayName(BaseComponent: Any, hocName: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapDisplayName")(BaseComponent.asInstanceOf[js.Any], hocName.asInstanceOf[js.Any])).asInstanceOf[String]
}
