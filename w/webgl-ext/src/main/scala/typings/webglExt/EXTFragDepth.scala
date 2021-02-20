package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EXTFragDepth extends StObject {
  
  val __EXT_frag_depth: Unit = js.native
}
object EXTFragDepth {
  
  @scala.inline
  def apply(__EXT_frag_depth: Unit): EXTFragDepth = {
    val __obj = js.Dynamic.literal(__EXT_frag_depth = __EXT_frag_depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTFragDepth]
  }
  
  @scala.inline
  implicit class EXTFragDepthMutableBuilder[Self <: EXTFragDepth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__EXT_frag_depth(value: Unit): Self = StObject.set(x, "__EXT_frag_depth", value.asInstanceOf[js.Any])
  }
}
