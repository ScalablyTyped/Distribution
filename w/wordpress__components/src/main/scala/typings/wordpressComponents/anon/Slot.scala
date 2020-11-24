package typings.wordpressComponents.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slot extends js.Object {
  
  /**
    * Use Popover.Slot to render the Popover to a specific location on the page.
    *
    * This is useful to allow style cascade to take effect.
    *
    * @example
    *
    * import { render } from 'react';
    * import { Popover } from '@wordpress/components';
    * import Content from './Content';
    *
    * const app = document.getElementById( 'app' );
    * render(
    *   <div>
    *       <Content />
    *       <Popover.Slot />
    *   </div>,
    *   app
    * );
    */
  def Slot(): ReactElement = js.native
}
object Slot {
  
  @scala.inline
  def apply(Slot: () => ReactElement): Slot = {
    val __obj = js.Dynamic.literal(Slot = js.Any.fromFunction0(Slot))
    __obj.asInstanceOf[Slot]
  }
  
  @scala.inline
  implicit class SlotOps[Self <: Slot] (val x: Self) extends AnyVal {
    
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
    def setSlot(value: () => ReactElement): Self = this.set("Slot", js.Any.fromFunction0(value))
  }
}
