package typings.vscodeTextmate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releasePlistMod {
  
  @JSImport("vscode-textmate/release/plist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsePLIST(content: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePLIST")(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def parseWithLocation(content: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseWithLocation")(content.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parseWithLocation(content: String, filename: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithLocation")(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parseWithLocation(content: String, filename: String, locationKeyName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithLocation")(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], locationKeyName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parseWithLocation(content: String, filename: Null, locationKeyName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithLocation")(content.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], locationKeyName.asInstanceOf[js.Any])).asInstanceOf[Any]
}
