package typings.xstate.schedulerMod

import typings.xstate.anon.PartialSchedulerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xstate/lib/scheduler", "Scheduler")
@js.native
class Scheduler () extends js.Object {
  def this(options: PartialSchedulerOptions) = this()
  
  def clear(): Unit = js.native
  
  var flushEvents: js.Any = js.native
  
  def initialize(): Unit = js.native
  def initialize(callback: js.Function0[Unit]): Unit = js.native
  
  var initialized: js.Any = js.native
  
  var options: js.Any = js.native
  
  var process: js.Any = js.native
  
  var processingEvent: js.Any = js.native
  
  var queue: js.Any = js.native
  
  def schedule(task: js.Function0[Unit]): Unit = js.native
}
