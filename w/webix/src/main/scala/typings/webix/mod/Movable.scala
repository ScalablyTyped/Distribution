package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Movable extends StObject {
  
  @JSName("$dragCreate")
  def $dragCreate(args: Any*): Any
  @JSName("$dragCreate")
  var $dragCreate_Original: WebixCallback
  
  @JSName("$dragDestroy")
  def $dragDestroy(args: Any*): Any
  @JSName("$dragDestroy")
  var $dragDestroy_Original: WebixCallback
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback
}
object Movable {
  
  @JSImport("webix", "Movable")
  @js.native
  val ^ : Movable = js.native
  
  extension [Self <: Movable](x: Self) {
    
    inline def set$dragCreate(value: WebixCallback): Self = StObject.set(x, "$dragCreate", value.asInstanceOf[js.Any])
    
    inline def set$dragDestroy(value: WebixCallback): Self = StObject.set(x, "$dragDestroy", value.asInstanceOf[js.Any])
    
    inline def set$dragPos(value: WebixCallback): Self = StObject.set(x, "$dragPos", value.asInstanceOf[js.Any])
  }
}
