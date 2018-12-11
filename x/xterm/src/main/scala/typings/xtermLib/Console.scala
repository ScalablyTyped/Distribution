package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Console extends js.Object {
  var memory: js.Any = js.native
  def assert(): scala.Unit = js.native
  def assert(condition: scala.Boolean): scala.Unit = js.native
  def assert(condition: scala.Boolean, message: java.lang.String, data: js.Any*): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def count(): scala.Unit = js.native
  def count(label: java.lang.String): scala.Unit = js.native
  def debug(): scala.Unit = js.native
  def debug(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def dir(): scala.Unit = js.native
  def dir(value: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def dirxml(value: js.Any): scala.Unit = js.native
  def error(): scala.Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def exception(): scala.Unit = js.native
  def exception(message: java.lang.String, optionalParams: js.Any*): scala.Unit = js.native
  def group(): scala.Unit = js.native
  def group(groupTitle: java.lang.String, optionalParams: js.Any*): scala.Unit = js.native
  def groupCollapsed(): scala.Unit = js.native
  def groupCollapsed(groupTitle: java.lang.String, optionalParams: js.Any*): scala.Unit = js.native
  def groupEnd(): scala.Unit = js.native
  def info(): scala.Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def log(): scala.Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def markTimeline(): scala.Unit = js.native
  def markTimeline(label: java.lang.String): scala.Unit = js.native
  def profile(): scala.Unit = js.native
  def profile(reportName: java.lang.String): scala.Unit = js.native
  def profileEnd(): scala.Unit = js.native
  def profileEnd(reportName: java.lang.String): scala.Unit = js.native
  def table(tabularData: js.Any*): scala.Unit = js.native
  def time(): scala.Unit = js.native
  def time(label: java.lang.String): scala.Unit = js.native
  def timeEnd(): scala.Unit = js.native
  def timeEnd(label: java.lang.String): scala.Unit = js.native
  def timeStamp(): scala.Unit = js.native
  def timeStamp(label: java.lang.String): scala.Unit = js.native
  def timeline(): scala.Unit = js.native
  def timeline(label: java.lang.String): scala.Unit = js.native
  def timelineEnd(): scala.Unit = js.native
  def timelineEnd(label: java.lang.String): scala.Unit = js.native
  def trace(): scala.Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
  def warn(): scala.Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): scala.Unit = js.native
}

@JSGlobal("Console")
@js.native
object Console
  extends ScalablyTyped.runtime.Instantiable0[Console]

