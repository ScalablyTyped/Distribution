package typings.vscode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoClosingPairs extends StObject {
  
  var autoClosingPairs: js.Array[NotIn] = js.native
}
object AutoClosingPairs {
  
  @scala.inline
  def apply(autoClosingPairs: js.Array[NotIn]): AutoClosingPairs = {
    val __obj = js.Dynamic.literal(autoClosingPairs = autoClosingPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoClosingPairs]
  }
  
  @scala.inline
  implicit class AutoClosingPairsMutableBuilder[Self <: AutoClosingPairs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClosingPairs(value: js.Array[NotIn]): Self = StObject.set(x, "autoClosingPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoClosingPairsVarargs(value: NotIn*): Self = StObject.set(x, "autoClosingPairs", js.Array(value :_*))
  }
}
