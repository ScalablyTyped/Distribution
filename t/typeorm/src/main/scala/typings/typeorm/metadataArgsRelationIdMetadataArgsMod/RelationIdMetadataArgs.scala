package typings.typeorm.metadataArgsRelationIdMetadataArgsMod

import typings.typeorm.queryBuilderSelectQueryBuilderMod.SelectQueryBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationIdMetadataArgs extends js.Object {
  
  /**
    * Alias of the joined (destination) table.
    */
  val alias: js.UndefOr[String] = js.native
  
  /**
    * Class's property name to which this decorator is applied.
    */
  val propertyName: String = js.native
  
  /**
    * Extra condition applied to "ON" section of join.
    */
  val queryBuilderFactory: js.UndefOr[js.Function1[/* qb */ SelectQueryBuilder[_], SelectQueryBuilder[_]]] = js.native
  
  /**
    * Target's relation which it should count.
    */
  val relation: String | (js.Function1[/* object */ js.Any, _]) = js.native
  
  /**
    * Class to which this decorator is applied.
    */
  val target: js.Function = js.native
}
object RelationIdMetadataArgs {
  
  @scala.inline
  def apply(
    propertyName: String,
    relation: String | (js.Function1[/* object */ js.Any, _]),
    target: js.Function
  ): RelationIdMetadataArgs = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any], relation = relation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationIdMetadataArgs]
  }
  
  @scala.inline
  implicit class RelationIdMetadataArgsOps[Self <: RelationIdMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationFunction1(value: /* object */ js.Any => _): Self = this.set("relation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRelation(value: String | (js.Function1[/* object */ js.Any, _])): Self = this.set("relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setQueryBuilderFactory(value: /* qb */ SelectQueryBuilder[_] => SelectQueryBuilder[_]): Self = this.set("queryBuilderFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQueryBuilderFactory: Self = this.set("queryBuilderFactory", js.undefined)
  }
}
