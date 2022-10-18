package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.KeyDef
import typings.testingLibraryUserEvent.distTypesSystemKeyboardMod.keyboardKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesKeyboardParseKeyDefMod {
  
  @JSImport("@testing-library/user-event/dist/types/keyboard/parseKeyDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseKeyDef(keyboardMap: js.Array[keyboardKey], text: String): js.Array[KeyDef] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyDef")(keyboardMap.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Array[KeyDef]]
}
