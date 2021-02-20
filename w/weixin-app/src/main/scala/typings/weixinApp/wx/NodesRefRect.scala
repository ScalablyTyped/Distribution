package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesRefRect extends RectArea {
  
  /** 节点的dataset */
  var dataset: js.Any = js.native
  
  /** 节点的ID */
  var id: String = js.native
}
object NodesRefRect {
  
  @scala.inline
  def apply(
    bottom: Double,
    dataset: js.Any,
    height: Double,
    id: String,
    left: Double,
    right: Double,
    top: Double,
    width: Double
  ): NodesRefRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesRefRect]
  }
  
  @scala.inline
  implicit class NodesRefRectMutableBuilder[Self <: NodesRefRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: js.Any): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
