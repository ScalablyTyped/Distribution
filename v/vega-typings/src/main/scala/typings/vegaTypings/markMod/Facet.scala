package typings.vegaTypings.markMod

import typings.vegaTypings.anon.As
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.anon.Name
  - typings.vegaTypings.anon.Aggregate
*/
trait Facet extends js.Object

object Facet {
  @scala.inline
  def Name(data: String, field: String, name: String): Facet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facet]
  }
  @scala.inline
  def Aggregate(data: String, groupby: String | js.Array[String], name: String, aggregate: As = null): Facet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facet]
  }
}

