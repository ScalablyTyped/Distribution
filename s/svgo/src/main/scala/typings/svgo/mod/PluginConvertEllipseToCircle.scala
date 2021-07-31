package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginConvertEllipseToCircle
  extends StObject
     with PluginConfig {
  
  /** convert ellipse with equal radius measures to circle */
  var convertEllipseToCircle: Boolean | js.Object
}
object PluginConvertEllipseToCircle {
  
  @scala.inline
  def apply(convertEllipseToCircle: Boolean | js.Object): PluginConvertEllipseToCircle = {
    val __obj = js.Dynamic.literal(convertEllipseToCircle = convertEllipseToCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginConvertEllipseToCircle]
  }
  
  @scala.inline
  implicit class PluginConvertEllipseToCircleMutableBuilder[Self <: PluginConvertEllipseToCircle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvertEllipseToCircle(value: Boolean | js.Object): Self = StObject.set(x, "convertEllipseToCircle", value.asInstanceOf[js.Any])
  }
}
