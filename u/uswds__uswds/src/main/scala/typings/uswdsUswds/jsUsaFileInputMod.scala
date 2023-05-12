package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.Document
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaFileInputMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-file-input", JSImport.Default)
  @js.native
  val default: FileInput = js.native
  
  @js.native
  trait FileInput extends StObject {
    
    /**
      * Disable the file input component
      */
    def disable(el: HTMLElement): Unit = js.native
    
    /**
      * Enable the file input component
      */
    def enable(el: HTMLElement): Unit = js.native
    
    /**
      * Get an object of the properties and elements belonging directly to the given
      * file input component.
      */
    def getFileInputContext(el: HTMLElement): FileInputContext = js.native
    
    def init(root: Document): Unit = js.native
    def init(root: HTMLElement): Unit = js.native
    
    def off(el: HTMLElement): Unit = js.native
    
    def on(el: HTMLElement): Unit = js.native
    
    def teardown(root: Document): Unit = js.native
    def teardown(root: HTMLElement): Unit = js.native
  }
  
  trait FileInputContext extends StObject {
    
    var dropZoneEl: HTMLDivElement
    
    var inputEl: HTMLInputElement
  }
  object FileInputContext {
    
    inline def apply(dropZoneEl: HTMLDivElement, inputEl: HTMLInputElement): FileInputContext = {
      val __obj = js.Dynamic.literal(dropZoneEl = dropZoneEl.asInstanceOf[js.Any], inputEl = inputEl.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInputContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileInputContext] (val x: Self) extends AnyVal {
      
      inline def setDropZoneEl(value: HTMLDivElement): Self = StObject.set(x, "dropZoneEl", value.asInstanceOf[js.Any])
      
      inline def setInputEl(value: HTMLInputElement): Self = StObject.set(x, "inputEl", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FileInput
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaFileInputMod.foo` */
  override def _to: FileInput = default
}
