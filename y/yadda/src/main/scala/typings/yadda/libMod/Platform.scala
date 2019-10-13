package typings.yadda.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "Platform")
@js.native
class Platform ()
  extends typings.yadda.libPlatformMod.Platform {
  /* CompleteClass */
  override def get_container(): js.Any = js.native
  /* CompleteClass */
  override def is_browser(): Boolean = js.native
  /* CompleteClass */
  override def is_karma(): Boolean = js.native
   // Window | NodeJS.Global | Phantom
  /* CompleteClass */
  override def is_node(): Boolean = js.native
  /* CompleteClass */
  override def is_phantom(): Boolean = js.native
}

