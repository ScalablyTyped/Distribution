package typings.walkSync.anon

import typings.node.fsMod.ReadAsyncOptions
import typings.node.fsMod.ReadPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofread extends StObject {
  
  def apply(
    fd: Double,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.ArrayBufferView, 
      Unit
    ]
  ): Unit = js.native
  def apply[TBuffer /* <: js.typedarray.ArrayBufferView */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* bytesRead */ Double, 
      /* buffer */ TBuffer, 
      Unit
    ]
  ): Unit = js.native
  def apply[TBuffer /* <: js.typedarray.ArrayBufferView */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* bytesRead */ Double, 
      /* buffer */ TBuffer, 
      Unit
    ]
  ): Unit = js.native
  def apply[TBuffer /* <: js.typedarray.ArrayBufferView */](
    fd: Double,
    options: ReadAsyncOptions[TBuffer],
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* bytesRead */ Double, 
      /* buffer */ TBuffer, 
      Unit
    ]
  ): Unit = js.native
}
