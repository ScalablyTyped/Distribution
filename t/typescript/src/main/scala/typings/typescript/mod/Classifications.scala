package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classifications extends js.Object {
  var endOfLineState: EndOfLineState = js.native
  var spans: js.Array[Double] = js.native
}

object Classifications {
  @scala.inline
  def apply(endOfLineState: EndOfLineState, spans: js.Array[Double]): Classifications = {
    val __obj = js.Dynamic.literal(endOfLineState = endOfLineState.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classifications]
  }
  @scala.inline
  implicit class ClassificationsOps[Self <: Classifications] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndOfLineState(value: EndOfLineState): Self = this.set("endOfLineState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpansVarargs(value: Double*): Self = this.set("spans", js.Array(value :_*))
    @scala.inline
    def setSpans(value: js.Array[Double]): Self = this.set("spans", value.asInstanceOf[js.Any])
  }
  
}

