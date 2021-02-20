package typings.twineSugarcube

import typings.twineSugarcube.extensionsMod.global.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateMod {
  
  @js.native
  trait TemplateAPI extends StObject {
    
    /**
      * Add new template(s).
      * @param name Name, or array of names, of the template(s) to add. **NOTE**: Names must consist of characters from the basic Latin
      * alphabet and start with a letter, which may be optionally followed by any number of letters, numbers, the underscore, or the hyphen.
      * @param definition Definition of the template(s), which may be a: function, string, or an array of either. **NOTE**: Each time array
      * definitions are referenced, one of their member templates is randomly selected to be the output source.
      * @since 2.29.0
      * @example
      * // Basic usage
      * // Define a function template named ?yolo.
      * Template.add('yolo', function () {
      *     return either('YOLO', 'You Only Live Once');
      * });
      *
      * // Define a string template named ?nolf.
      * Template.add('nolf', 'No One Lives Forever');
      *
      * // Define an array of string templates named ?alsoYolo.
      * Template.add('alsoYolo', ['YOLO', 'You Only Live Once']);
      *
      * // Define an array of mixed string and function templates named ?cmyk.
      * Template.add('cmyk', [
      *     'Cyan',
      *     function () {
      *         return either('Magenta', 'Yellow');
      *     },
      *     'Black'
      * ]);
      *
      * // Using the context object (this)
      * // Define a function template with two names, ?color and ?Color, whose output changes based on its name.
      * Template.add(['color', 'Color'], function () {
      *     var color = either('red', 'green', 'blue');
      *     return this.name === 'Color' ? color.toUpperFirst() : color;
      * });
      */
    def add(name: String, definition: String): Unit = js.native
    def add(name: String, definition: Array[String | TemplateExpander]): Unit = js.native
    def add(name: String, definition: TemplateExpander): Unit = js.native
    def add(name: Array[String], definition: String): Unit = js.native
    def add(name: Array[String], definition: Array[String | TemplateExpander]): Unit = js.native
    def add(name: Array[String], definition: TemplateExpander): Unit = js.native
    
    /**
      * Remove existing template(s).
      * @param name Name, or array of names, of the template(s) to remove.
      * @since 2.29.0
      * @example
      * // Deletes the template ?yolo.
      * Template.delete('yolo');
      *
      * // Deletes the templates ?yolo and ?nolf.
      * Template.delete(['yolo', 'nolf']);
      */
    def delete(name: String): Unit = js.native
    def delete(name: Array[String]): Unit = js.native
    
    /**
      * Return the named template definition, or null on failure.
      * @param name Name of the template whose definition should be returned.
      * @since 2.29.0
      * @example
      * // Returns the template ?yolo, or null if it doesn't exist.
      * var yolo = Template.get('yolo');
      */
    def get(name: String): String | (Array[String | TemplateExpander]) | TemplateExpander | Null = js.native
    
    /**
      * Returns whether the named template exists.
      * @param name Name of the template to search for.
      * @since 2.29.0
      * @example
      * if (Template.has('yolo')) {
      *     // A ?yolo template exists.
      * }
      */
    def has(name: String): Boolean = js.native
    
    /**
      * Returns the number of existing templates.
      * @since 2.29.0
      * @example
      * if (Template.size === 0) {
      *     // No templates exist.
      * }
      */
    val size: Double = js.native
  }
  
  type TemplateExpander = js.ThisFunction0[/* this */ TemplateExpansionContext, String]
  
  @js.native
  trait TemplateExpansionContext extends StObject {
    
    /**
      * The template's name.
      */
    val name: String = js.native
  }
  object TemplateExpansionContext {
    
    @scala.inline
    def apply(name: String): TemplateExpansionContext = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateExpansionContext]
    }
    
    @scala.inline
    implicit class TemplateExpansionContextMutableBuilder[Self <: TemplateExpansionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
