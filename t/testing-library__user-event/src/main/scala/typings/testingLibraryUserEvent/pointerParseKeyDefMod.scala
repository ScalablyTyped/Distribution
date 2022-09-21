package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.ReleasePrevious
import typings.testingLibraryUserEvent.sharedMod.pointerKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerParseKeyDefMod {
  
  @JSImport("@testing-library/user-event/dist/types/pointer/parseKeyDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseKeyDef(pointerMap: js.Array[pointerKey], keys: String): js.Array[ReleasePrevious] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyDef")(pointerMap.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReleasePrevious]]
}
