package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ReferenceType, 'type'> & std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ReferenceType> */
@js.native
trait PickReferenceTypetypePart extends StObject {
  
  var id: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[ModelToObject[String] | String] = js.native
  
  var `type`: ((ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)) with (js.UndefOr[(ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)]) = js.native
  
  var typeArguments: js.UndefOr[ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]] = js.native
}
object PickReferenceTypetypePart {
  
  @scala.inline
  def apply(
    `type`: ((ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)) with (js.UndefOr[(ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)])
  ): PickReferenceTypetypePart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickReferenceTypetypePart]
  }
  
  @scala.inline
  implicit class PickReferenceTypetypePartMutableBuilder[Self <: PickReferenceTypetypePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setType(
      value: ((ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)) with (js.UndefOr[(ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)])
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArguments(value: ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
    
    @scala.inline
    def setTypeArgumentsVarargs(value: (Type | _ModelToObject[js.Any])*): Self = StObject.set(x, "typeArguments", js.Array(value :_*))
  }
}
