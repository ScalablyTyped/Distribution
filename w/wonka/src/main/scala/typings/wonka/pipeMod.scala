package typings.wonka

import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/helpers/pipe", JSImport.Namespace)
@js.native
object pipeMod extends js.Object {
  def pipe[T, R](source: sourceT[T], consumer: UnaryFn[sourceT[T], R]): R = js.native
  def pipe[T, A, B](source: sourceT[T], op1: UnaryFn[sourceT[T], sourceT[A]], op2: UnaryFn[sourceT[A], sourceT[B]]): sourceT[B] = js.native
  def pipe[T, A, B, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    consumer: UnaryFn[sourceT[B], R]
  ): R = js.native
  def pipe[T, A, B, C, D](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]]
  ): sourceT[D] = js.native
  def pipe[T, A, B, C, D, E](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]]
  ): sourceT[E] = js.native
  def pipe[T, A, B, C, D, E, F](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]]
  ): sourceT[F] = js.native
  def pipe[T, A, B, C, D, E, F, G](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]]
  ): sourceT[G] = js.native
  def pipe[T, A, B, C, D, E, F, G, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]],
    consumer: UnaryFn[sourceT[G], R]
  ): R = js.native
  def pipe[T, A, B, C, D, E, F, G, H, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]],
    op8: UnaryFn[sourceT[G], sourceT[H]],
    consumer: UnaryFn[sourceT[H], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCDEFGH_sourceT[T, A, B, C, D, E, F, G, H](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    op7: UnaryFn[sourceT[F], sourceT[G]],
    op8: UnaryFn[sourceT[G], sourceT[H]]
  ): sourceT[H] = js.native
  @JSName("pipe")
  def pipe_TABCDEFR_R[T, A, B, C, D, E, F, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    op6: UnaryFn[sourceT[E], sourceT[F]],
    consumer: UnaryFn[sourceT[F], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCDER_R[T, A, B, C, D, E, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    op5: UnaryFn[sourceT[D], sourceT[E]],
    consumer: UnaryFn[sourceT[E], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCDR_R[T, A, B, C, D, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    op4: UnaryFn[sourceT[C], sourceT[D]],
    consumer: UnaryFn[sourceT[D], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABCR_R[T, A, B, C, R](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]],
    consumer: UnaryFn[sourceT[C], R]
  ): R = js.native
  @JSName("pipe")
  def pipe_TABC_sourceT[T, A, B, C](
    source: sourceT[T],
    op1: UnaryFn[sourceT[T], sourceT[A]],
    op2: UnaryFn[sourceT[A], sourceT[B]],
    op3: UnaryFn[sourceT[B], sourceT[C]]
  ): sourceT[C] = js.native
  @JSName("pipe")
  def pipe_TAR_R[T, A, R](source: sourceT[T], op1: UnaryFn[sourceT[T], sourceT[A]], consumer: UnaryFn[sourceT[A], R]): R = js.native
  @JSName("pipe")
  def pipe_TA_sourceT[T, A](source: sourceT[T], op1: UnaryFn[sourceT[T], sourceT[A]]): sourceT[A] = js.native
  type UnaryFn[T, R] = js.Function1[/* source */ T, R]
}

