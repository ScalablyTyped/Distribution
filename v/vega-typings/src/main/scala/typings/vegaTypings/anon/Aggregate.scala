package typings.vegaTypings.anon

import typings.vegaTypings.markMod.Facet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregate extends Facet {
  
  var aggregate: js.UndefOr[As] = js.native
  
  var data: String = js.native
  
  var groupby: String | js.Array[String] = js.native
  
  var name: String = js.native
}
object Aggregate {
  
  @scala.inline
  def apply(data: String, groupby: String | js.Array[String], name: String): Aggregate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregate]
  }
  
  @scala.inline
  implicit class AggregateMutableBuilder[Self <: Aggregate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: As): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateUndefined: Self = StObject.set(x, "aggregate", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: String | js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
