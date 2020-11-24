package typings.stylefire.buildMod

import org.scalablytyped.runtime.StringDictionary
import typings.stylefire.anon.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGAttrs
  extends /* key */ StringDictionary[js.Any] {
  
  var style: js.UndefOr[Transform] = js.native
}
object SVGAttrs {
  
  @scala.inline
  def apply(): SVGAttrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttrs]
  }
  
  @scala.inline
  implicit class SVGAttrsOps[Self <: SVGAttrs] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: Transform): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
