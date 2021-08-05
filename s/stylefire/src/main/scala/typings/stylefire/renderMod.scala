package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.stylefire.stylefireBooleans.`true`
import typings.stylefire.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @JSImport("stylefire/lib/css/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    state: State,
    changedValues: js.Array[String],
    enableHardwareAcceleration: Boolean,
    blacklist: Set[String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], changedValues.asInstanceOf[js.Any], enableHardwareAcceleration.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("stylefire/lib/css/render", "aliasMap")
  @js.native
  val aliasMap: AliasMap_ = js.native
  
  inline def default_true(state: State, changedValues: `true`, enableHardwareAcceleration: Boolean, blacklist: Set[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], changedValues.asInstanceOf[js.Any], enableHardwareAcceleration.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type AliasMap_ = StringDictionary[String]
}
