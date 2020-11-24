package typings.ultraStrftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleFormats extends js.Object {
  
  /** equivalent to %m/%d/%y in en_US */
  var D: String = js.native
  
  /** equivalent to %Y-%m-%d in en_US */
  var F: String = js.native
  
  /** equivalent to %H:%M in en_US */
  var R: String = js.native
  
  /** equivalent to %H:%M:%S in en_US */
  var T: String = js.native
  
  /** equivalent to %D in en_US */
  var X: String = js.native
  
  /** equivalent to %a %b %d %X %Y %Z in en_US */
  var c: String = js.native
  
  /** equivalent to %I:%M:%S %p in en_US */
  var r: String = js.native
  
  /** equivalent to %e-%b-%Y in en_US */
  var v: String = js.native
  
  /** equivalent to %T in en_US */
  var x: String = js.native
}
object LocaleFormats {
  
  @scala.inline
  def apply(D: String, F: String, R: String, T: String, X: String, c: String, r: String, v: String, x: String): LocaleFormats = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleFormats]
  }
  
  @scala.inline
  implicit class LocaleFormatsOps[Self <: LocaleFormats] (val x: Self) extends AnyVal {
    
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
    def setD(value: String): Self = this.set("D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: String): Self = this.set("F", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: String): Self = this.set("R", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: String): Self = this.set("T", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: String): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
  }
}
