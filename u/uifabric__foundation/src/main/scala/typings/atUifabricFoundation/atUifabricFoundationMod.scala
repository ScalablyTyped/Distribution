package typings.atUifabricFoundation

import typings.atUifabricFoundation.libHooksControlledMod.IControlledStateOptions
import typings.atUifabricFoundation.libIComponentMod.IComponentOptions
import typings.atUifabricFoundation.libIComponentMod.IFactoryOptions
import typings.atUifabricFoundation.libIComponentMod.IViewComponent
import typings.atUifabricFoundation.libISlotsMod.ISlot
import typings.atUifabricFoundation.libISlotsMod.ISlotDefinition
import typings.atUifabricFoundation.libISlotsMod.ISlotFactory
import typings.atUifabricFoundation.libISlotsMod.ISlots
import typings.atUifabricFoundation.libISlotsMod.ISlottableProps
import typings.atUifabricFoundation.libISlotsMod.ValidProps
import typings.atUifabricFoundation.libISlotsMod.ValidShorthand
import typings.atUifabricFoundation.libThemeProviderMod.IThemeProviderProps
import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.atUifabricUtilities.libStyledMod.ICustomizableProps
import typings.atUifabricUtilities.libStyledMod.IPropsWithStyles
import typings.react.reactMod.Attributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Dispatch
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SetStateAction
import typings.react.reactMod.StatelessComponent
import typings.std.Partial
import typings.std.Required
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation", JSImport.Namespace)
@js.native
object atUifabricFoundationMod extends js.Object {
  val ThemeProvider: FunctionComponent[IThemeProviderProps] = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] with TStatics = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def getControlledDerivedProps[TProps, TProp /* <: String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): StatelessComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): StatelessComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): StatelessComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): StatelessComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): StatelessComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): StatelessComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): StatelessComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): StatelessComponent[TComponentProps] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def useControlledState[TProps, TProp /* <: String */, TDefaultProp /* <: String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: ImportType.apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def withSlots[P](`type`: String): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P]): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
}

