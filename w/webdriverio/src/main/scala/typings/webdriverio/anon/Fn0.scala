package typings.webdriverio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn0 extends StObject {
  
  def apply[ReturnValue, InnerArguments /* <: js.Array[Any] */](
    script: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): js.Promise[ReturnValue] = js.native
  def apply[ReturnValue, InnerArguments /* <: js.Array[Any] */](
    script: js.Function1[
      /* import warning: importer.ImportType#apply c repeated non-array type: InnerArguments */ /* innerArgs */ /* args */ js.Array[InnerArguments], 
      Unit
    ],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type InnerArguments is not an array type */ args: InnerArguments
  ): js.Promise[ReturnValue] = js.native
}
