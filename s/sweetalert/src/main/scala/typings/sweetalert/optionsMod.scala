package typings.sweetalert

import typings.sweetalert.anon.PartialSwalOptions
import typings.sweetalert.optionsButtonsMod.ButtonList
import typings.sweetalert.optionsContentMod.ContentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("sweetalert/typings/modules/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOpts(params: (String | PartialSwalOptions)*): SwalOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getOpts")(params.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SwalOptions]
  
  inline def setDefaults(opts: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait SwalOptions extends StObject {
    
    var buttons: ButtonList | (js.Array[String | Boolean])
    
    var className: String
    
    var closeOnClickOutside: Boolean
    
    var closeOnEsc: Boolean
    
    var content: ContentOptions
    
    var dangerMode: Boolean
    
    var icon: String
    
    var text: String
    
    var timer: Double
    
    var title: String
  }
  object SwalOptions {
    
    inline def apply(
      buttons: ButtonList | (js.Array[String | Boolean]),
      className: String,
      closeOnClickOutside: Boolean,
      closeOnEsc: Boolean,
      content: ContentOptions,
      dangerMode: Boolean,
      icon: String,
      text: String,
      timer: Double,
      title: String
    ): SwalOptions = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeOnClickOutside = closeOnClickOutside.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dangerMode = dangerMode.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwalOptions]
    }
    
    extension [Self <: SwalOptions](x: Self) {
      
      inline def setButtons(value: ButtonList | (js.Array[String | Boolean])): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsVarargs(value: (String | Boolean)*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "closeOnClickOutside", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setContent(value: ContentOptions): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDangerMode(value: Boolean): Self = StObject.set(x, "dangerMode", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
