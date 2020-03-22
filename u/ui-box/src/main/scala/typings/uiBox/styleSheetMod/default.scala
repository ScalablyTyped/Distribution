package typings.uiBox.styleSheetMod

import typings.std.CSSRule
import typings.std.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/utils/style-sheet", JSImport.Default)
@js.native
class default () extends CustomStyleSheet {
  def this(options: Options) = this()
  /* CompleteClass */
  override var ctr: js.Any = js.native
  /* CompleteClass */
  override var injected: js.Any = js.native
  /* CompleteClass */
  override var isSpeedy: js.Any = js.native
  /* CompleteClass */
  override var maxLength: js.Any = js.native
  /* CompleteClass */
  override var tags: js.Any = js.native
  /* CompleteClass */
  override def _insert(sheet: CSSStyleSheet, rule: String): Unit = js.native
  /* CompleteClass */
  override def flush(): Unit = js.native
  /* CompleteClass */
  override def getSheet(): js.UndefOr[CSSStyleSheet] = js.native
  /* CompleteClass */
  override def inject(): Unit = js.native
  /* CompleteClass */
  override def insert(rule: String): Double = js.native
  /* CompleteClass */
  override def rules(): js.Array[CSSRule] = js.native
  /* CompleteClass */
  override def speedy(bool: Boolean): Unit = js.native
}

