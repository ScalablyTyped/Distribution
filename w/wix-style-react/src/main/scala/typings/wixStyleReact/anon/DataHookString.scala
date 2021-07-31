package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookString extends StObject {
  
  var dataHook: String
}
object DataHookString {
  
  @scala.inline
  def apply(dataHook: String): DataHookString = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHookString]
  }
  
  @scala.inline
  implicit class DataHookStringMutableBuilder[Self <: DataHookString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
  }
}
