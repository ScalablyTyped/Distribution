package typings.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIcomponentMod {
  type IComponentStyles[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typings.uifabricFoundation.uifabricFoundationStrings.IComponentStyles with org.scalablytyped.runtime.TopLevel[js.Any]
  type IPropsWithChildren[TProps] = typings.react.mod.PropsWithChildren[TProps]
  type IStateComponentType[TComponentProps, TViewProps] = js.Function1[/* props */ TComponentProps, TViewProps]
  type IStylesFunction[TViewProps, TTokens, TStyleSet /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */] = js.Function3[
    /* props */ TViewProps, 
    /* theme */ typings.uifabricStyling.ithemeMod.ITheme, 
    /* tokens */ TTokens, 
    TStyleSet
  ]
  type IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */] = (typings.uifabricFoundation.libIcomponentMod.IStylesFunction[TViewProps, TTokens, TStyleSet]) | TStyleSet
  type IToken[TViewProps, TTokens] = (typings.uifabricFoundation.libIcomponentMod.ITokenBase[TViewProps, TTokens]) | (typings.uifabricFoundation.libIcomponentMod.ITokenBaseArray[TViewProps, TTokens])
  type ITokenBase[TViewProps, TTokens] = js.UndefOr[
    (typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[TViewProps, TTokens]) | typings.uifabricFoundation.uifabricFoundationBooleans.`false` | scala.Null
  ]
  type ITokenFunctionOrObject[TViewProps, TTokens] = (typings.uifabricFoundation.libIcomponentMod.ITokenFunction[TViewProps, TTokens]) | TTokens
  type IViewComponent[TViewProps] = js.Function1[
    /* props */ typings.react.mod.PropsWithChildren[TViewProps], 
    typings.std.ReturnType[typings.react.mod.FunctionComponent[js.Object]]
  ]
}
