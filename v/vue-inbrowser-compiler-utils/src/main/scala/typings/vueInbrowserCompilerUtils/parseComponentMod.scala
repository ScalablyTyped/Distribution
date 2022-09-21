package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseComponentMod {
  
  @JSImport("vue-inbrowser-compiler-utils/lib/types/parseComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(code: String): VsgSFCDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any]).asInstanceOf[VsgSFCDescriptor]
  
  trait VsgSFCDescriptor
    extends StObject
       with VsgSFCDescriptorSimple {
    
    var styles: js.UndefOr[js.Array[String]] = js.undefined
  }
  object VsgSFCDescriptor {
    
    inline def apply(): VsgSFCDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VsgSFCDescriptor]
    }
    
    extension [Self <: VsgSFCDescriptor](x: Self) {
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
  
  trait VsgSFCDescriptorSimple extends StObject {
    
    var script: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object VsgSFCDescriptorSimple {
    
    inline def apply(): VsgSFCDescriptorSimple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VsgSFCDescriptorSimple]
    }
    
    extension [Self <: VsgSFCDescriptorSimple](x: Self) {
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
