package typings.vegaLite.anon

import typings.vegaTypings.axisMod.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  var axes: js.UndefOr[js.Array[Axis]] = js.undefined
  
  var encode: js.UndefOr[Update] = js.undefined
  
  var from: js.UndefOr[Data] = js.undefined
  
  var name: String
  
  var role: String
  
  var title: js.UndefOr[Dx | Encode | Font | FontStyle] = js.undefined
  
  var `type`: String
}
object From {
  
  @scala.inline
  def apply(name: String, role: String, `type`: String): From = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: js.Array[Axis]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setAxesVarargs(value: Axis*): Self = StObject.set(x, "axes", js.Array(value :_*))
    
    @scala.inline
    def setEncode(value: Update): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setFrom(value: Data): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Dx | Encode | Font | FontStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
