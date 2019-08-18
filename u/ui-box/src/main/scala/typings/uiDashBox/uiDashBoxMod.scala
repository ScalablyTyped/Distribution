package typings.uiDashBox

import typings.uiDashBox.distCacheMod.CacheEntry
import typings.uiDashBox.distTypesBoxDashTypesMod.BoxComponent
import typings.uiDashBox.distTypesEnhancersMod.EnhancerProps
import typings.uiDashBox.distTypesEnhancersMod.PropAliases
import typings.uiDashBox.distTypesEnhancersMod.PropEnhancers
import typings.uiDashBox.distTypesEnhancersMod.PropTypesMapping
import typings.uiDashBox.distTypesEnhancersMod.PropValidators
import typings.uiDashBox.distUtilsSplitDashBoxDashPropsMod.SplitBoxProps
import typings.uiDashBox.distUtilsSplitDashPropsMod.Dictionary
import typings.uiDashBox.distUtilsSplitDashPropsMod.SplitProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box", JSImport.Namespace)
@js.native
object uiDashBoxMod extends js.Object {
  val default: BoxComponent = js.native
  val hydrate: js.Function1[/* newEntries */ js.Array[CacheEntry], Unit] = js.native
  val propAliases: PropAliases = js.native
  val propEnhancers: PropEnhancers = js.native
  val propNames: js.Array[String] = js.native
  val propTypes: PropTypesMapping = js.native
  def clearStyles(): Unit = js.native
  def extractStyles(): Anon_Cache = js.native
  def splitBoxProps[P /* <: EnhancerProps */](props: P): SplitBoxProps[P] = js.native
  def splitProps[P /* <: Dictionary[_] */, K /* <: String */](props: P, keys: js.Array[K]): SplitProps[P, K] = js.native
  @JSName("background")
  @js.native
  object backgroundNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("borderRadius")
  @js.native
  object borderRadiusNs extends js.Object {
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
    @js.native
    object propAliases extends js.Object {
      var borderRadius: js.Array[String] = js.native
    }
    
  }
  
  @JSName("borders")
  @js.native
  object bordersNs extends js.Object {
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
    @js.native
    object propAliases extends js.Object {
      var border: js.Array[String] = js.native
      var borderColor: js.Array[String] = js.native
      var borderStyle: js.Array[String] = js.native
      var borderWidth: js.Array[String] = js.native
    }
    
  }
  
  @JSName("boxShadow")
  @js.native
  object boxShadowNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("dimensions")
  @js.native
  object dimensionsNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("flex")
  @js.native
  object flexNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("interaction")
  @js.native
  object interactionNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("layout")
  @js.native
  object layoutNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("list")
  @js.native
  object listNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("opacity")
  @js.native
  object opacityNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("overflow")
  @js.native
  object overflowNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("position")
  @js.native
  object positionNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("spacing")
  @js.native
  object spacingNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("text")
  @js.native
  object textNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @JSName("transform")
  @js.native
  object transformNs extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
}

