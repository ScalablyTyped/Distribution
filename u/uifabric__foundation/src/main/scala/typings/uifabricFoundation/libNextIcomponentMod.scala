package typings.uifabricFoundation

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.Required
import typings.std.ReturnType
import typings.uifabricFoundation.libIcomponentMod.IFactoryOptions
import typings.uifabricFoundation.libIcomponentMod.IStateComponentType
import typings.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject
import typings.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject
import typings.uifabricFoundation.libIslotsMod.ISlotDefinition
import typings.uifabricFoundation.libIslotsMod.ISlots
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricMergeStyles.libIstylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNextIcomponentMod {
  
  /* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/next/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics>> */
  trait IComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] extends StObject {
    
    var displayName: String
    
    var factoryOptions: IFactoryOptions[TComponentProps]
    
    var fields: js.Array[String]
    
    var slots: ISlotComponent[TComponentProps, TComponentSlots]
    
    var state: IStateComponentType[TComponentProps, TViewProps]
    
    var statics: TStatics
    
    var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]
    
    var tokens: ITokenFunctionOrObject[TViewProps, TTokens]
    
    var view: IViewComponent[TViewProps, TComponentSlots]
  }
  object IComponent {
    
    inline def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](
      displayName: String,
      factoryOptions: IFactoryOptions[TComponentProps],
      fields: js.Array[String],
      slots: ISlotComponent[TComponentProps, TComponentSlots],
      state: TComponentProps => TViewProps,
      statics: TStatics,
      styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
      tokens: ITokenFunctionOrObject[TViewProps, TTokens],
      view: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[FunctionComponent[js.Object]]
    ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], state = js.Any.fromFunction1(state), statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], view = js.Any.fromFunction2(view))
      __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IComponent[?, ?, ?, ?, ?, ?], TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] (val x: Self & (IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = StObject.set(x, "factoryOptions", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setSlots(value: ISlotComponent[TComponentProps, TComponentSlots]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsFunction1(value: TComponentProps => ISlotDefinition[Required[TComponentSlots]]): Self = StObject.set(x, "slots", js.Any.fromFunction1(value))
      
      inline def setState(value: TComponentProps => TViewProps): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      inline def setStatics(value: TStatics): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      inline def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setView(
        value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[FunctionComponent[js.Object]]
      ): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
    }
  }
  
  trait IComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
    extends StObject
       with typings.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
    
    /**
      * Slot definition object defining the slot component for each slot.
      */
    var slots: js.UndefOr[ISlotComponent[TComponentProps, TComponentSlots]] = js.undefined
    
    /**
      * Stateless pure function that receives props to render the output of the component.
      */
    var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.undefined
  }
  object IComponentOptions {
    
    inline def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IComponentOptions[?, ?, ?, ?, ?, ?], TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] (val x: Self & (IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
      
      inline def setSlots(value: ISlotComponent[TComponentProps, TComponentSlots]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsFunction1(value: TComponentProps => ISlotDefinition[Required[TComponentSlots]]): Self = StObject.set(x, "slots", js.Any.fromFunction1(value))
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setView(
        value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[FunctionComponent[js.Object]]
      ): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type IPartialSlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[TComponentSlots] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[TComponentSlots]])
  
  trait IRecompositionComponentOptions[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics]
    extends StObject
       with typings.uifabricFoundation.libIcomponentMod.IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] {
    
    /**
      * Slot definition object defining the slot component for each slot.
      */
    var slots: js.UndefOr[IPartialSlotComponent[TComponentProps, TComponentSlots]] = js.undefined
    
    /**
      * Stateless pure function that receives props to render the output of the component.
      */
    var view: js.UndefOr[IViewComponent[TViewProps, TComponentSlots]] = js.undefined
  }
  object IRecompositionComponentOptions {
    
    inline def apply[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics](): IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRecompositionComponentOptions[?, ?, ?, ?, ?, ?], TComponentProps /* <: ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TComponentSlots, TStatics] (val x: Self & (IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics])) extends AnyVal {
      
      inline def setSlots(value: IPartialSlotComponent[TComponentProps, TComponentSlots]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsFunction1(value: TComponentProps => ISlotDefinition[TComponentSlots]): Self = StObject.set(x, "slots", js.Any.fromFunction1(value))
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setView(
        value: (/* props */ PropsWithChildren[TViewProps], /* slots */ ISlots[Required[TComponentSlots]]) => ReturnType[FunctionComponent[js.Object]]
      ): Self = StObject.set(x, "view", js.Any.fromFunction2(value))
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  type ISlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[Required[TComponentSlots]] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[Required[TComponentSlots]]])
  
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ PropsWithChildren[TViewProps], 
    /* slots */ ISlots[Required[TComponentSlots]], 
    ReturnType[FunctionComponent[js.Object]]
  ]
}
