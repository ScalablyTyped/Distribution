package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskOptionsCoreUIConfiguration extends StObject {
  
  var displayedOptions: IVector[String] = js.native
}
object IPrintTaskOptionsCoreUIConfiguration {
  
  @scala.inline
  def apply(displayedOptions: IVector[String]): IPrintTaskOptionsCoreUIConfiguration = {
    val __obj = js.Dynamic.literal(displayedOptions = displayedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionsCoreUIConfiguration]
  }
  
  @scala.inline
  implicit class IPrintTaskOptionsCoreUIConfigurationMutableBuilder[Self <: IPrintTaskOptionsCoreUIConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayedOptions(value: IVector[String]): Self = StObject.set(x, "displayedOptions", value.asInstanceOf[js.Any])
  }
}
