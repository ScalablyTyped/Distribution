package typings.atUifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIComponentMod {
  import typings.atUifabricFoundation.Anon_Children
  import typings.atUifabricFoundation.atUifabricFoundationNumbers.`false`
  import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
  import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
  import typings.react.reactMod.FunctionComponent
  import typings.std.ReturnType

  type IComponentStyles[TSlots] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typings.atUifabricFoundation.atUifabricFoundationStrings.IComponentStyles with js.Any
  type IPropsWithChildren[TProps] = TProps with Anon_Children
  type IStateComponentType[TComponentProps, TViewProps] = js.Function1[/* props */ TComponentProps, TViewProps]
  type IStylesFunction[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] = js.Function3[/* props */ TViewProps, /* theme */ ITheme, /* tokens */ TTokens, TStyleSet]
  type IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] = (IStylesFunction[TViewProps, TTokens, TStyleSet]) | TStyleSet
  type IToken[TViewProps, TTokens] = (ITokenBase[TViewProps, TTokens]) | (ITokenBaseArray[TViewProps, TTokens])
  type ITokenBase[TViewProps, TTokens] = js.UndefOr[(ITokenFunctionOrObject[TViewProps, TTokens]) | `false` | Null]
  type ITokenFunctionOrObject[TViewProps, TTokens] = (ITokenFunction[TViewProps, TTokens]) | TTokens
  type IViewComponent[TViewProps] = js.Function1[
    /* props */ IPropsWithChildren[TViewProps], 
    ReturnType[FunctionComponent[js.Object]]
  ]
}
