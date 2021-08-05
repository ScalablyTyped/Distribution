package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypographyProps
  extends StObject
     with FontFamilyProps
     with FontSizeProps[StyledSystemLength]
     with LineHeightProps[StyledSystemLength]
     with FontWeightProps
     with FontStyleProps
     with TextAlignProps
     with LetterSpacingProps[StyledSystemLength]
     with ColorProps
     with TextTransformProps
object TypographyProps {
  
  inline def apply(): TypographyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypographyProps]
  }
}
