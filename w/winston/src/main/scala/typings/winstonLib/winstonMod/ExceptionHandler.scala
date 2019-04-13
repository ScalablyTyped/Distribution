package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionHandler
  extends org.scalablytyped.runtime.Instantiable1[/* logger */ Logger, ExceptionHandler] {
  var catcher: js.Function | scala.Boolean = js.native
  var handlers: stdLib.Map[_, _] = js.native
  var logger: Logger = js.native
  def getAllInfo(err: java.lang.String): js.Object = js.native
  def getAllInfo(err: stdLib.Error): js.Object = js.native
  def getOsInfo(): js.Object = js.native
  def getProcessInfo(): js.Object = js.native
  def getTrace(err: stdLib.Error): js.Object = js.native
  def handle(transports: winstonDashTransportLib.winstonDashTransportMod.^ *): scala.Unit = js.native
  def unhandle(transports: winstonDashTransportLib.winstonDashTransportMod.^ *): scala.Unit = js.native
}

@JSImport("winston", "ExceptionHandler")
@js.native
class ExceptionHandlerCls protected () extends ExceptionHandler {
  def this(logger: Logger) = this()
}

