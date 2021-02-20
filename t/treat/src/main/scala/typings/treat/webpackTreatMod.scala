package typings.treat

import typings.treat.typesMod.ThemeRef
import typings.treat.typesMod.TreatTheme
import typings.treat.typesMod.WebpackTreat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackTreatMod {
  
  @JSImport("treat/lib/types/webpackTreat", "addLocalCss")
  @js.native
  val addLocalCss: js.Function1[/* css */ js.Object, Unit] = js.native
  
  @JSImport("treat/lib/types/webpackTreat", "addTheme")
  @js.native
  val addTheme: js.Function1[
    /* theme */ TreatTheme[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ], 
    Unit
  ] = js.native
  
  @JSImport("treat/lib/types/webpackTreat", "addThemedCss")
  @js.native
  val addThemedCss: js.Function2[/* themeRef */ ThemeRef, /* css */ js.Object, Unit] = js.native
  
  @JSImport("treat/lib/types/webpackTreat", "getIdentName")
  @js.native
  val getIdentName: js.Function3[
    /* local */ String, 
    /* scopeId */ Double, 
    /* theme */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ], 
    String
  ] = js.native
  
  @JSImport("treat/lib/types/webpackTreat", "getNextScope")
  @js.native
  def getNextScope(): Double = js.native
  
  @JSImport("treat/lib/types/webpackTreat", "getThemes")
  @js.native
  val getThemes: js.Function0[
    js.Array[
      TreatTheme[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
      ]
    ]
  ] = js.native
  
  @JSImport("treat/lib/types/webpackTreat", "setWebpackTreat")
  @js.native
  def setWebpackTreat(newWebpackTreat: WebpackTreat): Unit = js.native
}
