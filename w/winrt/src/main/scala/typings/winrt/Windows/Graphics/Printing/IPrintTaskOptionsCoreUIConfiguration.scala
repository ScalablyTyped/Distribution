package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskOptionsCoreUIConfiguration extends StObject {
  
  var displayedOptions: IVector[String]
}
object IPrintTaskOptionsCoreUIConfiguration {
  
  inline def apply(displayedOptions: IVector[String]): IPrintTaskOptionsCoreUIConfiguration = {
    val __obj = js.Dynamic.literal(displayedOptions = displayedOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionsCoreUIConfiguration]
  }
  
  extension [Self <: IPrintTaskOptionsCoreUIConfiguration](x: Self) {
    
    inline def setDisplayedOptions(value: IVector[String]): Self = StObject.set(x, "displayedOptions", value.asInstanceOf[js.Any])
  }
}
