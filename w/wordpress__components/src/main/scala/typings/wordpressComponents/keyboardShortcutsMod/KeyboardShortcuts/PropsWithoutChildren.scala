package typings.wordpressComponents.keyboardShortcutsMod.KeyboardShortcuts

import typings.std.Record
import typings.wordpressComponents.wordpressComponentsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsWithoutChildren
  extends BaseProps
     with Props {
  
  @JSName("bindGlobal")
  var bindGlobal_PropsWithoutChildren: `true` = js.native
  
  var children: js.UndefOr[scala.Nothing] = js.native
}
object PropsWithoutChildren {
  
  @scala.inline
  def apply(bindGlobal: `true`, shortcuts: Record[String, js.Function0[Unit]]): PropsWithoutChildren = {
    val __obj = js.Dynamic.literal(bindGlobal = bindGlobal.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithoutChildren]
  }
  
  @scala.inline
  implicit class PropsWithoutChildrenOps[Self <: PropsWithoutChildren] (val x: Self) extends AnyVal {
    
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
    def setBindGlobal(value: `true`): Self = this.set("bindGlobal", value.asInstanceOf[js.Any])
  }
}
