package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataList extends StObject {
  
  var dataList: Any
  
  var inputTypes: Any
}
object DataList {
  
  inline def apply(dataList: Any, inputTypes: Any): DataList = {
    val __obj = js.Dynamic.literal(dataList = dataList.asInstanceOf[js.Any], inputTypes = inputTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataList]
  }
  
  extension [Self <: DataList](x: Self) {
    
    inline def setDataList(value: Any): Self = StObject.set(x, "dataList", value.asInstanceOf[js.Any])
    
    inline def setInputTypes(value: Any): Self = StObject.set(x, "inputTypes", value.asInstanceOf[js.Any])
  }
}
