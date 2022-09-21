package typings.table

import typings.table.apiMod.BorderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBorderCharactersMod {
  
  @JSImport("table/dist/src/getBorderCharacters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBorderCharacters(name: String): BorderConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorderCharacters")(name.asInstanceOf[js.Any]).asInstanceOf[BorderConfig]
}
