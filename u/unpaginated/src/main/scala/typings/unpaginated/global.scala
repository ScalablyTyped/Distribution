package typings.unpaginated

import typings.unpaginated.anon.Cursor
import typings.unpaginated.anon.CursorData
import typings.unpaginated.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object unpaginated {
    
    inline def apply[T](fn: js.Function1[/* page */ Double, js.Promise[js.Array[T] | Data[T]]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    
    @JSGlobal("unpaginated")
    @js.native
    val ^ : js.Any = js.native
    
    inline def byCursor[T](
      fn: js.Function1[
          (/* cursor */ Double) | (/* cursor */ String), 
          js.Promise[Cursor[T] | CursorData[T]]
        ]
    ): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("byCursor")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    
    inline def byOffset[T](fn: js.Function1[/* offset */ Double, js.Promise[js.Array[T] | Data[T]]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("byOffset")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
    
    inline def byPage[T](fn: js.Function1[/* page */ Double, js.Promise[js.Array[T] | Data[T]]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("byPage")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  }
}
