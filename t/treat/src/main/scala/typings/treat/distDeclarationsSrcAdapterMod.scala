package typings.treat

import typings.treat.distDeclarationsSrcTypesMod.Adapter
import typings.treat.distDeclarationsSrcTypesMod.ThemeRef
import typings.treat.distDeclarationsSrcTypesMod.TreatTheme
import typings.treat.themeMod.ThemeOrAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAdapterMod {
  
  @JSImport("treat/dist/declarations/src/adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("treat/dist/declarations/src/adapter", "addLocalCss")
  @js.native
  val addLocalCss: js.Function1[/* css */ js.Object, Unit] = js.native
  
  @JSImport("treat/dist/declarations/src/adapter", "addTheme")
  @js.native
  val addTheme: js.Function1[/* theme */ TreatTheme[ThemeOrAny], Unit] = js.native
  
  @JSImport("treat/dist/declarations/src/adapter", "addThemedCss")
  @js.native
  val addThemedCss: js.Function2[/* themeRef */ ThemeRef, /* css */ js.Object, Unit] = js.native
  
  @JSImport("treat/dist/declarations/src/adapter", "getIdentName")
  @js.native
  val getIdentName: js.Function3[/* local */ String, /* scopeId */ Double, /* theme */ js.UndefOr[ThemeOrAny], String] = js.native
  
  inline def getNextScope(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextScope")().asInstanceOf[Double]
  
  @JSImport("treat/dist/declarations/src/adapter", "getThemes")
  @js.native
  val getThemes: js.Function0[js.Array[TreatTheme[ThemeOrAny]]] = js.native
  
  inline def setAdapter(newAdapter: Adapter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdapter")(newAdapter.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
