package typings.treat

import typings.treat.typesMod.ThemeRef
import typings.treat.typesMod.TreatTheme
import typings.treat.typesMod.WebpackTreat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("treat/lib/types/webpackTreat", JSImport.Namespace)
@js.native
object webpackTreatMod extends js.Object {
  
  val addLocalCss: js.Function1[/* css */ js.Object, Unit] = js.native
  
  val addTheme: js.Function1[
    /* theme */ TreatTheme[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ], 
    Unit
  ] = js.native
  
  val addThemedCss: js.Function2[/* themeRef */ ThemeRef, /* css */ js.Object, Unit] = js.native
  
  val getIdentName: js.Function3[
    /* local */ String, 
    /* scopeId */ Double, 
    /* theme */ js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
    ], 
    String
  ] = js.native
  
  def getNextScope(): Double = js.native
  
  val getThemes: js.Function0[
    js.Array[
      TreatTheme[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
      ]
    ]
  ] = js.native
  
  def setWebpackTreat(newWebpackTreat: WebpackTreat): Unit = js.native
}
