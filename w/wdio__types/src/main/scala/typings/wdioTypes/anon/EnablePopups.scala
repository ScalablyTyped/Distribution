package typings.wdioTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnablePopups extends StObject {
  
  var enablePopups: js.UndefOr[Boolean] = js.undefined
}
object EnablePopups {
  
  inline def apply(): EnablePopups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnablePopups]
  }
  
  extension [Self <: EnablePopups](x: Self) {
    
    inline def setEnablePopups(value: Boolean): Self = StObject.set(x, "enablePopups", value.asInstanceOf[js.Any])
    
    inline def setEnablePopupsUndefined: Self = StObject.set(x, "enablePopups", js.undefined)
  }
}
