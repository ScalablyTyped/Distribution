package typings.uifabricFoundation

import typings.fluentuiTheme.libTypesIthemeMod.ITheme
import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.ReturnType
import typings.uifabricFoundation.anon.Slots
import typings.uifabricFoundation.libIcomponentMod.IComponentStyles
import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIslotsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TUnion extends @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotProp<infer TProps, never> ? TProps : never
    }}}
    */
  @js.native
  trait ExtractProps[TUnion] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TUnion extends boolean ? boolean : TUnion extends number ? number : TUnion extends string ? string : never
    }}}
    */
  type ExtractShorthand[TUnion] = Boolean
  
  trait IDefaultSlotProps[TSlots] extends StObject {
    
    var _defaultStyles: IComponentStyles[TSlots]
  }
  object IDefaultSlotProps {
    
    inline def apply[TSlots](_defaultStyles: IComponentStyles[TSlots]): IDefaultSlotProps[TSlots] = {
      val __obj = js.Dynamic.literal(_defaultStyles = _defaultStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDefaultSlotProps[TSlots]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDefaultSlotProps[?], TSlots] (val x: Self & IDefaultSlotProps[TSlots]) extends AnyVal {
      
      inline def set_defaultStyles(value: IComponentStyles[TSlots]): Self = StObject.set(x, "_defaultStyles", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProcessedSlotProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object IProcessedSlotProps {
    
    inline def apply(): IProcessedSlotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProcessedSlotProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IProcessedSlotProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait ISlot[TProps] extends StObject {
    
    def apply(): ReturnType[FunctionComponent[js.Object]] = js.native
    def apply(componentProps: PropsWithChildren[TProps]): ReturnType[FunctionComponent[js.Object]] = js.native
    
    var isSlot: js.UndefOr[Boolean] = js.native
  }
  
  trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends StObject {
    
    var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.undefined
  }
  object ISlotCreator {
    
    inline def apply[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](): ISlotCreator[TProps, TShorthandProp] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISlotCreator[?, ?], TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] (val x: Self & (ISlotCreator[TProps, TShorthandProp])) extends AnyVal {
      
      inline def setCreate(
        value: (/* componentProps */ TProps & IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle, /* theme */ js.UndefOr[ITheme]) => ReturnType[FunctionComponent[TProps]]
      ): Self = StObject.set(x, "create", js.Any.fromFunction5(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ slot in keyof TSlots ]: react.react.ElementType<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    }}}
    */
  @js.native
  trait ISlotDefinition[TSlots] extends StObject
  
  type ISlotFactory[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = js.Function5[
    /* componentProps */ TProps & IProcessedSlotProps, 
    /* userProps */ ISlotProp[TProps, TShorthandProp], 
    /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], 
    /* defaultStyles */ IStyle, 
    /* theme */ js.UndefOr[ITheme], 
    ReturnType[FunctionComponent[TProps]]
  ]
  
  trait ISlotOptions[TProps] extends StObject {
    
    var component: js.UndefOr[ElementType[TProps]] = js.undefined
    
    var render: js.UndefOr[ISlotRender[TProps]] = js.undefined
  }
  object ISlotOptions {
    
    inline def apply[TProps](): ISlotOptions[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlotOptions[TProps]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISlotOptions[?], TProps] (val x: Self & ISlotOptions[TProps]) extends AnyVal {
      
      inline def setComponent(value: ElementType[TProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setRender(
        value: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ComponentType[TProps]) => ReturnType[FunctionComponent[TProps]]
      ): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  type ISlotProp[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = TShorthandProp | TProps
  
  type ISlotRender[TProps] = js.Function2[
    /* props */ PropsWithChildren[TProps], 
    /* defaultComponent */ ComponentType[TProps], 
    ReturnType[FunctionComponent[TProps]]
  ]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ slot in keyof TSlots ]: @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlot<@uifabric/foundation.@uifabric/foundation/lib/ISlots.ExtractProps<TSlots[slot]>>}
    }}}
    */
  @js.native
  trait ISlots[TSlots] extends StObject
  
  type ISlottableComponentType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ComponentType[TProps] & (ISlotCreator[TProps, TShorthandProp])
  
  type ISlottableProps[TSlots] = TSlots & Slots[TSlots]
  
  type ISlottableReactType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] = ElementType[TProps] & (ISlotCreator[TProps, TShorthandProp])
  
  type ValidProps = js.Object
  
  type ValidShorthand = String | Double | Boolean
}
