package typings.vegaTypings.anon

import typings.vegaTypings.markMod.Facet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aggregate
  extends StObject
     with Facet {
  
  var aggregate: js.UndefOr[As] = js.undefined
  
  var data: String
  
  var groupby: String | js.Array[String]
  
  var name: String
}
object Aggregate {
  
  inline def apply(data: String, groupby: String | js.Array[String], name: String): Aggregate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
  
  extension [Self <: Aggregate](x: Self) {
    
    inline def setAggregate(value: As): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: String | js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
