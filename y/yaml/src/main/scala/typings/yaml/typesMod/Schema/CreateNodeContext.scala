package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNodeContext
  extends /* key */ StringDictionary[js.Any] {
  
  var wrapScalars: js.UndefOr[Boolean] = js.native
}
object CreateNodeContext {
  
  @scala.inline
  def apply(): CreateNodeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodeContext]
  }
  
  @scala.inline
  implicit class CreateNodeContextOps[Self <: CreateNodeContext] (val x: Self) extends AnyVal {
    
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
    def setWrapScalars(value: Boolean): Self = this.set("wrapScalars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapScalars: Self = this.set("wrapScalars", js.undefined)
  }
}
