package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.Core.Node
import typings.webgme.GmeClasses.TraversalOptions
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeCommon.VoidFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackFinished extends js.Object {
  // takes *no* callback & returns a promise
  def apply(
    node: Node,
    options: TraversalOptions,
    visitFn: js.Function2[/* node */ Node, /* finished */ VoidFn, Unit]
  ): js.Promise[Unit] = js.native
  // takes a callback & returning *no* promise
  def apply(
    node: Node,
    options: TraversalOptions,
    visitFn: js.Function2[/* node */ Node, /* finished */ VoidFn, Unit],
    callback: ResultCallback[DataObject]
  ): Unit = js.native
}

