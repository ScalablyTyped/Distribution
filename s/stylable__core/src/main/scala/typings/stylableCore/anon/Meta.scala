package typings.stylableCore.anon

import typings.stylableCore.stylableMetaMod.KeyframesSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends js.Object {
  
  var meta: StylableMeta = js.native
  
  var symbol: KeyframesSymbol = js.native
}
object Meta {
  
  @scala.inline
  def apply(meta: StylableMeta, symbol: KeyframesSymbol): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
    
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
    def setMeta(value: StylableMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: KeyframesSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
