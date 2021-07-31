package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.treelinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeLinksTransform
  extends StObject
     with _Transforms {
  
  var `type`: treelinks
}
object TreeLinksTransform {
  
  @scala.inline
  def apply(): TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("treelinks")
    __obj.asInstanceOf[TreeLinksTransform]
  }
  
  @scala.inline
  implicit class TreeLinksTransformMutableBuilder[Self <: TreeLinksTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: treelinks): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
