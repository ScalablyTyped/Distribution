package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blockversion extends StObject {
  
  var block_version: Double
}
object Blockversion {
  
  inline def apply(block_version: Double): Blockversion = {
    val __obj = js.Dynamic.literal(block_version = block_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blockversion]
  }
  
  extension [Self <: Blockversion](x: Self) {
    
    inline def setBlock_version(value: Double): Self = StObject.set(x, "block_version", value.asInstanceOf[js.Any])
  }
}
