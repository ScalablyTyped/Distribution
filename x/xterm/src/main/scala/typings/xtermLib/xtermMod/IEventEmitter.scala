package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventEmitter extends js.Object {
  def addDisposableListener(`type`: java.lang.String, handler: js.Function1[/* repeated */js.Any, scala.Unit]): IDisposable = js.native
  def emit(`type`: java.lang.String): scala.Unit = js.native
  def emit(`type`: java.lang.String, data: js.Any): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
}

