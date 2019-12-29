package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.stylefire.libStylerTypesMod.State
import typings.stylefire.stylefireBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/css/render", JSImport.Namespace)
@js.native
object libCssRenderMod extends js.Object {
  val aliasMap: AliasMap = js.native
  def default(
    state: State,
    changedValues: js.Array[String],
    enableHardwareAcceleration: Boolean,
    blacklist: Set[String]
  ): String = js.native
  @JSName("default")
  def default_true(state: State, changedValues: `true`, enableHardwareAcceleration: Boolean, blacklist: Set[String]): String = js.native
  type AliasMap = StringDictionary[String]
}

