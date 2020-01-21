package typings.tensorflowTfjsCore.serializationMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableConstructor[T /* <: Serializable */]
  extends Instantiable1[/* args (repeated) */ js.Any, T] {
  var className: String = js.native
  @JSName("fromConfig")
  var fromConfig_Original: FromConfigMethod[T] = js.native
  def fromConfig(cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

