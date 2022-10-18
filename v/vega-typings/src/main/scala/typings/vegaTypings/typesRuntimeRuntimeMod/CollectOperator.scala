package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.anon.ingestunknownformatFormat
import typings.vegaTypings.anon.requeststringformatFormat
import typings.vegaTypings.vegaTypingsStrings.collect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectOperator
  extends StObject
     with BaseOperator
     with DefinedOperator {
  
  @JSName("type")
  var type_CollectOperator: collect
  
  /**
    * Either the data literals, or a reference to data to parse and load
    */
  @JSName("value")
  var value_CollectOperator: js.UndefOr[ObjectOrAny[requeststringformatFormat | ingestunknownformatFormat]] = js.undefined
}
object CollectOperator {
  
  inline def apply(id: ID): CollectOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("collect")
    __obj.asInstanceOf[CollectOperator]
  }
  
  extension [Self <: CollectOperator](x: Self) {
    
    inline def setType(value: collect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ObjectOrAny[requeststringformatFormat | ingestunknownformatFormat]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
