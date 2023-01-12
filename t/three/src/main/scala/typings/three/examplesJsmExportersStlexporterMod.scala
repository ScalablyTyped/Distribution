package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmExportersStlexporterMod {
  
  @JSImport("three/examples/jsm/exporters/STLExporter", "STLExporter")
  @js.native
  open class STLExporter () extends StObject {
    
    def parse(scene: Object3D[Event]): String = js.native
    def parse(scene: Object3D[Event], options: STLExporterOptions): String = js.native
  }
  
  trait STLExporterOptions extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
  }
  object STLExporterOptions {
    
    inline def apply(): STLExporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[STLExporterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: STLExporterOptions] (val x: Self) extends AnyVal {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    }
  }
}
