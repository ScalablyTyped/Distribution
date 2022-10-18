package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemMetadataMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/metadata", JSImport.Default)
  @js.native
  val default: js.Array[IconMetadata] = js.native
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/metadata", "deprecatedSystemIcons")
  @js.native
  val deprecatedSystemIcons: js.Array[String] = js.native
  
  type _To = js.Array[IconMetadata]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemMetadataMod.foo` */
  override def _to: js.Array[IconMetadata] = default
}
