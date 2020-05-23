package typings.typescriptServices.TypeScript.PullHelpers

import typings.typescriptServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherPullDeclsWalker extends js.Object {
  var currentlyWalkingOtherDecls: js.Any
  def walkOtherPullDecls(
    currentDecl: PullDecl,
    otherDecls: js.Array[PullDecl],
    callBack: js.Function1[/* otherDecl */ PullDecl, Unit]
  ): Unit
}

object OtherPullDeclsWalker {
  @scala.inline
  def apply(
    currentlyWalkingOtherDecls: js.Any,
    walkOtherPullDecls: (PullDecl, js.Array[PullDecl], js.Function1[/* otherDecl */ PullDecl, Unit]) => Unit
  ): OtherPullDeclsWalker = {
    val __obj = js.Dynamic.literal(currentlyWalkingOtherDecls = currentlyWalkingOtherDecls.asInstanceOf[js.Any], walkOtherPullDecls = js.Any.fromFunction3(walkOtherPullDecls))
    __obj.asInstanceOf[OtherPullDeclsWalker]
  }
}

