package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getImportExportSpecifierInfoMod {
  
  @JSImport("sucrase/dist/types/util/getImportExportSpecifierInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tokens: typings.sucrase.tokenProcessorMod.default): ImportExportSpecifierInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokens.asInstanceOf[js.Any]).asInstanceOf[ImportExportSpecifierInfo]
  inline def default(tokens: typings.sucrase.tokenProcessorMod.default, index: Double): ImportExportSpecifierInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokens.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ImportExportSpecifierInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sucrase.anon.EndIndex
    - typings.sucrase.anon.IsType
  */
  trait ImportExportSpecifierInfo extends StObject
  object ImportExportSpecifierInfo {
    
    inline def EndIndex(endIndex: Double, leftName: String, rightName: String): typings.sucrase.anon.EndIndex = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], isType = false, leftName = leftName.asInstanceOf[js.Any], rightName = rightName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sucrase.anon.EndIndex]
    }
    
    inline def IsType(endIndex: Double, leftName: Null, rightName: Null): typings.sucrase.anon.IsType = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], isType = true, leftName = leftName.asInstanceOf[js.Any], rightName = rightName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sucrase.anon.IsType]
    }
  }
}
