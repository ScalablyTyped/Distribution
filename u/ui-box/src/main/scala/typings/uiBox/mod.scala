package typings.uiBox

import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.uiBox.anon.Cache
import typings.uiBox.boxTypesMod.BoxProps
import typings.uiBox.cacheMod.CacheEntry
import typings.uiBox.safeHrefMod.SafeHrefConfigObj
import typings.uiBox.splitBoxPropsMod.SplitBoxProps
import typings.uiBox.splitPropsMod.Dictionary
import typings.uiBox.splitPropsMod.SplitProps
import typings.uiBox.typesEnhancersMod.EnhancerProps
import typings.uiBox.typesEnhancersMod.PropAliases
import typings.uiBox.typesEnhancersMod.PropEnhancers
import typings.uiBox.typesEnhancersMod.PropTypesMapping
import typings.uiBox.typesEnhancersMod.PropValidators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ui-box", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clearStyles(): Unit = js.native
  
  def configureSafeHref(configObject: SafeHrefConfigObj): Unit = js.native
  
  def default[E /* <: ElementType[_] */](props: BoxProps[E]): Element = js.native
  
  def extractStyles(): Cache = js.native
  
  val hydrate: js.Function1[/* newEntries */ js.Array[CacheEntry], Unit] = js.native
  
  val propAliases: PropAliases = js.native
  
  val propEnhancers: PropEnhancers = js.native
  
  val propNames: js.Array[String] = js.native
  
  val propTypes: PropTypesMapping = js.native
  
  def setClassNamePrefix(prefix: String): Unit = js.native
  
  def splitBoxProps[P /* <: EnhancerProps */](props: P): SplitBoxProps[P] = js.native
  
  def splitProps[P /* <: Dictionary[_] */, K /* <: /* keyof P */ String */](props: P, keys: js.Array[K]): SplitProps[P, K] = js.native
  
  @js.native
  object background extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object borderRadius extends js.Object {
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
    
    @js.native
    object propAliases extends js.Object {
      
      var borderRadius: js.Array[String] = js.native
    }
  }
  
  @js.native
  object borders extends js.Object {
    
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
  
  @js.native
  object boxShadow extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object dimensions extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object flex extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object interaction extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object layout extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object list extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object opacity extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object overflow extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object position extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object spacing extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object text extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object transform extends js.Object {
    
    val propAliases: PropAliases = js.native
    
    val propEnhancers: PropEnhancers = js.native
    
    val propTypes: PropTypesMapping = js.native
    
    val propValidators: PropValidators = js.native
  }
}
