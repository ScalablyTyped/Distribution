package typings.yeomanTest.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends EventEmitter {
  
  def enforceUpdate(env: Env): this.type = js.native
  
  var queues: js.Array[String] = js.native
}
