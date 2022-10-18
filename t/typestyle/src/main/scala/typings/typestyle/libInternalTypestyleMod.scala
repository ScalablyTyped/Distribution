package typings.typestyle

import typings.std.Record
import typings.typestyle.anon.AutoGenerateTag
import typings.typestyle.libTypesMod.FontFace
import typings.typestyle.libTypesMod.KeyFrames
import typings.typestyle.libTypesMod.NestedCSSProperties
import typings.typestyle.typestyleBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInternalTypestyleMod {
  
  @JSImport("typestyle/lib/internal/typestyle", "TypeStyle")
  @js.native
  open class TypeStyle protected () extends StObject {
    def this(hasAutoGenerateTag: AutoGenerateTag) = this()
    
    /**
      * Only calls cb all sync operations settle
      */
    /* private */ var _afterAllSync: Any = js.native
    
    /* private */ var _autoGenerateTag: Any = js.native
    
    /* private */ var _freeStyle: Any = js.native
    
    /* private */ var _getTag: Any = js.native
    
    /**
      * We have a single stylesheet that we update as components register themselves
      */
    /* private */ var _lastFreeStyleChangeId: Any = js.native
    
    /* private */ var _pending: Any = js.native
    
    /* private */ var _pendingRawChange: Any = js.native
    
    /* private */ var _raw: Any = js.native
    
    /** Checks if the style tag needs updating and if so queues up the change */
    /* private */ var _styleUpdated: Any = js.native
    
    /* private */ var _tag: Any = js.native
    
    /**
      * Insert `raw` CSS as a string. This is useful for e.g.
      * - third party CSS that you are customizing with template strings
      * - generating raw CSS in JavaScript
      * - reset libraries like normalize.css that you can use without loaders
      */
    def cssRaw(mustBeValidCSS: String): Unit = js.native
    
    /**
      * Takes CSSProperties and registers it to a global selector (body, html, etc.)
      */
    def cssRule(selector: String, objects: NestedCSSProperties*): Unit = js.native
    
    /**
      * Utility function to register an @font-face
      */
    def fontFace(fontFace: FontFace*): Unit = js.native
    
    /**
      * Renders styles to the singleton tag imediately
      * NOTE: You should only call it on initial render to prevent any non CSS flash.
      * After that it is kept sync using `requestAnimationFrame` and we haven't noticed any bad flashes.
      **/
    def forceRenderStyles(): Unit = js.native
    
    /**
      * Allows use to use the stylesheet in a node.js environment
      */
    def getStyles(): String = js.native
    
    /**
      * Takes keyframes and returns a generated animationName
      */
    def keyframes(frames: KeyFrames): String = js.native
    
    /**
      * Helps with testing. Reinitializes FreeStyle + raw
      */
    def reinit(): Unit = js.native
    
    /** Sets the target tag where we write the css on style updates */
    def setStylesTarget(tag: StylesTarget): Unit = js.native
    
    /**
      * Takes CSSProperties and return a generated className you can use on your component
      */
    def style(objects: js.UndefOr[NestedCSSProperties]*): String = js.native
    @JSName("style")
    def style_false(objects: (js.UndefOr[NestedCSSProperties | Null | `false`])*): String = js.native
    
    /**
      * Takes an object where property names are ideal class names and property values are CSSProperties, and
      * returns an object where property names are the same ideal class names and the property values are
      * the actual generated class names using the ideal class name as the $debugName
      */
    def stylesheet[Classes /* <: String */](classes: Record[Classes, NestedCSSProperties]): /* import warning: importer.ImportType#apply Failed type conversion: {[ ClassName in Classes ]: string} */ js.Any = js.native
  }
  
  trait StylesTarget extends StObject {
    
    var textContent: String | Null
  }
  object StylesTarget {
    
    inline def apply(): StylesTarget = {
      val __obj = js.Dynamic.literal(textContent = null)
      __obj.asInstanceOf[StylesTarget]
    }
    
    extension [Self <: StylesTarget](x: Self) {
      
      inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      inline def setTextContentNull: Self = StObject.set(x, "textContent", null)
    }
  }
}
