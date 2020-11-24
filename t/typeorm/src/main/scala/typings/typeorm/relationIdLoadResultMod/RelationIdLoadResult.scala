package typings.typeorm.relationIdLoadResultMod

import typings.typeorm.relationIdAttributeMod.RelationIdAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationIdLoadResult extends js.Object {
  
  var relationIdAttribute: RelationIdAttribute = js.native
  
  var results: js.Array[_] = js.native
}
object RelationIdLoadResult {
  
  @scala.inline
  def apply(relationIdAttribute: RelationIdAttribute, results: js.Array[_]): RelationIdLoadResult = {
    val __obj = js.Dynamic.literal(relationIdAttribute = relationIdAttribute.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationIdLoadResult]
  }
  
  @scala.inline
  implicit class RelationIdLoadResultOps[Self <: RelationIdLoadResult] (val x: Self) extends AnyVal {
    
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
    def setRelationIdAttribute(value: RelationIdAttribute): Self = this.set("relationIdAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: js.Any*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[_]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
