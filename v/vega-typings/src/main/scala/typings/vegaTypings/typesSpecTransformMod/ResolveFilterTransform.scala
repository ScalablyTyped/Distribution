package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.resolvefilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveFilterTransform
  extends StObject
     with Transforms {
  
  var filter: SignalRef
  
  var ignore: Double | SignalRef
  
  var `type`: resolvefilter
}
object ResolveFilterTransform {
  
  inline def apply(filter: SignalRef, ignore: Double | SignalRef): ResolveFilterTransform = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("resolvefilter")
    __obj.asInstanceOf[ResolveFilterTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveFilterTransform] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: SignalRef): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: Double | SignalRef): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setType(value: resolvefilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
