package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NodeOptions extends js.Object {
  // takes *no* callback & returns a promise
  def apply(
    node: webgmeLib.CoreNs.Node,
    options: webgmeLib.GmeClassesNs.TraversalOptions,
    visitFn: js.Function2[
      /* node */ webgmeLib.CoreNs.Node, 
      /* finished */ webgmeLib.GmeCommonNs.VoidFn, 
      scala.Unit
    ]
  ): js.Promise[scala.Unit] = js.native
  // takes a callback & returning *no* promise
  def apply(
    node: webgmeLib.CoreNs.Node,
    options: webgmeLib.GmeClassesNs.TraversalOptions,
    visitFn: js.Function2[
      /* node */ webgmeLib.CoreNs.Node, 
      /* finished */ webgmeLib.GmeCommonNs.VoidFn, 
      scala.Unit
    ],
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

