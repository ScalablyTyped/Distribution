package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.resolvefilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveFilterTransform extends _Transforms {
  
  var filter: SignalRef = js.native
  
  var ignore: Double | SignalRef = js.native
  
  var `type`: resolvefilter = js.native
}
object ResolveFilterTransform {
  
  @scala.inline
  def apply(filter: SignalRef, ignore: Double | SignalRef, `type`: resolvefilter): ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveFilterTransform]
  }
  
  @scala.inline
  implicit class ResolveFilterTransformOps[Self <: ResolveFilterTransform] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: SignalRef): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore(value: Double | SignalRef): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: resolvefilter): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
