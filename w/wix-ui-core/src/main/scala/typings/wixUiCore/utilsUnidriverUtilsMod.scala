package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsUnidriverUtilsMod {
  
  @JSImport("wix-ui-core/dist/test/utils/unidriver/Utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byDataHook(dataHook: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("byDataHook")(dataHook.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def safeGetNative[T](base: UniDriver[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeGetNative")(base.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
