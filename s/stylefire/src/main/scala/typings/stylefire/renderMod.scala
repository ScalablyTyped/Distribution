package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.stylefire.stylefireBooleans.`true`
import typings.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stylefire/lib/css/render", JSImport.Namespace)
@js.native
object renderMod extends js.Object {
  
  val aliasMap: AliasMap_ = js.native
  
  def default(
    state: State,
    changedValues: js.Array[String],
    enableHardwareAcceleration: Boolean,
    blacklist: Set[String]
  ): String = js.native
  @JSName("default")
  def default_true(state: State, changedValues: `true`, enableHardwareAcceleration: Boolean, blacklist: Set[String]): String = js.native
  
  type AliasMap_ = StringDictionary[String]
}
