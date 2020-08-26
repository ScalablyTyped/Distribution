package typings.typescriptServices.TypeScript.PullHelpers

import typings.typescriptServices.TypeScript.PullDecl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherPullDeclsWalker extends js.Object {
  var currentlyWalkingOtherDecls: js.Any = js.native
  def walkOtherPullDecls(
    currentDecl: PullDecl,
    otherDecls: js.Array[PullDecl],
    callBack: js.Function1[/* otherDecl */ PullDecl, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class OtherPullDeclsWalkerOps[Self <: OtherPullDeclsWalker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentlyWalkingOtherDecls(value: js.Any): Self = this.set("currentlyWalkingOtherDecls", value.asInstanceOf[js.Any])
    @scala.inline
    def setWalkOtherPullDecls(value: (PullDecl, js.Array[PullDecl], js.Function1[/* otherDecl */ PullDecl, Unit]) => Unit): Self = this.set("walkOtherPullDecls", js.Any.fromFunction3(value))
  }
  
}

