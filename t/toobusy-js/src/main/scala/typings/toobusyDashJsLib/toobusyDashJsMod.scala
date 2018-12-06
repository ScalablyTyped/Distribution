package typings
package toobusyDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("toobusy-js", JSImport.Namespace)
@js.native
object toobusyDashJsMod extends js.Object {
  /**
   * Main export function.
   * @return True if node process is too busy.
   */
  def apply(): scala.Boolean = js.native
  /**
       * Sets or gets the current check interval.
       * If you want more sensitive checking, set a faster (lower) interval. A lower maxLag can also create a more
       * sensitive check.
       * @param  [newInterval] New interval to set. If not provided, will return the existing interval.
       * @return               New or existing interval.
       */
  def interval(): scala.Double = js.native
  /**
       * Sets or gets the current check interval.
       * If you want more sensitive checking, set a faster (lower) interval. A lower maxLag can also create a more
       * sensitive check.
       * @param  [newInterval] New interval to set. If not provided, will return the existing interval.
       * @return               New or existing interval.
       */
  def interval(newInterval: scala.Double): scala.Double = js.native
  /**
       * Returns last lag reading from last check interval.
       * @return Lag in ms.
       */
  def lag(): scala.Double = js.native
  /**
       * Set or get the current max latency threshold. Default is 70ms.
       *
       * Note that if event loop lag goes over this threshold, the process is not always 'too busy' - the farther
       * it goes over the threshold, the more likely the process will be considered too busy.
       *
       * The percentage is equal to the percent over the max lag threshold. So 1.25x over the maxLag will indicate
       * too busy 25% of the time. 2x over the maxLag threshold will indicate too busy 100% of the time.
       * @param  [newLag] New maxLag (highwater) threshold.
       * @return          New or existing maxLag (highwater) threshold.
       */
  def maxLag(): scala.Double = js.native
  /**
       * Set or get the current max latency threshold. Default is 70ms.
       *
       * Note that if event loop lag goes over this threshold, the process is not always 'too busy' - the farther
       * it goes over the threshold, the more likely the process will be considered too busy.
       *
       * The percentage is equal to the percent over the max lag threshold. So 1.25x over the maxLag will indicate
       * too busy 25% of the time. 2x over the maxLag threshold will indicate too busy 100% of the time.
       * @param  [newLag] New maxLag (highwater) threshold.
       * @return          New or existing maxLag (highwater) threshold.
       */
  def maxLag(newLag: scala.Double): scala.Double = js.native
  /**
       * Registers an event listener for lag events,
       * optionally specify a minimum value threshold for events being emitted
       * @param fn                 Function of form onLag(value: number) => void
       * @param [threshold=maxLag] Optional minimum lag value for events to be emitted
       */
  def onLag(fn: js.Function1[/* lag */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
       * Registers an event listener for lag events,
       * optionally specify a minimum value threshold for events being emitted
       * @param fn                 Function of form onLag(value: number) => void
       * @param [threshold=maxLag] Optional minimum lag value for events to be emitted
       */
  def onLag(fn: js.Function1[/* lag */ scala.Double, scala.Unit], threshold: scala.Double): scala.Unit = js.native
  /**
       * Shuts down toobusy.
       *
       * Not necessary to call this manually, only do this if you know what you're doing. `unref()` is called
       * on toobusy's check interval, so it will never keep the server open.
       */
  def shutdown(): scala.Unit = js.native
  /**
       * Set or get the smoothing factor. Default is 0.3333....
       *
       * The smoothing factor per the standard exponential smoothing formula "αtn + (1-α)tn-1"
       * See: https://en.wikipedia.org/wiki/Exponential_smoothing
       *
       * @param  [newFactor] New smoothing factor.
       * @return             New or existing smoothing factor.
       */
  def smoothingFactor(): scala.Double = js.native
  /**
       * Set or get the smoothing factor. Default is 0.3333....
       *
       * The smoothing factor per the standard exponential smoothing formula "αtn + (1-α)tn-1"
       * See: https://en.wikipedia.org/wiki/Exponential_smoothing
       *
       * @param  [newFactor] New smoothing factor.
       * @return             New or existing smoothing factor.
       */
  def smoothingFactor(newFactor: scala.Double): scala.Double = js.native
  def started(): scala.Boolean = js.native
}

