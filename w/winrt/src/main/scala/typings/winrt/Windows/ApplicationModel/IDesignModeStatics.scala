package typings.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDesignModeStatics extends StObject {
  
  var designModeEnabled: Boolean = js.native
}
object IDesignModeStatics {
  
  @scala.inline
  def apply(designModeEnabled: Boolean): IDesignModeStatics = {
    val __obj = js.Dynamic.literal(designModeEnabled = designModeEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDesignModeStatics]
  }
  
  @scala.inline
  implicit class IDesignModeStaticsMutableBuilder[Self <: IDesignModeStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesignModeEnabled(value: Boolean): Self = StObject.set(x, "designModeEnabled", value.asInstanceOf[js.Any])
  }
}
