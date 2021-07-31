package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Increment extends StObject {
  
  var increment: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Increment {
  
  @scala.inline
  def apply(): Increment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Increment]
  }
  
  @scala.inline
  implicit class IncrementMutableBuilder[Self <: Increment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
