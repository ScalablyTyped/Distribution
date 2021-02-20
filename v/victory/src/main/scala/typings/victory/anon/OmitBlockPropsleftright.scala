package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined victory.victory.Omit<victory.victory.BlockProps, 'left' | 'right'> */
@js.native
trait OmitBlockPropsleftright extends StObject {
  
  var bottom: js.UndefOr[Double] = js.native
  
  var top: js.UndefOr[Double] = js.native
}
object OmitBlockPropsleftright {
  
  @scala.inline
  def apply(): OmitBlockPropsleftright = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitBlockPropsleftright]
  }
  
  @scala.inline
  implicit class OmitBlockPropsleftrightMutableBuilder[Self <: OmitBlockPropsleftright] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
