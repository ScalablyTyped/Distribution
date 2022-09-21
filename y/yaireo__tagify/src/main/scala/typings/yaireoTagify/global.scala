package typings.yaireoTagify

import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.yaireoTagify.mod.BaseTagData
import typings.yaireoTagify.mod.TagifySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Tagify {
    
    /**
      * Tagify class. This is the main entry point for creating a new tagify editor.
      * @template T Type of the tag data used by the tagify instance. Must contain at
      * least a `value` property. Defaults to {@link Tagify.TagData}, which allows
      * arbitrary properties. To enjoy more type safety, extend from
      * {@link Tagify.BaseTagData}, specify the allowed properties and use that as
      * the type parameter.
      */
    @JSGlobal("Tagify")
    @js.native
    open class ^[T /* <: BaseTagData */] protected ()
      extends typings.yaireoTagify.mod.^[T] {
      /**
        * Creates a new tagify editor on the given input element.
        * @param inputElement Input or textarea element to convert into a tagify
        * editor.
        * @param settings Optional settings to configure the tagify
        * editor.
        */
      def this(inputElement: HTMLInputElement) = this()
      def this(inputElement: HTMLTextAreaElement) = this()
      def this(inputElement: HTMLInputElement, settings: TagifySettings[T]) = this()
      def this(inputElement: HTMLTextAreaElement, settings: TagifySettings[T]) = this()
    }
  }
}
