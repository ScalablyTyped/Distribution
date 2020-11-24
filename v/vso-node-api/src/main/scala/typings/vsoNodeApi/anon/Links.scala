package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Links extends js.Object {
  
  var all: scala.Double = js.native
  
  var fields: scala.Double = js.native
  
  var links: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var relations: scala.Double = js.native
}
object Links {
  
  @scala.inline
  def apply(
    all: scala.Double,
    fields: scala.Double,
    links: scala.Double,
    none: scala.Double,
    relations: scala.Double
  ): Links = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
  
  @scala.inline
  implicit class LinksOps[Self <: Links] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: scala.Double): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: scala.Double): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelations(value: scala.Double): Self = this.set("relations", value.asInstanceOf[js.Any])
  }
}
