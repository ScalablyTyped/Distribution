package typings.vegaTypings.markMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.anon.Name
  - typings.vegaTypings.anon.Aggregate
*/
trait Facet extends StObject
object Facet {
  
  @scala.inline
  def Aggregate(data: String, groupby: String | js.Array[String], name: String): typings.vegaTypings.anon.Aggregate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Aggregate]
  }
  
  @scala.inline
  def Name(data: String, field: String, name: String): typings.vegaTypings.anon.Name = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.anon.Name]
  }
}
