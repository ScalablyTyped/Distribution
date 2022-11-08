package typings.tokenStream

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("token-stream", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with TokenStream[T] {
    def this(tokens: js.Array[T]) = this()
    
    /* CompleteClass */
    override def advance(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def defer(token: T): Unit = js.native
    
    /* CompleteClass */
    override def lookahead(index: Double): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def peek(): js.UndefOr[T] = js.native
  }
  
  trait TokenStream[T] extends StObject {
    
    def advance(): js.UndefOr[T]
    
    def defer(token: T): Unit
    
    def lookahead(index: Double): js.UndefOr[T]
    
    def peek(): js.UndefOr[T]
  }
  object TokenStream {
    
    inline def apply[T](
      advance: () => js.UndefOr[T],
      defer: T => Unit,
      lookahead: Double => js.UndefOr[T],
      peek: () => js.UndefOr[T]
    ): TokenStream[T] = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction0(advance), defer = js.Any.fromFunction1(defer), lookahead = js.Any.fromFunction1(lookahead), peek = js.Any.fromFunction0(peek))
      __obj.asInstanceOf[TokenStream[T]]
    }
    
    extension [Self <: TokenStream[?], T](x: Self & TokenStream[T]) {
      
      inline def setAdvance(value: () => js.UndefOr[T]): Self = StObject.set(x, "advance", js.Any.fromFunction0(value))
      
      inline def setDefer(value: T => Unit): Self = StObject.set(x, "defer", js.Any.fromFunction1(value))
      
      inline def setLookahead(value: Double => js.UndefOr[T]): Self = StObject.set(x, "lookahead", js.Any.fromFunction1(value))
      
      inline def setPeek(value: () => js.UndefOr[T]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    }
  }
}
