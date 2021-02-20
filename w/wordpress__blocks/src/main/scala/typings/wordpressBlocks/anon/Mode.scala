package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.INLINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends StObject {
  
  var mode: INLINE = js.native
}
object Mode {
  
  @scala.inline
  def apply(mode: INLINE): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeMutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: INLINE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
