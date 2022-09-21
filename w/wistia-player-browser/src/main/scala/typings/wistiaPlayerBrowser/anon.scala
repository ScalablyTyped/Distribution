package typings.wistiaPlayerBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait After extends StObject {
    
    var after: js.UndefOr[String] = js.undefined
    
    var before: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
  }
  object After {
    
    inline def apply(): After = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[After]
    }
    
    extension [Self <: After](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  trait ClickToPlayButton extends StObject {
    
    var clickToPlayButton: Boolean
  }
  object ClickToPlayButton {
    
    inline def apply(clickToPlayButton: Boolean): ClickToPlayButton = {
      val __obj = js.Dynamic.literal(clickToPlayButton = clickToPlayButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClickToPlayButton]
    }
    
    extension [Self <: ClickToPlayButton](x: Self) {
      
      inline def setClickToPlayButton(value: Boolean): Self = StObject.set(x, "clickToPlayButton", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fov extends StObject {
    
    var fov: js.UndefOr[Double] = js.undefined
    
    var heading: js.UndefOr[Double] = js.undefined
    
    var pitch: js.UndefOr[Double] = js.undefined
  }
  object Fov {
    
    inline def apply(): Fov = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fov]
    }
    
    extension [Self <: Fov](x: Self) {
      
      inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
      
      inline def setFovUndefined: Self = StObject.set(x, "fov", js.undefined)
      
      inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    }
  }
  
  trait Language extends StObject {
    
    var language: String
    
    var visible: Boolean
  }
  object Language {
    
    inline def apply(language: String, visible: Boolean): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxHeight extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
  }
  object MaxHeight {
    
    inline def apply(): MaxHeight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxHeight]
    }
    
    extension [Self <: MaxHeight](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
}
