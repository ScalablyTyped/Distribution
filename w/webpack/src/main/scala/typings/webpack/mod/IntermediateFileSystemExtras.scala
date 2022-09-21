package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntermediateFileSystemExtras extends StObject {
  
  def close(
    arg0: Double,
    arg1: js.Function1[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      Unit
    ]
  ): Unit
  
  def createWriteStream(arg0: String): WritableStream[Any]
  
  def mkdirSync(arg0: String): Unit
  
  def open(
    arg0: String,
    arg1: String,
    arg2: js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit
  
  def read(
    arg0: Double,
    arg1: Buffer,
    arg2: Double,
    arg3: Double,
    arg4: Double,
    arg5: js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit
  
  def rename(
    arg0: String,
    arg1: String,
    arg2: js.Function1[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      Unit
    ]
  ): Unit
}
object IntermediateFileSystemExtras {
  
  inline def apply(
    close: (Double, js.Function1[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      Unit
    ]) => Unit,
    createWriteStream: String => WritableStream[Any],
    mkdirSync: String => Unit,
    open: (String, String, js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[Double], 
      Unit
    ]) => Unit,
    read: (Double, Buffer, Double, Double, Double, js.Function2[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      /* arg1 */ js.UndefOr[Double], 
      Unit
    ]) => Unit,
    rename: (String, String, js.Function1[
      /* arg0 */ js.UndefOr[
        Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
      ], 
      Unit
    ]) => Unit
  ): IntermediateFileSystemExtras = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction2(close), createWriteStream = js.Any.fromFunction1(createWriteStream), mkdirSync = js.Any.fromFunction1(mkdirSync), open = js.Any.fromFunction3(open), read = js.Any.fromFunction6(read), rename = js.Any.fromFunction3(rename))
    __obj.asInstanceOf[IntermediateFileSystemExtras]
  }
  
  extension [Self <: IntermediateFileSystemExtras](x: Self) {
    
    inline def setClose(
      value: (Double, js.Function1[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "close", js.Any.fromFunction2(value))
    
    inline def setCreateWriteStream(value: String => WritableStream[Any]): Self = StObject.set(x, "createWriteStream", js.Any.fromFunction1(value))
    
    inline def setMkdirSync(value: String => Unit): Self = StObject.set(x, "mkdirSync", js.Any.fromFunction1(value))
    
    inline def setOpen(
      value: (String, String, js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[Double], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
    
    inline def setRead(
      value: (Double, Buffer, Double, Double, Double, js.Function2[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          /* arg1 */ js.UndefOr[Double], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "read", js.Any.fromFunction6(value))
    
    inline def setRename(
      value: (String, String, js.Function1[
          /* arg0 */ js.UndefOr[
            Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any)
          ], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "rename", js.Any.fromFunction3(value))
  }
}
