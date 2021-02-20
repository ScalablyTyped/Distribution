package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.previewerMod.Previewer
import typings.wordpressCustomizeBrowser.settingMod.Setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Choice extends StObject {
    
    var choice: js.Any = js.native
    
    var header: js.Any = js.native
  }
  object Choice {
    
    @scala.inline
    def apply(choice: js.Any, header: js.Any): Choice = {
      val __obj = js.Dynamic.literal(choice = choice.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    @scala.inline
    implicit class ChoiceMutableBuilder[Self <: Choice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoice(value: js.Any): Self = StObject.set(x, "choice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Default extends StObject {
    
    var default: js.UndefOr[String | Setting[_]] = js.native
  }
  object Default {
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String | Setting[_]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@wordpress/customize-browser.@wordpress/customize-browser/Setting.Setting_Options> */
  @js.native
  trait PartialSettingOptions extends StObject {
    
    var dirty: js.UndefOr[Boolean] = js.native
    
    var previewer: js.UndefOr[Previewer[String]] = js.native
    
    var transport: js.UndefOr[String] = js.native
  }
  object PartialSettingOptions {
    
    @scala.inline
    def apply(): PartialSettingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSettingOptions]
    }
    
    @scala.inline
    implicit class PartialSettingOptionsMutableBuilder[Self <: PartialSettingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
      
      @scala.inline
      def setPreviewer(value: Previewer[String]): Self = StObject.set(x, "previewer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewerUndefined: Self = StObject.set(x, "previewer", js.undefined)
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
}
