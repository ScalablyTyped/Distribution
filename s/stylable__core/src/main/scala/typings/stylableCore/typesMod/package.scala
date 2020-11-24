package typings.stylableCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CSSObject = js.Any with js.Object
  
  type ModuleResolver = js.Function2[
    /* directoryPath */ java.lang.String, 
    /* request */ java.lang.String, 
    java.lang.String
  ]
  
  type PartialObject[T] = typings.std.Partial[T] with js.Object
  
  type StateArguments = js.Array[typings.stylableCore.typesMod.StateTypeValidator | java.lang.String]
}
