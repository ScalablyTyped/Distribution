package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldButtonLabel extends StObject {
  
  var boldButtonLabel: Requireable[String]
  
  var bulletedListButtonLabel: Requireable[String]
  
  var italicButtonLabel: Requireable[String]
  
  var linkButtonLabel: Requireable[String]
  
  var numberedListButtonLabel: Requireable[String]
  
  var underlineButtonLabel: Requireable[String]
}
object BoldButtonLabel {
  
  inline def apply(
    boldButtonLabel: Requireable[String],
    bulletedListButtonLabel: Requireable[String],
    italicButtonLabel: Requireable[String],
    linkButtonLabel: Requireable[String],
    numberedListButtonLabel: Requireable[String],
    underlineButtonLabel: Requireable[String]
  ): BoldButtonLabel = {
    val __obj = js.Dynamic.literal(boldButtonLabel = boldButtonLabel.asInstanceOf[js.Any], bulletedListButtonLabel = bulletedListButtonLabel.asInstanceOf[js.Any], italicButtonLabel = italicButtonLabel.asInstanceOf[js.Any], linkButtonLabel = linkButtonLabel.asInstanceOf[js.Any], numberedListButtonLabel = numberedListButtonLabel.asInstanceOf[js.Any], underlineButtonLabel = underlineButtonLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldButtonLabel]
  }
  
  extension [Self <: BoldButtonLabel](x: Self) {
    
    inline def setBoldButtonLabel(value: Requireable[String]): Self = StObject.set(x, "boldButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setBulletedListButtonLabel(value: Requireable[String]): Self = StObject.set(x, "bulletedListButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setItalicButtonLabel(value: Requireable[String]): Self = StObject.set(x, "italicButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setLinkButtonLabel(value: Requireable[String]): Self = StObject.set(x, "linkButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setNumberedListButtonLabel(value: Requireable[String]): Self = StObject.set(x, "numberedListButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setUnderlineButtonLabel(value: Requireable[String]): Self = StObject.set(x, "underlineButtonLabel", value.asInstanceOf[js.Any])
  }
}
