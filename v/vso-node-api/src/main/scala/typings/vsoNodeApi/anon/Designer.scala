package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Designer extends StObject {
  
  var designer: scala.Double = js.native
  
  var yaml: scala.Double = js.native
}
object Designer {
  
  @scala.inline
  def apply(designer: scala.Double, yaml: scala.Double): Designer = {
    val __obj = js.Dynamic.literal(designer = designer.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Designer]
  }
  
  @scala.inline
  implicit class DesignerMutableBuilder[Self <: Designer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesigner(value: scala.Double): Self = StObject.set(x, "designer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaml(value: scala.Double): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
  }
}
