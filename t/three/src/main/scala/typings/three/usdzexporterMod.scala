package typings.three

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usdzexporterMod {
  
  @JSImport("three/examples/jsm/exporters/USDZExporter", "USDZExporter")
  @js.native
  open class USDZExporter () extends StObject {
    
    def parse(scene: Object3D[Event]): js.Promise[js.typedarray.Uint8Array] = js.native
  }
}
