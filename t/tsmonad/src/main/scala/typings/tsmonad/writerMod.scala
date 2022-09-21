package typings.tsmonad

import typings.tsmonad.monadMod.Eq
import typings.tsmonad.monadMod.Monad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @JSImport("tsmonad/lib/src/writer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tsmonad/lib/src/writer", "Writer")
  @js.native
  open class Writer_[S, T] protected ()
    extends StObject
       with Monad[T]
       with Eq[Writer_[S, T]] {
    def this(story: js.Array[S], value: T) = this()
    
    /* CompleteClass */
    override def bind[U](f: js.Function1[T, Monad[U]]): Monad[U] = js.native
    
    def caseOf[U](patterns: WriterPatterns[S, T, U]): U = js.native
    
    /* CompleteClass */
    override def chain[U](f: js.Function1[T, Monad[U]]): Monad[U] = js.native
    
    def fmap[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
    
    def lift[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
    
    def map[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
    
    /* CompleteClass */
    override def of[U](t: U): Monad[U] = js.native
    
    /* private */ var story: Any = js.native
    
    /* CompleteClass */
    override def unit[U](t: U): Monad[U] = js.native
    
    /* private */ var value: Any = js.native
  }
  /* static members */
  object Writer_ {
    
    @JSImport("tsmonad/lib/src/writer", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def tell[S](s: S): Writer_[S, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("tell")(s.asInstanceOf[js.Any]).asInstanceOf[Writer_[S, Double]]
    
    inline def writer[S, T](story: js.Array[S], value: T): Writer_[S, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writer")(story.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Writer_[S, T]]
  }
  
  inline def writer[S, T](story: js.Array[S], value: T): Writer_[S, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writer")(story.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Writer_[S, T]]
  
  trait WriterPatterns[S, T, U] extends StObject {
    
    def writer(story: js.Array[S], value: T): U
  }
  object WriterPatterns {
    
    inline def apply[S, T, U](writer: (js.Array[S], T) => U): WriterPatterns[S, T, U] = {
      val __obj = js.Dynamic.literal(writer = js.Any.fromFunction2(writer))
      __obj.asInstanceOf[WriterPatterns[S, T, U]]
    }
    
    extension [Self <: WriterPatterns[?, ?, ?], S, T, U](x: Self & (WriterPatterns[S, T, U])) {
      
      inline def setWriter(value: (js.Array[S], T) => U): Self = StObject.set(x, "writer", js.Any.fromFunction2(value))
    }
  }
}
