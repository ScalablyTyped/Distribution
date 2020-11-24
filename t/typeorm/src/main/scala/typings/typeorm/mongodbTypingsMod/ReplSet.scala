package typings.typeorm.mongodbTypingsMod

import typings.typeorm.platformPlatformToolsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "ReplSet")
@js.native
class ReplSet protected () extends EventEmitter {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[Server]) = this()
  def this(servers: js.Array[Server], options: ReplSetOptions) = this()
  
  /**
    * All raw connections
    */
  def connections(): js.Array[_] = js.native
}
