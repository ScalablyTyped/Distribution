package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed retrieving the MediaStreamSample . */
trait MediaStreamSourceSampleRequestDeferral extends js.Object {
  /** Reports that the application has completed retrieving the MediaStreamSample . */
  def complete(): Unit
}

object MediaStreamSourceSampleRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceSampleRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceSampleRequestDeferral]
  }
}

