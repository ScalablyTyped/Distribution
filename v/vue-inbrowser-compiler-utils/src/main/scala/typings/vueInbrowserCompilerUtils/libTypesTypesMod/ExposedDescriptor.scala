package typings.vueInbrowserCompilerUtils.libTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExposedDescriptor
  extends StObject
     with DocBlockTags
     with Descriptor {
  
  var name: String
}
object ExposedDescriptor {
  
  inline def apply(name: String): ExposedDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExposedDescriptor]
  }
  
  extension [Self <: ExposedDescriptor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
