package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWwwFormUrlDecoderEntry extends StObject {
  
  var name: String
  
  var value: String
}
object IWwwFormUrlDecoderEntry {
  
  inline def apply(name: String, value: String): IWwwFormUrlDecoderEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWwwFormUrlDecoderEntry]
  }
  
  extension [Self <: IWwwFormUrlDecoderEntry](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
