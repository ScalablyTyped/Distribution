package typings.wonderJs

import typings.wonderJs.standardBasicMaterialMod.StandardBasicMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicMaterialMod {
  
  @JSImport("wonder.js/dist/es2015/material/BasicMaterial", "BasicMaterial")
  @js.native
  class BasicMaterial () extends StandardBasicMaterial
  /* static members */
  object BasicMaterial {
    
    @JSImport("wonder.js/dist/es2015/material/BasicMaterial", "BasicMaterial")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): BasicMaterial = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BasicMaterial]
  }
}
