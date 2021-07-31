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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/foundation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uifabric/foundation", "ThemeProvider")
  @js.native
  val ThemeProvider: FunctionComponent[IThemeProviderProps] = js.native
  
  @scala.inline
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] & TStatics = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
  @scala.inline
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] & TStatics = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
  
  @scala.inline
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps]): ISlotFactory[TProps, TShorthandProp] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any]).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  @scala.inline
  def createFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](DefaultComponent: ComponentType[TProps], options: IFactoryOptions[TProps]): ISlotFactory[TProps, TShorthandProp] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(DefaultComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISlotFactory[TProps, TShorthandProp]]
  
  @scala.inline
  def getControlledDerivedProps[TProps, TProp /* <: /* keyof TProps */ String */](
    props: TProps,
    propName: TProp,
    derivedValue: /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getControlledDerivedProps")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], derivedValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any]
  
  @scala.inline
  def getSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](userProps: TComponentProps, slots: ISlotDefinition[Required[TComponentSlots]]): ISlots[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlots")(userProps.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[ISlots[Required[TComponentSlots]]]
  
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  @scala.inline
  def legacyStyled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): FunctionComponent[TComponentProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps]]
  
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: Unit,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  @scala.inline
  def legacyStyled_TComponentProps_IntersectionIPropsWithStylesTStylePropsTStyleSetRefAttributesTRefTStylePropsTStyleSet_IStyleSetTStyleSetTRef_ForwardRefExoticComponent[TComponentProps /* <: (IPropsWithStyles[TStyleProps, TStyleSet]) & RefAttributes[TRef] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */, TRef](
    Component: FunctionComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: Unit,
    customizable: ICustomizableProps,
    pure: Boolean
  ): ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("legacyStyled")(Component.asInstanceOf[js.Any], baseStyles.asInstanceOf[js.Any], getProps.asInstanceOf[js.Any], customizable.asInstanceOf[js.Any], pure.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[TComponentProps] & RefAttributes[TRef]]]
  
  @scala.inline
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
  @scala.inline
  def useControlledState[TProps, TProp /* <: /* keyof TProps */ String */, TDefaultProp /* <: /* keyof TProps */ String */](props: TProps, propName: TProp, options: IControlledStateOptions[TProps, TProp, TDefaultProp]): js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControlledState")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
    ], 
    Dispatch[
      SetStateAction[
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[TProp] */ js.Any
      ]
    ]
  ]]
  
  @scala.inline
  def withSlots[P](`type`: String, props: Attributes & P, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: String, props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: String, props: Unit, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: ISlot[P], props: Attributes & P, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: ISlot[P], props: Null, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
  @scala.inline
  def withSlots[P](`type`: ISlot[P], props: Unit, children: ReactNode*): ReturnType[FunctionComponent[P]] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSlots")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FunctionComponent[P]]]
}
