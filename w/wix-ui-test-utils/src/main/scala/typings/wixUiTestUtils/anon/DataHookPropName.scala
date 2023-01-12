package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookPropName extends StObject {
  
  var dataHookPropName: js.UndefOr[String] = js.undefined
}
object DataHookPropName {
  
  inline def apply(): DataHookPropName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHookPropName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataHookPropName] (val x: Self) extends AnyVal {
    
    inline def setDataHookPropName(value: String): Self = StObject.set(x, "dataHookPropName", value.asInstanceOf[js.Any])
    
    inline def setDataHookPropNameUndefined: Self = StObject.set(x, "dataHookPropName", js.undefined)
  }
}
