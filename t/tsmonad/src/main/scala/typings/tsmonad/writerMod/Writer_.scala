package typings.tsmonad.writerMod

import typings.tsmonad.monadMod.Eq_
import typings.tsmonad.monadMod.Monad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsmonad/lib/src/writer", "Writer")
@js.native
class Writer_[S, T] protected ()
  extends Monad[T]
     with Eq_[Writer_[S, T]] {
  def this(story: js.Array[S], value: T) = this()
  
  def caseOf[U](patterns: WriterPatterns[S, T, U]): U = js.native
  
  def fmap[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
  
  def lift[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
  
  def map[U](f: js.Function1[/* t */ T, U]): Writer_[S, U] = js.native
  
  var story: js.Any = js.native
  
  var value: js.Any = js.native
}
/* static members */
@JSImport("tsmonad/lib/src/writer", "Writer")
@js.native
object Writer_ extends js.Object {
  
  def tell[S](s: S): Writer_[S, Double] = js.native
  
  def writer[S, T](story: js.Array[S], value: T): Writer_[S, T] = js.native
}
