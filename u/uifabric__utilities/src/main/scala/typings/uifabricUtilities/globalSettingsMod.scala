package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalSettingsMod {
  
  @JSImport("@uifabric/utilities/lib/GlobalSettings", "GlobalSettings")
  @js.native
  class GlobalSettings () extends StObject
  /* static members */
  object GlobalSettings {
    
    @JSImport("@uifabric/utilities/lib/GlobalSettings", "GlobalSettings.addChangeListener")
    @js.native
    def addChangeListener(cb: IChangeEventCallback): Unit = js.native
    
    @JSImport("@uifabric/utilities/lib/GlobalSettings", "GlobalSettings.getValue")
    @js.native
    def getValue[T](key: String): T = js.native
    @JSImport("@uifabric/utilities/lib/GlobalSettings", "GlobalSettings.getValue")
    @js.native
    def getValue[T](key: String, defaultValue: T): T = js.native
    @JSImport("@uifabric/utilities/lib/GlobalSettings", "GlobalSettings.getValue")
    @js.native
    def getValue[T](key: String, defaultValue: js.Function0[T]): T = js.native
    
    @JSImport("@uifabric/utilities/lib/GlobalSettings", "GlobalSettings.removeChangeListener")
    @js.native
    def removeChangeListener(cb: IChangeEventCallback): Unit = js.native
    
    @JSImport("@uifabric/utilities/lib/GlobalSettings", "GlobalSettings.setValue")
    @js.native
    def setValue[T](key: String, value: T): T = js.native
  }
  
  @js.native
  trait IChangeDescription extends StObject {
    
    var key: String = js.native
    
    var oldValue: js.Any = js.native
    
    var value: js.Any = js.native
  }
  object IChangeDescription {
    
    @scala.inline
    def apply(key: String, oldValue: js.Any, value: js.Any): IChangeDescription = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChangeDescription]
    }
    
    @scala.inline
    implicit class IChangeDescriptionMutableBuilder[Self <: IChangeDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IChangeEventCallback extends StObject {
    
    def apply(): Unit = js.native
    def apply(changeDescription: IChangeDescription): Unit = js.native
    
    var __id__ : js.UndefOr[String] = js.native
  }
}
