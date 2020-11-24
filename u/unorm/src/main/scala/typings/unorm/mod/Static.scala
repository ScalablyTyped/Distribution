package typings.unorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends js.Object {
  
  def nfc(str: String): String = js.native
  
  def nfd(str: String): String = js.native
  
  def nfkc(str: String): String = js.native
  
  def nfkd(str: String): String = js.native
}
object Static {
  
  @scala.inline
  def apply(nfc: String => String, nfd: String => String, nfkc: String => String, nfkd: String => String): Static = {
    val __obj = js.Dynamic.literal(nfc = js.Any.fromFunction1(nfc), nfd = js.Any.fromFunction1(nfd), nfkc = js.Any.fromFunction1(nfkc), nfkd = js.Any.fromFunction1(nfkd))
    __obj.asInstanceOf[Static]
  }
  
  @scala.inline
  implicit class StaticOps[Self <: Static] (val x: Self) extends AnyVal {
    
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
    def setNfc(value: String => String): Self = this.set("nfc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNfd(value: String => String): Self = this.set("nfd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNfkc(value: String => String): Self = this.set("nfkc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNfkd(value: String => String): Self = this.set("nfkd", js.Any.fromFunction1(value))
  }
}
