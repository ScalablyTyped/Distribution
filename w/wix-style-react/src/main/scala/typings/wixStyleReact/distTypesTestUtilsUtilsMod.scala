package typings.wixStyleReact

import typings.react.mod.FunctionComponent
import typings.std.HTMLElement
import typings.wixStyleReact.wixStyleReactStrings.httpColonSlashSlashlocalhostSlash
import typings.wixUiTestUtils.anon.Instantiable
import typings.wixUiTestUtils.distSrcReactHelpersHelpersMod.ControlledComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/test-utils/utils", "ASSET_PREFIX")
  @js.native
  val ASSET_PREFIX: httpColonSlashSlashlocalhostSlash = js.native
  
  inline def findBaseByExactHook(base: Any, hook: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBaseByExactHook")(base.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def findBaseByHook(base: Any, hook: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findBaseByHook")(base.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def findByHook(element: Any, hook: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findByHook")(element.asInstanceOf[js.Any], hook.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getFormattedDataHooks(dataHooks: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedDataHooks")(dataHooks.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def isClassExists(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExists")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeControlled[T /* <: ControlledComponentProps */](Component: FunctionComponent[T]): Instantiable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeControlled")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable[T]]
  
  inline def resolveIn(timeout: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveIn")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
