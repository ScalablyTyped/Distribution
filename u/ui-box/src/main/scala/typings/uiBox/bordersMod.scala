package typings.uiBox

import typings.uiBox.typesEnhancersMod.PropEnhancers
import typings.uiBox.typesEnhancersMod.PropTypesMapping
import typings.uiBox.typesEnhancersMod.PropValidators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bordersMod {
  
  object propAliases {
    
    @JSImport("ui-box/dist/src/enhancers/borders", "propAliases")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ui-box/dist/src/enhancers/borders", "propAliases.border")
    @js.native
    def border: js.Array[String] = js.native
    
    @JSImport("ui-box/dist/src/enhancers/borders", "propAliases.borderColor")
    @js.native
    def borderColor: js.Array[String] = js.native
    @scala.inline
    def borderColor_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("ui-box/dist/src/enhancers/borders", "propAliases.borderStyle")
    @js.native
    def borderStyle: js.Array[String] = js.native
    @scala.inline
    def borderStyle_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("ui-box/dist/src/enhancers/borders", "propAliases.borderWidth")
    @js.native
    def borderWidth: js.Array[String] = js.native
    @scala.inline
    def borderWidth_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def border_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ui-box/dist/src/enhancers/borders", "propEnhancers")
  @js.native
  val propEnhancers: PropEnhancers = js.native
  
  @JSImport("ui-box/dist/src/enhancers/borders", "propTypes")
  @js.native
  val propTypes: PropTypesMapping = js.native
  
  @JSImport("ui-box/dist/src/enhancers/borders", "propValidators")
  @js.native
  val propValidators: PropValidators = js.native
}
