package typings.typedoc.serializationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization", "ProjectReflectionSerializer")
@js.native
class ProjectReflectionSerializer protected ()
  extends typings.typedoc.serializersMod.ProjectReflectionSerializer {
  def this(owner: typings.typedoc.serializerMod.Serializer) = this()
}
/* static members */
object ProjectReflectionSerializer {
  
  @JSImport("typedoc/dist/lib/serialization", "ProjectReflectionSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization", "ProjectReflectionSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  @scala.inline
  def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
