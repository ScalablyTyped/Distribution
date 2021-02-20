package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.treelinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeLinksTransform extends _Transforms {
  
  var `type`: treelinks = js.native
}
object TreeLinksTransform {
  
  @scala.inline
  def apply(`type`: treelinks): TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeLinksTransform]
  }
  
  @scala.inline
  implicit class TreeLinksTransformMutableBuilder[Self <: TreeLinksTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: treelinks): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
