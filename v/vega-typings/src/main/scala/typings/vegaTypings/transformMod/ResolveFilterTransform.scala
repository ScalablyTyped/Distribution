package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.resolvefilter
import org.scalablytyped.runtime.StObject
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
  implicit class ResolveFilterTransformMutableBuilder[Self <: ResolveFilterTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: SignalRef): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnore(value: Double | SignalRef): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: resolvefilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
