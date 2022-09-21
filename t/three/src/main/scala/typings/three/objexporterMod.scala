package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objexporterMod {
  
  @JSImport("three/examples/jsm/exporters/OBJExporter", "OBJExporter")
  @js.native
  open class OBJExporter () extends StObject {
    
    def parse(`object`: Object3D[Event]): String = js.native
  }
}
