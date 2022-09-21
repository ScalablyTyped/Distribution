package typings.webpack.mod

import typings.webpack.anon.ReadonlyrenderManifesttap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkTemplate extends StObject {
  
  var hooks: ReadonlyrenderManifesttap
  
  val outputOptions: Output
}
object ChunkTemplate {
  
  inline def apply(hooks: ReadonlyrenderManifesttap, outputOptions: Output): ChunkTemplate = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], outputOptions = outputOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkTemplate]
  }
  
  extension [Self <: ChunkTemplate](x: Self) {
    
    inline def setHooks(value: ReadonlyrenderManifesttap): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setOutputOptions(value: Output): Self = StObject.set(x, "outputOptions", value.asInstanceOf[js.Any])
  }
}
