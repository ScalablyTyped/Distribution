package typings.uifabricFoundation

import org.scalablytyped.runtime.TopLevel
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.Array
import typings.std.ReturnType
import typings.uifabricFoundation.uifabricFoundationBooleans.`false`
import typings.uifabricFoundation.uifabricFoundationStrings.children
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIcomponentMod {
  
  /* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TStatics>> & {  view :@uifabric/foundation.@uifabric/foundation/lib/IComponent.IViewComponent<TViewProps>} */
  @js.native
  trait IComponent[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends StObject {
    
    var displayName: String = js.native
    
    var factoryOptions: IFactoryOptions[TComponentProps] = js.native
    
    var fields: js.Array[String] = js.native
    
    var state: IStateComponentType[TComponentProps, TViewProps] = js.native
    
    var statics: TStatics = js.native
    
    var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = js.native
    
    var tokens: ITokenFunctionOrObject[TViewProps, TTokens] = js.native
    
    /**
      * Component that generates view output.
      */
    var view: IViewComponent[TViewProps] = js.native
  }
  object IComponent {
    
    @scala.inline
    def apply[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](
      displayName: String,
      factoryOptions: IFactoryOptions[TComponentProps],
      fields: js.Array[String],
      state: TComponentProps => TViewProps,
      statics: TStatics,
      styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
      tokens: ITokenFunctionOrObject[TViewProps, TTokens],
      view: /* props */ PropsWithChildren[TViewProps] => ReturnType[FunctionComponent[js.Object]]
    ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], state = js.Any.fromFunction1(state), statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], view = js.Any.fromFunction1(view))
      __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
    }
    
    @scala.inline
    implicit class IComponentMutableBuilder[Self <: IComponent[_, _, _, _, _], TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] (val x: Self with (IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics])) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = StObject.set(x, "factoryOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setState(value: TComponentProps => TViewProps): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStatics(value: TStatics): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setView(value: /* props */ PropsWithChildren[TViewProps] => ReturnType[FunctionComponent[js.Object]]): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IComponentOptions[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends StObject {
    
    /**
      * Display name to identify component in React hierarchy. This parameter is required for targeted component styling
      * via theming.
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      * Default prop for which to map primitive values.
      */
    var factoryOptions: js.UndefOr[IFactoryOptions[TComponentProps]] = js.native
    
    /**
      * List of fields which can be customized.
      */
    var fields: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Optional state component that processes TComponentProps into TViewProps.
      */
    var state: js.UndefOr[IStateComponentType[TComponentProps, TViewProps]] = js.native
    
    /**
      * Optional static object to assign to constructed component.
      */
    var statics: js.UndefOr[TStatics] = js.native
    
    /**
      * Styles prop to pass into component.
      */
    var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.native
    
    /**
      * Tokens prop to pass into component.
      */
    var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.native
  }
  object IComponentOptions {
    
    @scala.inline
    def apply[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
    }
    
    @scala.inline
    implicit class IComponentOptionsMutableBuilder[Self <: IComponentOptions[_, _, _, _, _], TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] (val x: Self with (IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics])) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = StObject.set(x, "factoryOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryOptionsUndefined: Self = StObject.set(x, "factoryOptions", js.undefined)
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setState(value: TComponentProps => TViewProps): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStatics(value: TStatics): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type IComponentStyles[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typings.uifabricFoundation.uifabricFoundationStrings.IComponentStyles with TopLevel[js.Any]
  
  /* Inlined @uifabric/foundation.@uifabric/foundation/lib/IComponent.IStyleableComponentProps<TViewProps, TTokens, TStyleSet> & std.Required<std.Pick<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IStyleableComponentProps<TViewProps, TTokens, TStyleSet>, 'theme'>> */
  @js.native
  trait ICustomizationProps[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.native
    
    var theme: js.UndefOr[ITheme] with ITheme = js.native
    
    var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.native
  }
  object ICustomizationProps {
    
    @scala.inline
    def apply[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](theme: js.UndefOr[ITheme] with ITheme): ICustomizationProps[TViewProps, TTokens, TStyleSet] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomizationProps[TViewProps, TTokens, TStyleSet]]
    }
    
    @scala.inline
    implicit class ICustomizationPropsMutableBuilder[Self <: ICustomizationProps[_, _, _], TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] (val x: Self with (ICustomizationProps[TViewProps, TTokens, TStyleSet])) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: js.UndefOr[ITheme] with ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  @js.native
  trait IFactoryOptions[TProps] extends StObject {
    
    /**
      * Default prop for which to map primitive values.
      */
    var defaultProp: js.UndefOr[(/* keyof TProps */ String) | children] = js.native
  }
  object IFactoryOptions {
    
    @scala.inline
    def apply[TProps](): IFactoryOptions[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFactoryOptions[TProps]]
    }
    
    @scala.inline
    implicit class IFactoryOptionsMutableBuilder[Self <: IFactoryOptions[_], TProps] (val x: Self with IFactoryOptions[TProps]) extends AnyVal {
      
      @scala.inline
      def setDefaultProp(value: (/* keyof TProps */ String) | children): Self = StObject.set(x, "defaultProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPropUndefined: Self = StObject.set(x, "defaultProp", js.undefined)
    }
  }
  
  type IPropsWithChildren[TProps] = PropsWithChildren[TProps]
  
  type IStateComponentType[TComponentProps, TViewProps] = js.Function1[/* props */ TComponentProps, TViewProps]
  
  @js.native
  trait IStyleableComponentProps[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.native
    
    var theme: js.UndefOr[ITheme] = js.native
    
    var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.native
  }
  object IStyleableComponentProps {
    
    @scala.inline
    def apply[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](): IStyleableComponentProps[TViewProps, TTokens, TStyleSet] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStyleableComponentProps[TViewProps, TTokens, TStyleSet]]
    }
    
    @scala.inline
    implicit class IStyleableComponentPropsMutableBuilder[Self <: IStyleableComponentProps[_, _, _], TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] (val x: Self with (IStyleableComponentProps[TViewProps, TTokens, TStyleSet])) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type IStylesFunction[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] = js.Function3[/* props */ TViewProps, /* theme */ ITheme, /* tokens */ TTokens, TStyleSet]
  
  type IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] = (IStylesFunction[TViewProps, TTokens, TStyleSet]) | TStyleSet
  
  type IToken[TViewProps, TTokens] = (ITokenBase[TViewProps, TTokens]) | (ITokenBaseArray[TViewProps, TTokens])
  
  type ITokenBase[TViewProps, TTokens] = js.UndefOr[(ITokenFunctionOrObject[TViewProps, TTokens]) | `false` | Null]
  
  @js.native
  trait ITokenBaseArray[TViewProps, TTokens] extends Array[IToken[TViewProps, TTokens]]
  
  @js.native
  trait ITokenFunction[TViewProps, TTokens] extends StObject {
    
    def apply(props: TViewProps, theme: ITheme): IToken[TViewProps, TTokens] = js.native
  }
  
  type ITokenFunctionOrObject[TViewProps, TTokens] = (ITokenFunction[TViewProps, TTokens]) | TTokens
  
  type IViewComponent[TViewProps] = js.Function1[
    /* props */ PropsWithChildren[TViewProps], 
    ReturnType[FunctionComponent[js.Object]]
  ]
}
