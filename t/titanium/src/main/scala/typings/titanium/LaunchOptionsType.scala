package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary object of parameters used to identify an incoming URL that is handled
  * by the application.
  */
@js.native
trait LaunchOptionsType extends js.Object {
  /**
    * The application or service that triggered the handled URL.
    */
  var source: js.UndefOr[java.lang.String] = js.native
  /**
    * The url that was triggered by the application or service.
    */
  var url: js.UndefOr[java.lang.String] = js.native
}

object LaunchOptionsType {
  @scala.inline
  def apply(): LaunchOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOptionsType]
  }
  @scala.inline
  implicit class LaunchOptionsTypeOps[Self <: LaunchOptionsType] (val x: Self) extends AnyVal {
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
    def setSource(value: java.lang.String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

