package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmExportersColladaExporterMod {
  
  @JSImport("three/examples/jsm/exporters/ColladaExporter", "ColladaExporter")
  @js.native
  open class ColladaExporter () extends StObject {
    
    def parse(
      `object`: Object3D[Event],
      onDone: js.Function1[/* res */ ColladaExporterResult, Unit],
      options: ColladaExporterOptions
    ): ColladaExporterResult | Null = js.native
  }
  
  trait ColladaExporterOptions extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var textureDirectory: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ColladaExporterOptions {
    
    inline def apply(): ColladaExporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColladaExporterOptions]
    }
    
    extension [Self <: ColladaExporterOptions](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setTextureDirectory(value: String): Self = StObject.set(x, "textureDirectory", value.asInstanceOf[js.Any])
      
      inline def setTextureDirectoryUndefined: Self = StObject.set(x, "textureDirectory", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ColladaExporterResult extends StObject {
    
    var data: String
    
    var textures: js.Array[js.Object]
  }
  object ColladaExporterResult {
    
    inline def apply(data: String, textures: js.Array[js.Object]): ColladaExporterResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColladaExporterResult]
    }
    
    extension [Self <: ColladaExporterResult](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTextures(value: js.Array[js.Object]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
      
      inline def setTexturesVarargs(value: js.Object*): Self = StObject.set(x, "textures", js.Array(value*))
    }
  }
}
