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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIcomponentMod {
  
  /* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TStatics>> & {  view :@uifabric/foundation.@uifabric/foundation/lib/IComponent.IViewComponent<TViewProps>} */
  trait IComponent[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends StObject {
    
    var displayName: String
    
    var factoryOptions: IFactoryOptions[TComponentProps]
    
    var fields: js.Array[String]
    
    var state: IStateComponentType[TComponentProps, TViewProps]
    
    var statics: TStatics
    
    var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]
    
    var tokens: ITokenFunctionOrObject[TViewProps, TTokens]
    
    /**
      * Component that generates view output.
      */
    var view: IViewComponent[TViewProps]
  }
  object IComponent {
    
    inline def apply[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](
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
    
    extension [Self <: IComponent[?, ?, ?, ?, ?], TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](x: Self & (IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics])) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = StObject.set(x, "factoryOptions", value.asInstanceOf[js.Any])
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setState(value: TComponentProps => TViewProps): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      inline def setStatics(value: TStatics): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      inline def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setView(value: /* props */ PropsWithChildren[TViewProps] => ReturnType[FunctionComponent[js.Object]]): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
    }
  }
  
  trait IComponentOptions[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends StObject {
    
    /**
      * Display name to identify component in React hierarchy. This parameter is required for targeted component styling
      * via theming.
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Default prop for which to map primitive values.
      */
    var factoryOptions: js.UndefOr[IFactoryOptions[TComponentProps]] = js.undefined
    
    /**
      * List of fields which can be customized.
      */
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional state component that processes TComponentProps into TViewProps.
      */
    var state: js.UndefOr[IStateComponentType[TComponentProps, TViewProps]] = js.undefined
    
    /**
      * Optional static object to assign to constructed component.
      */
    var statics: js.UndefOr[TStatics] = js.undefined
    
    /**
      * Styles prop to pass into component.
      */
    var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.undefined
    
    /**
      * Tokens prop to pass into component.
      */
    var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.undefined
  }
  object IComponentOptions {
    
    inline def apply[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](): IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
    }
    
    extension [Self <: IComponentOptions[?, ?, ?, ?, ?], TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](x: Self & (IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics])) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setFactoryOptions(value: IFactoryOptions[TComponentProps]): Self = StObject.set(x, "factoryOptions", value.asInstanceOf[js.Any])
      
      inline def setFactoryOptionsUndefined: Self = StObject.set(x, "factoryOptions", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setState(value: TComponentProps => TViewProps): Self = StObject.set(x, "state", js.Any.fromFunction1(value))
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStatics(value: TStatics): Self = StObject.set(x, "statics", value.asInstanceOf[js.Any])
      
      inline def setStaticsUndefined: Self = StObject.set(x, "statics", js.undefined)
      
      inline def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type IComponentStyles[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typings.uifabricFoundation.uifabricFoundationStrings.IComponentStyles & TopLevel[js.Any]
  
  /* Inlined @uifabric/foundation.@uifabric/foundation/lib/IComponent.IStyleableComponentProps<TViewProps, TTokens, TStyleSet> & std.Required<std.Pick<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IStyleableComponentProps<TViewProps, TTokens, TStyleSet>, 'theme'>> */
  trait ICustomizationProps[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.undefined
    
    var theme: js.UndefOr[ITheme] & ITheme
    
    var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.undefined
  }
  object ICustomizationProps {
    
    inline def apply[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](theme: js.UndefOr[ITheme] & ITheme): ICustomizationProps[TViewProps, TTokens, TStyleSet] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomizationProps[TViewProps, TTokens, TStyleSet]]
    }
    
    extension [Self <: ICustomizationProps[?, ?, ?], TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](x: Self & (ICustomizationProps[TViewProps, TTokens, TStyleSet])) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: js.UndefOr[ITheme] & ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  trait IFactoryOptions[TProps] extends StObject {
    
    /**
      * Default prop for which to map primitive values.
      */
    var defaultProp: js.UndefOr[(/* keyof TProps */ String) | children] = js.undefined
  }
  object IFactoryOptions {
    
    inline def apply[TProps](): IFactoryOptions[TProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFactoryOptions[TProps]]
    }
    
    extension [Self <: IFactoryOptions[?], TProps](x: Self & IFactoryOptions[TProps]) {
      
      inline def setDefaultProp(value: (/* keyof TProps */ String) | children): Self = StObject.set(x, "defaultProp", value.asInstanceOf[js.Any])
      
      inline def setDefaultPropUndefined: Self = StObject.set(x, "defaultProp", js.undefined)
    }
  }
  
  type IPropsWithChildren[TProps] = PropsWithChildren[TProps]
  
  type IStateComponentType[TComponentProps, TViewProps] = js.Function1[/* props */ TComponentProps, TViewProps]
  
  trait IStyleableComponentProps[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.undefined
    
    var theme: js.UndefOr[ITheme] = js.undefined
    
    var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.undefined
  }
  object IStyleableComponentProps {
    
    inline def apply[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](): IStyleableComponentProps[TViewProps, TTokens, TStyleSet] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStyleableComponentProps[TViewProps, TTokens, TStyleSet]]
    }
    
    extension [Self <: IStyleableComponentProps[?, ?, ?], TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](x: Self & (IStyleableComponentProps[TViewProps, TTokens, TStyleSet])) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyles(value: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesFunction3(value: (TViewProps, /* theme */ ITheme, TTokens) => TStyleSet): Self = StObject.set(x, "styles", js.Any.fromFunction3(value))
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTokens(value: ITokenFunctionOrObject[TViewProps, TTokens]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type IStylesFunction[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] = js.Function3[/* props */ TViewProps, /* theme */ ITheme, /* tokens */ TTokens, TStyleSet]
  
  type IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] = (IStylesFunction[TViewProps, TTokens, TStyleSet]) | TStyleSet
  
  type IToken[TViewProps, TTokens] = (ITokenBase[TViewProps, TTokens]) | (ITokenBaseArray[TViewProps, TTokens])
  
  type ITokenBase[TViewProps, TTokens] = js.UndefOr[(ITokenFunctionOrObject[TViewProps, TTokens]) | `false` | Null]
  
  @js.native
  trait ITokenBaseArray[TViewProps, TTokens]
    extends StObject
       with Array[IToken[TViewProps, TTokens]]
  
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
