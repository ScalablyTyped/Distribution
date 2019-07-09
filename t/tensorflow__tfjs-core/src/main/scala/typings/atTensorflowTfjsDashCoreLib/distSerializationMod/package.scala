package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSerializationMod {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - ConfigDictArray
    - ConfigDict
  */
  type ConfigDictValue = _ConfigDictValue | scala.Boolean | scala.Double | java.lang.String | scala.Null
  type FromConfigMethod[T /* <: Serializable */] = js.Function2[/* cls */ SerializableConstructor[T], /* config */ ConfigDict, T]
}
