package typings.stylableCore.stylableTransformerMod

import typings.stylableCore.stylableCoreStrings.`class`
import typings.stylableCore.stylableCoreStrings.`pseudo-element`
import typings.stylableCore.stylableCoreStrings.element
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableResolverMod.CSSResolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopeAnchor extends js.Object {
  
  var name: String = js.native
  
  var resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]] = js.native
  
  var `type`: `class` | element | `pseudo-element` = js.native
}
object ScopeAnchor {
  
  @scala.inline
  def apply(
    name: String,
    resolved: js.Array[CSSResolve[ClassSymbol | ElementSymbol]],
    `type`: `class` | element | `pseudo-element`
  ): ScopeAnchor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resolved = resolved.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeAnchor]
  }
  
  @scala.inline
  implicit class ScopeAnchorOps[Self <: ScopeAnchor] (val x: Self) extends AnyVal {
    
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
    def setType(value: `class` | element | `pseudo-element`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
