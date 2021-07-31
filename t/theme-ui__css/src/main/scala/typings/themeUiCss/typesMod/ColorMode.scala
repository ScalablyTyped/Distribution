package typings.themeUiCss.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorMode
  extends StObject
     with /* k */ StringDictionary[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any) | (Scale[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
        ])
      ]
    ] {
  
  /**
    * A contrast color for emphasizing UI
    */
  var accent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  ] = js.undefined
  
  /**
    * Body background color
    */
  var background: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  ] = js.undefined
  
  /**
    * A background color for highlighting text
    */
  var highlight: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  ] = js.undefined
  
  /**
    * A faint color for backgrounds, borders, and accents that do not require
    * high contrast with the background color
    */
  var muted: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  ] = js.undefined
  
  /**
    * Primary brand color for links, buttons, etc.
    */
  var primary: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  ] = js.undefined
  
  /**
    * A secondary brand color for alternative styling
    */
  var secondary: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  ] = js.undefined
  
  /**
    * Body foreground color
    */
  var text: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
  ] = js.undefined
}
object ColorMode {
  
  @scala.inline
  def apply(): ColorMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorMode]
  }
  
  @scala.inline
  implicit class ColorModeMutableBuilder[Self <: ColorMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    @scala.inline
    def setBackground(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setHighlight(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    @scala.inline
    def setMuted(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    @scala.inline
    def setPrimary(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    @scala.inline
    def setText(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
