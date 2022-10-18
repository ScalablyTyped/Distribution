package typings.vegaTypings

import typings.vegaTypings.typesSpecAutosizeMod.AutoSize
import typings.vegaTypings.typesSpecColorMod.Color
import typings.vegaTypings.typesSpecConfigMod.Config
import typings.vegaTypings.typesSpecEncodeMod.Encodable
import typings.vegaTypings.typesSpecEncodeMod.EncodeEntry
import typings.vegaTypings.typesSpecPaddingMod.Padding
import typings.vegaTypings.typesSpecScopeMod.Scope
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecMod {
  
  trait Spec
    extends StObject
       with Scope
       with Encodable[EncodeEntry] {
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    var autosize: js.UndefOr[AutoSize | SignalRef] = js.undefined
    
    var background: js.UndefOr[Color | SignalRef] = js.undefined
    
    var config: js.UndefOr[Config] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double | SignalRef] = js.undefined
    
    var padding: js.UndefOr[Padding | SignalRef] = js.undefined
    
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var width: js.UndefOr[Double | SignalRef] = js.undefined
  }
  object Spec {
    
    inline def apply(): Spec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Spec]
    }
    
    extension [Self <: Spec](x: Self) {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAutosize(value: AutoSize | SignalRef): Self = StObject.set(x, "autosize", value.asInstanceOf[js.Any])
      
      inline def setAutosizeUndefined: Self = StObject.set(x, "autosize", js.undefined)
      
      inline def setBackground(value: Color | SignalRef): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setConfig(value: Config): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeight(value: Double | SignalRef): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPadding(value: Padding | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setWidth(value: Double | SignalRef): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
