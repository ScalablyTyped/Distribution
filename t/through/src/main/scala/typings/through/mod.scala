package typings.through

import typings.node.streamMod.Transform
import typings.through.anon.AutoDestroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ThroughStream extends Transform {
    var autoDestroy: Boolean = js.native
    def queue(chunk: js.Any): js.Any = js.native
  }
  
  def apply(): ThroughStream = js.native
  def apply(write: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], opts: AutoDestroy): ThroughStream = js.native
  def apply(write: js.UndefOr[scala.Nothing], end: js.Function0[Unit]): ThroughStream = js.native
  def apply(write: js.UndefOr[scala.Nothing], end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit]): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.UndefOr[scala.Nothing], opts: AutoDestroy): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit]): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit], opts: AutoDestroy): ThroughStream = js.native
}

