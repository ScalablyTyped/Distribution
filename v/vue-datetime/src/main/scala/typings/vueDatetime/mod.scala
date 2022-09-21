package typings.vueDatetime

import org.scalablytyped.runtime.Shortcut
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
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait VueDateTimeConstructor extends StObject {
    
    def data(): VueDateTimeData
    
    var methods: Any
    
    var props: VueDateTimeProps
  }
  object VueDateTimeConstructor {
    
    inline def apply(data: () => VueDateTimeData, methods: Any, props: VueDateTimeProps): VueDateTimeConstructor = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueDateTimeConstructor]
    }
    
    extension [Self <: VueDateTimeConstructor](x: Self) {
      
      inline def setData(value: () => VueDateTimeData): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setMethods(value: Any): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VueDateTimeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
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
    
    var inputClass: Any
    
    var inputStyle: Any
  }
  object VueDateTimeProps {
    
    inline def apply(inputClass: Any, inputStyle: Any): VueDateTimeProps = {
      val __obj = js.Dynamic.literal(inputClass = inputClass.asInstanceOf[js.Any], inputStyle = inputStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueDateTimeProps]
    }
    
    extension [Self <: VueDateTimeProps](x: Self) {
      
      inline def setInputClass(value: Any): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      inline def setInputStyle(value: Any): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = VueDateTimeConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueDateTimeConstructor = default
}
