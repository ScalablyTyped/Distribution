package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionNameAscending extends js.Object {
  
  var definitionNameAscending: scala.Double = js.native
  
  var definitionNameDescending: scala.Double = js.native
  
  var lastModifiedAscending: scala.Double = js.native
  
  var lastModifiedDescending: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object DefinitionNameAscending {
  
  @scala.inline
  def apply(
    definitionNameAscending: scala.Double,
    definitionNameDescending: scala.Double,
    lastModifiedAscending: scala.Double,
    lastModifiedDescending: scala.Double,
    none: scala.Double
  ): DefinitionNameAscending = {
    val __obj = js.Dynamic.literal(definitionNameAscending = definitionNameAscending.asInstanceOf[js.Any], definitionNameDescending = definitionNameDescending.asInstanceOf[js.Any], lastModifiedAscending = lastModifiedAscending.asInstanceOf[js.Any], lastModifiedDescending = lastModifiedDescending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNameAscending]
  }
  
  @scala.inline
  implicit class DefinitionNameAscendingOps[Self <: DefinitionNameAscending] (val x: Self) extends AnyVal {
    
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
    def setDefinitionNameAscending(value: scala.Double): Self = this.set("definitionNameAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionNameDescending(value: scala.Double): Self = this.set("definitionNameDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedAscending(value: scala.Double): Self = this.set("lastModifiedAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDescending(value: scala.Double): Self = this.set("lastModifiedDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
}
