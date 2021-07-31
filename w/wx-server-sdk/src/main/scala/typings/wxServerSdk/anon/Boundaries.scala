package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundaries extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  var boundaries: js.Array[js.Any]
  
  var groupBy: js.Any
  
  var output: js.UndefOr[js.Object] = js.undefined
}
object Boundaries {
  
  @scala.inline
  def apply(boundaries: js.Array[js.Any], groupBy: js.Any): Boundaries = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
  
  @scala.inline
  implicit class BoundariesMutableBuilder[Self <: Boundaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundaries(value: js.Array[js.Any]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundariesVarargs(value: js.Any*): Self = StObject.set(x, "boundaries", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setGroupBy(value: js.Any): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: js.Object): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
