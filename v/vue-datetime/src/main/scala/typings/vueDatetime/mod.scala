package typings.vueDatetime

import org.scalablytyped.runtime.Shortcut
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-datetime", JSImport.Default)
  @js.native
  val default: VueDateTimeConstructor = js.native
  
  @JSImport("vue-datetime", "Datetime")
  @js.native
  val Datetime: VueDateTimeConstructor = js.native
  
  @JSImport("vue-datetime", "DatetimePopup")
  @js.native
  val DatetimePopup: VueDateTimeConstructor = js.native
  
  @js.native
  trait VueDateTimeConstructor
    extends StObject
       with VueConstructor[Vue] {
    
    def data(): VueDateTimeData = js.native
    
    var methods: js.Any = js.native
    
    var props: VueDateTimeProps = js.native
  }
  
  trait VueDateTimeData extends StObject {
    
    var value: String
  }
  object VueDateTimeData {
    
    inline def apply(value: String): VueDateTimeData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueDateTimeData]
    }
    
    extension [Self <: VueDateTimeData](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueDateTimeProps extends StObject {
    
    var inputClass: js.Any
    
    var inputStyle: js.Any
  }
  object VueDateTimeProps {
    
    inline def apply(inputClass: js.Any, inputStyle: js.Any): VueDateTimeProps = {
      val __obj = js.Dynamic.literal(inputClass = inputClass.asInstanceOf[js.Any], inputStyle = inputStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueDateTimeProps]
    }
    
    extension [Self <: VueDateTimeProps](x: Self) {
      
      inline def setInputClass(value: js.Any): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      inline def setInputStyle(value: js.Any): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = VueDateTimeConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueDateTimeConstructor = default
}
