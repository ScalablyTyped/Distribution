package typings.treat

import typings.treat.typesMod.TreatModuleObject
import typings.treat.typesMod.TreatModuleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveStylesMod {
  
  @JSImport("treat/lib/types/resolveStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveStyles(themeRef: String, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreatModuleValue]]
  inline def resolveStyles(themeRef: String, styles: TreatModuleObject): TreatModuleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[TreatModuleObject]
}
