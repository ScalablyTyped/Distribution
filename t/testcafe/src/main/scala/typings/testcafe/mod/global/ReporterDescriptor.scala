package typings.testcafe.mod.global

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReporterDescriptor extends StObject {
  
  var name: String
  
  var output: js.UndefOr[String | WritableStream] = js.undefined
}
object ReporterDescriptor {
  
  inline def apply(name: String): ReporterDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterDescriptor]
  }
  
  extension [Self <: ReporterDescriptor](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String | WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
