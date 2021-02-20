package typings.typeorm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "ReadPreference")
@js.native
class ReadPreference protected ()
  extends typings.typeorm.typingsMod.ReadPreference {
  def this(mode: String, tags: js.Object) = this()
}
/* static members */
object ReadPreference {
  
  @JSImport("typeorm/browser", "ReadPreference")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * All modes read from among the nearest candidates, but unlike other modes, NEAREST will include both the primary and all secondaries in the random selection.
    */
  @JSImport("typeorm/browser", "ReadPreference.NEAREST")
  @js.native
  def NEAREST: String = js.native
  @scala.inline
  def NEAREST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NEAREST")(x.asInstanceOf[js.Any])
  
  /**
    * Read from primary only. All operations produce an error (throw an exception where applicable) if primary is unavailable. Cannot be combined with tags (This is the default.).
    */
  @JSImport("typeorm/browser", "ReadPreference.PRIMARY")
  @js.native
  def PRIMARY: String = js.native
  @scala.inline
  def PRIMARY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
  
  /**
    * Read from primary if available, otherwise a secondary.
    */
  @JSImport("typeorm/browser", "ReadPreference.PRIMARY_PREFERRED")
  @js.native
  def PRIMARY_PREFERRED: String = js.native
  @scala.inline
  def PRIMARY_PREFERRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY_PREFERRED")(x.asInstanceOf[js.Any])
  
  /**
    * Read from secondary if available, otherwise error.
    */
  @JSImport("typeorm/browser", "ReadPreference.SECONDARY")
  @js.native
  def SECONDARY: String = js.native
  @scala.inline
  def SECONDARY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY")(x.asInstanceOf[js.Any])
  
  /**
    * Read from a secondary if available, otherwise read from the primary.
    */
  @JSImport("typeorm/browser", "ReadPreference.SECONDARY_PREFERRED")
  @js.native
  def SECONDARY_PREFERRED: String = js.native
  @scala.inline
  def SECONDARY_PREFERRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY_PREFERRED")(x.asInstanceOf[js.Any])
  
  /**
    * Validate if a mode is legal.
    */
  @JSImport("typeorm/browser", "ReadPreference.isValid")
  @js.native
  def isValid(mode: String): Boolean = js.native
}
