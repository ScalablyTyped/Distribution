package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.LIST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionListTypeRef extends IntrospectionTypeRef {
  
  var kind: LIST = js.native
  
  var ofType: js.UndefOr[IntrospectionTypeRef] = js.native
}
object IntrospectionListTypeRef {
  
  @scala.inline
  def apply(kind: LIST): IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionListTypeRef]
  }
  
  @scala.inline
  implicit class IntrospectionListTypeRefOps[Self <: IntrospectionListTypeRef] (val x: Self) extends AnyVal {
    
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
    def setKind(value: LIST): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfType(value: IntrospectionTypeRef): Self = this.set("ofType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfType: Self = this.set("ofType", js.undefined)
  }
}
