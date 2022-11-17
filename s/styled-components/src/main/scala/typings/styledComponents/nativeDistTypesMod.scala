package typings.styledComponents

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ExoticComponent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.std.Array
import typings.std.Omit
import typings.std.Partial
import typings.std.TemplateStringsArray
import typings.styledComponents.anon.AsAs
import typings.styledComponents.anon.`176`
import typings.styledComponents.nativeDistModelsThemeProviderMod.DefaultTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistTypesMod {
  
  type AnyComponent[P] = ExoticComponentWithDisplayName[P] | ComponentType[P]
  
  type Attrs[Props] = (ExtensibleObject & Props) | (js.Function1[/* props */ ExecutionContext & Props, Partial[Props]])
  
  type BaseExtensibleObject = StringDictionary[Any]
  
  type CSSProp = String | StyledObject[ExecutionContext] | StyleFunction[BaseExtensibleObject]
  
  trait CommonStatics[R /* <: Runtime */, Props] extends StObject {
    
    var attrs: js.Array[Attrs[Props]]
    
    var shouldForwardProp: js.UndefOr[ShouldForwardProp[R]] = js.undefined
    
    var target: StyledTarget[R]
    
    var withComponent: Any
  }
  object CommonStatics {
    
    inline def apply[R /* <: Runtime */, Props](attrs: js.Array[Attrs[Props]], target: StyledTarget[R], withComponent: Any): CommonStatics[R, Props] = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = withComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonStatics[R, Props]]
    }
    
    extension [Self <: CommonStatics[?, ?], R /* <: Runtime */, Props](x: Self & (CommonStatics[R, Props])) {
      
      inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setShouldForwardProp(value: (/* prop */ String, /* elementToBeCreated */ js.UndefOr[StyledTarget[R]]) => Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction2(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
      
      inline def setTarget(value: StyledTarget[R]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWithComponent(value: Any): Self = StObject.set(x, "withComponent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionContext
    extends StObject
       with ExtensibleObject {
    
    @JSName("theme")
    var theme_ExecutionContext: DefaultTheme
  }
  object ExecutionContext {
    
    inline def apply(theme: DefaultTheme): ExecutionContext = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionContext]
    }
    
    extension [Self <: ExecutionContext](x: Self) {
      
      inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExoticComponentWithDisplayName[P]
    extends StObject
       with ExoticComponent[P] {
    
    var defaultProps: js.UndefOr[Partial[P]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  trait ExtensibleObject
    extends StObject
       with BaseExtensibleObject {
    
    @JSName("$as")
    var $as: js.UndefOr[KnownTarget] = js.undefined
    
    @JSName("$forwardedAs")
    var $forwardedAs: js.UndefOr[KnownTarget] = js.undefined
    
    var as: js.UndefOr[KnownTarget] = js.undefined
    
    var forwardedAs: js.UndefOr[KnownTarget] = js.undefined
    
    var theme: js.UndefOr[DefaultTheme] = js.undefined
  }
  object ExtensibleObject {
    
    inline def apply(): ExtensibleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtensibleObject]
    }
    
    extension [Self <: ExtensibleObject](x: Self) {
      
      inline def set$as(value: KnownTarget): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
      
      inline def set$forwardedAs(value: KnownTarget): Self = StObject.set(x, "$forwardedAs", value.asInstanceOf[js.Any])
      
      inline def set$forwardedAsUndefined: Self = StObject.set(x, "$forwardedAs", js.undefined)
      
      inline def setAs(value: KnownTarget): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setForwardedAs(value: KnownTarget): Self = StObject.set(x, "forwardedAs", value.asInstanceOf[js.Any])
      
      inline def setForwardedAsUndefined: Self = StObject.set(x, "forwardedAs", js.undefined)
      
      inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Flattener = (chunks : std.Array<styled-components.styled-components/native/dist/types.Interpolation<Props>>, executionContext : std.Object | null | undefined, styleSheet : std.Object | null | undefined): std.Array<styled-components.styled-components/native/dist/types.Interpolation<Props>>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/types.Flattener
  - styled-components.styled-components/native/dist/types.Interpolation
  */
  @js.native
  trait Flattener[Props] extends StObject {
    
    def apply(chunks: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Null, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Unit, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
  }
  
  type FlattenerResult[Props] = RuleSet[Props] | Double | String | js.Array[String] | (IStyledComponent[Any, Any, Any]) | Keyframes
  
  trait IInlineStyle[Props] extends StObject {
    
    def generateStyleObject(executionContext: js.Object): js.Object
    
    var rules: RuleSet[Props]
  }
  object IInlineStyle {
    
    inline def apply[Props](generateStyleObject: js.Object => js.Object, rules: RuleSet[Props]): IInlineStyle[Props] = {
      val __obj = js.Dynamic.literal(generateStyleObject = js.Any.fromFunction1(generateStyleObject), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInlineStyle[Props]]
    }
    
    extension [Self <: IInlineStyle[?], Props](x: Self & IInlineStyle[Props]) {
      
      inline def setGenerateStyleObject(value: js.Object => js.Object): Self = StObject.set(x, "generateStyleObject", js.Any.fromFunction1(value))
      
      inline def setRules(value: RuleSet[Props]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IInlineStyleConstructor[Props]
    extends StObject
       with Instantiable1[/* rules */ RuleSet[Props], IInlineStyle[Props]]
  
  @js.native
  trait IStyledComponent[R /* <: Runtime */, Target /* <: StyledTarget[R] */, Props /* <: js.Object */]
    extends StObject
       with PolymorphicComponent[R, Target, Props, ExecutionContext]
       with IStyledStatics[R, Props] {
    
    @JSName("defaultProps")
    var defaultProps_IStyledComponent: js.UndefOr[
        Partial[
          ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : {} */ js.Any) & Props
        ]
      ] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type IStyledComponentFactory = (target : Target, options : styled-components.styled-components/native/dist/types.StyledOptions<R, Props>, rules : styled-components.styled-components/native/dist/types.RuleSet<Props>): styled-components.styled-components/native/dist/types.IStyledComponent<R, Target, Props> & Statics
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/types.IStyledComponentFactory
  - styled-components.styled-components/native/dist/types.Interpolation
  - styled-components.styled-components/native/dist/types.RuleSet
  */
  @js.native
  trait IStyledComponentFactory[R /* <: Runtime */, Target /* <: StyledTarget[R] */, Props /* <: js.Object */, Statics] extends StObject {
    
    def apply(target: Target, options: StyledOptions[R, Props], rules: RuleSet[Props]): (IStyledComponent[R, Target, Props]) & Statics = js.native
  }
  
  trait IStyledStatics[R /* <: Runtime */, OuterProps /* <: js.Object */]
    extends StObject
       with CommonStatics[R, OuterProps] {
    
    var componentStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? styled-components.styled-components/native/dist/models/ComponentStyle.default : never */ js.Any
    
    var foldedComponentIds: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.Array<string> : never */ js.Any
    
    var inlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'native' ? std.InstanceType<styled-components.styled-components/native/dist/types.IInlineStyleConstructor<OuterProps>> : never */ js.Any
    
    var styledComponentId: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
    
    var warnTooManyClasses: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.ReturnType<(displayName : string, componentId : string): (className : string): void> : never */ js.Any
      ] = js.undefined
    
    @JSName("withComponent")
    def withComponent_MIStyledStatics[Target /* <: StyledTarget[R] */, Props](tag: Target): IStyledComponent[R, Target, OuterProps & Props]
  }
  object IStyledStatics {
    
    inline def apply[R /* <: Runtime */, OuterProps /* <: js.Object */](
      attrs: js.Array[Attrs[OuterProps]],
      componentStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? styled-components.styled-components/native/dist/models/ComponentStyle.default : never */ js.Any,
      foldedComponentIds: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.Array<string> : never */ js.Any,
      inlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'native' ? std.InstanceType<styled-components.styled-components/native/dist/types.IInlineStyleConstructor<OuterProps>> : never */ js.Any,
      styledComponentId: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any,
      target: StyledTarget[R],
      withComponent: Any => IStyledComponent[R, Any, OuterProps & Any]
    ): IStyledStatics[R, OuterProps] = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], componentStyle = componentStyle.asInstanceOf[js.Any], foldedComponentIds = foldedComponentIds.asInstanceOf[js.Any], inlineStyle = inlineStyle.asInstanceOf[js.Any], styledComponentId = styledComponentId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = js.Any.fromFunction1(withComponent))
      __obj.asInstanceOf[IStyledStatics[R, OuterProps]]
    }
    
    extension [Self <: IStyledStatics[?, ?], R /* <: Runtime */, OuterProps /* <: js.Object */](x: Self & (IStyledStatics[R, OuterProps])) {
      
      inline def setComponentStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? styled-components.styled-components/native/dist/models/ComponentStyle.default : never */ js.Any
      ): Self = StObject.set(x, "componentStyle", value.asInstanceOf[js.Any])
      
      inline def setFoldedComponentIds(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.Array<string> : never */ js.Any
      ): Self = StObject.set(x, "foldedComponentIds", value.asInstanceOf[js.Any])
      
      inline def setInlineStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'native' ? std.InstanceType<styled-components.styled-components/native/dist/types.IInlineStyleConstructor<OuterProps>> : never */ js.Any
      ): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
      
      inline def setStyledComponentId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ): Self = StObject.set(x, "styledComponentId", value.asInstanceOf[js.Any])
      
      inline def setWarnTooManyClasses(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.ReturnType<(displayName : string, componentId : string): (className : string): void> : never */ js.Any
      ): Self = StObject.set(x, "warnTooManyClasses", value.asInstanceOf[js.Any])
      
      inline def setWarnTooManyClassesUndefined: Self = StObject.set(x, "warnTooManyClasses", js.undefined)
      
      inline def setWithComponent(value: Any => IStyledComponent[R, Any, OuterProps & Any]): Self = StObject.set(x, "withComponent", js.Any.fromFunction1(value))
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Interpolation = styled-components.styled-components/native/dist/types.StyleFunction<Props> | styled-components.styled-components/native/dist/types.StyledObject<Props> | std.TemplateStringsArray | string | number | false | undefined | null | styled-components.styled-components/native/dist/types.Keyframes | styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> | std.Array<styled-components.styled-components/native/dist/types.Interpolation<Props>>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/types.Interpolation
  */
  type Interpolation[Props] = js.UndefOr[
    StyleFunction[Props] | StyledObject[Props] | TemplateStringsArray | String | Double | false | Null | Keyframes | (IStyledComponent["web", Any, Any]) | js.Array[Any]
  ]
  
  trait Keyframes extends StObject {
    
    var id: String
    
    var name: String
    
    var rules: String
  }
  object Keyframes {
    
    inline def apply(id: String, name: String, rules: String): Keyframes = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keyframes]
    }
    
    extension [Self <: Keyframes](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  type KnownTarget = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with "a", "abbr", "address" */ Any
  
  type NameGenerator = js.Function1[/* hash */ Double, String]
  
  type NativeTarget = AnyComponent[Any]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as T[K] extends never? never : K ]: T[K]}
    }}}
    */
  @js.native
  trait OmitNever[T] extends StObject
  
  @js.native
  trait PolymorphicComponent[R /* <: Runtime */, FallbackComponent /* <: StyledTarget[R] */, ExpectedProps /* <: js.Object */, PropsToBeInjectedIntoActualComponent /* <: js.Object */]
    extends StObject
       with ForwardRefExoticComponent[ExpectedProps]
  
  type PolymorphicComponentProps[R /* <: Runtime */, ActualComponent /* <: StyledTarget[R] */, PropsToBeInjectedIntoActualComponent /* <: js.Object */, ActualComponentProps] = ((AsAs[ActualComponent, R]) & HTMLAttributes[ActualComponent] & (Omit[
    PropsToBeInjectedIntoActualComponent, 
    (/* keyof ActualComponentProps */ String) | "as" | "$as"
  ]) & ActualComponentProps) | ((`176`[ActualComponent, R]) & HTMLAttributes[ActualComponent] & (Omit[
    PropsToBeInjectedIntoActualComponent, 
    (/* keyof ActualComponentProps */ String) | "as" | "$as"
  ]) & ActualComponentProps)
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RuleSet = std.Array<styled-components.styled-components/native/dist/types.Interpolation<Props>>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/types.FlattenerResult
  - styled-components.styled-components/native/dist/types.Interpolation
  - styled-components.styled-components/native/dist/types.RuleSet
  */
  @js.native
  trait RuleSet[Props]
    extends StObject
       with Array[Interpolation[Props]]
  
  object Runtime {
    
    inline def native: "native" = "native".asInstanceOf["native"]
    
    inline def web: "web" = "web".asInstanceOf["web"]
  }
  type Runtime = "web" | "native"
  
  type ShouldForwardProp[R /* <: Runtime */] = js.Function2[/* prop */ String, /* elementToBeCreated */ js.UndefOr[StyledTarget[R]], Boolean]
  
  @js.native
  trait Stringifier extends StObject {
    
    def apply(css: String): js.Array[String] = js.native
    def apply(css: String, selector: String): js.Array[String] = js.native
    def apply(css: String, selector: String, prefix: String): js.Array[String] = js.native
    def apply(css: String, selector: String, prefix: String, componentId: String): js.Array[String] = js.native
    def apply(css: String, selector: String, prefix: Unit, componentId: String): js.Array[String] = js.native
    def apply(css: String, selector: Unit, prefix: String): js.Array[String] = js.native
    def apply(css: String, selector: Unit, prefix: String, componentId: String): js.Array[String] = js.native
    def apply(css: String, selector: Unit, prefix: Unit, componentId: String): js.Array[String] = js.native
    
    var hash: String = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StyleFunction = (executionContext : styled-components.styled-components/native/dist/types.ExecutionContext & Props): styled-components.styled-components/native/dist/types.Interpolation<Props>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/types.CSSProp
  - styled-components.styled-components/native/dist/types.Flattener
  - styled-components.styled-components/native/dist/types.FlattenerResult
  - styled-components.styled-components/native/dist/types.IStyledComponentFactory
  - styled-components.styled-components/native/dist/types.Interpolation
  - styled-components.styled-components/native/dist/types.RuleSet
  - styled-components.styled-components/native/dist/types.StyleFunction
  - styled-components.styled-components/native/dist/types.StyledObject
  - styled-components.styled-components/native/dist/types.Styles
  */
  @js.native
  trait StyleFunction[Props] extends StObject {
    
    def apply(executionContext: ExecutionContext & Props): Interpolation[Props] = js.native
  }
  
  trait StyleSheet extends StObject {
    
    var create: js.Function
  }
  object StyleSheet {
    
    inline def apply(create: js.Function): StyleSheet = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheet]
    }
    
    extension [Self <: StyleSheet](x: Self) {
      
      inline def setCreate(value: js.Function): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    }
  }
  
  type StyledObject[Props] = StringDictionary[BaseExtensibleObject | String | Double | StyleFunction[Props]]
  
  trait StyledOptions[R /* <: Runtime */, Props] extends StObject {
    
    var attrs: js.UndefOr[js.Array[Attrs[Props]]] = js.undefined
    
    var componentId: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var parentComponentId: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ] = js.undefined
    
    var shouldForwardProp: js.UndefOr[ShouldForwardProp[R]] = js.undefined
  }
  object StyledOptions {
    
    inline def apply[R /* <: Runtime */, Props](): StyledOptions[R, Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledOptions[R, Props]]
    }
    
    extension [Self <: StyledOptions[?, ?], R /* <: Runtime */, Props](x: Self & (StyledOptions[R, Props])) {
      
      inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setComponentId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setParentComponentId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ): Self = StObject.set(x, "parentComponentId", value.asInstanceOf[js.Any])
      
      inline def setParentComponentIdUndefined: Self = StObject.set(x, "parentComponentId", js.undefined)
      
      inline def setShouldForwardProp(value: (/* prop */ String, /* elementToBeCreated */ js.UndefOr[StyledTarget[R]]) => Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction2(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    R extends 'web' ? styled-components.styled-components/native/dist/types.WebTarget : styled-components.styled-components/native/dist/types.NativeTarget
    }}}
    */
  type StyledTarget[R /* <: Runtime */] = WebTarget
  
  type Styles[Props] = TemplateStringsArray | StyledObject[Props] | StyleFunction[Props]
  
  type WebTarget = String | KnownTarget
}
