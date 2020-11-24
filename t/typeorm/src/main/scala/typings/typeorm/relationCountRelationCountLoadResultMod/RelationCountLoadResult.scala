package typings.typeorm.relationCountRelationCountLoadResultMod

import typings.typeorm.anon.Cnt
import typings.typeorm.relationCountRelationCountAttributeMod.RelationCountAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationCountLoadResult extends js.Object {
  
  var relationCountAttribute: RelationCountAttribute = js.native
  
  var results: js.Array[Cnt] = js.native
}
object RelationCountLoadResult {
  
  @scala.inline
  def apply(relationCountAttribute: RelationCountAttribute, results: js.Array[Cnt]): RelationCountLoadResult = {
    val __obj = js.Dynamic.literal(relationCountAttribute = relationCountAttribute.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationCountLoadResult]
  }
  
  @scala.inline
  implicit class RelationCountLoadResultOps[Self <: RelationCountLoadResult] (val x: Self) extends AnyVal {
    
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
    def setRelationCountAttribute(value: RelationCountAttribute): Self = this.set("relationCountAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: Cnt*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[Cnt]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
