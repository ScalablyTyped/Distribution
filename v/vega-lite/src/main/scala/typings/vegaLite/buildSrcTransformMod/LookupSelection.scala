package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcParameterMod.ParameterName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupSelection
  extends StObject
     with LookupBase {
  
  /**
    * Selection parameter name to look up.
    */
  var param: ParameterName
}
object LookupSelection {
  
  inline def apply(key: FieldName, param: ParameterName): LookupSelection = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupSelection]
  }
  
  extension [Self <: LookupSelection](x: Self) {
    
    inline def setParam(value: ParameterName): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
  }
}
