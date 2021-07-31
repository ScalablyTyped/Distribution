package typings.uiBox

import typings.uiBox.typesEnhancersMod.PropEnhancers
import typings.uiBox.typesEnhancersMod.PropTypesMapping
import typings.uiBox.typesEnhancersMod.PropValidators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object borderRadiusMod {
  
  object propAliases {
    
    @JSImport("ui-box/dist/src/enhancers/border-radius", "propAliases")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ui-box/dist/src/enhancers/border-radius", "propAliases.borderRadius")
    @js.native
    def borderRadius: js.Array[String] = js.native
    @scala.inline
    def borderRadius_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ui-box/dist/src/enhancers/border-radius", "propEnhancers")
  @js.native
  val propEnhancers: PropEnhancers = js.native
  
  @JSImport("ui-box/dist/src/enhancers/border-radius", "propTypes")
  @js.native
  val propTypes: PropTypesMapping = js.native
  
  @JSImport("ui-box/dist/src/enhancers/border-radius", "propValidators")
  @js.native
  val propValidators: PropValidators = js.native
}
