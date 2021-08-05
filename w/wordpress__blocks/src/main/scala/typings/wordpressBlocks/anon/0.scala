package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.BLOCKS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var mode: BLOCKS
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(mode = "BLOCKS")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setMode(value: BLOCKS): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
