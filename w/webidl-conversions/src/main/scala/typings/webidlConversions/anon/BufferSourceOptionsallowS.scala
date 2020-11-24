package typings.webidlConversions.anon

import typings.webidlConversions.mod.Globals
import typings.webidlConversions.webidlConversionsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webidl-conversions.webidl-conversions.BufferSourceOptions & {  allowShared :false | undefined} */
@js.native
trait BufferSourceOptionsallowS extends js.Object {
  
  var allowShared: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var globals: js.UndefOr[Globals] = js.native
}
object BufferSourceOptionsallowS {
  
  @scala.inline
  def apply(allowShared: js.UndefOr[Boolean] with js.UndefOr[`false`]): BufferSourceOptionsallowS = {
    val __obj = js.Dynamic.literal(allowShared = allowShared.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferSourceOptionsallowS]
  }
  
  @scala.inline
  implicit class BufferSourceOptionsallowSOps[Self <: BufferSourceOptionsallowS] (val x: Self) extends AnyVal {
    
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
    def setAllowShared(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("allowShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setGlobals(value: Globals): Self = this.set("globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
  }
}
