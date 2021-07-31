package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipeMod {
  
  @JSImport("wonka/src/pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pipe[T, R](source: Source[T], consumer: UnaryFn[Source[T], R]): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def pipe[T, A, B](source: Source[T], op1: UnaryFn[Source[T], Source[A]], op2: UnaryFn[Source[A], Source[B]]): Source[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any])).asInstanceOf[Source[B]]
  @scala.inline
  def pipe[T, A, B, C](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]]
  ): Source[C] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any])).asInstanceOf[Source[C]]
  @scala.inline
  def pipe[T, A, B, C, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    consumer: UnaryFn[Source[C], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def pipe[T, A, B, C, D, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    consumer: UnaryFn[Source[D], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def pipe[T, A, B, C, D, E, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    consumer: UnaryFn[Source[E], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def pipe[T, A, B, C, D, E, F, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    consumer: UnaryFn[Source[F], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def pipe[T, A, B, C, D, E, F, G, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    consumer: UnaryFn[Source[G], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  @scala.inline
  def pipe[T, A, B, C, D, E, F, G, H, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    op8: UnaryFn[Source[G], Source[H]],
    consumer: UnaryFn[Source[H], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any], op8.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @scala.inline
  def pipe_TABCDEFGH_Source[T, A, B, C, D, E, F, G, H](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]],
    op8: UnaryFn[Source[G], Source[H]]
  ): Source[H] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any], op8.asInstanceOf[js.Any])).asInstanceOf[Source[H]]
  
  @scala.inline
  def pipe_TABCDEFG_Source[T, A, B, C, D, E, F, G](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]],
    op7: UnaryFn[Source[F], Source[G]]
  ): Source[G] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any], op7.asInstanceOf[js.Any])).asInstanceOf[Source[G]]
  
  @scala.inline
  def pipe_TABCDEF_Source[T, A, B, C, D, E, F](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]],
    op6: UnaryFn[Source[E], Source[F]]
  ): Source[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any], op6.asInstanceOf[js.Any])).asInstanceOf[Source[F]]
  
  @scala.inline
  def pipe_TABCDE_Source[T, A, B, C, D, E](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]],
    op5: UnaryFn[Source[D], Source[E]]
  ): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any], op5.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
  
  @scala.inline
  def pipe_TABCD_Source[T, A, B, C, D](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    op3: UnaryFn[Source[B], Source[C]],
    op4: UnaryFn[Source[C], Source[D]]
  ): Source[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], op3.asInstanceOf[js.Any], op4.asInstanceOf[js.Any])).asInstanceOf[Source[D]]
  
  @scala.inline
  def pipe_TABR_R[T, A, B, R](
    source: Source[T],
    op1: UnaryFn[Source[T], Source[A]],
    op2: UnaryFn[Source[A], Source[B]],
    consumer: UnaryFn[Source[B], R]
  ): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], op2.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @scala.inline
  def pipe_TAR_R[T, A, R](source: Source[T], op1: UnaryFn[Source[T], Source[A]], consumer: UnaryFn[Source[A], R]): R = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any], consumer.asInstanceOf[js.Any])).asInstanceOf[R]
  
  @scala.inline
  def pipe_TA_Source[T, A](source: Source[T], op1: UnaryFn[Source[T], Source[A]]): Source[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(source.asInstanceOf[js.Any], op1.asInstanceOf[js.Any])).asInstanceOf[Source[A]]
  
  type UnaryFn[T, R] = js.Function1[/* source */ T, R]
}
