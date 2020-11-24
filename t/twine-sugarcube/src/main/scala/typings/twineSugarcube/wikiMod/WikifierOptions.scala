package typings.twineSugarcube.wikiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WikifierOptions extends js.Object {
  
  var ignoreTerminatorCase: js.UndefOr[Boolean] = js.native
  
  var profile: String = js.native
}
object WikifierOptions {
  
  @scala.inline
  def apply(profile: String): WikifierOptions = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[WikifierOptions]
  }
  
  @scala.inline
  implicit class WikifierOptionsOps[Self <: WikifierOptions] (val x: Self) extends AnyVal {
    
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
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTerminatorCase(value: Boolean): Self = this.set("ignoreTerminatorCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTerminatorCase: Self = this.set("ignoreTerminatorCase", js.undefined)
  }
}
