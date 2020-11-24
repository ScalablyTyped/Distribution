package typings.typeorm.metadataArgsRelationMetadataArgsMod

import typings.typeorm.optionsRelationOptionsMod.RelationOptions
import typings.typeorm.typesPropertyTypeInFunctionMod.PropertyTypeFactory
import typings.typeorm.typesRelationTypeInFunctionMod.RelationTypeInFunction
import typings.typeorm.typesRelationTypesMod.RelationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationMetadataArgs extends js.Object {
  
  /**
    * Inverse side of the relation.
    */
  val inverseSideProperty: js.UndefOr[PropertyTypeFactory[_]] = js.native
  
  /**
    * Indicates if this relation will be lazily loaded.
    */
  val isLazy: Boolean = js.native
  
  /**
    * Indicates if this is a children (can be only one-to-many relation) relation in the tree tables.
    */
  val isTreeChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if this is a parent (can be only many-to-one relation) relation in the tree tables.
    */
  val isTreeParent: js.UndefOr[Boolean] = js.native
  
  /**
    * Additional relation options.
    */
  val options: RelationOptions = js.native
  
  /**
    * In the case if this relation is without a target, targetId must be specified.
    * This is used for entity schemas without classes.
    */
  /**
    * Class's property name to which this relation is applied.
    */
  val propertyName: String = js.native
  
  /**
    * Original (reflected) class's property type.
    *
    * todo: this can be empty for relations from entity schemas.
    */
  /**
    * Type of relation. Can be one of the value of the RelationTypes class.
    */
  val relationType: RelationType = js.native
  
  /**
    * Class to which this relation is applied.
    */
  val target: js.Function | String = js.native
  
  /**
    * Type of the relation. This type is in function because of language specifics and problems with recursive
    * referenced classes.
    */
  val `type`: RelationTypeInFunction = js.native
}
object RelationMetadataArgs {
  
  @scala.inline
  def apply(
    isLazy: Boolean,
    options: RelationOptions,
    propertyName: String,
    relationType: RelationType,
    target: js.Function | String,
    `type`: RelationTypeInFunction
  ): RelationMetadataArgs = {
    val __obj = js.Dynamic.literal(isLazy = isLazy.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], relationType = relationType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationMetadataArgs]
  }
  
  @scala.inline
  implicit class RelationMetadataArgsOps[Self <: RelationMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setIsLazy(value: Boolean): Self = this.set("isLazy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RelationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationType(value: RelationType): Self = this.set("relationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFunction1(value: /* type */ js.UndefOr[js.Any] => js.Function): Self = this.set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: RelationTypeInFunction): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverseSidePropertyFunction1(value: _ => String | js.Any): Self = this.set("inverseSideProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInverseSideProperty(value: PropertyTypeFactory[_]): Self = this.set("inverseSideProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverseSideProperty: Self = this.set("inverseSideProperty", js.undefined)
    
    @scala.inline
    def setIsTreeChildren(value: Boolean): Self = this.set("isTreeChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTreeChildren: Self = this.set("isTreeChildren", js.undefined)
    
    @scala.inline
    def setIsTreeParent(value: Boolean): Self = this.set("isTreeParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTreeParent: Self = this.set("isTreeParent", js.undefined)
  }
}
