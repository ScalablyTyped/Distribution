package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvideResolveFeature[T1 /* <: js.Function */, T2 /* <: js.Function */] extends js.Object {
  var provide: T1
  var resolve: T2
}

object ProvideResolveFeature {
  @scala.inline
  def apply[/* <: js.Function */ T1, /* <: js.Function */ T2](provide: T1, resolve: T2): ProvideResolveFeature[T1, T2] = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideResolveFeature[T1, T2]]
  }
}

