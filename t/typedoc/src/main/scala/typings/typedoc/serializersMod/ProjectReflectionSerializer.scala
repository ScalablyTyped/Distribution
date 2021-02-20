package typings.typedoc.serializersMod

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers", "ProjectReflectionSerializer")
@js.native
class ProjectReflectionSerializer protected ()
  extends typings.typedoc.serializersReflectionsMod.ProjectReflectionSerializer {
  def this(owner: Serializer) = this()
}
/* static members */
object ProjectReflectionSerializer {
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "ProjectReflectionSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "ProjectReflectionSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  @scala.inline
  def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
