package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWall extends StObject {
  
  var bounds: IRectangle = js.native
  
  var format: IFormat = js.native
  
  var visible: Boolean = js.native
}
object IWall {
  
  @scala.inline
  def apply(bounds: IRectangle, format: IFormat, visible: Boolean): IWall = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWall]
  }
  
  @scala.inline
  implicit class IWallMutableBuilder[Self <: IWall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: IRectangle): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
