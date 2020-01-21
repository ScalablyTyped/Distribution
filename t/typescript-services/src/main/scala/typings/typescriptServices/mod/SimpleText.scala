package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IScriptSnapshot
import typings.typescriptServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "SimpleText")
@js.native
object SimpleText extends js.Object {
  def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): ISimpleText = js.native
  def fromString(value: String): ISimpleText = js.native
}

