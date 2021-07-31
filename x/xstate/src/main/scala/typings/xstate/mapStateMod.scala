package typings.xstate

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapStateMod {
  
  @JSImport("xstate/lib/mapState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mapState(stateMap: StringDictionary[js.Any], stateId: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mapState")(stateMap.asInstanceOf[js.Any], stateId.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
