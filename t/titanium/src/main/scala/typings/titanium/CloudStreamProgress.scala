package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback as a request is transmitted or received.
  */
trait CloudStreamProgress extends js.Object {
  /**
  	 * A value from 0.0-1.0 with the progress of the exchange.
  	 */
  var progress: js.UndefOr[Double] = js.undefined
  /**
  	 * The URL for the request, to help identify it.
  	 */
  var url: js.UndefOr[String] = js.undefined
}

object CloudStreamProgress {
  @scala.inline
  def apply(progress: Int | Double = null, url: String = null): CloudStreamProgress = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudStreamProgress]
  }
}

