package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.anon.GetStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unidriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/test/utils/unidriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ReactBase(base: UniDriver[js.Any]): GetStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("ReactBase")(base.asInstanceOf[js.Any]).asInstanceOf[GetStyle]
  
  @scala.inline
  def byDataHook(dataHook: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("byDataHook")(dataHook.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def safeGetNative[T](base: UniDriver[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("safeGetNative")(base.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
}
