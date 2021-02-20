package typings.uifabricFoundation

import org.scalablytyped.runtime.TopLevel
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.ReturnType
import typings.uifabricFoundation.anon.Slots
import typings.uifabricFoundation.libIcomponentMod.IComponentStyles
import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIslotsMod {
  
  type ExtractProps[TUnion] = js.Any
  
  type ExtractShorthand[TUnion] = String | Double | Boolean
  
  @js.native
  trait IDefaultSlotProps[TSlots] extends StObject {
    
    var _defaultStyles: IComponentStyles[TSlots] = js.native
  }
  object IDefaultSlotProps {
    
    @scala.inline
    def apply[TSlots](_defaultStyles: IComponentStyles[TSlots]): IDefaultSlotProps[TSlots] = {
      val __obj = js.Dynamic.literal(_defaultStyles = _defaultStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDefaultSlotProps[TSlots]]
    }
    
    @scala.inline
    implicit class IDefaultSlotPropsMutableBuilder[Self <: IDefaultSlotProps[_], TSlots] (val x: Self with IDefaultSlotProps[TSlots]) extends AnyVal {
      
      @scala.inline
      def set_defaultStyles(value: IComponentStyles[TSlots]): Self = StObject.set(x, "_defaultStyles", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IProcessedSlotProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
  }
  object IProcessedSlotProps {
    
    @scala.inline
    def apply(): IProcessedSlotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProcessedSlotProps]
    }
    
    @scala.inline
    implicit class IProcessedSlotPropsMutableBuilder[Self <: IProcessedSlotProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait ISlot[TProps] extends StObject {
    
    def apply(): ReturnType[FunctionComponent[js.Object]] = js.native
    def apply(componentProps: PropsWithChildren[TProps]): ReturnType[FunctionComponent[js.Object]] = js.native
    
    var isSlot: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends StObject {
    
    var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.native
  }
  object ISlotCreator {
    
    @scala.inline
    def apply[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](): ISlotCreator[TProps, TShorthandProp] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
    }
    
    @scala.inline
    implicit class ISlotCreatorMutableBuilder[Self <: ISlotCreator[_, _], TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] (val x: Self with (ISlotCreator[TProps, TShorthandProp])) extends AnyVal {
      
      @scala.inline
      def setCreate(
        value: (/* componentProps */ TProps with IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle, /* theme */ js.UndefOr[ITheme]) => ReturnType[FunctionComponent[TProps]]
      ): Self = StObject.set(x, "create", js.Any.fromFunction5(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    }
  }
  
  type ISlotDefinition[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: react.react.ElementType<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typings.uifabricFoundation.uifabricFoundationStrings.ISlotDefinition with TopLevel[TSlots]
  
  type ISlotFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = js.Function5[
    /* componentProps */ TProps with IProcessedSlotProps, 
    /* userProps */ ISlotProp[TProps, TShorthandProp], 
    /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], 
    /* defaultStyles */ IStyle, 
    /* theme */ js.UndefOr[ITheme], 
    ReturnType[FunctionComponent[TProps]]
  ]
  
  @js.native
  trait ISlotOptions[TProps] extends StObject {
    
    var component: js.UndefOr[ElementType[TProps]] = js.native
    
    var render: js.UndefOr[ISlotRender[TProps]] = js.native
  }
  object ISlotOptions {
    
    @scala.inline
    def apply[TProps](): ISlotOptions[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlotOptions[TProps]]
    }
    
    @scala.inline
    implicit class ISlotOptionsMutableBuilder[Self <: ISlotOptions[_], TProps] (val x: Self with ISlotOptions[TProps]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ElementType[TProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ComponentType[TProps]) => ReturnType[FunctionComponent[TProps]]
      ): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  type ISlotProp[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = TShorthandProp | TProps
  
  type ISlotRender[TProps] = js.Function2[
    /* props */ PropsWithChildren[TProps], 
    /* defaultComponent */ ComponentType[TProps], 
    ReturnType[FunctionComponent[TProps]]
  ]
  
  type ISlots[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ slot in keyof TSlots ]: @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlot<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    */ typings.uifabricFoundation.uifabricFoundationStrings.ISlots with TopLevel[TSlots]
  
  type ISlottableComponentType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ComponentType[TProps] with (ISlotCreator[TProps, TShorthandProp])
  
  type ISlottableProps[TSlots] = TSlots with Slots[TSlots]
  
  type ISlottableReactType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ElementType[TProps] with (ISlotCreator[TProps, TShorthandProp])
  
  type ValidProps = js.Object
  
  type ValidShorthand = String | Double | Boolean
}
