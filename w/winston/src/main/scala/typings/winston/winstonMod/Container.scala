package typings.winston.winstonMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container
  extends Instantiable0[Container]
     with Instantiable1[/* options */ LoggerOptions, Container] {
  var loggers: Map[String, Logger] = js.native
  var options: LoggerOptions = js.native
  def add(id: String): Logger = js.native
  def add(id: String, options: LoggerOptions): Logger = js.native
  def close(): Unit = js.native
  def close(id: String): Unit = js.native
  def get(id: String): Logger = js.native
  def get(id: String, options: LoggerOptions): Logger = js.native
  def has(id: String): Boolean = js.native
}

@JSImport("winston", "Container")
@js.native
class ContainerCls () extends Container {
  def this(options: LoggerOptions) = this()
}

