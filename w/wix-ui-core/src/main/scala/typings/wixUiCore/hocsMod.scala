package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.ShouldLoadAsync
import typings.wixUiCore.withEllipsedTooltipMod.WrapperComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hocsMod {
  
  @JSImport("wix-ui-core/dist/src/hocs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withEllipsedTooltip(): js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltip")().asInstanceOf[js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]]]
  inline def withEllipsedTooltip(hasShowTooltipShouldLoadAsyncTooltipProps: ShouldLoadAsync): js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withEllipsedTooltip")(hasShowTooltipShouldLoadAsyncTooltipProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Comp */ js.Any, FunctionComponent[WrapperComponentProps]]]
  
  inline def withFocusable(Component: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withFocusable")(Component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
