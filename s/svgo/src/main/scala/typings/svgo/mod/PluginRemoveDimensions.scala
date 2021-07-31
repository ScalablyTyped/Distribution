package typings.svgo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginRemoveDimensions
  extends StObject
     with PluginConfig {
  
  var removeDimensions: Boolean | js.Object
}
object PluginRemoveDimensions {
  
  @scala.inline
  def apply(removeDimensions: Boolean | js.Object): PluginRemoveDimensions = {
    val __obj = js.Dynamic.literal(removeDimensions = removeDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginRemoveDimensions]
  }
  
  @scala.inline
  implicit class PluginRemoveDimensionsMutableBuilder[Self <: PluginRemoveDimensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemoveDimensions(value: Boolean | js.Object): Self = StObject.set(x, "removeDimensions", value.asInstanceOf[js.Any])
  }
}
