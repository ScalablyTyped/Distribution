package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.MongosOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "Mongos")
@js.native
class Mongos protected ()
  extends typings.typeorm.mongodbTypingsMod.Mongos {
  /**
    *
    * @param servers A seedlist of servers participating in the replicaset.
    * @param options Optional.
    */
  def this(servers: js.Array[typings.typeorm.mongodbTypingsMod.Server]) = this()
  def this(servers: js.Array[typings.typeorm.mongodbTypingsMod.Server], options: MongosOptions) = this()
}
