package typings.wordpressComponents.anon

import typings.wordpressComponents.wordpressComponentsStrings.`bottom left`
import typings.wordpressComponents.wordpressComponentsStrings.`bottom right`
import typings.wordpressComponents.wordpressComponentsStrings.`top left`
import typings.wordpressComponents.wordpressComponentsStrings.`top right`
import typings.wordpressComponents.wordpressComponentsStrings.bottom
import typings.wordpressComponents.wordpressComponentsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Origin extends js.Object {
  var origin: js.UndefOr[top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)] = js.native
}

object Origin {
  @scala.inline
  def apply(): Origin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Origin]
  }
  @scala.inline
  implicit class OriginOps[Self <: Origin] (val x: Self) extends AnyVal {
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
    def setOrigin(value: top | (`top left`) | (`top right`) | bottom | (`bottom left`) | (`bottom right`)): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

