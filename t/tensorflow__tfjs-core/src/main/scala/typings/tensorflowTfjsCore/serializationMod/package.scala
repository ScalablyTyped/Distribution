package typings.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serializationMod {
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - typings.tensorflowTfjsCore.serializationMod.ConfigDictArray
    - typings.tensorflowTfjsCore.serializationMod.ConfigDict
  */
  type ConfigDictValue = typings.tensorflowTfjsCore.serializationMod._ConfigDictValue | scala.Boolean | scala.Double | java.lang.String | scala.Null
  
  type FromConfigMethod[T /* <: typings.tensorflowTfjsCore.serializationMod.Serializable */] = js.Function2[
    /* cls */ typings.tensorflowTfjsCore.serializationMod.SerializableConstructor[T], 
    /* config */ typings.tensorflowTfjsCore.serializationMod.ConfigDict, 
    T
  ]
}
