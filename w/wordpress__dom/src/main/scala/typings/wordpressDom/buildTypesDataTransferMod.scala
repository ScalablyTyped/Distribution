package typings.wordpressDom

import typings.std.DataTransfer
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDataTransferMod {
  
  @JSImport("@wordpress/dom/build-types/data-transfer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFilesFromDataTransfer(dataTransfer: DataTransfer): js.Array[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilesFromDataTransfer")(dataTransfer.asInstanceOf[js.Any]).asInstanceOf[js.Array[File]]
}
