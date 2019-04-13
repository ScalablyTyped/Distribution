package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container
  extends org.scalablytyped.runtime.Instantiable0[Container]
     with org.scalablytyped.runtime.Instantiable1[/* options */ LoggerOptions, Container] {
  var loggers: stdLib.Map[java.lang.String, Logger] = js.native
  var options: LoggerOptions = js.native
  def add(id: java.lang.String): Logger = js.native
  def add(id: java.lang.String, options: LoggerOptions): Logger = js.native
  def close(): scala.Unit = js.native
  def close(id: java.lang.String): scala.Unit = js.native
  def get(id: java.lang.String): Logger = js.native
  def get(id: java.lang.String, options: LoggerOptions): Logger = js.native
  def has(id: java.lang.String): scala.Boolean = js.native
}

@JSImport("winston", "Container")
@js.native
class ContainerCls () extends Container {
  def this(options: LoggerOptions) = this()
}

