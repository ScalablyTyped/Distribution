package typings.wordpressBlockEditor

import typings.wordpressBlockEditor.anon.ClassName
import typings.wordpressBlockEditor.anon.MinFontSize
import typings.wordpressBlocks.BlockAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksUseTypographyPropsMod {
  
  @JSImport("@wordpress/block-editor/hooks/use-typography-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTypographyClassesAndStyles(attributes: BlockAttributes, fluidTypographySettings: Boolean): ClassName = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyClassesAndStyles")(attributes.asInstanceOf[js.Any], fluidTypographySettings.asInstanceOf[js.Any])).asInstanceOf[ClassName]
  inline def getTypographyClassesAndStyles(attributes: BlockAttributes, fluidTypographySettings: MinFontSize): ClassName = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypographyClassesAndStyles")(attributes.asInstanceOf[js.Any], fluidTypographySettings.asInstanceOf[js.Any])).asInstanceOf[ClassName]
}
