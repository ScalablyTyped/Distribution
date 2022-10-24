package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datahook
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `data-hook`: String
}
object Datahook {
  
  inline def apply(`data-hook`: String): Datahook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data-hook")(`data-hook`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datahook]
  }
  
  extension [Self <: Datahook](x: Self) {
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
  }
}
