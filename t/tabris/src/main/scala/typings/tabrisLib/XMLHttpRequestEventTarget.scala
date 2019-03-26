package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventTarget extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListener, useCapture: scala.Boolean): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: tabrisLib.tabrisLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: tabrisLib.tabrisLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: tabrisLib.tabrisLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: tabrisLib.tabrisLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ErrorEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: tabrisLib.tabrisLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: tabrisLib.tabrisLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: tabrisLib.tabrisLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: tabrisLib.tabrisLibStrings.loadend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: tabrisLib.tabrisLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: tabrisLib.tabrisLibStrings.loadstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: tabrisLib.tabrisLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: tabrisLib.tabrisLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: tabrisLib.tabrisLibStrings.timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: tabrisLib.tabrisLibStrings.timeout,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def onabort(`this`: XMLHttpRequestEventTarget, ev: Event): js.Any = js.native
  def onerror(`this`: XMLHttpRequestEventTarget, ev: ErrorEvent): js.Any = js.native
  def onload(`this`: XMLHttpRequestEventTarget, ev: Event): js.Any = js.native
  def onloadend(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent): js.Any = js.native
  def onloadstart(`this`: XMLHttpRequestEventTarget, ev: Event): js.Any = js.native
  def onprogress(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent): js.Any = js.native
  def ontimeout(`this`: XMLHttpRequestEventTarget, ev: ProgressEvent): js.Any = js.native
}

