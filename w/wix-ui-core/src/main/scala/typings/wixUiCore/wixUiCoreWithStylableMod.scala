package typings.wixUiCore

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.stylableRuntime.typesMod.RuntimeStylesheet
import typings.stylableRuntime.typesMod.StateMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreWithStylableMod {
  
  @JSImport("wix-ui-core/withStylable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withStylable[CoreProps, ExtendedProps](
    Component: ComponentClass[CoreProps, ComponentState],
    stylesheet: RuntimeStylesheet,
    getState: js.Function3[
      /* p */ js.UndefOr[js.Any], 
      /* s */ js.UndefOr[js.Any], 
      /* c */ js.UndefOr[js.Any], 
      StateMap
    ]
  ): ComponentClass[CoreProps & ExtendedProps, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[CoreProps & ExtendedProps, ComponentState]]
  inline def withStylable[CoreProps, ExtendedProps](
    Component: ComponentClass[CoreProps, ComponentState],
    stylesheet: RuntimeStylesheet,
    getState: js.Function3[
      /* p */ js.UndefOr[js.Any], 
      /* s */ js.UndefOr[js.Any], 
      /* c */ js.UndefOr[js.Any], 
      StateMap
    ],
    extendedDefaultProps: js.Object
  ): ComponentClass[CoreProps & ExtendedProps, ComponentState] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any], extendedDefaultProps.asInstanceOf[js.Any])).asInstanceOf[ComponentClass[CoreProps & ExtendedProps, ComponentState]]
  inline def withStylable[CoreProps, ExtendedProps](
    Component: FunctionComponent[CoreProps],
    stylesheet: RuntimeStylesheet,
    getState: js.Function1[/* p */ js.UndefOr[js.Any], StateMap]
  ): FunctionComponent[CoreProps & ExtendedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[CoreProps & ExtendedProps]]
  inline def withStylable[CoreProps, ExtendedProps](
    Component: FunctionComponent[CoreProps],
    stylesheet: RuntimeStylesheet,
    getState: js.Function1[/* p */ js.UndefOr[js.Any], StateMap],
    extendedDefaultProps: js.Object
  ): FunctionComponent[CoreProps & ExtendedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStylable")(Component.asInstanceOf[js.Any], stylesheet.asInstanceOf[js.Any], getState.asInstanceOf[js.Any], extendedDefaultProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[CoreProps & ExtendedProps]]
}
