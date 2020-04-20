package typings.winston.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionHandler extends Instantiable1[/* logger */ Logger, ExceptionHandler] {
  var catcher: js.Function | Boolean = js.native
  var handlers: Map[_, _] = js.native
  var logger: Logger = js.native
  def getAllInfo(err: String): js.Object = js.native
  def getAllInfo(err: Error): js.Object = js.native
  def getOsInfo(): js.Object = js.native
  def getProcessInfo(): js.Object = js.native
  def getTrace(err: Error): js.Object = js.native
  def handle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
  def unhandle(transports: typings.winstonTransport.mod.^ *): Unit = js.native
}

@JSImport("winston", "ExceptionHandler")
@js.native
object ExceptionHandler extends TopLevel[ExceptionHandler]

