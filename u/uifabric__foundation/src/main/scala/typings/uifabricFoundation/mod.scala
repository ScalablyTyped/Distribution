package typings.uifabricFoundation

import typings.react.mod.Attributes
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.Dispatch
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.SetStateAction
import typings.std.Partial
import typings.std.Required
import typings.std.ReturnType
import typings.uifabricFoundation.controlledMod.IControlledStateOptions
import typings.uifabricFoundation.libIcomponentMod.IComponentOptions
import typings.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typings.uifabricFoundation.libIcomponentMod.IViewComponent
import typings.uifabricFoundation.libIslotsMod.ISlot
import typings.uifabricFoundation.libIslotsMod.ISlotDefinition
import typings.uifabricFoundation.libIslotsMod.ISlotFactory
import typings.uifabricFoundation.libIslotsMod.ISlots
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricFoundation.libIslotsMod.ValidProps
import typings.uifabricFoundation.libIslotsMod.ValidShorthand
import typings.uifabricFoundation.themeProviderMod.IThemeProviderProps
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import typings.uifabricUtilities.styledMod.ICustomizableProps
import typings.uifabricUtilities.styledMod.IPropsWithStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/foundation", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ThemeProvider: FunctionComponent[IThemeProviderProps] = js.native
  
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] with TStatics = js.native
  
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = js.native
  
  def getControlledDerivedProps[TProps, TProp /* <: /* keyof TProps */ String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = js.native
  
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = js.native
  
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = js.native
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.UndefOr[scala.Nothing],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: js.UndefOr[scala.Nothing],
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  @JSName("legacyStyled")
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) with RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] with RefAttributes[TRef]] = js.native
  
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = js.native
  
  def withSlots[P](`type`: String, props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: js.UndefOr[scala.Nothing], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: String, props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Attributes with P, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
  def withSlots[P](`type`: ISlot[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = js.native
}
