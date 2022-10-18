package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.wixUiIconsCommon.distSrcTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemMetadataMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/metadata", JSImport.Default)
  @js.native
  val default: js.Array[IconMetadata] = js.native
  
  @JSImport("wix-ui-icons-common/dist/src/system/metadata", "deprecatedSystemIcons")
  @js.native
  val deprecatedSystemIcons: js.Array[String] = js.native
  
  type _To = js.Array[IconMetadata]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemMetadataMod.foo` */
  override def _to: js.Array[IconMetadata] = default
}
