package typings.vision.mod.hapiAugmentingMod

import typings.vision.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerDecorations extends js.Object {
  /**
    * The view handler can be used with routes registered in the same realm as the view manager.
    * The handler takes an options parameter that can be either a string or an object.
    * When the options parameter is a string, it should be the filename and path of the template relative
    * to the templates path configured via the views manager. When the options parameter is an object, it may have the following keys:
    * The rendering context contains the `params`, `payload`, `query`, and `pre` values from the request by default
    * (these can be overriden by values explicitly set via the options).
    * @see {@link https://github.com/hapijs/vision/blob/master/API.md#the-view-handler}
    */
  var view: js.UndefOr[String | Context] = js.native
}

object HandlerDecorations {
  @scala.inline
  def apply(): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerDecorations]
  }
  @scala.inline
  implicit class HandlerDecorationsOps[Self <: HandlerDecorations] (val x: Self) extends AnyVal {
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
    def setView(value: String | Context): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

