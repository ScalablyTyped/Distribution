package typings.vegaTypings.scaleMod

import typings.vegaTypings.vegaTypingsStrings.sequential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequentialScale
  extends NumericScale
     with Scale {
  
  @JSName("type")
  var type_SequentialScale: sequential = js.native
}
object SequentialScale {
  
  @scala.inline
  def apply(name: String, `type`: sequential): SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequentialScale]
  }
  
  @scala.inline
  implicit class SequentialScaleOps[Self <: SequentialScale] (val x: Self) extends AnyVal {
    
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
    def setType(value: sequential): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
