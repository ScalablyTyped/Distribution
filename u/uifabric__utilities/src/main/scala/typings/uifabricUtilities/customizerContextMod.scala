package typings.uifabricUtilities

import typings.react.mod.Context
import typings.uifabricUtilities.customizationsMod.ICustomizations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customizerContextMod {
  
  @JSImport("@uifabric/utilities/lib/customizations/CustomizerContext", "CustomizerContext")
  @js.native
  val CustomizerContext: Context[ICustomizerContext] = js.native
  
  @js.native
  trait ICustomizerContext extends StObject {
    
    var customizations: ICustomizations = js.native
  }
  object ICustomizerContext {
    
    @scala.inline
    def apply(customizations: ICustomizations): ICustomizerContext = {
      val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomizerContext]
    }
    
    @scala.inline
    implicit class ICustomizerContextMutableBuilder[Self <: ICustomizerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomizations(value: ICustomizations): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    }
  }
}
