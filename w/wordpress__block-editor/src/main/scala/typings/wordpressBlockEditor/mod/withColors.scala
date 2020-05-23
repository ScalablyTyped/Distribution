package typings.wordpressBlockEditor.mod

import typings.react.mod.ComponentType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor", "withColors")
@js.native
object withColors extends js.Object {
  def apply(colorTypes: (String | (Record[String, String]))*): js.Function1[/* component */ ComponentType[_], ComponentType[_]] = js.native
}

