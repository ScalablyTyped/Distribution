package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.NormalPullDecl")
@js.native
class NormalPullDecl protected () extends PullDecl {
  def this(
    declName: String,
    displayName: String,
    kind: PullElementKind,
    declFlags: PullElementFlags,
    parentDecl: PullDecl
  ) = this()
  def this(
    declName: String,
    displayName: String,
    kind: PullElementKind,
    declFlags: PullElementFlags,
    parentDecl: PullDecl,
    addToParent: Boolean
  ) = this()
  var _rootDecl: RootPullDecl = js.native
  var parentDecl: js.Any = js.native
  var parentPath: js.Any = js.native
}

