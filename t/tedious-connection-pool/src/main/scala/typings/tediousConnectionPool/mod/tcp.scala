package typings.tediousConnectionPool.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tedious Connection Pool Class
  */
@js.native
trait tcp extends EventEmitter {
  
  /**
    * acquires a connection from the pool
    * @param callback invoked when the connection is retrieved and ready
    */
  def acquire(callback: ConnectionCallback): Unit = js.native
  
  /**
    * closes opened connections
    */
  def drain(): Unit = js.native
}
