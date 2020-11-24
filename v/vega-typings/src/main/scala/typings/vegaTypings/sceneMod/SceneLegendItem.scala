package typings.vegaTypings.sceneMod

import typings.vegaTypings.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneLegendItem extends js.Object {
  
  var datum: Index = js.native
}
object SceneLegendItem {
  
  @scala.inline
  def apply(datum: Index): SceneLegendItem = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneLegendItem]
  }
  
  @scala.inline
  implicit class SceneLegendItemOps[Self <: SceneLegendItem] (val x: Self) extends AnyVal {
    
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
    def setDatum(value: Index): Self = this.set("datum", value.asInstanceOf[js.Any])
  }
}
