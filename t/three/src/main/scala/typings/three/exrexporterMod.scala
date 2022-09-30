package typings.three

import typings.three.srcConstantsMod.TextureDataType
import typings.three.threeInts.`0`
import typings.three.threeInts.`2`
import typings.three.threeInts.`3`
import typings.three.threeMod.WebGLRenderTarget
import typings.three.threeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exrexporterMod {
  
  @JSImport("three/examples/jsm/exporters/EXRExporter", "EXRExporter")
  @js.native
  open class EXRExporter () extends StObject {
    
    def parse(renderer: WebGLRenderer, renderTarget: WebGLRenderTarget): js.typedarray.Uint8Array = js.native
    def parse(renderer: WebGLRenderer, renderTarget: WebGLRenderTarget, options: EXRExporterParseOptions): js.typedarray.Uint8Array = js.native
  }
  
  @JSImport("three/examples/jsm/exporters/EXRExporter", "NO_COMPRESSION")
  @js.native
  val NO_COMPRESSION: `0` = js.native
  
  @JSImport("three/examples/jsm/exporters/EXRExporter", "ZIPS_COMPRESSION")
  @js.native
  val ZIPS_COMPRESSION: `2` = js.native
  
  @JSImport("three/examples/jsm/exporters/EXRExporter", "ZIP_COMPRESSION")
  @js.native
  val ZIP_COMPRESSION: `3` = js.native
  
  trait EXRExporterParseOptions extends StObject {
    
    var compression: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[TextureDataType] = js.undefined
  }
  object EXRExporterParseOptions {
    
    inline def apply(): EXRExporterParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EXRExporterParseOptions]
    }
    
    extension [Self <: EXRExporterParseOptions](x: Self) {
      
      inline def setCompression(value: Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setType(value: TextureDataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
