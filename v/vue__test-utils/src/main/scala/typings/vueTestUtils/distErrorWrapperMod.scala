package typings.vueTestUtils

import typings.vueTestUtils.vueTestUtilsStrings.DOMWrapper
import typings.vueTestUtils.vueTestUtilsStrings.VueWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorWrapperMod {
  
  @JSImport("@vue/test-utils/dist/errorWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWrapperError[T /* <: js.Object */](wrapperType: DOMWrapper | VueWrapper): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createWrapperError")(wrapperType.asInstanceOf[js.Any]).asInstanceOf[T]
}
