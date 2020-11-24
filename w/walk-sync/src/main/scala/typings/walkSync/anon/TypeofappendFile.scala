package typings.walkSync.anon

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappendFile extends js.Object {
  
  def apply(file: Double, data: String, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: Uint8Array, callback: NoParamCallback): Unit = js.native
  def apply(file: Double, data: Uint8Array, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: String, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: Uint8Array, callback: NoParamCallback): Unit = js.native
  def apply(file: PathLike, data: Uint8Array, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
}
