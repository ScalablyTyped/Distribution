package typings.xelib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ContainerHandle = typings.xelib.mod.Handle with js.Object
  
  type ElementHandle = typings.xelib.mod.Handle with js.Object
  
  type FileHandle = typings.xelib.mod.ContainerHandle with js.Object
  
  type Handle = scala.Double with js.Object
  
  type I[T] = T
  
  type NodeTreeHandle = typings.xelib.mod.Handle with js.Object
  
  type RecordHandle = typings.xelib.mod.ElementHandle with js.Object
  
  type Zeroable[H /* <: typings.xelib.mod.Handle */] = H | typings.xelib.xelibNumbers.`0`
}
