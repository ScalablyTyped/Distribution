package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.anon.PartialSettingOptions
import typings.wordpressCustomizeBrowser.controlMod.Control
import typings.wordpressCustomizeBrowser.previewerMod.Previewer
import typings.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingMod {
  
  @JSImport("@wordpress/customize-browser/Setting", "Setting")
  @js.native
  class Setting[T] protected () extends Value[T] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    var defaults: SettingOptions = js.native
    
    def findControls(): js.Array[Control] = js.native
    
    def initialize(id: String, value: js.Any): Unit = js.native
    def initialize(id: String, value: js.Any, options: PartialSettingOptions): Unit = js.native
    def initialize(id: String, value: Unit, options: PartialSettingOptions): Unit = js.native
    def initialize(id: Unit, value: js.Any): Unit = js.native
    def initialize(id: Unit, value: js.Any, options: PartialSettingOptions): Unit = js.native
    def initialize(id: Unit, value: Unit, options: PartialSettingOptions): Unit = js.native
    
    def preview(): Unit = js.native
  }
  
  trait SettingOptions extends StObject {
    
    var dirty: Boolean
    
    var previewer: Previewer[String]
    
    var transport: String
  }
  object SettingOptions {
    
    @scala.inline
    def apply(dirty: Boolean, previewer: Previewer[String], transport: String): SettingOptions = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], previewer = previewer.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[SettingOptions]
    }
    
    @scala.inline
    implicit class SettingOptionsMutableBuilder[Self <: SettingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewer(value: Previewer[String]): Self = StObject.set(x, "previewer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
