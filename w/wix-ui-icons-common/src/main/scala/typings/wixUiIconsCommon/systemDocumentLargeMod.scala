package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.documentLargeMod.DocumentLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemDocumentLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/DocumentLarge", JSImport.Default)
  @js.native
  val default: FC[DocumentLargeProps] = js.native
  
  type _To = FC[DocumentLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemDocumentLargeMod.foo` */
  override def _to: FC[DocumentLargeProps] = default
}
