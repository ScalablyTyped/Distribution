package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usaTableMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-table", JSImport.Default)
  @js.native
  val default: Table = js.native
  
  @js.native
  trait Table extends StObject {
    
    var SORTABLE_HEADER: String = js.native
    
    var SORT_BUTTON: String = js.native
    
    var TABLE: String = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
  }
  
  type _To = Table
  
  /* This means you don't have to write `default`, but can instead just say `usaTableMod.foo` */
  override def _to: Table = default
}
