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
import typings.styledComponents.styledComponentsStrings.$as
import typings.styledComponents.styledComponentsStrings.as
import typings.styledComponents.styledComponentsStrings.web
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
  
  @js.native
  trait Flattener[Props] extends StObject {
    
    def apply(chunks: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Null, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Unit, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.styledComponents.nativeDistTypesMod.RuleSet[Props]
    - scala.Double
    - java.lang.String
    - js.Array[java.lang.String]
    - typings.styledComponents.nativeDistTypesMod.IStyledComponent[scala.Any, scala.Any, scala.Any]
    - typings.styledComponents.nativeDistTypesMod.Keyframes
  */
  type FlattenerResult[Props] = _FlattenerResult[Props] | js.Array[String] | (IStyledComponent[Any, Any, Any]) | Double | String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.styledComponents.nativeDistTypesMod.StyleFunction[Props]
    - typings.styledComponents.nativeDistTypesMod.StyledObject[Props]
    - typings.std.TemplateStringsArray
    - java.lang.String
    - scala.Double
    - typings.styledComponents.styledComponentsBooleans.`false`
    - scala.Unit
    - scala.Null
    - typings.styledComponents.nativeDistTypesMod.Keyframes
    - typings.styledComponents.nativeDistTypesMod.IStyledComponent[typings.styledComponents.styledComponentsStrings.web, scala.Any, scala.Any]
    - js.Array[scala.Any]
  */
  type Interpolation[Props] = js.UndefOr[
    _Interpolation[Props] | (IStyledComponent[web, Any, Any]) | js.Array[Any] | StyledObject[Props] | TemplateStringsArray | String | Double | Null
  ]
  
  trait Keyframes
    extends StObject
       with _FlattenerResult[Any]
       with _Interpolation[Any] {
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.styledComponents.styledComponentsStrings.a
    - typings.styledComponents.styledComponentsStrings.abbr
    - typings.styledComponents.styledComponentsStrings.address
    - typings.styledComponents.styledComponentsStrings.area
    - typings.styledComponents.styledComponentsStrings.article
    - typings.styledComponents.styledComponentsStrings.aside
    - typings.styledComponents.styledComponentsStrings.audio
    - typings.styledComponents.styledComponentsStrings.b
    - typings.styledComponents.styledComponentsStrings.base
    - typings.styledComponents.styledComponentsStrings.bdi
    - typings.styledComponents.styledComponentsStrings.bdo
    - typings.styledComponents.styledComponentsStrings.big
    - typings.styledComponents.styledComponentsStrings.blockquote
    - typings.styledComponents.styledComponentsStrings.body
    - typings.styledComponents.styledComponentsStrings.br
    - typings.styledComponents.styledComponentsStrings.button
    - typings.styledComponents.styledComponentsStrings.canvas
    - typings.styledComponents.styledComponentsStrings.caption
    - typings.styledComponents.styledComponentsStrings.cite
    - typings.styledComponents.styledComponentsStrings.code
    - typings.styledComponents.styledComponentsStrings.col
    - typings.styledComponents.styledComponentsStrings.colgroup
    - typings.styledComponents.styledComponentsStrings.data
    - typings.styledComponents.styledComponentsStrings.datalist
    - typings.styledComponents.styledComponentsStrings.dd
    - typings.styledComponents.styledComponentsStrings.del
    - typings.styledComponents.styledComponentsStrings.details
    - typings.styledComponents.styledComponentsStrings.dfn
    - typings.styledComponents.styledComponentsStrings.dialog
    - typings.styledComponents.styledComponentsStrings.div
    - typings.styledComponents.styledComponentsStrings.dl
    - typings.styledComponents.styledComponentsStrings.dt
    - typings.styledComponents.styledComponentsStrings.em
    - typings.styledComponents.styledComponentsStrings.embed
    - typings.styledComponents.styledComponentsStrings.fieldset
    - typings.styledComponents.styledComponentsStrings.figcaption
    - typings.styledComponents.styledComponentsStrings.figure
    - typings.styledComponents.styledComponentsStrings.footer
    - typings.styledComponents.styledComponentsStrings.form
    - typings.styledComponents.styledComponentsStrings.h1
    - typings.styledComponents.styledComponentsStrings.h2
    - typings.styledComponents.styledComponentsStrings.h3
    - typings.styledComponents.styledComponentsStrings.h4
    - typings.styledComponents.styledComponentsStrings.h5
    - typings.styledComponents.styledComponentsStrings.h6
    - typings.styledComponents.styledComponentsStrings.head
    - typings.styledComponents.styledComponentsStrings.header
    - typings.styledComponents.styledComponentsStrings.hgroup
    - typings.styledComponents.styledComponentsStrings.hr
    - typings.styledComponents.styledComponentsStrings.html
    - typings.styledComponents.styledComponentsStrings.i
    - typings.styledComponents.styledComponentsStrings.iframe
    - typings.styledComponents.styledComponentsStrings.img
    - typings.styledComponents.styledComponentsStrings.input
    - typings.styledComponents.styledComponentsStrings.ins
    - typings.styledComponents.styledComponentsStrings.kbd
    - typings.styledComponents.styledComponentsStrings.keygen
    - typings.styledComponents.styledComponentsStrings.label
    - typings.styledComponents.styledComponentsStrings.legend
    - typings.styledComponents.styledComponentsStrings.li
    - typings.styledComponents.styledComponentsStrings.link
    - typings.styledComponents.styledComponentsStrings.main
    - typings.styledComponents.styledComponentsStrings.map
    - typings.styledComponents.styledComponentsStrings.mark
    - typings.styledComponents.styledComponentsStrings.menu
    - typings.styledComponents.styledComponentsStrings.menuitem
    - typings.styledComponents.styledComponentsStrings.meta
    - typings.styledComponents.styledComponentsStrings.meter
    - typings.styledComponents.styledComponentsStrings.nav
    - typings.styledComponents.styledComponentsStrings.noindex
    - typings.styledComponents.styledComponentsStrings.noscript
    - typings.styledComponents.styledComponentsStrings.`object`
    - typings.styledComponents.styledComponentsStrings.ol
    - typings.styledComponents.styledComponentsStrings.optgroup
    - typings.styledComponents.styledComponentsStrings.option
    - typings.styledComponents.styledComponentsStrings.output
    - typings.styledComponents.styledComponentsStrings.p
    - typings.styledComponents.styledComponentsStrings.param
    - typings.styledComponents.styledComponentsStrings.picture
    - typings.styledComponents.styledComponentsStrings.pre
    - typings.styledComponents.styledComponentsStrings.progress
    - typings.styledComponents.styledComponentsStrings.q
    - typings.styledComponents.styledComponentsStrings.rp
    - typings.styledComponents.styledComponentsStrings.rt
    - typings.styledComponents.styledComponentsStrings.ruby
    - typings.styledComponents.styledComponentsStrings.s
    - typings.styledComponents.styledComponentsStrings.samp
    - typings.styledComponents.styledComponentsStrings.slot
    - typings.styledComponents.styledComponentsStrings.script
    - typings.styledComponents.styledComponentsStrings.section
    - typings.styledComponents.styledComponentsStrings.select
    - typings.styledComponents.styledComponentsStrings.small
    - typings.styledComponents.styledComponentsStrings.source
    - typings.styledComponents.styledComponentsStrings.span
    - typings.styledComponents.styledComponentsStrings.strong
    - typings.styledComponents.styledComponentsStrings.style
    - typings.styledComponents.styledComponentsStrings.sub
    - typings.styledComponents.styledComponentsStrings.summary
    - typings.styledComponents.styledComponentsStrings.sup
    - typings.styledComponents.styledComponentsStrings.table
    - typings.styledComponents.styledComponentsStrings.template
    - typings.styledComponents.styledComponentsStrings.tbody
    - typings.styledComponents.styledComponentsStrings.td
    - typings.styledComponents.styledComponentsStrings.textarea
    - typings.styledComponents.styledComponentsStrings.tfoot
    - typings.styledComponents.styledComponentsStrings.th
    - typings.styledComponents.styledComponentsStrings.thead
    - typings.styledComponents.styledComponentsStrings.time
    - typings.styledComponents.styledComponentsStrings.title
    - typings.styledComponents.styledComponentsStrings.tr
    - typings.styledComponents.styledComponentsStrings.track
    - typings.styledComponents.styledComponentsStrings.u
    - typings.styledComponents.styledComponentsStrings.ul
    - typings.styledComponents.styledComponentsStrings.`var`
    - typings.styledComponents.styledComponentsStrings.video
    - typings.styledComponents.styledComponentsStrings.wbr
    - typings.styledComponents.styledComponentsStrings.webview
    - typings.styledComponents.styledComponentsStrings.svg
    - typings.styledComponents.styledComponentsStrings.animate
    - typings.styledComponents.styledComponentsStrings.animateMotion
    - typings.styledComponents.styledComponentsStrings.animateTransform
    - typings.styledComponents.styledComponentsStrings.circle
    - typings.styledComponents.styledComponentsStrings.clipPath
    - typings.styledComponents.styledComponentsStrings.defs
    - typings.styledComponents.styledComponentsStrings.desc
    - typings.styledComponents.styledComponentsStrings.ellipse
    - typings.styledComponents.styledComponentsStrings.feBlend
    - typings.styledComponents.styledComponentsStrings.feColorMatrix
    - typings.styledComponents.styledComponentsStrings.feComponentTransfer
    - typings.styledComponents.styledComponentsStrings.feComposite
    - typings.styledComponents.styledComponentsStrings.feConvolveMatrix
    - typings.styledComponents.styledComponentsStrings.feDiffuseLighting
    - typings.styledComponents.styledComponentsStrings.feDisplacementMap
    - typings.styledComponents.styledComponentsStrings.feDistantLight
    - typings.styledComponents.styledComponentsStrings.feDropShadow
    - typings.styledComponents.styledComponentsStrings.feFlood
    - typings.styledComponents.styledComponentsStrings.feFuncA
    - typings.styledComponents.styledComponentsStrings.feFuncB
    - typings.styledComponents.styledComponentsStrings.feFuncG
    - typings.styledComponents.styledComponentsStrings.feFuncR
    - typings.styledComponents.styledComponentsStrings.feGaussianBlur
    - typings.styledComponents.styledComponentsStrings.feImage
    - typings.styledComponents.styledComponentsStrings.feMerge
    - typings.styledComponents.styledComponentsStrings.feMergeNode
    - typings.styledComponents.styledComponentsStrings.feMorphology
    - typings.styledComponents.styledComponentsStrings.feOffset
    - typings.styledComponents.styledComponentsStrings.fePointLight
    - typings.styledComponents.styledComponentsStrings.feSpecularLighting
    - typings.styledComponents.styledComponentsStrings.feSpotLight
    - typings.styledComponents.styledComponentsStrings.feTile
    - typings.styledComponents.styledComponentsStrings.feTurbulence
    - typings.styledComponents.styledComponentsStrings.filter
    - typings.styledComponents.styledComponentsStrings.foreignObject
    - typings.styledComponents.styledComponentsStrings.g
    - typings.styledComponents.styledComponentsStrings.image
    - typings.styledComponents.styledComponentsStrings.line
    - typings.styledComponents.styledComponentsStrings.linearGradient
    - typings.styledComponents.styledComponentsStrings.marker
    - typings.styledComponents.styledComponentsStrings.mask
    - typings.styledComponents.styledComponentsStrings.metadata
    - typings.styledComponents.styledComponentsStrings.mpath
    - typings.styledComponents.styledComponentsStrings.path
    - typings.styledComponents.styledComponentsStrings.pattern
    - typings.styledComponents.styledComponentsStrings.polygon
    - typings.styledComponents.styledComponentsStrings.polyline
    - typings.styledComponents.styledComponentsStrings.radialGradient
    - typings.styledComponents.styledComponentsStrings.rect
    - typings.styledComponents.styledComponentsStrings.stop
    - typings.styledComponents.styledComponentsStrings.switch
    - typings.styledComponents.styledComponentsStrings.symbol
    - typings.styledComponents.styledComponentsStrings.text
    - typings.styledComponents.styledComponentsStrings.textPath
    - typings.styledComponents.styledComponentsStrings.tspan
    - typings.styledComponents.styledComponentsStrings.use
    - typings.styledComponents.styledComponentsStrings.view
    - typings.styledComponents.nativeDistTypesMod.AnyComponent[scala.Any]
  */
  type KnownTarget = _KnownTarget | AnyComponent[Any]
  
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
    (/* keyof ActualComponentProps */ String) | as | $as
  ]) & ActualComponentProps) | ((`176`[ActualComponent, R]) & HTMLAttributes[ActualComponent] & (Omit[
    PropsToBeInjectedIntoActualComponent, 
    (/* keyof ActualComponentProps */ String) | as | $as
  ]) & ActualComponentProps)
  
  @js.native
  trait RuleSet[Props]
    extends StObject
       with Array[Interpolation[Props]]
       with _FlattenerResult[Props]
  
  /* Rewritten from type alias, can be one of: 
    - typings.styledComponents.styledComponentsStrings.web
    - typings.styledComponents.styledComponentsStrings.native
  */
  trait Runtime extends StObject
  object Runtime {
    
    inline def native: typings.styledComponents.styledComponentsStrings.native = "native".asInstanceOf[typings.styledComponents.styledComponentsStrings.native]
    
    inline def web: typings.styledComponents.styledComponentsStrings.web = "web".asInstanceOf[typings.styledComponents.styledComponentsStrings.web]
  }
  
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
  
  @js.native
  trait StyleFunction[Props]
    extends StObject
       with _Interpolation[Props] {
    
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
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    R extends 'web' ? styled-components.styled-components/native/dist/types.WebTarget : styled-components.styled-components/native/dist/types.NativeTarget
    }}}
    */
  @js.native
  trait StyledTarget[R /* <: Runtime */] extends StObject
  
  type Styles[Props] = TemplateStringsArray | StyledObject[Props] | StyleFunction[Props]
  
  type WebTarget = String | KnownTarget
  
  trait _FlattenerResult[Props] extends StObject
  
  trait _Interpolation[Props] extends StObject
  
  trait _KnownTarget extends StObject
}
