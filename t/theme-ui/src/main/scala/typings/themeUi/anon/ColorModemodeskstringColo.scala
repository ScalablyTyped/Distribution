package typings.themeUi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.themeUi.mod.ColorMode
import typings.themeUi.mod.ObjectOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined theme-ui.theme-ui.ColorMode & {  modes :{[k: string] : theme-ui.theme-ui.ColorMode} | undefined} */
@js.native
trait ColorModemodeskstringColo
  extends /* k */ StringDictionary[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any) | (ObjectOrArray[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ _
      ])
    ] {
  /**
    * A contrast color for emphasizing UI
    */
  var accent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
  ] = js.native
  /**
    * Body background color
    */
  var background: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any = js.native
  /**
    * A background color for highlighting text
    */
  var highlight: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
  ] = js.native
  /**
    * Nested color modes can provide overrides when used in conjunction with
    * `Theme.initialColorModeName and `useColorMode()`
    */
  var modes: js.UndefOr[StringDictionary[ColorMode]] = js.native
  /**
    * A faint color for backgrounds, borders, and accents that do not require
    * high contrast with the background color
    */
  var muted: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
  ] = js.native
  /**
    * Primary brand color for links, buttons, etc.
    */
  var primary: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
  ] = js.native
  /**
    * A secondary brand color for alternative styling
    */
  var secondary: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
  ] = js.native
  /**
    * Body foreground color
    */
  var text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any = js.native
}

object ColorModemodeskstringColo {
  @scala.inline
  def apply(
    background: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any,
    text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
  ): ColorModemodeskstringColo = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorModemodeskstringColo]
  }
  @scala.inline
  implicit class ColorModemodeskstringColoOps[Self <: ColorModemodeskstringColo] (val x: Self) extends AnyVal {
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
    def setBackground(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
    ): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
    ): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
    ): Self = this.set("accent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccent: Self = this.set("accent", js.undefined)
    @scala.inline
    def setHighlight(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
    ): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setModes(value: StringDictionary[ColorMode]): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModes: Self = this.set("modes", js.undefined)
    @scala.inline
    def setMuted(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
    ): Self = this.set("muted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuted: Self = this.set("muted", js.undefined)
    @scala.inline
    def setPrimary(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
    ): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setSecondary(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ js.Any
    ): Self = this.set("secondary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
  
}

