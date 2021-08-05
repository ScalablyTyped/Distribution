package typings.treat

import typings.treat.typesMod.TreatModuleObject
import typings.treat.typesMod.TreatModuleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("treat/lib/types/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTheme(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")().asInstanceOf[Unit]
  
  inline def globalStyle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("globalStyle")().asInstanceOf[Unit]
  
  inline def resolveClassName(themeRef: String, classRef: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveClassName")(themeRef.asInstanceOf[js.Any], classRef.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveStyles(themeRef: String, styles: js.Array[TreatModuleValue]): js.Array[TreatModuleValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreatModuleValue]]
  inline def resolveStyles(themeRef: String, styles: TreatModuleObject): TreatModuleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveStyles")(themeRef.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[TreatModuleObject]
  
  inline def style(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("style")().asInstanceOf[Unit]
  
  inline def styleMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")().asInstanceOf[Unit]
  
  inline def styleTree(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("styleTree")().asInstanceOf[Unit]
}
