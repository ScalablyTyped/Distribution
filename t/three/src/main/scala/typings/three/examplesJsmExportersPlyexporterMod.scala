package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmExportersPlyexporterMod {
  
  @JSImport("three/examples/jsm/exporters/PLYExporter", "PLYExporter")
  @js.native
  open class PLYExporter () extends StObject {
    
    def parse(
      `object`: Object3D[Event],
      onDone: js.Function1[/* res */ String, Unit],
      options: PLYExporterOptions
    ): String | Null = js.native
  }
  
  trait PLYExporterOptions extends StObject {
    
    var binary: js.UndefOr[Boolean] = js.undefined
    
    var excludeAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var littleEndian: js.UndefOr[Boolean] = js.undefined
  }
  object PLYExporterOptions {
    
    inline def apply(): PLYExporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PLYExporterOptions]
    }
    
    extension [Self <: PLYExporterOptions](x: Self) {
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setExcludeAttributes(value: js.Array[String]): Self = StObject.set(x, "excludeAttributes", value.asInstanceOf[js.Any])
      
      inline def setExcludeAttributesUndefined: Self = StObject.set(x, "excludeAttributes", js.undefined)
      
      inline def setExcludeAttributesVarargs(value: String*): Self = StObject.set(x, "excludeAttributes", js.Array(value*))
      
      inline def setLittleEndian(value: Boolean): Self = StObject.set(x, "littleEndian", value.asInstanceOf[js.Any])
      
      inline def setLittleEndianUndefined: Self = StObject.set(x, "littleEndian", js.undefined)
    }
  }
}
