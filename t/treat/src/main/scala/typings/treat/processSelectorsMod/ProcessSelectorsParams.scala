package typings.treat.processSelectorsMod

import typings.treat.typesMod.Style
import typings.treat.typesMod.ThemeRef
import typings.treat.typesMod.TreatTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessSelectorsParams extends js.Object {
  
  var style: Style = js.native
  
  var themeRef: js.UndefOr[ThemeRef] = js.native
  
  var themes: js.Array[
    TreatTheme[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
    ]
  ] = js.native
}
object ProcessSelectorsParams {
  
  @scala.inline
  def apply(
    style: Style,
    themes: js.Array[
      TreatTheme[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
      ]
    ]
  ): ProcessSelectorsParams = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], themes = themes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessSelectorsParams]
  }
  
  @scala.inline
  implicit class ProcessSelectorsParamsOps[Self <: ProcessSelectorsParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemesVarargs(value: TreatTheme[js.Any]*): Self = this.set("themes", js.Array(value :_*))
    
    @scala.inline
    def setThemes(
      value: js.Array[
          TreatTheme[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ _
          ]
        ]
    ): Self = this.set("themes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeRef(value: ThemeRef): Self = this.set("themeRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThemeRef: Self = this.set("themeRef", js.undefined)
  }
}
