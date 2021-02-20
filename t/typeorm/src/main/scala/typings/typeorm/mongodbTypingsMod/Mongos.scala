package typings.typeorm.mongodbTypingsMod

import typings.typeorm.platformPlatformToolsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "Mongos")
@js.native
class Mongos protected () extends EventEmitter {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[Server]) = this()
  def this(servers: js.Array[Server], options: MongosOptions) = this()
  
  /**
    * All raw connections
    */
  def connections(): js.Array[_] = js.native
}
