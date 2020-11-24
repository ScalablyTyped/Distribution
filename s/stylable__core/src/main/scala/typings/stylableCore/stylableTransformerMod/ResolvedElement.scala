package typings.stylableCore.stylableTransformerMod

import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableResolverMod.CSSResolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolvedElement extends js.Object {
  
  var name: String = js.native
  
  var resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
  
  var `type`: String = js.native
}
object ResolvedElement {
  
  @scala.inline
  def apply(name: String, resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]], `type`: String): ResolvedElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedElement]
  }
  
  @scala.inline
  implicit class ResolvedElementOps[Self <: ResolvedElement] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedVarargs(value: (CSSResolve[ClassSymbol | ElementSymbol])*): Self = this.set("resolved", js.Array(value :_*))
    
    @scala.inline
    def setResolved(value: js.Array[CSSResolve[ClassSymbol | ElementSymbol]]): Self = this.set("resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
