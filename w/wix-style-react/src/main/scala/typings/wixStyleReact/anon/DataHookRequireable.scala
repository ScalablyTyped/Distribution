package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookRequireable extends StObject {
  
  var dataHook: Requireable[String]
}
object DataHookRequireable {
  
  inline def apply(dataHook: Requireable[String]): DataHookRequireable = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookRequireable]
  }
  
  extension [Self <: DataHookRequireable](x: Self) {
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
  }
}
