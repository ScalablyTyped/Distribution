package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.sentenceCaseMod.SentenceCaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSentenceCaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/SentenceCase", JSImport.Default)
  @js.native
  val default: FC[SentenceCaseProps] = js.native
  
  type _To = FC[SentenceCaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSentenceCaseMod.foo` */
  override def _to: FC[SentenceCaseProps] = default
}
