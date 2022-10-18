package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import typings.uswdsUswds.anon.ApQueryFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaTimePickerMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-time-picker", JSImport.Default)
  @js.native
  val default: TimePicker = js.native
  
  @js.native
  trait TimePicker extends StObject {
    
    var FILTER_DATASET: ApQueryFilter = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
  }
  
  type _To = TimePicker
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaTimePickerMod.foo` */
  override def _to: TimePicker = default
}
