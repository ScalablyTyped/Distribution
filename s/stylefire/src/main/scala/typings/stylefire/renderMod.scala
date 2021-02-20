package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.stylefire.stylefireBooleans.`true`
import typings.stylefire.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("stylefire/lib/css/render", JSImport.Default)
  @js.native
  def default(
    state: State,
    changedValues: js.Array[String],
    enableHardwareAcceleration: Boolean,
    blacklist: Set[String]
  ): String = js.native
  
  @JSImport("stylefire/lib/css/render", "aliasMap")
  @js.native
  val aliasMap: AliasMap_ = js.native
  
  @JSImport("stylefire/lib/css/render", JSImport.Default)
  @js.native
  def default_true(state: State, changedValues: `true`, enableHardwareAcceleration: Boolean, blacklist: Set[String]): String = js.native
  
  type AliasMap_ = StringDictionary[String]
}
