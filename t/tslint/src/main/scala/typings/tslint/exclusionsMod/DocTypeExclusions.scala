package typings.tslint.exclusionsMod

import typings.tslint.exclusionMod.Exclusion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocTypeExclusions extends js.Object {
  
  var overloadsSeparateDocs: js.UndefOr[Boolean] = js.native
  
  var requirements: js.Array[Exclusion[_]] = js.native
}
object DocTypeExclusions {
  
  @scala.inline
  def apply(requirements: js.Array[Exclusion[_]]): DocTypeExclusions = {
    val __obj = js.Dynamic.literal(requirements = requirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocTypeExclusions]
  }
  
  @scala.inline
  implicit class DocTypeExclusionsOps[Self <: DocTypeExclusions] (val x: Self) extends AnyVal {
    
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
    def setRequirementsVarargs(value: Exclusion[js.Any]*): Self = this.set("requirements", js.Array(value :_*))
    
    @scala.inline
    def setRequirements(value: js.Array[Exclusion[_]]): Self = this.set("requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverloadsSeparateDocs(value: Boolean): Self = this.set("overloadsSeparateDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverloadsSeparateDocs: Self = this.set("overloadsSeparateDocs", js.undefined)
  }
}
