package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<typedoc.typedoc/dist/lib/serialization/schema.ReferenceType, 'type'> & std.Partial<typedoc.typedoc/dist/lib/serialization/schema.ReferenceType> */
@js.native
trait PickReferenceTypetypePart extends js.Object {
  
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
  implicit class PickReferenceTypetypePartOps[Self <: PickReferenceTypetypePart] (val x: Self) extends AnyVal {
    
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
    def setType(
      value: ((ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)) with (js.UndefOr[(ModelToObject[/* "reference" */ String]) | (/* "reference" */ String)])
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTypeArgumentsVarargs(value: (Type | _ModelToObject[js.Any])*): Self = this.set("typeArguments", js.Array(value :_*))
    
    @scala.inline
    def setTypeArguments(value: ModelToObject[js.UndefOr[js.Array[Type]]] | js.Array[Type]): Self = this.set("typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeArguments: Self = this.set("typeArguments", js.undefined)
  }
}
