package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.wixWixUiIconsCommon.typesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalMetadataMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/metadata", JSImport.Default)
  @js.native
  val default: js.Array[IconMetadata] = js.native
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/metadata", "deprecatedGeneralIcons")
  @js.native
  val deprecatedGeneralIcons: js.Array[String] = js.native
  
  type _To = js.Array[IconMetadata]
  
  /* This means you don't have to write `default`, but can instead just say `generalMetadataMod.foo` */
  override def _to: js.Array[IconMetadata] = default
}
