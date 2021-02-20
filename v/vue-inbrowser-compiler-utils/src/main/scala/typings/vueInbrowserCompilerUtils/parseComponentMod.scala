package typings.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseComponentMod {
  
  @JSImport("vue-inbrowser-compiler-utils/lib/parseComponent", JSImport.Default)
  @js.native
  def default(code: String): VsgSFCDescriptor = js.native
  
  @js.native
  trait VsgSFCDescriptor extends VsgSFCDescriptorSimple {
    
    var styles: js.UndefOr[js.Array[String]] = js.native
  }
  object VsgSFCDescriptor {
    
    @scala.inline
    def apply(): VsgSFCDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VsgSFCDescriptor]
    }
    
    @scala.inline
    implicit class VsgSFCDescriptorMutableBuilder[Self <: VsgSFCDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait VsgSFCDescriptorSimple extends StObject {
    
    var script: js.UndefOr[String] = js.native
    
    var template: js.UndefOr[String] = js.native
  }
  object VsgSFCDescriptorSimple {
    
    @scala.inline
    def apply(): VsgSFCDescriptorSimple = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VsgSFCDescriptorSimple]
    }
    
    @scala.inline
    implicit class VsgSFCDescriptorSimpleMutableBuilder[Self <: VsgSFCDescriptorSimple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
