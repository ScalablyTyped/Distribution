package typings.wonderJs

import typings.wonderJs.engineMaterialMod.EngineMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object standardBasicMaterialMod {
  
  @JSImport("wonder.js/dist/es2015/material/StandardBasicMaterial", "StandardBasicMaterial")
  @js.native
  abstract class StandardBasicMaterial () extends EngineMaterial {
    
    /* protected */ def addExtendShaderLib(): Unit = js.native
    
    var alphaTest: Double = js.native
    
    var opacity: Double = js.native
  }
}
