package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PerformanceObserver extends js.Object {
  def disconnect(): scala.Unit
  def observe(options: PerformanceObserverInit): scala.Unit
  def takeRecords(): PerformanceEntryList
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver
  extends ScalablyTyped.runtime.Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver]

