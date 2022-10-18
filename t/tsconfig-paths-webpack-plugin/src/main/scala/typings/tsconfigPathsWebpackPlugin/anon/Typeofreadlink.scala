package typings.tsconfigPathsWebpackPlugin.anon

import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofreadlink extends StObject {
  
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: EncodingOption,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ String), Unit]
  ): Unit = js.native
}
