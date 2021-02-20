package typings.vegaLite.anon

import typings.vegaLite.vegaSchemaMod.VgComparator
import typings.vegaTypings.axisMod.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axes extends StObject {
  
  var axes: js.UndefOr[js.Array[Axis]] = js.native
  
  var encode: js.UndefOr[Update] = js.native
  
  var from: Data = js.native
  
  var name: String = js.native
  
  var role: String = js.native
  
  var sort: VgComparator = js.native
  
  var title: js.UndefOr[Dx | Encode | Font | FontStyle] = js.native
  
  var `type`: String = js.native
}
object Axes {
  
  @scala.inline
  def apply(from: Data, name: String, role: String, sort: VgComparator, `type`: String): Axes = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axes]
  }
  
  @scala.inline
  implicit class AxesMutableBuilder[Self <: Axes] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: VgComparator): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Dx | Encode | Font | FontStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
