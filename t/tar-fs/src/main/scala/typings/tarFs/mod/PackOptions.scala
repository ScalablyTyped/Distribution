package typings.tarFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackOptions extends Options {
  
  var dereference: js.UndefOr[Boolean] = js.native
  
  var entries: js.UndefOr[js.Array[String]] = js.native
  
  @JSName("finalize")
  var finalize_FPackOptions: js.UndefOr[Boolean] = js.native
  
  var finish: js.UndefOr[js.Function1[/* pack */ typings.tarStream.mod.Pack_, Unit]] = js.native
  
  var pack: js.UndefOr[typings.tarStream.mod.Pack_] = js.native
}
object PackOptions {
  
  @scala.inline
  def apply(): PackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackOptions]
  }
  
  @scala.inline
  implicit class PackOptionsOps[Self <: PackOptions] (val x: Self) extends AnyVal {
    
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
    def setDereference(value: Boolean): Self = this.set("dereference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDereference: Self = this.set("dereference", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: String*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[String]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setFinalize(value: Boolean): Self = this.set("finalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalize: Self = this.set("finalize", js.undefined)
    
    @scala.inline
    def setFinish(value: /* pack */ typings.tarStream.mod.Pack_ => Unit): Self = this.set("finish", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinish: Self = this.set("finish", js.undefined)
    
    @scala.inline
    def setPack(value: typings.tarStream.mod.Pack_): Self = this.set("pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePack: Self = this.set("pack", js.undefined)
  }
}
