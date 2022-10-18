package typings.table

import typings.table.distSrcTypesApiMod.StreamUserConfig
import typings.table.distSrcTypesApiMod.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCreateStreamMod {
  
  @JSImport("table/dist/src/createStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(userConfig: StreamUserConfig): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(userConfig.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
}
