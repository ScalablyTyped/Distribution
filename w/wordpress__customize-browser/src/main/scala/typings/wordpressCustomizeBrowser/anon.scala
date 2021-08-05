package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.previewerMod.Previewer
import typings.wordpressCustomizeBrowser.settingMod.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Choice extends StObject {
    
    var choice: js.Any
    
    var header: js.Any
  }
  object Choice {
    
    inline def apply(choice: js.Any, header: js.Any): Choice = {
      val __obj = js.Dynamic.literal(choice = choice.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    extension [Self <: Choice](x: Self) {
      
      inline def setChoice(value: js.Any): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default extends StObject {
    
    var default: js.UndefOr[String | Setting[js.Any]] = js.undefined
  }
  object Default {
    
    inline def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: String | Setting[js.Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@wordpress/customize-browser.@wordpress/customize-browser/Setting.Setting_Options> */
  trait PartialSettingOptions extends StObject {
    
    var dirty: js.UndefOr[Boolean] = js.undefined
    
    var previewer: js.UndefOr[Previewer[String]] = js.undefined
    
    var transport: js.UndefOr[String] = js.undefined
  }
  object PartialSettingOptions {
    
    inline def apply(): PartialSettingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSettingOptions]
    }
    
    extension [Self <: PartialSettingOptions](x: Self) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      inline def setPreviewer(value: Previewer[String]): Self = StObject.set(x, "previewer", value.asInstanceOf[js.Any])
      
      inline def setPreviewerUndefined: Self = StObject.set(x, "previewer", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
