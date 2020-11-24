package typings.writeGood.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explanation extends js.Object {
  
  var explanation: String = js.native
  
  var fn: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any = js.native
}
object Explanation {
  
  @scala.inline
  def apply(
    explanation: String,
    fn: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any
  ): Explanation = {
    val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit class ExplanationOps[Self <: Explanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WriteGood */ js.Any): Self = this.set("fn", value.asInstanceOf[js.Any])
  }
}
