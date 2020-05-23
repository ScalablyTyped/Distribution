package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options passed to <Titanium.Android.createServiceIntent>.
  */
trait ServiceIntentOptions extends js.Object {
  /**
    * One of the `START_*` constants from <Titanium.Android> to specify the "stickiness" of the Service when Android shuts down the host application.
    */
  var startMode: js.UndefOr[Double] = js.undefined
  /**
    * URL for the service's JavaScript.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceIntentOptions {
  @scala.inline
  def apply(startMode: js.UndefOr[Double] = js.undefined, url: java.lang.String = null): ServiceIntentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(startMode)) __obj.updateDynamic("startMode")(startMode.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceIntentOptions]
  }
}

