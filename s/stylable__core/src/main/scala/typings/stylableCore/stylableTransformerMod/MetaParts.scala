package typings.stylableCore.stylableTransformerMod

import typings.std.Record
import typings.stylableCore.stylableMetaMod.ClassSymbol
import typings.stylableCore.stylableMetaMod.ElementSymbol
import typings.stylableCore.stylableResolverMod.CSSResolve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaParts extends js.Object {
  
  var `class`: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]] = js.native
  
  var element: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]] = js.native
}
object MetaParts {
  
  @scala.inline
  def apply(
    `class`: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]],
    element: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]
  ): MetaParts = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaParts]
  }
  
  @scala.inline
  implicit class MetaPartsOps[Self <: MetaParts] (val x: Self) extends AnyVal {
    
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
    def setClass(value: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: Record[String, js.Array[CSSResolve[ClassSymbol | ElementSymbol]]]): Self = this.set("element", value.asInstanceOf[js.Any])
  }
}
