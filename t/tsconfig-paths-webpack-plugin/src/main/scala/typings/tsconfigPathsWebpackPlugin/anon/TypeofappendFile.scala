package typings.tsconfigPathsWebpackPlugin.anon

import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofappendFile extends StObject {
  
  def apply(file: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = js.native
  def apply(file: PathOrFileDescriptor, data: js.typedarray.Uint8Array, callback: NoParamCallback): Unit = js.native
  def apply(path: PathOrFileDescriptor, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(
    path: PathOrFileDescriptor,
    data: js.typedarray.Uint8Array,
    options: WriteFileOptions,
    callback: NoParamCallback
  ): Unit = js.native
}
