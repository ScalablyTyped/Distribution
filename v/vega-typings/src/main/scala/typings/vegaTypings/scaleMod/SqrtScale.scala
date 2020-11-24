package typings.vegaTypings.scaleMod

import typings.vegaTypings.vegaTypingsStrings.sqrt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqrtScale
  extends NumericScale
     with Scale {
  
  @JSName("type")
  var type_SqrtScale: sqrt = js.native
}
object SqrtScale {
  
  @scala.inline
  def apply(name: String, `type`: sqrt): SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqrtScale]
  }
  
  @scala.inline
  implicit class SqrtScaleOps[Self <: SqrtScale] (val x: Self) extends AnyVal {
    
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
    def setType(value: sqrt): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
