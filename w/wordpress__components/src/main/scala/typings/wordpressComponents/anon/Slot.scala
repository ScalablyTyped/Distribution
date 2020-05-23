package typings.wordpressComponents.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def Slot(): ReactElement
}

object Slot {
  @scala.inline
  def apply(Slot: () => ReactElement): Slot = {
    val __obj = js.Dynamic.literal(Slot = js.Any.fromFunction0(Slot))
    __obj.asInstanceOf[Slot]
  }
}

