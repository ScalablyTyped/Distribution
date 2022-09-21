package typings.walkSync.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwritev extends StObject {
  
  def apply(
    fd: Double,
    buffers: js.Array[js.typedarray.ArrayBufferView],
    cb: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[js.typedarray.ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffers: js.Array[js.typedarray.ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[js.typedarray.ArrayBufferView], 
      Unit
    ]
  ): Unit = js.native
}
