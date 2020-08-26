package typings.uifabricMergeStyles.istyleMod

import org.scalablytyped.runtime.StringDictionary
import typings.uifabricMergeStyles.irawstylebaseMod.IRawStyleBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRawStyle
  extends IRawStyleBase
     with /**
  * Allow css variables, strings, objects. While we should have more strict typing
  * here, partners are broken in many unpredictable cases where typescript can't infer
  * the right typing. Loosening the typing to both allow for css variables and other things.
  */
/* key */ StringDictionary[js.Any]
     with _IStyleBase {
  /**
    * Display name for the style.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Custom selectors for the style.
    */
  var selectors: js.UndefOr[StringDictionary[IStyle]] = js.native
}

object IRawStyle {
  @scala.inline
  def apply(): IRawStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRawStyle]
  }
  @scala.inline
  implicit class IRawStyleOps[Self <: IRawStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setSelectors(value: StringDictionary[IStyle]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
  }
  
}

