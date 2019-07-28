package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.Node
import typings.webgme.GmeClassesNs.TraversalOptions
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeCommonNs.VoidFn
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

