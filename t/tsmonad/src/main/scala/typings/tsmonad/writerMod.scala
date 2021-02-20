package typings.tsmonad

import typings.tsmonad.monadMod.Eq
import typings.tsmonad.monadMod.Monad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @JSImport("tsmonad/lib/src/writer", "Writer")
  @js.native
  class Writer_[S, T] protected ()
    extends Monad[T]
       with Eq[Writer_[S, T]] {
    def this(story: js.Array[S], value: T) = this()
    
    def caseOf[U](patterns: WriterPatterns[S, T, U]): U = js.native
    
    def fmap[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
    
    def lift[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
    
    def map[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
    
    var story: js.Any = js.native
    
    var value: js.Any = js.native
  }
  /* static members */
  object Writer_ {
    
    @JSImport("tsmonad/lib/src/writer", "Writer.tell")
    @js.native
    def tell[S](s: S): Writer_[S, Double] = js.native
    
    @JSImport("tsmonad/lib/src/writer", "Writer.writer")
    @js.native
    def writer[S, T](story: js.Array[S], value: T): Writer_[S, T] = js.native
  }
  
  @JSImport("tsmonad/lib/src/writer", "writer")
  @js.native
  def writer[S, T](story: js.Array[S], value: T): Writer_[S, T] = js.native
  
  @js.native
  trait WriterPatterns[S, T, U] extends StObject {
    
    def writer(story: js.Array[S], value: T): U = js.native
  }
  object WriterPatterns {
    
    @scala.inline
    def apply[S, T, U](writer: (js.Array[S], T) => U): WriterPatterns[S, T, U] = {
      val __obj = js.Dynamic.literal(writer = js.Any.fromFunction2(writer))
      __obj.asInstanceOf[WriterPatterns[S, T, U]]
    }
    
    @scala.inline
    implicit class WriterPatternsMutableBuilder[Self <: WriterPatterns[_, _, _], S, T, U] (val x: Self with (WriterPatterns[S, T, U])) extends AnyVal {
      
      @scala.inline
      def setWriter(value: (js.Array[S], T) => U): Self = StObject.set(x, "writer", js.Any.fromFunction2(value))
    }
  }
}
