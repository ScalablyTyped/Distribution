package typings.uiBox.splitPropsMod

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitProps[P, K /* <: /* keyof P */ String */] extends js.Object {
  var matchedProps: Pick[P, K] = js.native
  var remainingProps: Omit[P, K] = js.native
}

object SplitProps {
  @scala.inline
  def apply[P, /* <: / * keyof P * / java.lang.String */ K](matchedProps: Pick[P, K], remainingProps: Omit[P, K]): SplitProps[P, K] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitProps[P, K]]
  }
  @scala.inline
  implicit class SplitPropsOps[Self <: SplitProps[_, _], P, /* <: / * keyof P * / java.lang.String */ K] (val x: Self with (SplitProps[P, K])) extends AnyVal {
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
    def setMatchedProps(value: Pick[P, K]): Self = this.set("matchedProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemainingProps(value: Omit[P, K]): Self = this.set("remainingProps", value.asInstanceOf[js.Any])
  }
  
}

