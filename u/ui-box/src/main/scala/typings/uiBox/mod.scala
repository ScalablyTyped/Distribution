package typings.uiBox

import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.uiBox.anon.Cache
import typings.uiBox.distSrcCacheMod.CacheEntry
import typings.uiBox.distSrcTypesBoxTypesMod.BoxProps
import typings.uiBox.distSrcTypesEnhancersMod.EnhancerProps
import typings.uiBox.distSrcTypesEnhancersMod.PropAliases
import typings.uiBox.distSrcTypesEnhancersMod.PropEnhancers
import typings.uiBox.distSrcTypesEnhancersMod.PropTypesMapping
import typings.uiBox.distSrcTypesEnhancersMod.PropValidators
import typings.uiBox.distSrcTypesKeyframesMod.KeyframesTimeline
import typings.uiBox.distSrcUtilsSafeHrefMod.SafeHrefConfigObj
import typings.uiBox.distSrcUtilsSplitBoxPropsMod.SplitBoxProps
import typings.uiBox.distSrcUtilsSplitPropsMod.Dictionary
import typings.uiBox.distSrcUtilsSplitPropsMod.SplitProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ui-box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[E /* <: ElementType[Any] */](props: BoxProps[E]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object background {
    
    @JSImport("ui-box", "background.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "background.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "background.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "background.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object borderRadius {
    
    object propAliases {
      
      @JSImport("ui-box", "borderRadius.propAliases")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ui-box", "borderRadius.propAliases.borderRadius")
      @js.native
      def borderRadius: js.Array[String] = js.native
      inline def borderRadius_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("ui-box", "borderRadius.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "borderRadius.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "borderRadius.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object borders {
    
    object propAliases {
      
      @JSImport("ui-box", "borders.propAliases")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("ui-box", "borders.propAliases.border")
      @js.native
      def border: js.Array[String] = js.native
      
      @JSImport("ui-box", "borders.propAliases.borderColor")
      @js.native
      def borderColor: js.Array[String] = js.native
      inline def borderColor_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
      
      @JSImport("ui-box", "borders.propAliases.borderStyle")
      @js.native
      def borderStyle: js.Array[String] = js.native
      inline def borderStyle_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(x.asInstanceOf[js.Any])
      
      @JSImport("ui-box", "borders.propAliases.borderWidth")
      @js.native
      def borderWidth: js.Array[String] = js.native
      inline def borderWidth_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
      
      inline def border_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("ui-box", "borders.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "borders.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "borders.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object boxShadow {
    
    @JSImport("ui-box", "boxShadow.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "boxShadow.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "boxShadow.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "boxShadow.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  inline def clearStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStyles")().asInstanceOf[Unit]
  
  inline def configureSafeHref(configObject: SafeHrefConfigObj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureSafeHref")(configObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object dimensions {
    
    @JSImport("ui-box", "dimensions.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "dimensions.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "dimensions.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "dimensions.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  inline def extractStyles(): Cache = ^.asInstanceOf[js.Dynamic].applyDynamic("extractStyles")().asInstanceOf[Cache]
  
  object flex {
    
    @JSImport("ui-box", "flex.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "flex.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "flex.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "flex.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSImport("ui-box", "hydrate")
  @js.native
  val hydrate: js.Function1[/* newEntries */ js.Array[CacheEntry], Unit] = js.native
  
  object interaction {
    
    @JSImport("ui-box", "interaction.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "interaction.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "interaction.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "interaction.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  inline def keyframes(friendlyName: String, timeline: KeyframesTimeline): String = (^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(friendlyName.asInstanceOf[js.Any], timeline.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object layout {
    
    @JSImport("ui-box", "layout.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "layout.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "layout.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "layout.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object list {
    
    @JSImport("ui-box", "list.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "list.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "list.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "list.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object opacity {
    
    @JSImport("ui-box", "opacity.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "opacity.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "opacity.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "opacity.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object overflow {
    
    @JSImport("ui-box", "overflow.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "overflow.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "overflow.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "overflow.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object position {
    
    @JSImport("ui-box", "position.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "position.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "position.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "position.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSImport("ui-box", "propAliases")
  @js.native
  val propAliases: PropAliases = js.native
  
  @JSImport("ui-box", "propEnhancers")
  @js.native
  val propEnhancers: PropEnhancers = js.native
  
  @JSImport("ui-box", "propNames")
  @js.native
  val propNames: js.Array[String] = js.native
  
  @JSImport("ui-box", "propTypes")
  @js.native
  val propTypes: PropTypesMapping = js.native
  
  inline def setClassNamePrefix(prefix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClassNamePrefix")(prefix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object spacing {
    
    @JSImport("ui-box", "spacing.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "spacing.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "spacing.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "spacing.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  inline def splitBoxProps[P /* <: EnhancerProps */](props: P): SplitBoxProps[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBoxProps")(props.asInstanceOf[js.Any]).asInstanceOf[SplitBoxProps[P]]
  
  inline def splitProps[P /* <: Dictionary[Any] */, K /* <: /* keyof P */ String */](props: P, keys: js.Array[K]): SplitProps[P, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitProps")(props.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[SplitProps[P, K]]
  
  object text {
    
    @JSImport("ui-box", "text.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "text.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "text.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "text.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
  
  object transform {
    
    @JSImport("ui-box", "transform.propAliases")
    @js.native
    val propAliases: PropAliases = js.native
    
    @JSImport("ui-box", "transform.propEnhancers")
    @js.native
    val propEnhancers: PropEnhancers = js.native
    
    @JSImport("ui-box", "transform.propTypes")
    @js.native
    val propTypes: PropTypesMapping = js.native
    
    @JSImport("ui-box", "transform.propValidators")
    @js.native
    val propValidators: PropValidators = js.native
  }
}
