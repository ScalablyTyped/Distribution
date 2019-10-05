package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to [createStream](Titanium.Stream.createStream).
  */
trait CreateStreamArgs extends js.Object {
  /**
  	 * Mode to open the stream in.
  	 */
  var mode: js.UndefOr[Double] = js.undefined
  /**
  	 * Object that the stream will read from or write to.
  	 */
  var source: js.UndefOr[Blob | Buffer] = js.undefined
}

object CreateStreamArgs {
  @scala.inline
  def apply(mode: Int | Double = null, source: Blob | Buffer = null): CreateStreamArgs = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamArgs]
  }
}

