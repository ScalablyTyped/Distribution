package typings.treat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackTreat extends js.Object {
  
  def addLocalCss(css: js.Object): Unit = js.native
  
  def addTheme(
    theme: TreatTheme[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ): Unit = js.native
  
  def addThemedCss(themeRef: ThemeRef, css: js.Object): Unit = js.native
  
  def getIdentName(local: String, scopeId: Double): String = js.native
  def getIdentName(
    local: String,
    scopeId: Double,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any
  ): String = js.native
  
  def getThemes(): js.Array[
    TreatTheme[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ] = js.native
}
