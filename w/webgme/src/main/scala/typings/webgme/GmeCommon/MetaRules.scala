package typings.webgme.GmeCommon

import typings.webgme.anon.Filter
import typings.webgme.anon.Level
import typings.webgme.anon.Ptr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaRules extends js.Object {
  
  var aspects: Filter = js.native
  
  var attributes: Level = js.native
  
  var children: MetaCardRule = js.native
  
  var constraints: Dictionary[typings.webgme.Core.Constraint] = js.native
  
  var pointers: Ptr = js.native
}
object MetaRules {
  
  @scala.inline
  def apply(
    aspects: Filter,
    attributes: Level,
    children: MetaCardRule,
    constraints: Dictionary[typings.webgme.Core.Constraint],
    pointers: Ptr
  ): MetaRules = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaRules]
  }
  
  @scala.inline
  implicit class MetaRulesOps[Self <: MetaRules] (val x: Self) extends AnyVal {
    
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
    def setAspects(value: Filter): Self = this.set("aspects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Level): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: MetaCardRule): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraints(value: Dictionary[typings.webgme.Core.Constraint]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointers(value: Ptr): Self = this.set("pointers", value.asInstanceOf[js.Any])
  }
}
