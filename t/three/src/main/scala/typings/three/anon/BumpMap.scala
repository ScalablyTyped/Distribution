package typings.three.anon

import typings.three.uniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BumpMap extends StObject {
  
  var bumpMap: IUniform = js.native
  
  var bumpScale: IUniform = js.native
}
object BumpMap {
  
  @scala.inline
  def apply(bumpMap: IUniform, bumpScale: IUniform): BumpMap = {
    val __obj = js.Dynamic.literal(bumpMap = bumpMap.asInstanceOf[js.Any], bumpScale = bumpScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpMap]
  }
  
  @scala.inline
  implicit class BumpMapMutableBuilder[Self <: BumpMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBumpMap(value: IUniform): Self = StObject.set(x, "bumpMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBumpScale(value: IUniform): Self = StObject.set(x, "bumpScale", value.asInstanceOf[js.Any])
  }
}
