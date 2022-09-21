package typings.victoryBrushContainer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XProps extends StObject {
  
  var xProps: String
  
  var yProps: String
}
object XProps {
  
  inline def apply(xProps: String, yProps: String): XProps = {
    val __obj = js.Dynamic.literal(xProps = xProps.asInstanceOf[js.Any], yProps = yProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[XProps]
  }
  
  extension [Self <: XProps](x: Self) {
    
    inline def setXProps(value: String): Self = StObject.set(x, "xProps", value.asInstanceOf[js.Any])
    
    inline def setYProps(value: String): Self = StObject.set(x, "yProps", value.asInstanceOf[js.Any])
  }
}
