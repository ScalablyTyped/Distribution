package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.wixWixUiIconsCommon.typesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/metadata", JSImport.Default)
  @js.native
  val default: js.Array[IconMetadata] = js.native
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/metadata", "generalIconsMetadata")
  @js.native
  val generalIconsMetadata: js.Array[IconMetadata] = js.native
  
  type _To = js.Array[IconMetadata]
  
  /* This means you don't have to write `default`, but can instead just say `metadataMod.foo` */
  override def _to: js.Array[IconMetadata] = default
}
