package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTSpan
  extends StObject
     with IASTSpan
object ASTSpan {
  
  @scala.inline
  def apply(_end: Double, _start: Double, end: () => Double, start: () => Double): ASTSpan = {
    val __obj = js.Dynamic.literal(_end = _end.asInstanceOf[js.Any], _start = _start.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[ASTSpan]
  }
}
