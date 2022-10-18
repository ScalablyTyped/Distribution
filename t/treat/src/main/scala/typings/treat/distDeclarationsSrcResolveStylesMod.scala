package typings.treat

import typings.treat.distDeclarationsSrcTypesMod.ThemeRef
import typings.treat.distDeclarationsSrcTypesMod.TreatModuleObject
import typings.treat.distDeclarationsSrcTypesMod.TreatModuleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcResolveStylesMod {
  
  @JSImport("treat/dist/declarations/src/resolveStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveStyles(themeRef: ThemeRef, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreatModuleValue]]
  inline def resolveStyles(themeRef: ThemeRef, styles: TreatModuleObject): TreatModuleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[TreatModuleObject]
}
