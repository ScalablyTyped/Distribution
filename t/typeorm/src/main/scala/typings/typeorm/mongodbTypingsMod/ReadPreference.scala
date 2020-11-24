package typings.typeorm.mongodbTypingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "ReadPreference")
@js.native
class ReadPreference protected () extends js.Object {
  def this(mode: String, tags: js.Object) = this()
  
  /**
    * Validate if a mode is legal.
    */
  def isValid(mode: String): Boolean = js.native
  
  /**
    * The ReadPreference mode as listed above.
    */
  var mode: String = js.native
  
  /**
    * An object representing read preference tags.
    */
  var tags: js.Any = js.native
}
/* static members */
@JSImport("typeorm/driver/mongodb/typings", "ReadPreference")
@js.native
object ReadPreference extends js.Object {
  
  /**
    * All modes read from among the nearest candidates, but unlike other modes, NEAREST will include both the primary and all secondaries in the random selection.
    */
  var NEAREST: String = js.native
  
  /**
    * Read from primary only. All operations produce an error (throw an exception where applicable) if primary is unavailable. Cannot be combined with tags (This is the default.).
    */
  var PRIMARY: String = js.native
  
  /**
    * Read from primary if available, otherwise a secondary.
    */
  var PRIMARY_PREFERRED: String = js.native
  
  /**
    * Read from secondary if available, otherwise error.
    */
  var SECONDARY: String = js.native
  
  /**
    * Read from a secondary if available, otherwise read from the primary.
    */
  var SECONDARY_PREFERRED: String = js.native
  
  /**
    * Validate if a mode is legal.
    */
  def isValid(mode: String): Boolean = js.native
}
