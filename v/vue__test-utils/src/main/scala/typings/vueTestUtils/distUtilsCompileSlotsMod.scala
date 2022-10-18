package typings.vueTestUtils

import typings.vueTestUtils.anon.Typeofvue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCompileSlotsMod {
  
  @JSImport("@vue/test-utils/dist/utils/compileSlots", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processSlot(): js.Function1[/* ctx */ js.UndefOr[js.Object], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("processSlot")().asInstanceOf[js.Function1[/* ctx */ js.UndefOr[js.Object], Any]]
  inline def processSlot(source: String): js.Function1[/* ctx */ js.UndefOr[js.Object], Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("processSlot")(source.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ctx */ js.UndefOr[js.Object], Any]]
  inline def processSlot(source: String, Vue: Typeofvue): js.Function1[/* ctx */ js.UndefOr[js.Object], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("processSlot")(source.asInstanceOf[js.Any], Vue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ctx */ js.UndefOr[js.Object], Any]]
  inline def processSlot(source: Unit, Vue: Typeofvue): js.Function1[/* ctx */ js.UndefOr[js.Object], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("processSlot")(source.asInstanceOf[js.Any], Vue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ctx */ js.UndefOr[js.Object], Any]]
}
