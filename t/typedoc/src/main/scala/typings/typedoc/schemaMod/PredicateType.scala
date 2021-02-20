package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.PredicateType, 'type' | 'name' | 'asserts' | 'targetType'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait PredicateType extends SomeType {
  
  var asserts: ModelToObject[Boolean] | Boolean = js.native
  
  var name: ModelToObject[String] | String = js.native
  
  var targetType: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
  ] = js.native
  
  var `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String) = js.native
}
object PredicateType {
  
  @scala.inline
  def apply(
    asserts: ModelToObject[Boolean] | Boolean,
    name: ModelToObject[String] | String,
    `type`: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)
  ): PredicateType = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredicateType]
  }
  
  @scala.inline
  implicit class PredicateTypeMutableBuilder[Self <: PredicateType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsserts(value: ModelToObject[Boolean] | Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "asserts", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setTargetType(
      value: ModelToObject[js.UndefOr[typings.typedoc.typesAbstractMod.Type]] | typings.typedoc.typesAbstractMod.Type
    ): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
    
    @scala.inline
    def setTargetTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "targetType", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "predicate" */ String]) | (/* "predicate" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
