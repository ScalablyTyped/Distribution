package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod._RangeScheme
import typings.vegaTypings.schemeMod.ColorScheme
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extent extends _RangeScheme {
  
  var count: js.UndefOr[Double | SignalRef] = js.native
  
  var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  
  var scheme: String | js.Array[String] | SignalRef | ColorScheme = js.native
}
object Extent {
  
  @scala.inline
  def apply(scheme: String | js.Array[String] | SignalRef | ColorScheme): Extent = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extent]
  }
  
  @scala.inline
  implicit class ExtentMutableBuilder[Self <: Extent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double | SignalRef): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setExtent(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setExtentVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "extent", js.Array(value :_*))
    
    @scala.inline
    def setScheme(value: String | js.Array[String] | SignalRef | ColorScheme): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeVarargs(value: String*): Self = StObject.set(x, "scheme", js.Array(value :_*))
  }
}
