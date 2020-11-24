package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.ReplSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "ReplSet")
@js.native
class ReplSet protected ()
  extends typings.typeorm.mongodbTypingsMod.ReplSet {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[typings.typeorm.mongodbTypingsMod.Server]) = this()
  def this(servers: js.Array[typings.typeorm.mongodbTypingsMod.Server], options: ReplSetOptions) = this()
}
