package typings.sweetalert

import org.scalablytyped.runtime.Shortcut
import typings.sweetalert.anon.PartialSwalOptions
import typings.sweetalert.stateMod.ActionOptions
import typings.sweetalert.stateMod.SwalState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod extends Shortcut {
  
  @JSImport("sweetalert/typings/core", JSImport.Default)
  @js.native
  val default: SweetAlert = js.native
  
  type SwalParams = js.Array[String | PartialSwalOptions]
  
  @js.native
  trait SweetAlert extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type SwalParams is not an array type */ params: SwalParams
    ): js.Promise[Any] = js.native
    
    var close: js.UndefOr[js.Function1[/* namespace */ js.UndefOr[String], Unit]] = js.native
    
    var getState: js.UndefOr[js.Function0[SwalState]] = js.native
    
    var setActionValue: js.UndefOr[js.Function1[/* opts */ String | ActionOptions, Unit]] = js.native
    
    var setDefaults: js.UndefOr[js.Function1[/* opts */ js.Object, Unit]] = js.native
    
    var stopLoading: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  type _To = SweetAlert
  
  /* This means you don't have to write `default`, but can instead just say `coreMod.foo` */
  override def _to: SweetAlert = default
}
