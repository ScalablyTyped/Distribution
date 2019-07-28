package typings.atTensorflowTfjsDashCore.distSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/serialization", "Serializable")
@js.native
abstract class Serializable () extends js.Object {
  /**
    * Return the class name for this class to use in serialization contexts.
    *
    * Generally speaking this will be the same thing that constructor.name
    * would have returned.  However, the class name needs to be robust
    * against minification for serialization/deserialization to work properly.
    *
    * There's also places such as initializers.VarianceScaling, where
    * implementation details between different languages led to different
    * class hierarchies and a non-leaf node is used for serialization purposes.
    */
  def getClassName(): String = js.native
  /**
    * Return all the non-weight state needed to serialize this object.
    */
  def getConfig(): ConfigDict = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/serialization", "Serializable")
@js.native
object Serializable extends js.Object {
  /**
    * Creates an instance of T from a ConfigDict.
    *
    * This works for most descendants of serializable.  A few need to
    * provide special handling.
    * @param cls A Constructor for the class to instantiate.
    * @param config The Configuration for the object.
    */
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

