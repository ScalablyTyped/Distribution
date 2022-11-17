package typings.styledComponents

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.ExoticComponent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.std.Array
import typings.std.InstanceType
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.std.ReturnType
import typings.std.TemplateStringsArray
import typings.styledComponents.anon.As
import typings.styledComponents.anon.`173`
import typings.styledComponents.nativeDistDistModelsComponentStyleMod.default
import typings.styledComponents.nativeDistDistModelsThemeProviderMod.DefaultTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistTypesMod {
  
  type AnyComponent[P] = ExoticComponentWithDisplayName[P] | ComponentType[P]
  
  type Attrs[Props] = (ExtensibleObject & Props) | (js.Function1[/* props */ ExecutionContext & Props, ExecutionContext & Props])
  
  type BaseExtensibleObject = StringDictionary[Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type CSSConstructor = (strings : std.Array<string>, interpolations : ...styled-components.styled-components/native/dist/dist/types.Interpolation<Props>): styled-components.styled-components/native/dist/dist/types.RuleSet<Props>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/dist/types.CSSConstructor
  - styled-components.styled-components/native/dist/dist/types.Flattener
  - styled-components.styled-components/native/dist/dist/types.FlattenerResult
  - styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory
  - styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory
  - styled-components.styled-components/native/dist/dist/types.Interpolation
  - styled-components.styled-components/native/dist/dist/types.RuleSet
  - styled-components.styled-components/native/dist/dist/types.StyleFunction
  - styled-components.styled-components/native/dist/dist/types.StyledObject
  - styled-components.styled-components/native/dist/dist/types.Styles
  */
  @js.native
  trait CSSConstructor[Props] extends StObject {
    
    def apply(strings: js.Array[String], interpolations: Interpolation[Props]*): RuleSet[Props] = js.native
  }
  
  trait CommonStatics[Props] extends StObject {
    
    var attrs: js.Array[Attrs[Props]]
    
    var shouldForwardProp: js.UndefOr[ShouldForwardProp] = js.undefined
    
    var target: StyledTarget
    
    var withComponent: Any
  }
  object CommonStatics {
    
    inline def apply[Props](attrs: js.Array[Attrs[Props]], target: StyledTarget, withComponent: Any): CommonStatics[Props] = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = withComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonStatics[Props]]
    }
    
    extension [Self <: CommonStatics[?], Props](x: Self & CommonStatics[Props]) {
      
      inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setShouldForwardProp(
        value: (/* prop */ String, /* isValidAttr */ js.Function1[/* prop */ String, Boolean], /* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget]) => Boolean
      ): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction3(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
      
      inline def setTarget(value: StyledTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWithComponent(value: Any): Self = StObject.set(x, "withComponent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomComponent[FallbackComponent /* <: StyledTarget */, ExpectedProps, PropsToBeInjectedIntoActualComponent]
    extends StObject
       with ForwardRefExoticComponent[ExpectedProps] {
    
    @JSName("<apply>")
    @scala.annotation.targetName("apply_rp_rp_rp")
    def apply(
      props: CustomComponentProps[
          "rp", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'rp' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'rp'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feComponentTransfer_feComponentTransfer_feComponentTransfer")
    def apply(
      props: CustomComponentProps[
          "feComponentTransfer", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feComponentTransfer' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feComponentTransfer'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_select_select_select")
    def apply(
      props: CustomComponentProps[
          "select", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'select' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'select'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_figure_figure_figure")
    def apply(
      props: CustomComponentProps[
          "figure", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'figure' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'figure'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_sup_sup_sup")
    def apply(
      props: CustomComponentProps[
          "sup", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'sup' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'sup'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_canvas_canvas_canvas")
    def apply(
      props: CustomComponentProps[
          "canvas", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'canvas' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'canvas'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_picture_picture_picture")
    def apply(
      props: CustomComponentProps[
          "picture", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'picture' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'picture'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_base_base_base")
    def apply(
      props: CustomComponentProps[
          "base", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'base' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'base'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_video_video_video")
    def apply(
      props: CustomComponentProps[
          "video", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'video' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'video'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_audio_audio_audio")
    def apply(
      props: CustomComponentProps[
          "audio", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'audio' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'audio'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_h1_h1_h1")
    def apply(
      props: CustomComponentProps[
          "h1", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'h1' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'h1'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_data_data_data")
    def apply(
      props: CustomComponentProps[
          "data", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'data' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'data'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_fePointLight_fePointLight_fePointLight")
    def apply(
      props: CustomComponentProps[
          "fePointLight", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fePointLight' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'fePointLight'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_mask_mask_mask")
    def apply(
      props: CustomComponentProps[
          "mask", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'mask' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'mask'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_textarea_textarea_textarea")
    def apply(
      props: CustomComponentProps[
          "textarea", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'textarea' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'textarea'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feFuncB_feFuncB_feFuncB")
    def apply(
      props: CustomComponentProps[
          "feFuncB", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feFuncB' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feFuncB'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_track_track_track")
    def apply(
      props: CustomComponentProps[
          "track", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'track' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'track'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_article_article_article")
    def apply(
      props: CustomComponentProps[
          "article", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'article' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'article'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_li_li_li")
    def apply(
      props: CustomComponentProps[
          "li", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'li' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'li'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_time_time_time")
    def apply(
      props: CustomComponentProps[
          "time", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'time' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'time'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feImage_feImage_feImage")
    def apply(
      props: CustomComponentProps[
          "feImage", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feImage' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feImage'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_var_var_var")
    def apply(
      props: CustomComponentProps[
          "var", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'var' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'var'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_fieldset_fieldset_fieldset")
    def apply(
      props: CustomComponentProps[
          "fieldset", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'fieldset' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'fieldset'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_aside_aside_aside")
    def apply(
      props: CustomComponentProps[
          "aside", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'aside' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'aside'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_textPath_textPath_textPath")
    def apply(
      props: CustomComponentProps[
          "textPath", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'textPath' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'textPath'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_optgroup_optgroup_optgroup")
    def apply(
      props: CustomComponentProps[
          "optgroup", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'optgroup' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'optgroup'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_area_area_area")
    def apply(
      props: CustomComponentProps[
          "area", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'area' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'area'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_slot_slot_slot")
    def apply(
      props: CustomComponentProps[
          "slot", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'slot' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'slot'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_tspan_tspan_tspan")
    def apply(
      props: CustomComponentProps[
          "tspan", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'tspan' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'tspan'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_code_code_code")
    def apply(
      props: CustomComponentProps[
          "code", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'code' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'code'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_s_s_s")
    def apply(
      props: CustomComponentProps[
          "s", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 's' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'s'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feDisplacementMap_feDisplacementMap_feDisplacementMap")
    def apply(
      props: CustomComponentProps[
          "feDisplacementMap", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feDisplacementMap' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feDisplacementMap'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_title_title_title")
    def apply(
      props: CustomComponentProps[
          "title", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'title' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'title'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_use_use_use")
    def apply(
      props: CustomComponentProps[
          "use", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'use' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'use'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_head_head_head")
    def apply(
      props: CustomComponentProps[
          "head", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'head' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'head'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_g_g_g")
    def apply(
      props: CustomComponentProps[
          "g", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'g' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'g'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_source_source_source")
    def apply(
      props: CustomComponentProps[
          "source", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'source' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'source'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_legend_legend_legend")
    def apply(
      props: CustomComponentProps[
          "legend", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'legend' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'legend'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_image_image_image")
    def apply(
      props: CustomComponentProps[
          "image", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'image' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'image'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_linearGradient_linearGradient_linearGradient")
    def apply(
      props: CustomComponentProps[
          "linearGradient", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'linearGradient' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'linearGradient'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_animate_animate_animate")
    def apply(
      props: CustomComponentProps[
          "animate", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'animate' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'animate'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_animateMotion_animateMotion_animateMotion")
    def apply(
      props: CustomComponentProps[
          "animateMotion", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'animateMotion' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'animateMotion'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_meter_meter_meter")
    def apply(
      props: CustomComponentProps[
          "meter", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'meter' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'meter'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_abbr_abbr_abbr")
    def apply(
      props: CustomComponentProps[
          "abbr", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'abbr' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'abbr'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_progress_progress_progress")
    def apply(
      props: CustomComponentProps[
          "progress", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'progress' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'progress'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feTile_feTile_feTile")
    def apply(
      props: CustomComponentProps[
          "feTile", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feTile' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feTile'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_tbody_tbody_tbody")
    def apply(
      props: CustomComponentProps[
          "tbody", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'tbody' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'tbody'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_template_template_template")
    def apply(
      props: CustomComponentProps[
          "template", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'template' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'template'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_animateTransform_animateTransform_animateTransform")
    def apply(
      props: CustomComponentProps[
          "animateTransform", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'animateTransform' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'animateTransform'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_param_param_param")
    def apply(
      props: CustomComponentProps[
          "param", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'param' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'param'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_h3_h3_h3")
    def apply(
      props: CustomComponentProps[
          "h3", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'h3' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'h3'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feFuncA_feFuncA_feFuncA")
    def apply(
      props: CustomComponentProps[
          "feFuncA", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feFuncA' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feFuncA'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_metadata_metadata_metadata")
    def apply(
      props: CustomComponentProps[
          "metadata", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'metadata' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'metadata'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_output_output_output")
    def apply(
      props: CustomComponentProps[
          "output", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'output' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'output'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_sub_sub_sub")
    def apply(
      props: CustomComponentProps[
          "sub", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'sub' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'sub'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feFuncR_feFuncR_feFuncR")
    def apply(
      props: CustomComponentProps[
          "feFuncR", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feFuncR' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feFuncR'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_embed_embed_embed")
    def apply(
      props: CustomComponentProps[
          "embed", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'embed' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'embed'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_style_style_style")
    def apply(
      props: CustomComponentProps[
          "style", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'style' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'style'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feMergeNode_feMergeNode_feMergeNode")
    def apply(
      props: CustomComponentProps[
          "feMergeNode", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feMergeNode' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feMergeNode'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_menu_menu_menu")
    def apply(
      props: CustomComponentProps[
          "menu", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'menu' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'menu'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_address_address_address")
    def apply(
      props: CustomComponentProps[
          "address", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'address' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'address'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_stop_stop_stop")
    def apply(
      props: CustomComponentProps[
          "stop", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'stop' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'stop'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_figcaption_figcaption_figcaption")
    def apply(
      props: CustomComponentProps[
          "figcaption", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'figcaption' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'figcaption'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_clipPath_clipPath_clipPath")
    def apply(
      props: CustomComponentProps[
          "clipPath", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'clipPath' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'clipPath'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_view_view_view")
    def apply(
      props: CustomComponentProps[
          "view", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'view' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'view'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_polygon_polygon_polygon")
    def apply(
      props: CustomComponentProps[
          "polygon", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'polygon' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'polygon'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feMorphology_feMorphology_feMorphology")
    def apply(
      props: CustomComponentProps[
          "feMorphology", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feMorphology' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feMorphology'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_tr_tr_tr")
    def apply(
      props: CustomComponentProps[
          "tr", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'tr' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'tr'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_link_link_link")
    def apply(
      props: CustomComponentProps[
          "link", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'link' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'link'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feFlood_feFlood_feFlood")
    def apply(
      props: CustomComponentProps[
          "feFlood", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feFlood' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feFlood'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_ol_ol_ol")
    def apply(
      props: CustomComponentProps[
          "ol", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'ol' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'ol'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feColorMatrix_feColorMatrix_feColorMatrix")
    def apply(
      props: CustomComponentProps[
          "feColorMatrix", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feColorMatrix' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feColorMatrix'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_button_button_button")
    def apply(
      props: CustomComponentProps[
          "button", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'button' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'button'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_ul_ul_ul")
    def apply(
      props: CustomComponentProps[
          "ul", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'ul' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'ul'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_map_map_map")
    def apply(
      props: CustomComponentProps[
          "map", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'map' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'map'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_samp_samp_samp")
    def apply(
      props: CustomComponentProps[
          "samp", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'samp' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'samp'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_filter_filter_filter")
    def apply(
      props: CustomComponentProps[
          "filter", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'filter' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'filter'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feDropShadow_feDropShadow_feDropShadow")
    def apply(
      props: CustomComponentProps[
          "feDropShadow", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feDropShadow' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feDropShadow'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_switch_switch_switch")
    def apply(
      props: CustomComponentProps[
          "switch", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'switch' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'switch'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_object_object_object")
    def apply(
      props: CustomComponentProps[
          "object", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'object' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'object'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_br_br_br")
    def apply(
      props: CustomComponentProps[
          "br", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'br' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'br'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_mpath_mpath_mpath")
    def apply(
      props: CustomComponentProps[
          "mpath", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'mpath' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'mpath'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_caption_caption_caption")
    def apply(
      props: CustomComponentProps[
          "caption", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'caption' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'caption'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_bdi_bdi_bdi")
    def apply(
      props: CustomComponentProps[
          "bdi", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'bdi' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'bdi'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_pre_pre_pre")
    def apply(
      props: CustomComponentProps[
          "pre", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'pre' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'pre'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_small_small_small")
    def apply(
      props: CustomComponentProps[
          "small", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'small' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'small'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_em_em_em")
    def apply(
      props: CustomComponentProps[
          "em", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'em' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'em'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_dialog_dialog_dialog")
    def apply(
      props: CustomComponentProps[
          "dialog", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'dialog' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'dialog'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feTurbulence_feTurbulence_feTurbulence")
    def apply(
      props: CustomComponentProps[
          "feTurbulence", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feTurbulence' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feTurbulence'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_section_section_section")
    def apply(
      props: CustomComponentProps[
          "section", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'section' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'section'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_p_p_p")
    def apply(
      props: CustomComponentProps[
          "p", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'p' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'p'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_td_td_td")
    def apply(
      props: CustomComponentProps[
          "td", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'td' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'td'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_ellipse_ellipse_ellipse")
    def apply(
      props: CustomComponentProps[
          "ellipse", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'ellipse' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'ellipse'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_wbr_wbr_wbr")
    def apply(
      props: CustomComponentProps[
          "wbr", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'wbr' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'wbr'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_header_header_header")
    def apply(
      props: CustomComponentProps[
          "header", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'header' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'header'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_img_img_img")
    def apply(
      props: CustomComponentProps[
          "img", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'img' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'img'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feBlend_feBlend_feBlend")
    def apply(
      props: CustomComponentProps[
          "feBlend", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feBlend' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feBlend'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_line_line_line")
    def apply(
      props: CustomComponentProps[
          "line", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'line' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'line'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_table_table_table")
    def apply(
      props: CustomComponentProps[
          "table", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'table' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'table'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_del_del_del")
    def apply(
      props: CustomComponentProps[
          "del", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'del' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'del'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_i_i_i")
    def apply(
      props: CustomComponentProps[
          "i", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'i' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'i'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_meta_meta_meta")
    def apply(
      props: CustomComponentProps[
          "meta", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'meta' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'meta'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_iframe_iframe_iframe")
    def apply(
      props: CustomComponentProps[
          "iframe", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'iframe' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'iframe'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_noindex_noindex_noindex")
    def apply(
      props: CustomComponentProps[
          "noindex", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'noindex' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'noindex'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feFuncG_feFuncG_feFuncG")
    def apply(
      props: CustomComponentProps[
          "feFuncG", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feFuncG' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feFuncG'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_h2_h2_h2")
    def apply(
      props: CustomComponentProps[
          "h2", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'h2' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'h2'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_script_script_script")
    def apply(
      props: CustomComponentProps[
          "script", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'script' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'script'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_marker_marker_marker")
    def apply(
      props: CustomComponentProps[
          "marker", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'marker' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'marker'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_defs_defs_defs")
    def apply(
      props: CustomComponentProps[
          "defs", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'defs' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'defs'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_path_path_path")
    def apply(
      props: CustomComponentProps[
          "path", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'path' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'path'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feConvolveMatrix_feConvolveMatrix_feConvolveMatrix")
    def apply(
      props: CustomComponentProps[
          "feConvolveMatrix", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feConvolveMatrix' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feConvolveMatrix'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_input_input_input")
    def apply(
      props: CustomComponentProps[
          "input", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'input' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'input'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_q_q_q")
    def apply(
      props: CustomComponentProps[
          "q", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'q' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'q'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feSpotLight_feSpotLight_feSpotLight")
    def apply(
      props: CustomComponentProps[
          "feSpotLight", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feSpotLight' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feSpotLight'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_ins_ins_ins")
    def apply(
      props: CustomComponentProps[
          "ins", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'ins' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'ins'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_html_html_html")
    def apply(
      props: CustomComponentProps[
          "html", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'html' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'html'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_kbd_kbd_kbd")
    def apply(
      props: CustomComponentProps[
          "kbd", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'kbd' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'kbd'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_hr_hr_hr")
    def apply(
      props: CustomComponentProps[
          "hr", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'hr' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'hr'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_summary_summary_summary")
    def apply(
      props: CustomComponentProps[
          "summary", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'summary' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'summary'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_dfn_dfn_dfn")
    def apply(
      props: CustomComponentProps[
          "dfn", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'dfn' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'dfn'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_text_text_text")
    def apply(
      props: CustomComponentProps[
          "text", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'text' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'text'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_h6_h6_h6")
    def apply(
      props: CustomComponentProps[
          "h6", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'h6' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'h6'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_symbol_symbol_symbol")
    def apply(
      props: CustomComponentProps[
          "symbol", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'symbol' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'symbol'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_foreignObject_foreignObject_foreignObject")
    def apply(
      props: CustomComponentProps[
          "foreignObject", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'foreignObject' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'foreignObject'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_noscript_noscript_noscript")
    def apply(
      props: CustomComponentProps[
          "noscript", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'noscript' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'noscript'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_span_span_span")
    def apply(
      props: CustomComponentProps[
          "span", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'span' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'span'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_svg_svg_svg")
    def apply(
      props: CustomComponentProps[
          "svg", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'svg' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'svg'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_ruby_ruby_ruby")
    def apply(
      props: CustomComponentProps[
          "ruby", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'ruby' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'ruby'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_desc_desc_desc")
    def apply(
      props: CustomComponentProps[
          "desc", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'desc' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'desc'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feDiffuseLighting_feDiffuseLighting_feDiffuseLighting")
    def apply(
      props: CustomComponentProps[
          "feDiffuseLighting", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feDiffuseLighting' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feDiffuseLighting'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_tfoot_tfoot_tfoot")
    def apply(
      props: CustomComponentProps[
          "tfoot", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'tfoot' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'tfoot'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_label_label_label")
    def apply(
      props: CustomComponentProps[
          "label", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'label' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'label'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feDistantLight_feDistantLight_feDistantLight")
    def apply(
      props: CustomComponentProps[
          "feDistantLight", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feDistantLight' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feDistantLight'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feComposite_feComposite_feComposite")
    def apply(
      props: CustomComponentProps[
          "feComposite", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feComposite' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feComposite'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_keygen_keygen_keygen")
    def apply(
      props: CustomComponentProps[
          "keygen", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'keygen' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'keygen'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_h5_h5_h5")
    def apply(
      props: CustomComponentProps[
          "h5", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'h5' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'h5'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_nav_nav_nav")
    def apply(
      props: CustomComponentProps[
          "nav", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'nav' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'nav'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_dd_dd_dd")
    def apply(
      props: CustomComponentProps[
          "dd", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'dd' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'dd'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_a_a_a")
    def apply(
      props: CustomComponentProps[
          "a", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'a' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'a'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feSpecularLighting_feSpecularLighting_feSpecularLighting")
    def apply(
      props: CustomComponentProps[
          "feSpecularLighting", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feSpecularLighting' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feSpecularLighting'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_rt_rt_rt")
    def apply(
      props: CustomComponentProps[
          "rt", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'rt' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'rt'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_menuitem_menuitem_menuitem")
    def apply(
      props: CustomComponentProps[
          "menuitem", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'menuitem' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'menuitem'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_b_b_b")
    def apply(
      props: CustomComponentProps[
          "b", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'b' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'b'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_details_details_details")
    def apply(
      props: CustomComponentProps[
          "details", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'details' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'details'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_dl_dl_dl")
    def apply(
      props: CustomComponentProps[
          "dl", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'dl' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'dl'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_th_th_th")
    def apply(
      props: CustomComponentProps[
          "th", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'th' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'th'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_body_body_body")
    def apply(
      props: CustomComponentProps[
          "body", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'body' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'body'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_footer_footer_footer")
    def apply(
      props: CustomComponentProps[
          "footer", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'footer' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'footer'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_bdo_bdo_bdo")
    def apply(
      props: CustomComponentProps[
          "bdo", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'bdo' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'bdo'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_thead_thead_thead")
    def apply(
      props: CustomComponentProps[
          "thead", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'thead' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'thead'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_big_big_big")
    def apply(
      props: CustomComponentProps[
          "big", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'big' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'big'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_webview_webview_webview")
    def apply(
      props: CustomComponentProps[
          "webview", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'webview' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'webview'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_rect_rect_rect")
    def apply(
      props: CustomComponentProps[
          "rect", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'rect' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'rect'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_main_main_main")
    def apply(
      props: CustomComponentProps[
          "main", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'main' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'main'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_mark_mark_mark")
    def apply(
      props: CustomComponentProps[
          "mark", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'mark' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'mark'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_pattern_pattern_pattern")
    def apply(
      props: CustomComponentProps[
          "pattern", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'pattern' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'pattern'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_blockquote_blockquote_blockquote")
    def apply(
      props: CustomComponentProps[
          "blockquote", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'blockquote' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'blockquote'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_polyline_polyline_polyline")
    def apply(
      props: CustomComponentProps[
          "polyline", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'polyline' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'polyline'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_strong_strong_strong")
    def apply(
      props: CustomComponentProps[
          "strong", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'strong' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'strong'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feOffset_feOffset_feOffset")
    def apply(
      props: CustomComponentProps[
          "feOffset", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feOffset' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feOffset'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feMerge_feMerge_feMerge")
    def apply(
      props: CustomComponentProps[
          "feMerge", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feMerge' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feMerge'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_dt_dt_dt")
    def apply(
      props: CustomComponentProps[
          "dt", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'dt' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'dt'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_colgroup_colgroup_colgroup")
    def apply(
      props: CustomComponentProps[
          "colgroup", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'colgroup' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'colgroup'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_form_form_form")
    def apply(
      props: CustomComponentProps[
          "form", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'form' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'form'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_h4_h4_h4")
    def apply(
      props: CustomComponentProps[
          "h4", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'h4' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'h4'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_feGaussianBlur_feGaussianBlur_feGaussianBlur")
    def apply(
      props: CustomComponentProps[
          "feGaussianBlur", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'feGaussianBlur' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'feGaussianBlur'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_option_option_option")
    def apply(
      props: CustomComponentProps[
          "option", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'option' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'option'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_hgroup_hgroup_hgroup")
    def apply(
      props: CustomComponentProps[
          "hgroup", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'hgroup' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'hgroup'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_div_div_div")
    def apply(
      props: CustomComponentProps[
          "div", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'div' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'div'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_cite_cite_cite")
    def apply(
      props: CustomComponentProps[
          "cite", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'cite' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'cite'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_datalist_datalist_datalist")
    def apply(
      props: CustomComponentProps[
          "datalist", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'datalist' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'datalist'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_radialGradient_radialGradient_radialGradient")
    def apply(
      props: CustomComponentProps[
          "radialGradient", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'radialGradient' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'radialGradient'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_u_u_u")
    def apply(
      props: CustomComponentProps[
          "u", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'u' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'u'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_col_col_col")
    def apply(
      props: CustomComponentProps[
          "col", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'col' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'col'> : {} */ js.Any
        ]
    ): ReactElement = js.native
    @JSName("<apply>")
    @scala.annotation.targetName("apply_circle_circle_circle")
    def apply(
      props: CustomComponentProps[
          "circle", 
          ExpectedProps & PropsToBeInjectedIntoActualComponent, 
          /* import warning: importer.ImportType#apply Failed type conversion: 'circle' extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentPropsWithRef<'circle'> : {} */ js.Any
        ]
    ): ReactElement = js.native
  }
  
  type CustomComponentProps[ActualComponent /* <: StyledTarget */, PropsToBeInjectedIntoActualComponent /* <: js.Object */, ActualComponentProps] = (As[ActualComponent] & HTMLAttributes[ActualComponent] & (Omit[
    PropsToBeInjectedIntoActualComponent, 
    (/* keyof ActualComponentProps */ String) | "as" | "$as"
  ]) & ActualComponentProps) | (`173`[ActualComponent] & HTMLAttributes[ActualComponent] & (Omit[
    PropsToBeInjectedIntoActualComponent, 
    (/* keyof ActualComponentProps */ String) | "as" | "$as"
  ]) & ActualComponentProps)
  
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
    var $as: js.UndefOr[KnownWebTarget] = js.undefined
    
    @JSName("$forwardedAs")
    var $forwardedAs: js.UndefOr[KnownWebTarget] = js.undefined
    
    var as: js.UndefOr[KnownWebTarget] = js.undefined
    
    var forwardedAs: js.UndefOr[KnownWebTarget] = js.undefined
    
    var theme: js.UndefOr[DefaultTheme] = js.undefined
  }
  object ExtensibleObject {
    
    inline def apply(): ExtensibleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtensibleObject]
    }
    
    extension [Self <: ExtensibleObject](x: Self) {
      
      inline def set$as(value: KnownWebTarget): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
      
      inline def set$forwardedAs(value: KnownWebTarget): Self = StObject.set(x, "$forwardedAs", value.asInstanceOf[js.Any])
      
      inline def set$forwardedAsUndefined: Self = StObject.set(x, "$forwardedAs", js.undefined)
      
      inline def setAs(value: KnownWebTarget): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setForwardedAs(value: KnownWebTarget): Self = StObject.set(x, "forwardedAs", value.asInstanceOf[js.Any])
      
      inline def setForwardedAsUndefined: Self = StObject.set(x, "forwardedAs", js.undefined)
      
      inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Flattener = (chunks : std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>, executionContext : std.Object | null | undefined, styleSheet : std.Object | null | undefined): std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/dist/types.Flattener
  - styled-components.styled-components/native/dist/dist/types.Interpolation
  */
  @js.native
  trait Flattener[Props] extends StObject {
    
    def apply(chunks: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Null, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Unit, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
  }
  
  type FlattenerResult[Props] = RuleSet[Props] | Double | String | js.Array[String] | (IStyledComponent[Any, Any]) | Keyframes
  
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
  trait IStyledComponent[Target /* <: WebTarget */, Props]
    extends StObject
       with CustomComponent[Target, Props, ExecutionContext]
       with IStyledStatics[Props] {
    
    @JSName("defaultProps")
    var defaultProps_IStyledComponent: js.UndefOr[
        Partial[
          ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentProps<Target> : {} */ js.Any) & Props
        ]
      ] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type IStyledComponentFactory = (target : Target, options : styled-components.styled-components/native/dist/dist/types.StyledOptions<Props>, rules : styled-components.styled-components/native/dist/dist/types.RuleSet<Props>): styled-components.styled-components/native/dist/dist/types.IStyledComponent<Target, Props> & Statics
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory
  - styled-components.styled-components/native/dist/dist/types.Interpolation
  - styled-components.styled-components/native/dist/dist/types.RuleSet
  */
  @js.native
  trait IStyledComponentFactory[Target /* <: WebTarget */, Props, Statics] extends StObject {
    
    def apply(target: Target, options: StyledOptions[Props], rules: RuleSet[Props]): (IStyledComponent[Target, Props]) & Statics = js.native
  }
  
  @js.native
  trait IStyledNativeComponent[Target /* <: NativeTarget */, Props]
    extends StObject
       with CustomComponent[Target, Props, ExecutionContext]
       with IStyledNativeStatics[Props] {
    
    @JSName("defaultProps")
    var defaultProps_IStyledNativeComponent: js.UndefOr[
        Partial[
          ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/dist/types.KnownWebTarget ? react.react.ComponentProps<Target> : {} */ js.Any) & Props
        ]
      ] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type IStyledNativeComponentFactory = (target : Target, options : styled-components.styled-components/native/dist/dist/types.StyledNativeOptions<Props>, rules : styled-components.styled-components/native/dist/dist/types.RuleSet<Props>): styled-components.styled-components/native/dist/dist/types.IStyledNativeComponent<Target, Props> & Statics
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory
  - styled-components.styled-components/native/dist/dist/types.Interpolation
  - styled-components.styled-components/native/dist/dist/types.RuleSet
  */
  @js.native
  trait IStyledNativeComponentFactory[Target /* <: NativeTarget */, Props, Statics] extends StObject {
    
    def apply(target: Target, options: StyledNativeOptions[Props], rules: RuleSet[Props]): (IStyledNativeComponent[Target, Props]) & Statics = js.native
  }
  
  trait IStyledNativeStatics[OuterProps]
    extends StObject
       with CommonStatics[OuterProps] {
    
    var inlineStyle: InstanceType[IInlineStyleConstructor[OuterProps]]
    
    @JSName("target")
    var target_IStyledNativeStatics: NativeTarget
    
    @JSName("withComponent")
    def withComponent_MIStyledNativeStatics[Target /* <: NativeTarget */, Props](tag: Target): IStyledNativeComponent[Target, OuterProps & Props]
  }
  object IStyledNativeStatics {
    
    inline def apply[OuterProps](
      attrs: js.Array[Attrs[OuterProps]],
      inlineStyle: InstanceType[IInlineStyleConstructor[OuterProps]],
      target: NativeTarget,
      withComponent: Any => IStyledNativeComponent[Any, OuterProps & Any]
    ): IStyledNativeStatics[OuterProps] = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], inlineStyle = inlineStyle.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = js.Any.fromFunction1(withComponent))
      __obj.asInstanceOf[IStyledNativeStatics[OuterProps]]
    }
    
    extension [Self <: IStyledNativeStatics[?], OuterProps](x: Self & IStyledNativeStatics[OuterProps]) {
      
      inline def setInlineStyle(value: InstanceType[IInlineStyleConstructor[OuterProps]]): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: NativeTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWithComponent(value: Any => IStyledNativeComponent[Any, OuterProps & Any]): Self = StObject.set(x, "withComponent", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IStyledStatics[OuterProps]
    extends StObject
       with CommonStatics[OuterProps] {
    
    var componentStyle: default = js.native
    
    var foldedComponentIds: js.Array[String] = js.native
    
    var styledComponentId: String = js.native
    
    @JSName("target")
    var target_IStyledStatics: WebTarget = js.native
    
    var warnTooManyClasses: js.UndefOr[
        ReturnType[
          js.Function2[
            /* displayName */ String, 
            /* componentId */ String, 
            js.Function1[/* className */ String, Unit]
          ]
        ]
      ] = js.native
    
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_linearGradient")
    def withComponent_MIStyledStatics[Props](tag: "linearGradient"): IStyledComponent["linearGradient", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_ol")
    def withComponent_MIStyledStatics[Props](tag: "ol"): IStyledComponent["ol", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_meta")
    def withComponent_MIStyledStatics[Props](tag: "meta"): IStyledComponent["meta", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_path")
    def withComponent_MIStyledStatics[Props](tag: "path"): IStyledComponent["path", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_polygon")
    def withComponent_MIStyledStatics[Props](tag: "polygon"): IStyledComponent["polygon", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_h5")
    def withComponent_MIStyledStatics[Props](tag: "h5"): IStyledComponent["h5", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_em")
    def withComponent_MIStyledStatics[Props](tag: "em"): IStyledComponent["em", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_circle")
    def withComponent_MIStyledStatics[Props](tag: "circle"): IStyledComponent["circle", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_audio")
    def withComponent_MIStyledStatics[Props](tag: "audio"): IStyledComponent["audio", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_input")
    def withComponent_MIStyledStatics[Props](tag: "input"): IStyledComponent["input", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_time")
    def withComponent_MIStyledStatics[Props](tag: "time"): IStyledComponent["time", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_title")
    def withComponent_MIStyledStatics[Props](tag: "title"): IStyledComponent["title", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feMorphology")
    def withComponent_MIStyledStatics[Props](tag: "feMorphology"): IStyledComponent["feMorphology", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_figure")
    def withComponent_MIStyledStatics[Props](tag: "figure"): IStyledComponent["figure", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_hgroup")
    def withComponent_MIStyledStatics[Props](tag: "hgroup"): IStyledComponent["hgroup", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_i")
    def withComponent_MIStyledStatics[Props](tag: "i"): IStyledComponent["i", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_tr")
    def withComponent_MIStyledStatics[Props](tag: "tr"): IStyledComponent["tr", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_mpath")
    def withComponent_MIStyledStatics[Props](tag: "mpath"): IStyledComponent["mpath", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_menuitem")
    def withComponent_MIStyledStatics[Props](tag: "menuitem"): IStyledComponent["menuitem", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_sup")
    def withComponent_MIStyledStatics[Props](tag: "sup"): IStyledComponent["sup", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_slot")
    def withComponent_MIStyledStatics[Props](tag: "slot"): IStyledComponent["slot", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_link")
    def withComponent_MIStyledStatics[Props](tag: "link"): IStyledComponent["link", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_source")
    def withComponent_MIStyledStatics[Props](tag: "source"): IStyledComponent["source", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_ellipse")
    def withComponent_MIStyledStatics[Props](tag: "ellipse"): IStyledComponent["ellipse", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_details")
    def withComponent_MIStyledStatics[Props](tag: "details"): IStyledComponent["details", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_dt")
    def withComponent_MIStyledStatics[Props](tag: "dt"): IStyledComponent["dt", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_foreignObject")
    def withComponent_MIStyledStatics[Props](tag: "foreignObject"): IStyledComponent["foreignObject", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_dfn")
    def withComponent_MIStyledStatics[Props](tag: "dfn"): IStyledComponent["dfn", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_clipPath")
    def withComponent_MIStyledStatics[Props](tag: "clipPath"): IStyledComponent["clipPath", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_colgroup")
    def withComponent_MIStyledStatics[Props](tag: "colgroup"): IStyledComponent["colgroup", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_img")
    def withComponent_MIStyledStatics[Props](tag: "img"): IStyledComponent["img", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feSpotLight")
    def withComponent_MIStyledStatics[Props](tag: "feSpotLight"): IStyledComponent["feSpotLight", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_body")
    def withComponent_MIStyledStatics[Props](tag: "body"): IStyledComponent["body", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_svg")
    def withComponent_MIStyledStatics[Props](tag: "svg"): IStyledComponent["svg", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feFuncA")
    def withComponent_MIStyledStatics[Props](tag: "feFuncA"): IStyledComponent["feFuncA", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_fePointLight")
    def withComponent_MIStyledStatics[Props](tag: "fePointLight"): IStyledComponent["fePointLight", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_blockquote")
    def withComponent_MIStyledStatics[Props](tag: "blockquote"): IStyledComponent["blockquote", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_footer")
    def withComponent_MIStyledStatics[Props](tag: "footer"): IStyledComponent["footer", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_view")
    def withComponent_MIStyledStatics[Props](tag: "view"): IStyledComponent["view", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feDisplacementMap")
    def withComponent_MIStyledStatics[Props](tag: "feDisplacementMap"): IStyledComponent["feDisplacementMap", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_kbd")
    def withComponent_MIStyledStatics[Props](tag: "kbd"): IStyledComponent["kbd", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_article")
    def withComponent_MIStyledStatics[Props](tag: "article"): IStyledComponent["article", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_h4")
    def withComponent_MIStyledStatics[Props](tag: "h4"): IStyledComponent["h4", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_h2")
    def withComponent_MIStyledStatics[Props](tag: "h2"): IStyledComponent["h2", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_th")
    def withComponent_MIStyledStatics[Props](tag: "th"): IStyledComponent["th", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_data")
    def withComponent_MIStyledStatics[Props](tag: "data"): IStyledComponent["data", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_u")
    def withComponent_MIStyledStatics[Props](tag: "u"): IStyledComponent["u", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_var")
    def withComponent_MIStyledStatics[Props](tag: "var"): IStyledComponent["var", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_thead")
    def withComponent_MIStyledStatics[Props](tag: "thead"): IStyledComponent["thead", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_style")
    def withComponent_MIStyledStatics[Props](tag: "style"): IStyledComponent["style", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_bdi")
    def withComponent_MIStyledStatics[Props](tag: "bdi"): IStyledComponent["bdi", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_s")
    def withComponent_MIStyledStatics[Props](tag: "s"): IStyledComponent["s", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_picture")
    def withComponent_MIStyledStatics[Props](tag: "picture"): IStyledComponent["picture", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_wbr")
    def withComponent_MIStyledStatics[Props](tag: "wbr"): IStyledComponent["wbr", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feMerge")
    def withComponent_MIStyledStatics[Props](tag: "feMerge"): IStyledComponent["feMerge", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_rp")
    def withComponent_MIStyledStatics[Props](tag: "rp"): IStyledComponent["rp", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feBlend")
    def withComponent_MIStyledStatics[Props](tag: "feBlend"): IStyledComponent["feBlend", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_html")
    def withComponent_MIStyledStatics[Props](tag: "html"): IStyledComponent["html", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_h3")
    def withComponent_MIStyledStatics[Props](tag: "h3"): IStyledComponent["h3", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_col")
    def withComponent_MIStyledStatics[Props](tag: "col"): IStyledComponent["col", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_symbol")
    def withComponent_MIStyledStatics[Props](tag: "symbol"): IStyledComponent["symbol", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_pattern")
    def withComponent_MIStyledStatics[Props](tag: "pattern"): IStyledComponent["pattern", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_figcaption")
    def withComponent_MIStyledStatics[Props](tag: "figcaption"): IStyledComponent["figcaption", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feColorMatrix")
    def withComponent_MIStyledStatics[Props](tag: "feColorMatrix"): IStyledComponent["feColorMatrix", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_select")
    def withComponent_MIStyledStatics[Props](tag: "select"): IStyledComponent["select", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_h1")
    def withComponent_MIStyledStatics[Props](tag: "h1"): IStyledComponent["h1", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feTile")
    def withComponent_MIStyledStatics[Props](tag: "feTile"): IStyledComponent["feTile", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_use")
    def withComponent_MIStyledStatics[Props](tag: "use"): IStyledComponent["use", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_cite")
    def withComponent_MIStyledStatics[Props](tag: "cite"): IStyledComponent["cite", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_td")
    def withComponent_MIStyledStatics[Props](tag: "td"): IStyledComponent["td", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_tbody")
    def withComponent_MIStyledStatics[Props](tag: "tbody"): IStyledComponent["tbody", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_param")
    def withComponent_MIStyledStatics[Props](tag: "param"): IStyledComponent["param", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_p")
    def withComponent_MIStyledStatics[Props](tag: "p"): IStyledComponent["p", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_text")
    def withComponent_MIStyledStatics[Props](tag: "text"): IStyledComponent["text", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_pre")
    def withComponent_MIStyledStatics[Props](tag: "pre"): IStyledComponent["pre", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_menu")
    def withComponent_MIStyledStatics[Props](tag: "menu"): IStyledComponent["menu", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_metadata")
    def withComponent_MIStyledStatics[Props](tag: "metadata"): IStyledComponent["metadata", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feMergeNode")
    def withComponent_MIStyledStatics[Props](tag: "feMergeNode"): IStyledComponent["feMergeNode", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_rect")
    def withComponent_MIStyledStatics[Props](tag: "rect"): IStyledComponent["rect", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_meter")
    def withComponent_MIStyledStatics[Props](tag: "meter"): IStyledComponent["meter", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_ins")
    def withComponent_MIStyledStatics[Props](tag: "ins"): IStyledComponent["ins", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_desc")
    def withComponent_MIStyledStatics[Props](tag: "desc"): IStyledComponent["desc", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_mask")
    def withComponent_MIStyledStatics[Props](tag: "mask"): IStyledComponent["mask", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_main")
    def withComponent_MIStyledStatics[Props](tag: "main"): IStyledComponent["main", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_ul")
    def withComponent_MIStyledStatics[Props](tag: "ul"): IStyledComponent["ul", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_iframe")
    def withComponent_MIStyledStatics[Props](tag: "iframe"): IStyledComponent["iframe", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_label")
    def withComponent_MIStyledStatics[Props](tag: "label"): IStyledComponent["label", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feDistantLight")
    def withComponent_MIStyledStatics[Props](tag: "feDistantLight"): IStyledComponent["feDistantLight", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_sub")
    def withComponent_MIStyledStatics[Props](tag: "sub"): IStyledComponent["sub", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_g")
    def withComponent_MIStyledStatics[Props](tag: "g"): IStyledComponent["g", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_table")
    def withComponent_MIStyledStatics[Props](tag: "table"): IStyledComponent["table", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_switch")
    def withComponent_MIStyledStatics[Props](tag: "switch"): IStyledComponent["switch", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_datalist")
    def withComponent_MIStyledStatics[Props](tag: "datalist"): IStyledComponent["datalist", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_image")
    def withComponent_MIStyledStatics[Props](tag: "image"): IStyledComponent["image", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_noscript")
    def withComponent_MIStyledStatics[Props](tag: "noscript"): IStyledComponent["noscript", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_tfoot")
    def withComponent_MIStyledStatics[Props](tag: "tfoot"): IStyledComponent["tfoot", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_nav")
    def withComponent_MIStyledStatics[Props](tag: "nav"): IStyledComponent["nav", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_address")
    def withComponent_MIStyledStatics[Props](tag: "address"): IStyledComponent["address", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_progress")
    def withComponent_MIStyledStatics[Props](tag: "progress"): IStyledComponent["progress", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_video")
    def withComponent_MIStyledStatics[Props](tag: "video"): IStyledComponent["video", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_polyline")
    def withComponent_MIStyledStatics[Props](tag: "polyline"): IStyledComponent["polyline", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_hr")
    def withComponent_MIStyledStatics[Props](tag: "hr"): IStyledComponent["hr", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_strong")
    def withComponent_MIStyledStatics[Props](tag: "strong"): IStyledComponent["strong", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_output")
    def withComponent_MIStyledStatics[Props](tag: "output"): IStyledComponent["output", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_summary")
    def withComponent_MIStyledStatics[Props](tag: "summary"): IStyledComponent["summary", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_caption")
    def withComponent_MIStyledStatics[Props](tag: "caption"): IStyledComponent["caption", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_aside")
    def withComponent_MIStyledStatics[Props](tag: "aside"): IStyledComponent["aside", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_dd")
    def withComponent_MIStyledStatics[Props](tag: "dd"): IStyledComponent["dd", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_object")
    def withComponent_MIStyledStatics[Props](tag: "object"): IStyledComponent["object", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_dl")
    def withComponent_MIStyledStatics[Props](tag: "dl"): IStyledComponent["dl", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feTurbulence")
    def withComponent_MIStyledStatics[Props](tag: "feTurbulence"): IStyledComponent["feTurbulence", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feFuncR")
    def withComponent_MIStyledStatics[Props](tag: "feFuncR"): IStyledComponent["feFuncR", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_bdo")
    def withComponent_MIStyledStatics[Props](tag: "bdo"): IStyledComponent["bdo", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_script")
    def withComponent_MIStyledStatics[Props](tag: "script"): IStyledComponent["script", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_textPath")
    def withComponent_MIStyledStatics[Props](tag: "textPath"): IStyledComponent["textPath", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_webview")
    def withComponent_MIStyledStatics[Props](tag: "webview"): IStyledComponent["webview", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feComponentTransfer")
    def withComponent_MIStyledStatics[Props](tag: "feComponentTransfer"): IStyledComponent["feComponentTransfer", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_tspan")
    def withComponent_MIStyledStatics[Props](tag: "tspan"): IStyledComponent["tspan", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_big")
    def withComponent_MIStyledStatics[Props](tag: "big"): IStyledComponent["big", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_fieldset")
    def withComponent_MIStyledStatics[Props](tag: "fieldset"): IStyledComponent["fieldset", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_stop")
    def withComponent_MIStyledStatics[Props](tag: "stop"): IStyledComponent["stop", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_optgroup")
    def withComponent_MIStyledStatics[Props](tag: "optgroup"): IStyledComponent["optgroup", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_template")
    def withComponent_MIStyledStatics[Props](tag: "template"): IStyledComponent["template", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_a")
    def withComponent_MIStyledStatics[Props](tag: "a"): IStyledComponent["a", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_section")
    def withComponent_MIStyledStatics[Props](tag: "section"): IStyledComponent["section", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_map")
    def withComponent_MIStyledStatics[Props](tag: "map"): IStyledComponent["map", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_animate")
    def withComponent_MIStyledStatics[Props](tag: "animate"): IStyledComponent["animate", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_h6")
    def withComponent_MIStyledStatics[Props](tag: "h6"): IStyledComponent["h6", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_code")
    def withComponent_MIStyledStatics[Props](tag: "code"): IStyledComponent["code", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_span")
    def withComponent_MIStyledStatics[Props](tag: "span"): IStyledComponent["span", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_ruby")
    def withComponent_MIStyledStatics[Props](tag: "ruby"): IStyledComponent["ruby", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feConvolveMatrix")
    def withComponent_MIStyledStatics[Props](tag: "feConvolveMatrix"): IStyledComponent["feConvolveMatrix", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_animateMotion")
    def withComponent_MIStyledStatics[Props](tag: "animateMotion"): IStyledComponent["animateMotion", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_option")
    def withComponent_MIStyledStatics[Props](tag: "option"): IStyledComponent["option", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feSpecularLighting")
    def withComponent_MIStyledStatics[Props](tag: "feSpecularLighting"): IStyledComponent["feSpecularLighting", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_br")
    def withComponent_MIStyledStatics[Props](tag: "br"): IStyledComponent["br", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_samp")
    def withComponent_MIStyledStatics[Props](tag: "samp"): IStyledComponent["samp", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_del")
    def withComponent_MIStyledStatics[Props](tag: "del"): IStyledComponent["del", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_rt")
    def withComponent_MIStyledStatics[Props](tag: "rt"): IStyledComponent["rt", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_defs")
    def withComponent_MIStyledStatics[Props](tag: "defs"): IStyledComponent["defs", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_legend")
    def withComponent_MIStyledStatics[Props](tag: "legend"): IStyledComponent["legend", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feFuncG")
    def withComponent_MIStyledStatics[Props](tag: "feFuncG"): IStyledComponent["feFuncG", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_canvas")
    def withComponent_MIStyledStatics[Props](tag: "canvas"): IStyledComponent["canvas", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_noindex")
    def withComponent_MIStyledStatics[Props](tag: "noindex"): IStyledComponent["noindex", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_b")
    def withComponent_MIStyledStatics[Props](tag: "b"): IStyledComponent["b", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_header")
    def withComponent_MIStyledStatics[Props](tag: "header"): IStyledComponent["header", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_abbr")
    def withComponent_MIStyledStatics[Props](tag: "abbr"): IStyledComponent["abbr", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_keygen")
    def withComponent_MIStyledStatics[Props](tag: "keygen"): IStyledComponent["keygen", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_mark")
    def withComponent_MIStyledStatics[Props](tag: "mark"): IStyledComponent["mark", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_radialGradient")
    def withComponent_MIStyledStatics[Props](tag: "radialGradient"): IStyledComponent["radialGradient", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_marker")
    def withComponent_MIStyledStatics[Props](tag: "marker"): IStyledComponent["marker", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_embed")
    def withComponent_MIStyledStatics[Props](tag: "embed"): IStyledComponent["embed", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_dialog")
    def withComponent_MIStyledStatics[Props](tag: "dialog"): IStyledComponent["dialog", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_small")
    def withComponent_MIStyledStatics[Props](tag: "small"): IStyledComponent["small", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feFuncB")
    def withComponent_MIStyledStatics[Props](tag: "feFuncB"): IStyledComponent["feFuncB", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feDiffuseLighting")
    def withComponent_MIStyledStatics[Props](tag: "feDiffuseLighting"): IStyledComponent["feDiffuseLighting", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_button")
    def withComponent_MIStyledStatics[Props](tag: "button"): IStyledComponent["button", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_li")
    def withComponent_MIStyledStatics[Props](tag: "li"): IStyledComponent["li", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feGaussianBlur")
    def withComponent_MIStyledStatics[Props](tag: "feGaussianBlur"): IStyledComponent["feGaussianBlur", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_area")
    def withComponent_MIStyledStatics[Props](tag: "area"): IStyledComponent["area", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_filter")
    def withComponent_MIStyledStatics[Props](tag: "filter"): IStyledComponent["filter", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_head")
    def withComponent_MIStyledStatics[Props](tag: "head"): IStyledComponent["head", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_form")
    def withComponent_MIStyledStatics[Props](tag: "form"): IStyledComponent["form", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_line")
    def withComponent_MIStyledStatics[Props](tag: "line"): IStyledComponent["line", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feImage")
    def withComponent_MIStyledStatics[Props](tag: "feImage"): IStyledComponent["feImage", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_track")
    def withComponent_MIStyledStatics[Props](tag: "track"): IStyledComponent["track", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feComposite")
    def withComponent_MIStyledStatics[Props](tag: "feComposite"): IStyledComponent["feComposite", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_q")
    def withComponent_MIStyledStatics[Props](tag: "q"): IStyledComponent["q", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feFlood")
    def withComponent_MIStyledStatics[Props](tag: "feFlood"): IStyledComponent["feFlood", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feDropShadow")
    def withComponent_MIStyledStatics[Props](tag: "feDropShadow"): IStyledComponent["feDropShadow", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_feOffset")
    def withComponent_MIStyledStatics[Props](tag: "feOffset"): IStyledComponent["feOffset", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_textarea")
    def withComponent_MIStyledStatics[Props](tag: "textarea"): IStyledComponent["textarea", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_div")
    def withComponent_MIStyledStatics[Props](tag: "div"): IStyledComponent["div", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_animateTransform")
    def withComponent_MIStyledStatics[Props](tag: "animateTransform"): IStyledComponent["animateTransform", OuterProps & Props] = js.native
    @JSName("withComponent")
    @scala.annotation.targetName("withComponent_base")
    def withComponent_MIStyledStatics[Props](tag: "base"): IStyledComponent["base", OuterProps & Props] = js.native
    @JSName("withComponent")
    def withComponent_MIStyledStatics[Props](tag: String): IStyledComponent[String, OuterProps & Props] = js.native
    @JSName("withComponent")
    def withComponent_MIStyledStatics[Target /* <: ExoticComponentWithDisplayName[Any] | (ComponentClass[Any, ComponentState]) | FunctionComponent[Any] */, Props](tag: Target): IStyledComponent[Target, OuterProps & Props] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Interpolation = styled-components.styled-components/native/dist/dist/types.StyleFunction<Props> | styled-components.styled-components/native/dist/dist/types.StyledObject | string | number | styled-components.styled-components/native/dist/dist/types.Keyframes | styled-components.styled-components/native/dist/dist/types.IStyledComponent<any, any> | std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/dist/types.Interpolation
  */
  type Interpolation[Props] = StyleFunction[Props] | StyledObject | String | Double | Keyframes | (IStyledComponent[Any, Any]) | js.Array[Any]
  
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
  
  type KnownWebTarget = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with "a", "abbr", "address" */ Any
  
  type NameGenerator = js.Function1[/* hash */ Double, String]
  
  type NativeTarget = AnyComponent[Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type RuleSet = std.Array<styled-components.styled-components/native/dist/dist/types.Interpolation<Props>>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/dist/types.FlattenerResult
  - styled-components.styled-components/native/dist/dist/types.Interpolation
  - styled-components.styled-components/native/dist/dist/types.RuleSet
  */
  @js.native
  trait RuleSet[Props]
    extends StObject
       with Array[Interpolation[Props]]
  
  type ShouldForwardProp = js.Function3[
    /* prop */ String, 
    /* isValidAttr */ js.Function1[/* prop */ String, Boolean], 
    /* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget], 
    Boolean
  ]
  
  @js.native
  trait Stringifier extends StObject {
    
    def apply(css: String): String = js.native
    def apply(css: String, selector: String): String = js.native
    def apply(css: String, selector: String, prefix: String): String = js.native
    def apply(css: String, selector: String, prefix: String, componentId: String): String = js.native
    def apply(css: String, selector: String, prefix: Unit, componentId: String): String = js.native
    def apply(css: String, selector: Unit, prefix: String): String = js.native
    def apply(css: String, selector: Unit, prefix: String, componentId: String): String = js.native
    def apply(css: String, selector: Unit, prefix: Unit, componentId: String): String = js.native
    
    var hash: String = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StyleFunction = (executionContext : styled-components.styled-components/native/dist/dist/types.ExecutionContext & Props): string | number | styled-components.styled-components/native/dist/dist/types.StyledObject | styled-components.styled-components/native/dist/dist/types.CSSConstructor<Props> | styled-components.styled-components/native/dist/dist/types.StyleFunction<Props>
  }}}
  to avoid circular code involving: 
  - styled-components.styled-components/native/dist/dist/types.Flattener
  - styled-components.styled-components/native/dist/dist/types.FlattenerResult
  - styled-components.styled-components/native/dist/dist/types.IStyledComponentFactory
  - styled-components.styled-components/native/dist/dist/types.IStyledNativeComponentFactory
  - styled-components.styled-components/native/dist/dist/types.Interpolation
  - styled-components.styled-components/native/dist/dist/types.RuleSet
  - styled-components.styled-components/native/dist/dist/types.StyleFunction
  - styled-components.styled-components/native/dist/dist/types.StyledObject
  - styled-components.styled-components/native/dist/dist/types.Styles
  */
  @js.native
  trait StyleFunction[Props] extends StObject {
    
    def apply(executionContext: ExecutionContext & Props): String | Double | StyledObject | CSSConstructor[Props] | StyleFunction[Props] = js.native
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
  
  trait StyledNativeOptions[Props] extends StObject {
    
    var attrs: js.UndefOr[js.Array[Attrs[Props]]] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var shouldForwardProp: js.UndefOr[ShouldForwardProp] = js.undefined
  }
  object StyledNativeOptions {
    
    inline def apply[Props](): StyledNativeOptions[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledNativeOptions[Props]]
    }
    
    extension [Self <: StyledNativeOptions[?], Props](x: Self & StyledNativeOptions[Props]) {
      
      inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setShouldForwardProp(
        value: (/* prop */ String, /* isValidAttr */ js.Function1[/* prop */ String, Boolean], /* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget]) => Boolean
      ): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction3(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    }
  }
  
  type StyledObject = StringDictionary[(Record[String, Any]) | String | Double | StyleFunction[ExecutionContext]]
  
  trait StyledOptions[Props] extends StObject {
    
    var attrs: js.UndefOr[js.Array[Attrs[Props]]] = js.undefined
    
    var componentId: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var parentComponentId: js.UndefOr[String] = js.undefined
    
    var shouldForwardProp: js.UndefOr[ShouldForwardProp] = js.undefined
  }
  object StyledOptions {
    
    inline def apply[Props](): StyledOptions[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledOptions[Props]]
    }
    
    extension [Self <: StyledOptions[?], Props](x: Self & StyledOptions[Props]) {
      
      inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setParentComponentId(value: String): Self = StObject.set(x, "parentComponentId", value.asInstanceOf[js.Any])
      
      inline def setParentComponentIdUndefined: Self = StObject.set(x, "parentComponentId", js.undefined)
      
      inline def setShouldForwardProp(
        value: (/* prop */ String, /* isValidAttr */ js.Function1[/* prop */ String, Boolean], /* elementToBeCreated */ js.UndefOr[WebTarget | NativeTarget]) => Boolean
      ): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction3(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    }
  }
  
  type StyledTarget = WebTarget | NativeTarget
  
  type Styles[Props] = TemplateStringsArray | StyledObject | StyleFunction[Props]
  
  type WebTarget = String | KnownWebTarget
}
