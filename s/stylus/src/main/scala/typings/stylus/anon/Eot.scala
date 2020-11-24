package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eot extends js.Object {
  
  @JSName(".eot")
  var Doteot: String = js.native
  
  @JSName(".gif")
  var Dotgif: String = js.native
  
  @JSName(".jpeg")
  var Dotjpeg: String = js.native
  
  @JSName(".jpg")
  var Dotjpg: String = js.native
  
  @JSName(".png")
  var Dotpng: String = js.native
  
  @JSName(".svg")
  var Dotsvg: String = js.native
  
  @JSName(".ttf")
  var Dotttf: String = js.native
  
  @JSName(".woff")
  var Dotwoff: String = js.native
}
object Eot {
  
  @scala.inline
  def apply(
    Doteot: String,
    Dotgif: String,
    Dotjpeg: String,
    Dotjpg: String,
    Dotpng: String,
    Dotsvg: String,
    Dotttf: String,
    Dotwoff: String
  ): Eot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".eot")(Doteot.asInstanceOf[js.Any])
    __obj.updateDynamic(".gif")(Dotgif.asInstanceOf[js.Any])
    __obj.updateDynamic(".jpeg")(Dotjpeg.asInstanceOf[js.Any])
    __obj.updateDynamic(".jpg")(Dotjpg.asInstanceOf[js.Any])
    __obj.updateDynamic(".png")(Dotpng.asInstanceOf[js.Any])
    __obj.updateDynamic(".svg")(Dotsvg.asInstanceOf[js.Any])
    __obj.updateDynamic(".ttf")(Dotttf.asInstanceOf[js.Any])
    __obj.updateDynamic(".woff")(Dotwoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eot]
  }
  
  @scala.inline
  implicit class EotOps[Self <: Eot] (val x: Self) extends AnyVal {
    
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
    def setDoteot(value: String): Self = this.set(".eot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotgif(value: String): Self = this.set(".gif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotjpeg(value: String): Self = this.set(".jpeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotjpg(value: String): Self = this.set(".jpg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotpng(value: String): Self = this.set(".png", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsvg(value: String): Self = this.set(".svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotttf(value: String): Self = this.set(".ttf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotwoff(value: String): Self = this.set(".woff", value.asInstanceOf[js.Any])
  }
}
