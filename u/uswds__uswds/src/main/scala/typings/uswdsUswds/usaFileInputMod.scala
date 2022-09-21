package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uswdsUswds.anon.DropZoneEl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usaFileInputMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-file-input", JSImport.Default)
  @js.native
  val default: FileInput = js.native
  
  @js.native
  trait FileInput extends StObject {
    
    /**
      * Disable the file input component
      *
      * @param el An element within the file input component
      */
    def disable(el: HTMLInputElement): Unit = js.native
    
    /**
      * Enable the file input component
      *
      * @param el An element within the file input component
      */
    def enable(el: HTMLInputElement): Unit = js.native
    
    /**
      * Get an object of the properties and elements belonging directly to the given
      * file input component.
      *
      * @param el the element within the file input
      * @returns elements
      */
    def getFileInputContext(el: HTMLElement): DropZoneEl = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
  }
  
  type _To = FileInput
  
  /* This means you don't have to write `default`, but can instead just say `usaFileInputMod.foo` */
  override def _to: FileInput = default
}
